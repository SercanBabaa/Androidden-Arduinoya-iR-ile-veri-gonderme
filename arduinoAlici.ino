const byte ledPin = 13;
const byte interruptPin = 2;
volatile byte state = LOW;

void setup() {
  Serial.begin(9600);
  pinMode(ledPin, OUTPUT);
  pinMode(interruptPin, INPUT_PULLUP);
  attachInterrupt(digitalPinToInterrupt(interruptPin), low, CHANGE);
  
  
}

unsigned long fark=0,eski=0;
void loop() {
  
}

void low() {
  eski=micros();
  attachInterrupt(digitalPinToInterrupt(interruptPin), high, HIGH);
}

void high() {
  fark=micros()-eski;
  attachInterrupt(digitalPinToInterrupt(interruptPin), low, LOW);
  Serial.print(fark);
  Serial.print("  ");
  Serial.print((int)(fark/1000));
  Serial.print("  ");
  Serial.println((int)ceil(fark/1000));

}

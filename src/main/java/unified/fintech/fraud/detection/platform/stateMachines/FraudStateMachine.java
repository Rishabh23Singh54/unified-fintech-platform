package unified.fintech.fraud.detection.platform.stateMachines;

import unified.fintech.fraud.detection.platform.states.FraudStatus;

public class FraudStateMachine {
    
    public FraudStatus evaluate(boolean isFraud) {
        return isFraud 
            ? FraudStatus.REJECTED
            : FraudStatus.APPROVED;
    }
}

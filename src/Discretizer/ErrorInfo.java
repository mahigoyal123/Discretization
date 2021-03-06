/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discretizer;


//package keel.Dataset;

public class ErrorInfo {

  public final static int BadNumberOfValues             = 0;
  public final static int OutputMissingValue            = 1;
  public final static int BadNumericValue               = 2;
  public final static int TrainNominalOutOfRange        = 3;
  public final static int TestNominalOutOfRange         = 4;
  public final static int TrainNumberOutOfRange         = 5;
  public final static int TestNumberOutOfRange          = 6;
  public final static int TypeAlreadyFixed              = 7;
  public final static int AttributeNotDefinedInTrain    = 8;
  public final static int InputTrainAttributeNotDefined = 9;
  public final static int InputTestAttributeNotDefined  = 10;
  public final static int OutputTrainAttributeNotDefined= 11;
  public final static int OutputTestAttributeNotDefined = 12;
  public final static int InputsInTestNotEquals         = 13;
  public final static int OutputsInTestNotEquals        = 14;
  
  
/**
 * It stores the type of the error
 */
  public int typeOfError;

/**
 * It stores the instance number where the error has appeared.
 */
  public int instanceNum;
  
/**
 * It stores the file number where the error has appeared.
 */
  public int fileLineNum;
  
/**
 * It stores the attribute number where the error has appeared.
 */
  public int attributeNum;
  
/**
 * It keeps if the attribute is an input, output or non-defined attribute
 */
  public int attDirection;
  
/**
 * It stores if the error has been in the train dataset. Otherwise
 * it has been in the test dataset.
 */
  public boolean errorInTrain;
  
/**
 * Message to be writen when showing the error
 */
  private String message;
    
/** 
 * Creates a new instance of ErrorInfo 
 */
  public ErrorInfo() {
    typeOfError = -1;
    instanceNum = -1;
    fileLineNum = -1;
    attributeNum = -1;
    attDirection = Attribute.DIR_NOT_DEF;
    errorInTrain = false;
  }//end ErrorInfo
 
  
/**
 * Creates a new instance with the parameters passed.
 */
  public ErrorInfo(int _type, int _iNum, int _lNum, int _atNum, int _atDir, boolean _train, String _msg){
    typeOfError = _type;
    instanceNum = _iNum;
    fileLineNum = _lNum;
    attributeNum = _atNum;
    attDirection = _atDir;
    errorInTrain = _train;                
    message = _msg;
  }//end ErrorInfo

  public ErrorInfo(String msg){
    message = msg;
    typeOfError = -1;
    instanceNum = -1;
    fileLineNum = -1;
    attributeNum = -1;
    attDirection = Attribute.DIR_NOT_DEF;
    errorInTrain = false;
  }//end ErrorInfo

  public void print(){
    String [] dir = {"Output", "Input"};
    switch (typeOfError){
        case BadNumberOfValues-> {
                System.err.println("BadNumberOfValuesException >> [line: "+fileLineNum+", instance: "+instanceNum+", Train DB: "+errorInTrain+"]");
                System.err.println(message);
                break;
        }
        case OutputMissingValue -> {
                System.err.println("OutputMissingValueException >> [line: "+fileLineNum+", instance: "+instanceNum+", attributeNum: "+attributeNum+", INPUT/OUTPUT: "+dir[Attribute.OUTPUT-attDirection]+" Train DB: "+errorInTrain+"]");
                System.err.println(message);
                break;
        }
        case BadNumericValue-> {
                System.err.println("BadNumericValueException >> [line: "+fileLineNum+", instance: "+instanceNum+", attributeNum: "+attributeNum+", INPUT/OUTPUT: "+dir[Attribute.OUTPUT-attDirection]+" Train DB: "+errorInTrain+"]");
                System.err.println(message);
                break;
        }
        case TrainNominalOutOfRange-> {
                System.err.println("TrainNominalOutOfRangeException >> [line: "+fileLineNum+", instance: "+instanceNum+", attributeNum: "+attributeNum+", INPUT/OUTPUT: "+dir[Attribute.OUTPUT-attDirection]+" Train DB: "+errorInTrain+"]");
                System.err.println(message);
                break;
        }
        case TestNominalOutOfRange-> {
                System.err.println("TestNominalOutOfRangeException >> [line: "+fileLineNum+", instance: "+instanceNum+", attributeNum: "+attributeNum+", INPUT/OUTPUT: "+dir[Attribute.OUTPUT-attDirection]+" Train DB: "+errorInTrain+"]");
                System.err.println(message);
                break;
        }
        case TrainNumberOutOfRange-> {
                System.err.println("TrainNumberOutOfRangeException >> [line: "+fileLineNum+", instance: "+instanceNum+", attributeNum: "+attributeNum+", INPUT/OUTPUT: "+dir[Attribute.OUTPUT-attDirection]+" Train DB: "+errorInTrain+"]");
                System.err.println(message);
                break;
        }
        case TestNumberOutOfRange-> {
                System.err.println("TestNumberOutOfRangeException >> [line: "+fileLineNum+", instance: "+instanceNum+", attributeNum: "+attributeNum+", INPUT/OUTPUT: "+dir[Attribute.OUTPUT-attDirection]+" Train DB: "+errorInTrain+"]");
                System.err.println(message);
                break;
        }
        case TypeAlreadyFixed-> {
                System.err.println("TypeAlreadyFixedException >> [line: "+fileLineNum+", instance: "+instanceNum+", attributeNum: "+attributeNum+", INPUT/OUTPUT: "+dir[Attribute.OUTPUT-attDirection]+" Train DB: "+errorInTrain+"]");
                System.err.println(message);
                break;
        }
        case AttributeNotDefinedInTrain-> {
                System.err.println("AttributeNotDefinedInTrainException >> [line: "+fileLineNum+", attributeNum: "+attributeNum+", Train DB: "+errorInTrain+"]");
                System.err.println(message);
                break;
        }
        case InputTrainAttributeNotDefined-> {
                System.err.println("InputTrainAttributeNotDefinedException >> [line: "+fileLineNum+", Train DB: "+errorInTrain+"]");
                System.err.println(message);
                break;
        }
        case InputTestAttributeNotDefined-> {
                System.err.println("InputTestAttributeNotDefinedException >> [line: "+fileLineNum+", Train DB: "+errorInTrain+"]");
                System.err.println(message);
                break;
        }
        case OutputTrainAttributeNotDefined-> {
                System.err.println("OutputTrainAttributeNotDefinedException >> [line: "+fileLineNum+", Train DB: "+errorInTrain+"]");
                System.err.println(message);
                break;
        }
        case OutputTestAttributeNotDefined-> {
                System.err.println("OutputTestAttributeNotDefinedException >> [line: "+fileLineNum+", Train DB: "+errorInTrain+"]");
                System.err.println(message);
                break;
        }
        case InputsInTestNotEquals-> {
                System.err.println("InputsInTestNotEqualsException >> [Train DB: "+errorInTrain+"]");
                System.err.println(message);
                break;
        }
        case OutputsInTestNotEquals-> {
                System.err.println("OutputsInTestNotEqualsException >> [Train DB: "+errorInTrain+"]");
                System.err.println(message);
                break;
        }
    }
  }//end print
  
  
}//end of Class ErrorInfo


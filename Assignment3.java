Assignment 3/.classpath                                                                             0000644 0       0       3642        14575371712 13051   0                                                                                                    ustar 00nobody                          nobody                                                                                                                                                                                                                 <?xml version="1.0" encoding="UTF-8"?>
<classpath>
	<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-17">
		<attributes>
			<attribute name="module" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="src" path="src"/>
	<classpathentry kind="lib" path="/Users/darinadiaz/Downloads/javafx-sdk-21.0.2/lib/javafx-swt.jar">
		<attributes>
			<attribute name="module" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="lib" path="/Users/darinadiaz/Downloads/javafx-sdk-21.0.2/lib/javafx.base.jar">
		<attributes>
			<attribute name="module" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="lib" path="/Users/darinadiaz/Downloads/javafx-sdk-21.0.2/lib/javafx.controls.jar">
		<attributes>
			<attribute name="module" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="lib" path="/Users/darinadiaz/Downloads/javafx-sdk-21.0.2/lib/javafx.fxml.jar">
		<attributes>
			<attribute name="module" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="lib" path="/Users/darinadiaz/Downloads/javafx-sdk-21.0.2/lib/javafx.graphics.jar">
		<attributes>
			<attribute name="module" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="lib" path="/Users/darinadiaz/Downloads/javafx-sdk-21.0.2/lib/javafx.media.jar">
		<attributes>
			<attribute name="module" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="lib" path="/Users/darinadiaz/Downloads/javafx-sdk-21.0.2/lib/javafx.swing.jar">
		<attributes>
			<attribute name="module" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="lib" path="/Users/darinadiaz/Downloads/javafx-sdk-21.0.2/lib/javafx.web.jar">
		<attributes>
			<attribute name="module" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="output" path="bin"/>
</classpath>
                                                                                              Assignment 3/.project                                                                               0000644 0       0       563         14570451124 12443   0                                                                                                    ustar 00nobody                          nobody                                                                                                                                                                                                                 <?xml version="1.0" encoding="UTF-8"?>
<projectDescription>
	<name>Assignment 3</name>
	<comment></comment>
	<projects>
	</projects>
	<buildSpec>
		<buildCommand>
			<name>org.eclipse.jdt.core.javabuilder</name>
			<arguments>
			</arguments>
		</buildCommand>
	</buildSpec>
	<natures>
		<nature>org.eclipse.jdt.core.javanature</nature>
	</natures>
</projectDescription>
                                                                                                                                             Assignment 3/.settings/org.eclipse.core.resources.prefs                                             0000644 0       0       67          14570451124 21044   0                                                                                                    ustar 00nobody                          nobody                                                                                                                                                                                                                 eclipse.preferences.version=1
encoding/<project>=UTF-8
                                                                                                                                                                                                                                                                                                                                                                                                                                                                         Assignment 3/.settings/org.eclipse.jdt.core.prefs                                                   0000644 0       0       1377        14570451161 17761   0                                                                                                    ustar 00nobody                          nobody                                                                                                                                                                                                                 eclipse.preferences.version=1
org.eclipse.jdt.core.compiler.codegen.inlineJsrBytecode=enabled
org.eclipse.jdt.core.compiler.codegen.targetPlatform=17
org.eclipse.jdt.core.compiler.codegen.unusedLocal=preserve
org.eclipse.jdt.core.compiler.compliance=17
org.eclipse.jdt.core.compiler.debug.lineNumber=generate
org.eclipse.jdt.core.compiler.debug.localVariable=generate
org.eclipse.jdt.core.compiler.debug.sourceFile=generate
org.eclipse.jdt.core.compiler.problem.assertIdentifier=error
org.eclipse.jdt.core.compiler.problem.enablePreviewFeatures=disabled
org.eclipse.jdt.core.compiler.problem.enumIdentifier=error
org.eclipse.jdt.core.compiler.problem.reportPreviewFeatures=warning
org.eclipse.jdt.core.compiler.release=enabled
org.eclipse.jdt.core.compiler.source=17
                                                                                                                                                                                                                                                                 Assignment 3/bin/CryptoManager.class                                                                0000644 0       0       4254        14575371244 15440   0                                                                                                    ustar 00nobody                          nobody                                                                                                                                                                                                                 ����   = H  CryptoManager  java/lang/Object LOWER_RANGE C ConstantValue     UPPER_RANGE   _ RANGE I   @ <init> ()V Code
     LineNumberTable LocalVariableTable this LCryptoManager; isStringInBounds (Ljava/lang/String;)Z
    java/lang/String   charAt (I)C
    ! " length ()I 	plainText Ljava/lang/String; i ch StackMapTable caesarEncryption '(Ljava/lang/String;I)Ljava/lang/String;
  +   - 0The selected string is not in bounds, Try again. / java/lang/StringBuilder
 . 
 . 2 3 4 append (C)Ljava/lang/StringBuilder;
 . 6 7 8 toString ()Ljava/lang/String; key encryptedText Ljava/lang/StringBuilder; encryptedChar bellasoEncryption 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; 
bellasoStr 	keyLength keyChar caesarDecryption decryptedText decryptedChar bellasoDecryption 
SourceFile CryptoManager.java !                	       
                  /     *� �                        	       �     &<� *� = � 	_� ��*� ����           (  )  *  +  ( $ .         & # $    " %     &   '    � � �  	 ( )     �     F*� *� ,�� .Y� 0M>� %*� 6`6_� ��,�� 1W�*� ���,� 5�       .    9  : 
 >  ?  @  A $ B + C . E 6 ? A G    >    F # $     F 9    4 : ;   - %     &   $  <   '    
�  .� � 
 	 = >          O� .Y� 0M+� >6� 1*� 6+p� 6`6_� ��,�� 1W�*� ���,� 5�       .    S  T  U  V  W % X , Y 3 Z 6 \ > U J ^    R    O # $     O ? $   G : ;   B @    : %    # &   %  A   ,  <   '    �  .� "� 
 	 B )     �     <� .Y� 0M>� %*� 6d6 � �@,�� 1W�*� ���,� 5�       & 	   l  m  n  o  p ! q $ s , m 7 u    >    < : $     < 9    4 C ;  
 - %     &     D   '    �  .� � 
 	 E >          O� .Y� 0M+� >6� 1*� 6+p� 6d6 � �@,�� 1W�*� ���,� 5�       .    �  �  �  �  � % � , � 3 � 6 � > � J �    R    O : $     O ? $   G C ;   B @    : %    # &   %  A   ,  D   '    �  .� "� 
  F    G                                                                                                                                                                                                                                                                                                                                                    Assignment 3/bin/CryptoManagerGFATest.class                                                         0000644 0       0       2564        14575361666 16627   0                                                                                                    ustar 00nobody                          nobody                                                                                                                                                                                                                 ����   = )  CryptoManagerGFATest  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LCryptoManagerGFATest; setUp 
Exceptions  java/lang/Exception RuntimeInvisibleAnnotations LBefore;  java/lang/Error  FUnresolved compilation problem: 
	Before cannot be resolved to a type

     (Ljava/lang/String;)V tearDown LAfter;  EUnresolved compilation problem: 
	After cannot be resolved to a type
 testStringInBounds LTest; " �Unresolved compilation problems: 
	Test cannot be resolved to a type
	The method assertTrue(boolean) is undefined for the type CryptoManagerGFATest
 testEncryptCaesar % �Unresolved compilation problems: 
	Test cannot be resolved to a type
	The method assertEquals(String, String) is undefined for the type CryptoManagerGFATest
 testDecryptCaesar 
SourceFile CryptoManagerGFATest.java !               /     *� �    
                                         4     
� Y� �    
               
                          4     
� Y� �    
               
                     4     
� Y!� �    
               
      #               4     
� Y$� �    
               
      &               4     
� Y$� �    
       $        
      '    (                                                                                                                                            Assignment 3/bin/CryptoManagerTestPublic.class                                                      0000644 0       0       6250        14575361676 17445   0                                                                                                    ustar 00nobody                          nobody                                                                                                                                                                                                                 ����   = 1  CryptoManagerTestPublic  java/lang/Object cryptoManager LCryptoManager; <init> ()V Code
     LineNumberTable LocalVariableTable this LCryptoManagerTestPublic; setUp 
Exceptions  java/lang/Exception RuntimeInvisibleAnnotations LBeforeEach;  java/lang/Error  JUnresolved compilation problem: 
	BeforeEach cannot be resolved to a type

     (Ljava/lang/String;)V tearDown LAfterEach;   IUnresolved compilation problem: 
	AfterEach cannot be resolved to a type
 testStringInBounds LTest; $�Unresolved compilation problems: 
	Test cannot be resolved to a type
	The method assertTrue(boolean) is undefined for the type CryptoManagerTestPublic
	The method assertTrue(boolean) is undefined for the type CryptoManagerTestPublic
	The method assertFalse(boolean) is undefined for the type CryptoManagerTestPublic
	The method assertFalse(boolean) is undefined for the type CryptoManagerTestPublic
	The method assertFalse(boolean) is undefined for the type CryptoManagerTestPublic
 testEncryptCaesar 'gUnresolved compilation problems: 
	Test cannot be resolved to a type
	The method assertEquals(String, String) is undefined for the type CryptoManagerTestPublic
	The method assertEquals(String, String) is undefined for the type CryptoManagerTestPublic
	The method assertEquals(String, String) is undefined for the type CryptoManagerTestPublic
	The method assertEquals(String, String) is undefined for the type CryptoManagerTestPublic
	The method assertEquals(String, String) is undefined for the type CryptoManagerTestPublic
	The method assertEquals(String, String) is undefined for the type CryptoManagerTestPublic
 testDecryptCaesar *�Unresolved compilation problems: 
	Test cannot be resolved to a type
	The method assertEquals(String, String) is undefined for the type CryptoManagerTestPublic
	The method assertEquals(String, String) is undefined for the type CryptoManagerTestPublic
	The method assertEquals(String, String) is undefined for the type CryptoManagerTestPublic
	The method assertEquals(String, String) is undefined for the type CryptoManagerTestPublic
 testEncryptBellaso -VUnresolved compilation problems: 
	Test cannot be resolved to a type
	The method assertEquals(String, String) is undefined for the type CryptoManagerTestPublic
	The method assertEquals(String, String) is undefined for the type CryptoManagerTestPublic
	The method assertEquals(String, String) is undefined for the type CryptoManagerTestPublic
 testDecryptBellaso 
SourceFile CryptoManagerTestPublic.java !                 	   /     *� 
�                                          	   4     
� Y� �                   
                       	   4     
� Y� �                   
      !        "   	   4     
� Y#� �                   
      %        "   	   4     
� Y&� �                    
      (        "   	   4     
� Y)� �           *        
      +        "   	   4     
� Y,� �           2        
      .        "   	   4     
� Y,� �           :        
      /    0                                                                                                                                                                                                                                                                                                                                                        Assignment 3/bin/FXDriver.class                                                                     0000644 0       0       1670        14575361722 14355   0                                                                                                    ustar 00nobody                          nobody                                                                                                                                                                                                                 ����   = ;  FXDriver  javafx/application/Application <init> ()V Code
  	   LineNumberTable LocalVariableTable this 
LFXDriver; main ([Ljava/lang/String;)V
     launch args [Ljava/lang/String; start (Ljavafx/stage/Stage;)V 
Exceptions  java/lang/Exception  
FXMainPane
  	  javafx/scene/Scene@��     @u�     
  $  % (Ljavafx/scene/Parent;DD)V
 ' ) ( javafx/stage/Stage * + setScene (Ljavafx/scene/Scene;)V - 'Cybersecurity Encryption and Decryption
 ' / 0 1 setTitle (Ljava/lang/String;)V
 ' 3 4  show stage Ljavafx/stage/Stage; root LFXMainPane; 
SourceFile FXDriver.java !               /     *� �    
                    	       3     *� �    
   
                                s     %� Y� M+� Y,  !� #� &+,� .+� 2�    
               $          %       % 5 6    7 8   9    :                                                                        Assignment 3/bin/FXMainPane$RadioButtonListener.class                                               0000644 0       0       2537        14575361722 20542   0                                                                                                    ustar 00nobody                          nobody                                                                                                                                                                                                                 ����   = C  FXMainPane$RadioButtonListener  java/lang/Object  javafx/event/EventHandler this$0 LFXMainPane; <init> (LFXMainPane;)V Code	    
   	  ()V LineNumberTable LocalVariableTable this  LFXMainPane$RadioButtonListener; handle (Ljavafx/event/ActionEvent;)V
    javafx/event/ActionEvent   	getTarget ()Ljavafx/event/EventTarget;	     
FXMainPane ! " radioButton1 "Ljavafx/scene/control/RadioButton;	  $ % & descriptionForInputLabel Ljavafx/scene/control/Label; ( .Cyber Key - enter an integer for Caesar Cipher
 * , + javafx/scene/control/Label - . setText (Ljava/lang/String;)V	  0 1 " radioButton2 3 -Cyber Key - enter a string for Bellaso Cipher event Ljavafx/event/ActionEvent; source Ljava/lang/Object; StackMapTable (Ljavafx/event/Event;)V
  ;   
SourceFile FXMainPane.java 	Signature ILjava/lang/Object;Ljavafx/event/EventHandler<Ljavafx/event/ActionEvent;>; InnerClasses RadioButtonListener NestHost               	 
     4     
*+� *� �           �        
            �     7+� M,*� � � *� � #'� )� ,*� � /� *� � #2� )�           �  �  �  � * � 6 �         7       7 4 5   2 6 7  8   	 �  A  9     )     	*+� � :�                   <    = >    ? @   
    A   B                                                                                                                                                                     Assignment 3/bin/FXMainPane.class                                                                   0000644 0       0       17741       14575361722 14700   0                                                                                                    ustar 00nobody                          nobody                                                                                                                                                                                                                 ����   =�  
FXMainPane  javafx/scene/layout/BorderPane 
decryption Ljavafx/scene/control/Button; 
exitButton 
encryption test clearButton plainTextTextField  Ljavafx/scene/control/TextField; inputForEncryptionTextField encryptedStringTextField3 decryptedTextField4 plainTextLabel Ljavafx/scene/control/Label; descriptionForInputLabel encryptedLabel3 decryptedLabel4 blankLabel1 blankLabel2 radioButton1 "Ljavafx/scene/control/RadioButton; radioButton2 shiftInt I BLANK Ljava/lang/String; ConstantValue                     buildTextFields ()V Code % javafx/scene/control/TextField
 $ ' ( " <init>	  *  	  ,  	  .  	  0   LineNumberTable LocalVariableTable this LFXMainPane; buildLabels 7 javafx/scene/control/Label 9 "Enter plain-text string to encrypt
 6 ; ( < (Ljava/lang/String;)V	  >   @ .Cyber Key - enter an integer for Caesar Cipher	  B   D Encrypted string	  F   H Decrypted string	  J  
  L M " buildBlankLabels	  O  	  Q  
  S T U setRight (Ljavafx/scene/Node;)V
  W X U setLeft buildRadioButtons [  javafx/scene/control/RadioButton ] Use Caesar cipher
 Z ;	  `   b Use Bellaso cipher	  d   f  javafx/scene/control/ToggleGroup
 e '
 Z i j k setToggleGroup %(Ljavafx/scene/control/ToggleGroup;)V
 Z m n o setSelected (Z)V	 q s r javafx/geometry/Pos t u CENTER Ljavafx/geometry/Pos;
 Z w x y setAlignment (Ljavafx/geometry/Pos;)V { FXMainPane$RadioButtonListener
 z } ( ~ (LFXMainPane;)V
 Z � � � setOnAction (Ljavafx/event/EventHandler;)V radioButtonGroup "Ljavafx/scene/control/ToggleGroup; radioButtonListener  LFXMainPane$RadioButtonListener; buildButtons � javafx/scene/control/Button � E_xit
 � ;	  �  
 � � � o setMnemonicParsing � javafx/scene/control/Tooltip � Select to close the application
 � ;
 � � � � 
setTooltip !(Ljavafx/scene/control/Tooltip;)V � _Clear	  � 
  � $Select this to clear the text fields � _Decrypt a string	  �   � Select this to decrypt a string � Encrypt a string	  �   � )Encrypt the string in the upper textfield
 � � � o 
setVisible addActionToExitButton   � � � handle ()Ljavafx/event/EventHandler;
 � � addActionToClearButton  � � � )(LFXMainPane;)Ljavafx/event/EventHandler; addActionToEncryptButton  � addActionToDecryptButton  � addButtonActions
  � � "
  � � "
  � � "
  � � "
  '	  �  	  �   � javafx/geometry/Insets@$      
 � � ( � (D)V
  � ! "
  � 5 "
  � Y "
  � � "
  � � " � javafx/scene/layout/HBox
 � '
 � � � � 	setMargin .(Ljavafx/scene/Node;Ljavafx/geometry/Insets;)V
 � w
 � � � � getChildren %()Ljavafx/collections/ObservableList; � javafx/scene/Node � � � !javafx/collections/ObservableList � � addAll ([Ljava/lang/Object;)Z � -fx-border-color: gray;
 � � � < setStyle � javafx/scene/layout/VBox
 � �
 � �
  � � U 	setCenter
  � � U setTop
  U 	setBottom inset Ljavafx/geometry/Insets; topBox Ljavafx/scene/layout/HBox; 	centerBox Ljavafx/scene/layout/VBox; 	bottomBox lambda$0 (Ljavafx/event/ActionEvent;)V
 javafx/application/Platform " exit
 java/lang/System (I)V event Ljavafx/event/ActionEvent; lambda$1  
 $ < setText lambda$2
 Z !" 
isSelected ()Z
 $$%& getText ()Ljava/lang/String;
(*) java/lang/Integer+, parseInt (Ljava/lang/String;)I
.0/ java/lang/String1& toUpperCase
354 CryptoManager67 caesarEncryption '(Ljava/lang/String;I)Ljava/lang/String;
39:; bellasoEncryption 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.=>? equals (Ljava/lang/Object;)ZA encryption failed	CDE out Ljava/io/PrintStream; GHI makeConcatWithConstants &(Ljava/lang/String;)Ljava/lang/String;
KML java/io/PrintStreamN < println
PRQ java/lang/RuntimeExceptionS& 
getMessageU java/lang/NumberFormatException 
bellasoStr encryptedStr e !Ljava/lang/NumberFormatException; Ljava/lang/RuntimeException; StackMapTable] javafx/event/ActionEvent lambda$3
3`a7 caesarDecryption
3cd; bellasoDecryption G encryptedText decryptedText 
SourceFile FXMainPane.java BootstrapMethods
lnm "java/lang/invoke/LambdaMetafactoryop metafactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;k (Ljavafx/event/Event;)Vr
 u
tr
 zyr
 ~r
 �^�
��� $java/lang/invoke/StringConcatFactoryH� �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;��  should be an integer InnerClasses RadioButtonListener� %java/lang/invoke/MethodHandles$Lookup� java/lang/invoke/MethodHandles Lookup NestMembers !                      	     
                                                                                ! "  #   g     -*� $Y� &� )*� $Y� &� +*� $Y� &� -*� $Y� &� /�    1       "  #  $ ! % , & 2       - 3 4    5 "  #   w     9*� 6Y8� :� =*� 6Y?� :� A*� 6YC� :� E*� 6YG� :� I*� K�    1       )  *  + ' , 4 - 8 . 2       9 3 4    M "  #   e     +*� 6Y� :� N*� 6Y� :� P**� N� R**� P� V�    1       1  2  3 " 4 * 5 2       + 3 4    Y "  #   �     h*� ZY\� ^� _*� ZYa� ^� c� eY� gL*� _+� h*� c+� h*� _� l*� _� p� v*� c� p� v� zY*� |M*� _,� *� c,� �    1   2    9  :  < " = * > 2 @ : A D B N D W E _ F g G 2        h 3 4   " F � �  W  � �   � "  #   �     �*� �Y�� �� �*� �� �*� �� �Y�� �� �*� �Y�� �� �*� �� �*� �� �Y�� �� �*� �Y�� �� �*� �� �*� �� �Y�� �� �*� �Y�� �� �*� �� �*� �� �Y�� �� �*� �� ��    1   :    O  P  Q % T 2 U : V J Y W Z _ [ o ^ | _ � ` � a � b 2       � 3 4    � "  #   ;     *� �� �  � ��    1   
    f  j 2        3 4    � "  #   <     *� �*� �  � ��    1   
    n  t 2        3 4    � "  #   <     *� �*� �  � ��    1   
    x  � 2        3 4    � "  #   <     *� �*� �  � ��    1   
    �  � 2        3 4    � "  #   K     *� �*� �*� �*� ű    1       �  �  �  �  � 2        3 4     ( "  #  �    (*� �*� �*� ʻ �Y η �L*� �*� �*� �*� �*� ۻ �Y� �M*� _+� �,� p� �,� �� �Y*� _SY*� cS� � W,� � �Y η �N-� �� �Y*� =SY*� )SY*� ESY*� -SY*� ISY*� /SY*� ASY*� +S� � W*-� �*,� �� �Y� �:*� �+� �*� �+� �*� �+� �*� �+� �� �� �Y*� �SY*� �SY*� �SY*� �S� � W*� � p� �    1   v    �   	   �  �  � " � & � * � . � 6 � > � E � a � g � r � � � � � � � � � � � � � � � � � � � � � � �' � 2   4   ( 3 4     6 �  r �  � Z	 

  #   :     ���    1       g  h  i 2           #   m     )*� )�*� +�*� -�*� /��    1       o 
 p  q  r ( s 2       ) 3 4     )   #  �     �MN*� _�� &**� +�#�'� �*� )�#�-*� ȸ2N� %*� +�#�-M*� +,�*� )�#�-,�8N*� )*� )�#�-�-�<� *� -@�� /*� --�� $M�B*� +�#�F  �J� M�B,�O�J�    � �T   � �P  1   J    z  {  }  ~    2 � 5 � @ � H � W � h � r �  � � � � � � � � � � � 2   >    � 3 4     �   �V    W   � XY  � 
XZ [   " � 5..!'� 
  \ TUP
^  #  h     �MN*� -�#�-M*� _�� **� +�#�'� �,*� ȸ_:� *� +�#�-N*� +-�,-�b:*� /�� $M�B*� +�#�e  �J� M�B,�O�J�    [ ^T   [ tP  1   B    �  �  �  �  � + � 5 � 8 � C � K � R � [ � _ � t � u �  � 2   R    � 3 4     �   Wf    SV   5 g   R 	g   _ XY  u 
XZ [   & � 8..� .�   \ TUP
 h   ij   6 q svwq x{|q }��q ���� �� ��     z �  ��� �     z                               Assignment 3/src/CryptoManager.java                                                                 0000644 0       0       13227       14575371244 15353   0                                                                                                    ustar 00nobody                          nobody                                                                                                                                                                                                                 
/**
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Darina Diaz 
**/


/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple �substitution cipher� where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */
public class CryptoManager {
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) {
		for (int i = 0; i < plainText.length(); i++) {
			char ch = plainText.charAt(i);
			if (ch < LOWER_RANGE || ch > UPPER_RANGE ) {
				return false;
				}
			}
		return true;
		}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) {
		if (!isStringInBounds(plainText)) {
			 return "The selected string is not in bounds, Try again.";
        }
		
	
	StringBuilder encryptedText = new StringBuilder();
    for (int i = 0; i < plainText.length(); i++) {
        char ch = plainText.charAt(i);
        int encryptedChar = ch + key;
        if (encryptedChar > UPPER_RANGE) {
            encryptedChar -= RANGE;
        }
        encryptedText.append((char) encryptedChar);
    }
    return encryptedText.toString();
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr) {
		StringBuilder encryptedText = new StringBuilder();
        int keyLength = bellasoStr.length();
        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            char keyChar = bellasoStr.charAt(i % keyLength);
            int encryptedChar = ch + keyChar;
            if (encryptedChar > UPPER_RANGE) {
                encryptedChar -= RANGE;
            }
            encryptedText.append((char) encryptedChar);
        }
        return encryptedText.toString();
    }


	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */

	public static String caesarDecryption (String encryptedText, int key) {
		StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < encryptedText.length(); i++) {
            char ch = encryptedText.charAt(i);
            int decryptedChar = ch - key;
            if (decryptedChar < LOWER_RANGE) {
                decryptedChar += RANGE;
            }
            decryptedText.append((char) decryptedChar);
        }
        return decryptedText.toString(); 
      
      }
    
	
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
		StringBuilder decryptedText = new StringBuilder();
        int keyLength = bellasoStr.length();
        for (int i = 0; i < encryptedText.length(); i++) {
            char ch = encryptedText.charAt(i);
            char keyChar = bellasoStr.charAt(i % keyLength);
            int decryptedChar = ch - keyChar;
            if (decryptedChar < LOWER_RANGE) {
                decryptedChar += RANGE;
            }
            decryptedText.append((char) decryptedChar);
        }
        return decryptedText.toString();
	}
}
	

                                                                                                                                                                                                                                                                                                                                                                         Assignment 3/src/CryptoManagerGFATest.java                                                          0000644 0       0       1442        14575361665 16453   0                                                                                                    ustar 00nobody                          nobody                                                                                                                                                                                                                 
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * This class represents GFA test cases for a CryptoManager object.
 * 
 * @author Farnaz Eivazi
 * @version 7/12/2022
 * 
 */
public class CryptoManagerGFATest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("THIS TEST SHOULD SUCCEED"));
	}

	@Test
	public void testEncryptCaesar() {
		assertEquals("IFMMP!XPSME", CryptoManager.caesarEncryption("HELLO WORLD", 1));
	}

	@Test
	public void testDecryptCaesar() {
		assertEquals("HELLO WORLD", CryptoManager.caesarDecryption("IFMMP!XPSME", 1));
	}
}
                                                                                                                                                                                                                              Assignment 3/src/CryptoManagerTestPublic.java                                                       0000644 0       0       5075        14575361676 17304   0                                                                                                    ustar 00nobody                          nobody                                                                                                                                                                                                                 
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class CryptoManagerTestPublic {
	CryptoManager cryptoManager;

	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void testStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("JAVA"));
		assertTrue(CryptoManager.isStringInBounds("\"JAVA IS FUN\""));
		assertFalse(CryptoManager.isStringInBounds("java"));
		assertFalse(CryptoManager.isStringInBounds("{JAVA"));
		assertFalse(CryptoManager.isStringInBounds("\"THIS TEST THAT SHOULD FAIL BECAUSE { IS OUTSIDE THE RANGE\""));
	}

	@Test
	public void testEncryptCaesar() {
		assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("bye", 3));
		assertEquals("DEF", CryptoManager.caesarEncryption("ABC", 3));
		assertEquals("!\"#", CryptoManager.caesarEncryption("ABC", 96));
		assertEquals("1.558", CryptoManager.caesarEncryption("HELLO", 105));
		assertEquals("UFTUJOH", CryptoManager.caesarEncryption("TESTING", 1));
		assertEquals("WKLV#LV#DQRWKHU#WHVW", CryptoManager.caesarEncryption("THIS IS ANOTHER TEST", 3));
	}

	@Test
	public void testDecryptCaesar() {
		assertEquals("TESTING", CryptoManager.caesarDecryption("UFTUJOH", 1));
		assertEquals("TESTING ANOTHER STRING", CryptoManager.caesarDecryption(";,:;05.G(56;/,9G:;905.", 999));
		assertEquals("HELLO WORLD", CryptoManager.caesarDecryption("4188;LC;>80", 300));
		assertEquals("THIS IS ANOTHER TEST", CryptoManager.caesarDecryption("WKLV#LV#DQRWKHU#WHVW", 3));
	}

	@Test
	public void testEncryptBellaso() {
		assertEquals("WN#\\N &", CryptoManager.bellasoEncryption("TESTING", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
		assertEquals("UJ^^((HT^X[YYM\"", CryptoManager.bellasoEncryption("MERRY CHRISTMAS", "HELLO"));
		assertEquals("WU\\VR9F#N!RF88U-'HED", CryptoManager.bellasoEncryption("THIS IS ANOTHER TEST", "CMSC203"));

	}

	@Test
	public void testDecryptBellaso() {
		assertEquals("TESTING", CryptoManager.bellasoDecryption("WN#\\N &", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
		assertEquals("MERRY CHRISTMAS", CryptoManager.bellasoDecryption("UJ^^((HT^X[YYM\"", "HELLO"));
		assertEquals("THIS IS ANOTHER TEST", CryptoManager.bellasoDecryption("WU\\VR9F#N!RF88U-'HED", "CMSC203"));

	}

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                   Assignment 3/src/FXDriver.java                                                                      0000644 0       0       1240        14575361711 14177   0                                                                                                    ustar 00nobody                          nobody                                                                                                                                                                                                                 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * The main method for the GUI example program JavaFX version
 * 
 * @author Farnaz Eivazi
 * @version 7/11/2022 *
 */
public class FXDriver extends Application {

	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// call the main scene which is a BorderPane
		FXMainPane root = new FXMainPane();
		stage.setScene(new Scene(root, 600, 350));
		// Set stage title and show the stage.
		stage.setTitle("Cybersecurity Encryption and Decryption");
		stage.show();

	}
}
                                                                                                                                                                                                                                                                                                                                                                Assignment 3/src/FXMainPane.java                                                                    0000644 0       0       17421       14575361722 14526   0                                                                                                    ustar 00nobody                          nobody                                                                                                                                                                                                                 
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * The class creates an object of FXMainPane used in FXDriver
 * 
 * @author Farnaz Eivazi
 * @version 7/12/2022
 */

public class FXMainPane extends BorderPane {

	private Button decryption, exitButton, encryption, test, clearButton;
	private TextField plainTextTextField, inputForEncryptionTextField, encryptedStringTextField3, decryptedTextField4;
	private Label plainTextLabel, descriptionForInputLabel, encryptedLabel3, decryptedLabel4, blankLabel1, blankLabel2;
	private RadioButton radioButton1, radioButton2;
	private int shiftInt = 0;
	private final String BLANK = "                 ";

	private void buildTextFields() {
		plainTextTextField = new TextField();
		inputForEncryptionTextField = new TextField();
		encryptedStringTextField3 = new TextField();
		decryptedTextField4 = new TextField();
	}

	private void buildLabels() {
		plainTextLabel = new Label("Enter plain-text string to encrypt");
		descriptionForInputLabel = new Label("Cyber Key - enter an integer for Caesar Cipher");
		encryptedLabel3 = new Label("Encrypted string");
		decryptedLabel4 = new Label("Decrypted string");
		buildBlankLabels();
	}

	private void buildBlankLabels() {
		blankLabel1 = new Label(BLANK);
		blankLabel2 = new Label(BLANK);
		setRight(blankLabel1);
		setLeft(blankLabel2);
	}

	private void buildRadioButtons() {
		// create three radio button instances
		radioButton1 = new RadioButton("Use Caesar cipher");
		radioButton2 = new RadioButton("Use Bellaso cipher");
		// create a group to make the radio buttons mutually exclusive
		ToggleGroup radioButtonGroup = new ToggleGroup();
		radioButton1.setToggleGroup(radioButtonGroup);
		radioButton2.setToggleGroup(radioButtonGroup);

		radioButton1.setSelected(true);
		radioButton1.setAlignment(Pos.CENTER);
		radioButton2.setAlignment(Pos.CENTER);

		RadioButtonListener radioButtonListener = new RadioButtonListener();
		radioButton1.setOnAction(radioButtonListener);
		radioButton2.setOnAction(radioButtonListener);
	}

	private void buildButtons() {
		// _ in label specifies that the next character is the mnemonic, ie, type Alt-m
		// as a shortcut
		// this activates the mnemonic on exitButton when the Alt key is pressed

		// create the exit Button
		exitButton = new Button("E_xit");
		exitButton.setMnemonicParsing(true);
		exitButton.setTooltip(new Tooltip("Select to close the application"));

		// create the clear Button
		clearButton = new Button("_Clear");
		clearButton.setMnemonicParsing(true);
		clearButton.setTooltip(new Tooltip("Select this to clear the text fields"));

		// create the decryption Button
		decryption = new Button("_Decrypt a string");
		decryption.setMnemonicParsing(true);
		decryption.setTooltip(new Tooltip("Select this to decrypt a string"));

		// create the encryption Button
		encryption = new Button("Encrypt a string");
		encryption.setMnemonicParsing(true);
		encryption.setTooltip(new Tooltip("Encrypt the string in the upper textfield"));
		encryption.setVisible(true);
	}

	private void addActionToExitButton() {
		// use a lambda expression for the EventHandler class for exitButton
		exitButton.setOnAction(event -> {
			Platform.exit();
			System.exit(0);
		});
	}

	private void addActionToClearButton() {
		// create a listener for the other button using a lambda expression
		clearButton.setOnAction(event -> {
			plainTextTextField.setText("");
			inputForEncryptionTextField.setText("");
			encryptedStringTextField3.setText("");
			decryptedTextField4.setText("");
		});
	}

	private void addActionToEncryptButton() {
		// create a listener for the exit button using a lambda expression
		encryption.setOnAction(event -> {
			try {
				String bellasoStr = "";
				String encryptedStr = "";

				if (radioButton1.isSelected()) {
					shiftInt = Integer.parseInt(inputForEncryptionTextField.getText());
					encryptedStr = CryptoManager.caesarEncryption(plainTextTextField.getText().toUpperCase(), shiftInt);
				} else {
					bellasoStr = inputForEncryptionTextField.getText().toUpperCase();
					inputForEncryptionTextField.setText(bellasoStr);
					encryptedStr = CryptoManager.bellasoEncryption(plainTextTextField.getText().toUpperCase(), bellasoStr);
				}

				plainTextTextField.setText(plainTextTextField.getText().toUpperCase());
				if (encryptedStr.equals(""))
					encryptedStringTextField3.setText("encryption failed");
				else
					encryptedStringTextField3.setText(encryptedStr);
			} catch (NumberFormatException e) {
				System.out.println(inputForEncryptionTextField.getText() + " should be an integer");
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
		});
	}

	private void addActionToDecryptButton() {
		// create a listener for the other button using a lambda expression
		decryption.setOnAction(event -> {
			try {
				String encryptedText = "";
				String bellasoStr = "";
				String decryptedText;
				encryptedText = encryptedStringTextField3.getText().toUpperCase();
				if (radioButton1.isSelected()) {
					shiftInt = Integer.parseInt(inputForEncryptionTextField.getText());
					decryptedText = CryptoManager.caesarDecryption(encryptedText, shiftInt);
				} else {
					bellasoStr = inputForEncryptionTextField.getText().toUpperCase();
					inputForEncryptionTextField.setText(bellasoStr);
					decryptedText = CryptoManager.bellasoDecryption(encryptedText, bellasoStr);
				}
				decryptedTextField4.setText(decryptedText);
			} catch (NumberFormatException e) {
				System.out.println(inputForEncryptionTextField.getText() + " should be an integer");
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
		});
	}

	private void addButtonActions() {
		addActionToExitButton();
		addActionToClearButton();
		addActionToEncryptButton();
		addActionToDecryptButton();
	}

	FXMainPane() {
		// for setting margins
		Insets inset = new Insets(10);
		buildTextFields();
		buildLabels();
		buildRadioButtons();
		buildButtons();
		addButtonActions();

		HBox topBox = new HBox();
		HBox.setMargin(radioButton1, inset);
		topBox.setAlignment(Pos.CENTER);
		topBox.getChildren().addAll(radioButton1, radioButton2);
		topBox.setStyle("-fx-border-color: gray;");

		// create the leftPanel
		VBox centerBox = new VBox(10);
		centerBox.getChildren().addAll(plainTextLabel, plainTextTextField, encryptedLabel3, encryptedStringTextField3,
				decryptedLabel4, decryptedTextField4, descriptionForInputLabel, inputForEncryptionTextField);
		setCenter(centerBox);

		setTop(topBox);

		HBox bottomBox = new HBox();
		HBox.setMargin(decryption, inset);
		HBox.setMargin(encryption, inset);
		HBox.setMargin(clearButton, inset);

		HBox.setMargin(exitButton, inset);
		bottomBox.getChildren().addAll(encryption, decryption, clearButton, exitButton);
		setBottom(bottomBox);
		bottomBox.setAlignment(Pos.CENTER);

	}

	class RadioButtonListener implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			Object source = event.getTarget();
			if (source == radioButton1) {
				descriptionForInputLabel.setText("Cyber Key - enter an integer for Caesar Cipher");
			} else if (source == radioButton2) {
				descriptionForInputLabel.setText("Cyber Key - enter a string for Bellaso Cipher");
			}
		}
	}

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
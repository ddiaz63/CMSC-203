PK
    Q�ZX��	)  )     Lab2_GUI_FX/.classpath<?xml version="1.0" encoding="UTF-8"?>
<classpath>
	<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-17">
		<attributes>
			<attribute name="module" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="src" path="src"/>
	<classpathentry kind="con" path="org.eclipse.jdt.USER_LIBRARY/JavaFX20">
		<attributes>
			<attribute name="module" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="output" path="bin"/>
</classpath>
PK
    3�ZX��U1r  r     Lab2_GUI_FX/.project<?xml version="1.0" encoding="UTF-8"?>
<projectDescription>
	<name>Lab2_GUI_FX</name>
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
PK
    ��ZXi�V��  �      Lab2_GUI_FX/src/DataManager.java


/**
 * The DataManager class should never depend on the GUI, but rather the reverse. 
 * So the DataManager methods should not use the GUI directly.  If you want data
 * to get from the user to the manager, have the GUI get the data, and call the manager 
 * with the data that the GUI got from a text field or other data structure.
 * @author ralexander
 *
 */
public class DataManager {
    
	DataManager() {	}

	/** 
	 * This method illustrates how the GUI can interact with the manager
	 */
	public String getHello() {
		return "Hello World";
	}

	public String getHowdy() {
		return "Howdy y'all";
	}

	public String getChinese() {
		return "Ni hau";
	}


}
PK
 
    Q�ZX��	)  )                   Lab2_GUI_FX/.classpathPK
 
    3�ZX��U1r  r               ]  Lab2_GUI_FX/.projectPK
 
    ��ZXi�V��  �                  Lab2_GUI_FX/src/DataManager.javaPK      �   �    
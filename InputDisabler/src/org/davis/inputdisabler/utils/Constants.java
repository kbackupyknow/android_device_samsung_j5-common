package org.davis.inputdisabler.utils;

/*
 * Created by Dāvis Mālnieks on 04/10/2015
 */

public final class Constants {

    // Paths to input devices

	public static final String TK_PATH = "/sys/class/input/input2/enabled";

	public static final String TS_PATH = "/sys/class/input/input4/enabled";
	
	public static final String GPIO_KEYS_POWER = "/sys/class/input/input7/enabled";

    // Doze

    public static final int DOZING_TIME = 1000 * 5;

    public static final String ACTION_DOZE_PULSE_STARTING = "android.intent.action.DOZE_PULSE_STARTING";
}

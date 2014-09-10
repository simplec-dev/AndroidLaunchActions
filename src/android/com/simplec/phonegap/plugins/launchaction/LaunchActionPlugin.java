package com.simplec.phonegap.plugins.launchaction;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Intent;
import android.provider.Settings;

public class LaunchActionPlugin extends CordovaPlugin {
	private static final String ACTION_LAUNCH_SETTINGS = "launchSettings";
	private static final String ACTION_LAUNCH_WIFI_SETTINGS = "launchWifi";
	private static final String ACTION_LAUNCH_DEVICE_INFO = "launchDeviceInfo";
	private static final String ACTION_LAUNCH_DEVELOPMENT_SETTINGS = "launchDevelopment";
	private static final String ACTION_LAUNCH_DATE_SETTINGS = "launchDate";
	private static final String ACTION_LAUNCH_MEMORY_CARD_SETTINGS = "launchMemory";
	private static final String ACTION_LAUNCH_ACTION_INTENT = "launchActionIntent";
	private static final String ACTION_LAUNCH_ACTION_DIALOG_INTENT = "launchActionDialogIntent";

	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
	}

	public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
        if (ACTION_LAUNCH_SETTINGS.equals(action)) {
        	Intent dialogIntent = new Intent(android.provider.Settings.ACTION_SETTINGS);
                dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                webView.getContext().startActivity(dialogIntent);
                return true;
        }
        
        if (ACTION_LAUNCH_WIFI_SETTINGS.equals(action)) {
	        Intent intent = new Intent(Settings.ACTION_WIRELESS_SETTINGS);
	        webView.getContext().startActivity(intent);
            return true;
        }
        
        if (ACTION_LAUNCH_DEVICE_INFO.equals(action)) {
	        Intent intent = new Intent(Settings.ACTION_DEVICE_INFO_SETTINGS);
	        webView.getContext().startActivity(intent);
            return true;
        }
        
        if (ACTION_LAUNCH_DEVELOPMENT_SETTINGS.equals(action)) {
	        Intent intent = new Intent(Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS);
	        webView.getContext().startActivity(intent);
            return true;
        }
        
        if (ACTION_LAUNCH_DATE_SETTINGS.equals(action)) {
	        Intent intent = new Intent(Settings.ACTION_DATE_SETTINGS);
	        webView.getContext().startActivity(intent);
            return true;
        }
        
        if (ACTION_LAUNCH_MEMORY_CARD_SETTINGS.equals(action)) {
	        Intent intent = new Intent(Settings.ACTION_MEMORY_CARD_SETTINGS);
	        webView.getContext().startActivity(intent);
            return true;
        }
        
        if (ACTION_LAUNCH_ACTION_INTENT.equals(action)) {
	        Intent intent = new Intent(args.getString(0));
	        webView.getContext().startActivity(intent);
            return true;
        }
        
        if (ACTION_LAUNCH_ACTION_INTENT.equals(action)) {
	        Intent intent = new Intent(args.getString(0));
	        webView.getContext().startActivity(intent);
            return true;
        }
        
        if (ACTION_LAUNCH_ACTION_DIALOG_INTENT.equals(action)) {
        	Intent dialogIntent = new Intent(args.getString(0));
            dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            webView.getContext().startActivity(dialogIntent);
            return true;
        }

    	callbackContext.error(action + " is not a supported function.");
    	return false;
    }
}

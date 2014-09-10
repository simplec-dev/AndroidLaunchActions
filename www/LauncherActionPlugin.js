
var LauncherActionPlugin = function() {
};

LauncherActionPlugin.prototype.launchSettings = function(successCallback, failureCallback) {
	cordova.exec(successCallback, failureCallback, 'LauncherActionPlugin', 'launchSettings', []);
};

LauncherActionPlugin.prototype.launchWifiSettings = function(successCallback, failureCallback) {
	cordova.exec(successCallback, failureCallback, 'LauncherActionPlugin', 'launchWifi', []);
};

LauncherActionPlugin.prototype.launchDeviceInfo = function(successCallback, failureCallback) {
	cordova.exec(successCallback, failureCallback, 'LauncherActionPlugin', 'launchDeviceInfo', []);
};

LauncherActionPlugin.prototype.launchDevelopmentSettings = function(successCallback, failureCallback) {
	cordova.exec(successCallback, failureCallback, 'LauncherActionPlugin', 'launchDevelopment', []);
};

LauncherActionPlugin.prototype.launchDateSettings = function(successCallback, failureCallback) {
	cordova.exec(successCallback, failureCallback, 'LauncherActionPlugin', 'launchDate', []);
};

LauncherActionPlugin.prototype.launchMemorySettings = function(successCallback, failureCallback) {
	cordova.exec(successCallback, failureCallback, 'LauncherActionPlugin', 'launchMemory', []);
};

LauncherActionPlugin.prototype.launchAction = function(action, successCallback, failureCallback) {
	cordova.exec(successCallback, failureCallback, 'LauncherActionPlugin', 'launchActionIntent', [action]);
};

LauncherActionPlugin.prototype.launchActionDialog = function(action, successCallback, failureCallback) {
	cordova.exec(successCallback, failureCallback, 'LauncherActionPlugin', 'launchActionDialogIntent', [action]);
};

module.exports = new LauncherActionPlugin();
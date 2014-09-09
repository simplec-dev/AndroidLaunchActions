
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

module.exports = new LauncherActionPlugin();
// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDeviceConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceConfigsResponseBody</p>
 */
public class GetDeviceConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDeviceConfigsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDeviceConfigsResponseBody build() {
            return new GetDeviceConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDeviceConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeviceConfigsResponseBody</p>
     */
    public static class CustomResourcePackage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigAboutLogo")
        private String configAboutLogo;

        @com.aliyun.core.annotation.NameInMap("DesktopWallpaper")
        private String desktopWallpaper;

        @com.aliyun.core.annotation.NameInMap("LoginPageBackground")
        private String loginPageBackground;

        @com.aliyun.core.annotation.NameInMap("LoginPageLogo")
        private String loginPageLogo;

        @com.aliyun.core.annotation.NameInMap("PersonalCenterLogo")
        private String personalCenterLogo;

        @com.aliyun.core.annotation.NameInMap("StartLogo")
        private String startLogo;

        @com.aliyun.core.annotation.NameInMap("StartMenuLogo")
        private String startMenuLogo;

        @com.aliyun.core.annotation.NameInMap("UpgradeLogo")
        private String upgradeLogo;

        private CustomResourcePackage(Builder builder) {
            this.configAboutLogo = builder.configAboutLogo;
            this.desktopWallpaper = builder.desktopWallpaper;
            this.loginPageBackground = builder.loginPageBackground;
            this.loginPageLogo = builder.loginPageLogo;
            this.personalCenterLogo = builder.personalCenterLogo;
            this.startLogo = builder.startLogo;
            this.startMenuLogo = builder.startMenuLogo;
            this.upgradeLogo = builder.upgradeLogo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomResourcePackage create() {
            return builder().build();
        }

        /**
         * @return configAboutLogo
         */
        public String getConfigAboutLogo() {
            return this.configAboutLogo;
        }

        /**
         * @return desktopWallpaper
         */
        public String getDesktopWallpaper() {
            return this.desktopWallpaper;
        }

        /**
         * @return loginPageBackground
         */
        public String getLoginPageBackground() {
            return this.loginPageBackground;
        }

        /**
         * @return loginPageLogo
         */
        public String getLoginPageLogo() {
            return this.loginPageLogo;
        }

        /**
         * @return personalCenterLogo
         */
        public String getPersonalCenterLogo() {
            return this.personalCenterLogo;
        }

        /**
         * @return startLogo
         */
        public String getStartLogo() {
            return this.startLogo;
        }

        /**
         * @return startMenuLogo
         */
        public String getStartMenuLogo() {
            return this.startMenuLogo;
        }

        /**
         * @return upgradeLogo
         */
        public String getUpgradeLogo() {
            return this.upgradeLogo;
        }

        public static final class Builder {
            private String configAboutLogo; 
            private String desktopWallpaper; 
            private String loginPageBackground; 
            private String loginPageLogo; 
            private String personalCenterLogo; 
            private String startLogo; 
            private String startMenuLogo; 
            private String upgradeLogo; 

            /**
             * ConfigAboutLogo.
             */
            public Builder configAboutLogo(String configAboutLogo) {
                this.configAboutLogo = configAboutLogo;
                return this;
            }

            /**
             * DesktopWallpaper.
             */
            public Builder desktopWallpaper(String desktopWallpaper) {
                this.desktopWallpaper = desktopWallpaper;
                return this;
            }

            /**
             * LoginPageBackground.
             */
            public Builder loginPageBackground(String loginPageBackground) {
                this.loginPageBackground = loginPageBackground;
                return this;
            }

            /**
             * LoginPageLogo.
             */
            public Builder loginPageLogo(String loginPageLogo) {
                this.loginPageLogo = loginPageLogo;
                return this;
            }

            /**
             * PersonalCenterLogo.
             */
            public Builder personalCenterLogo(String personalCenterLogo) {
                this.personalCenterLogo = personalCenterLogo;
                return this;
            }

            /**
             * StartLogo.
             */
            public Builder startLogo(String startLogo) {
                this.startLogo = startLogo;
                return this;
            }

            /**
             * StartMenuLogo.
             */
            public Builder startMenuLogo(String startMenuLogo) {
                this.startMenuLogo = startMenuLogo;
                return this;
            }

            /**
             * UpgradeLogo.
             */
            public Builder upgradeLogo(String upgradeLogo) {
                this.upgradeLogo = upgradeLogo;
                return this;
            }

            public CustomResourcePackage build() {
                return new CustomResourcePackage(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDeviceConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeviceConfigsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoLockScreenTime")
        private Integer autoLockScreenTime;

        @com.aliyun.core.annotation.NameInMap("AutoLogin")
        private Integer autoLogin;

        @com.aliyun.core.annotation.NameInMap("AutoUpdate")
        private Integer autoUpdate;

        @com.aliyun.core.annotation.NameInMap("CustomIdleAction")
        private Integer customIdleAction;

        @com.aliyun.core.annotation.NameInMap("CustomPowerOn")
        private Integer customPowerOn;

        @com.aliyun.core.annotation.NameInMap("CustomResourcePackage")
        private CustomResourcePackage customResourcePackage;

        @com.aliyun.core.annotation.NameInMap("DefinePowerButton")
        private Integer definePowerButton;

        @com.aliyun.core.annotation.NameInMap("DeviceLock")
        private Integer deviceLock;

        @com.aliyun.core.annotation.NameInMap("DisplayLayout")
        private String displayLayout;

        @com.aliyun.core.annotation.NameInMap("DisplayResolution")
        private String displayResolution;

        @com.aliyun.core.annotation.NameInMap("DisplayScaleRatio")
        private String displayScaleRatio;

        @com.aliyun.core.annotation.NameInMap("EnableAdb")
        private Integer enableAdb;

        @com.aliyun.core.annotation.NameInMap("EnableAutoLockScreen")
        private Integer enableAutoLockScreen;

        @com.aliyun.core.annotation.NameInMap("EnableBluetooth")
        private Integer enableBluetooth;

        @com.aliyun.core.annotation.NameInMap("EnableLockScreenPassword")
        private Integer enableLockScreenPassword;

        @com.aliyun.core.annotation.NameInMap("EnableModifyPassword")
        private Integer enableModifyPassword;

        @com.aliyun.core.annotation.NameInMap("EnableScheduledPowerOff")
        private Integer enableScheduledPowerOff;

        @com.aliyun.core.annotation.NameInMap("EnableUnlockPassword")
        private Integer enableUnlockPassword;

        @com.aliyun.core.annotation.NameInMap("EnableWlan")
        private Integer enableWlan;

        @com.aliyun.core.annotation.NameInMap("IdleTime")
        private Integer idleTime;

        @com.aliyun.core.annotation.NameInMap("LocalUsbPrint")
        private Integer localUsbPrint;

        @com.aliyun.core.annotation.NameInMap("LockPassword")
        private String lockPassword;

        @com.aliyun.core.annotation.NameInMap("ScheduledPowerOff")
        private String scheduledPowerOff;

        @com.aliyun.core.annotation.NameInMap("SecureNetworkType")
        private String secureNetworkType;

        @com.aliyun.core.annotation.NameInMap("SerialNo")
        private String serialNo;

        @com.aliyun.core.annotation.NameInMap("SleepTime")
        private Integer sleepTime;

        @com.aliyun.core.annotation.NameInMap("Urcl")
        private String urcl;

        @com.aliyun.core.annotation.NameInMap("UsbStorage")
        private Integer usbStorage;

        @com.aliyun.core.annotation.NameInMap("UserCustomId")
        private String userCustomId;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Data(Builder builder) {
            this.autoLockScreenTime = builder.autoLockScreenTime;
            this.autoLogin = builder.autoLogin;
            this.autoUpdate = builder.autoUpdate;
            this.customIdleAction = builder.customIdleAction;
            this.customPowerOn = builder.customPowerOn;
            this.customResourcePackage = builder.customResourcePackage;
            this.definePowerButton = builder.definePowerButton;
            this.deviceLock = builder.deviceLock;
            this.displayLayout = builder.displayLayout;
            this.displayResolution = builder.displayResolution;
            this.displayScaleRatio = builder.displayScaleRatio;
            this.enableAdb = builder.enableAdb;
            this.enableAutoLockScreen = builder.enableAutoLockScreen;
            this.enableBluetooth = builder.enableBluetooth;
            this.enableLockScreenPassword = builder.enableLockScreenPassword;
            this.enableModifyPassword = builder.enableModifyPassword;
            this.enableScheduledPowerOff = builder.enableScheduledPowerOff;
            this.enableUnlockPassword = builder.enableUnlockPassword;
            this.enableWlan = builder.enableWlan;
            this.idleTime = builder.idleTime;
            this.localUsbPrint = builder.localUsbPrint;
            this.lockPassword = builder.lockPassword;
            this.scheduledPowerOff = builder.scheduledPowerOff;
            this.secureNetworkType = builder.secureNetworkType;
            this.serialNo = builder.serialNo;
            this.sleepTime = builder.sleepTime;
            this.urcl = builder.urcl;
            this.usbStorage = builder.usbStorage;
            this.userCustomId = builder.userCustomId;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return autoLockScreenTime
         */
        public Integer getAutoLockScreenTime() {
            return this.autoLockScreenTime;
        }

        /**
         * @return autoLogin
         */
        public Integer getAutoLogin() {
            return this.autoLogin;
        }

        /**
         * @return autoUpdate
         */
        public Integer getAutoUpdate() {
            return this.autoUpdate;
        }

        /**
         * @return customIdleAction
         */
        public Integer getCustomIdleAction() {
            return this.customIdleAction;
        }

        /**
         * @return customPowerOn
         */
        public Integer getCustomPowerOn() {
            return this.customPowerOn;
        }

        /**
         * @return customResourcePackage
         */
        public CustomResourcePackage getCustomResourcePackage() {
            return this.customResourcePackage;
        }

        /**
         * @return definePowerButton
         */
        public Integer getDefinePowerButton() {
            return this.definePowerButton;
        }

        /**
         * @return deviceLock
         */
        public Integer getDeviceLock() {
            return this.deviceLock;
        }

        /**
         * @return displayLayout
         */
        public String getDisplayLayout() {
            return this.displayLayout;
        }

        /**
         * @return displayResolution
         */
        public String getDisplayResolution() {
            return this.displayResolution;
        }

        /**
         * @return displayScaleRatio
         */
        public String getDisplayScaleRatio() {
            return this.displayScaleRatio;
        }

        /**
         * @return enableAdb
         */
        public Integer getEnableAdb() {
            return this.enableAdb;
        }

        /**
         * @return enableAutoLockScreen
         */
        public Integer getEnableAutoLockScreen() {
            return this.enableAutoLockScreen;
        }

        /**
         * @return enableBluetooth
         */
        public Integer getEnableBluetooth() {
            return this.enableBluetooth;
        }

        /**
         * @return enableLockScreenPassword
         */
        public Integer getEnableLockScreenPassword() {
            return this.enableLockScreenPassword;
        }

        /**
         * @return enableModifyPassword
         */
        public Integer getEnableModifyPassword() {
            return this.enableModifyPassword;
        }

        /**
         * @return enableScheduledPowerOff
         */
        public Integer getEnableScheduledPowerOff() {
            return this.enableScheduledPowerOff;
        }

        /**
         * @return enableUnlockPassword
         */
        public Integer getEnableUnlockPassword() {
            return this.enableUnlockPassword;
        }

        /**
         * @return enableWlan
         */
        public Integer getEnableWlan() {
            return this.enableWlan;
        }

        /**
         * @return idleTime
         */
        public Integer getIdleTime() {
            return this.idleTime;
        }

        /**
         * @return localUsbPrint
         */
        public Integer getLocalUsbPrint() {
            return this.localUsbPrint;
        }

        /**
         * @return lockPassword
         */
        public String getLockPassword() {
            return this.lockPassword;
        }

        /**
         * @return scheduledPowerOff
         */
        public String getScheduledPowerOff() {
            return this.scheduledPowerOff;
        }

        /**
         * @return secureNetworkType
         */
        public String getSecureNetworkType() {
            return this.secureNetworkType;
        }

        /**
         * @return serialNo
         */
        public String getSerialNo() {
            return this.serialNo;
        }

        /**
         * @return sleepTime
         */
        public Integer getSleepTime() {
            return this.sleepTime;
        }

        /**
         * @return urcl
         */
        public String getUrcl() {
            return this.urcl;
        }

        /**
         * @return usbStorage
         */
        public Integer getUsbStorage() {
            return this.usbStorage;
        }

        /**
         * @return userCustomId
         */
        public String getUserCustomId() {
            return this.userCustomId;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Integer autoLockScreenTime; 
            private Integer autoLogin; 
            private Integer autoUpdate; 
            private Integer customIdleAction; 
            private Integer customPowerOn; 
            private CustomResourcePackage customResourcePackage; 
            private Integer definePowerButton; 
            private Integer deviceLock; 
            private String displayLayout; 
            private String displayResolution; 
            private String displayScaleRatio; 
            private Integer enableAdb; 
            private Integer enableAutoLockScreen; 
            private Integer enableBluetooth; 
            private Integer enableLockScreenPassword; 
            private Integer enableModifyPassword; 
            private Integer enableScheduledPowerOff; 
            private Integer enableUnlockPassword; 
            private Integer enableWlan; 
            private Integer idleTime; 
            private Integer localUsbPrint; 
            private String lockPassword; 
            private String scheduledPowerOff; 
            private String secureNetworkType; 
            private String serialNo; 
            private Integer sleepTime; 
            private String urcl; 
            private Integer usbStorage; 
            private String userCustomId; 
            private String uuid; 

            /**
             * AutoLockScreenTime.
             */
            public Builder autoLockScreenTime(Integer autoLockScreenTime) {
                this.autoLockScreenTime = autoLockScreenTime;
                return this;
            }

            /**
             * AutoLogin.
             */
            public Builder autoLogin(Integer autoLogin) {
                this.autoLogin = autoLogin;
                return this;
            }

            /**
             * AutoUpdate.
             */
            public Builder autoUpdate(Integer autoUpdate) {
                this.autoUpdate = autoUpdate;
                return this;
            }

            /**
             * CustomIdleAction.
             */
            public Builder customIdleAction(Integer customIdleAction) {
                this.customIdleAction = customIdleAction;
                return this;
            }

            /**
             * CustomPowerOn.
             */
            public Builder customPowerOn(Integer customPowerOn) {
                this.customPowerOn = customPowerOn;
                return this;
            }

            /**
             * CustomResourcePackage.
             */
            public Builder customResourcePackage(CustomResourcePackage customResourcePackage) {
                this.customResourcePackage = customResourcePackage;
                return this;
            }

            /**
             * DefinePowerButton.
             */
            public Builder definePowerButton(Integer definePowerButton) {
                this.definePowerButton = definePowerButton;
                return this;
            }

            /**
             * DeviceLock.
             */
            public Builder deviceLock(Integer deviceLock) {
                this.deviceLock = deviceLock;
                return this;
            }

            /**
             * DisplayLayout.
             */
            public Builder displayLayout(String displayLayout) {
                this.displayLayout = displayLayout;
                return this;
            }

            /**
             * DisplayResolution.
             */
            public Builder displayResolution(String displayResolution) {
                this.displayResolution = displayResolution;
                return this;
            }

            /**
             * DisplayScaleRatio.
             */
            public Builder displayScaleRatio(String displayScaleRatio) {
                this.displayScaleRatio = displayScaleRatio;
                return this;
            }

            /**
             * EnableAdb.
             */
            public Builder enableAdb(Integer enableAdb) {
                this.enableAdb = enableAdb;
                return this;
            }

            /**
             * EnableAutoLockScreen.
             */
            public Builder enableAutoLockScreen(Integer enableAutoLockScreen) {
                this.enableAutoLockScreen = enableAutoLockScreen;
                return this;
            }

            /**
             * EnableBluetooth.
             */
            public Builder enableBluetooth(Integer enableBluetooth) {
                this.enableBluetooth = enableBluetooth;
                return this;
            }

            /**
             * EnableLockScreenPassword.
             */
            public Builder enableLockScreenPassword(Integer enableLockScreenPassword) {
                this.enableLockScreenPassword = enableLockScreenPassword;
                return this;
            }

            /**
             * EnableModifyPassword.
             */
            public Builder enableModifyPassword(Integer enableModifyPassword) {
                this.enableModifyPassword = enableModifyPassword;
                return this;
            }

            /**
             * EnableScheduledPowerOff.
             */
            public Builder enableScheduledPowerOff(Integer enableScheduledPowerOff) {
                this.enableScheduledPowerOff = enableScheduledPowerOff;
                return this;
            }

            /**
             * EnableUnlockPassword.
             */
            public Builder enableUnlockPassword(Integer enableUnlockPassword) {
                this.enableUnlockPassword = enableUnlockPassword;
                return this;
            }

            /**
             * EnableWlan.
             */
            public Builder enableWlan(Integer enableWlan) {
                this.enableWlan = enableWlan;
                return this;
            }

            /**
             * IdleTime.
             */
            public Builder idleTime(Integer idleTime) {
                this.idleTime = idleTime;
                return this;
            }

            /**
             * LocalUsbPrint.
             */
            public Builder localUsbPrint(Integer localUsbPrint) {
                this.localUsbPrint = localUsbPrint;
                return this;
            }

            /**
             * LockPassword.
             */
            public Builder lockPassword(String lockPassword) {
                this.lockPassword = lockPassword;
                return this;
            }

            /**
             * ScheduledPowerOff.
             */
            public Builder scheduledPowerOff(String scheduledPowerOff) {
                this.scheduledPowerOff = scheduledPowerOff;
                return this;
            }

            /**
             * SecureNetworkType.
             */
            public Builder secureNetworkType(String secureNetworkType) {
                this.secureNetworkType = secureNetworkType;
                return this;
            }

            /**
             * SerialNo.
             */
            public Builder serialNo(String serialNo) {
                this.serialNo = serialNo;
                return this;
            }

            /**
             * SleepTime.
             */
            public Builder sleepTime(Integer sleepTime) {
                this.sleepTime = sleepTime;
                return this;
            }

            /**
             * Urcl.
             */
            public Builder urcl(String urcl) {
                this.urcl = urcl;
                return this;
            }

            /**
             * UsbStorage.
             */
            public Builder usbStorage(Integer usbStorage) {
                this.usbStorage = usbStorage;
                return this;
            }

            /**
             * UserCustomId.
             */
            public Builder userCustomId(String userCustomId) {
                this.userCustomId = userCustomId;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

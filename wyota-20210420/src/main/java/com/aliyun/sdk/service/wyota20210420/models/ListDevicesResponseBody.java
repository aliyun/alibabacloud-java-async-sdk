// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDevicesResponseBody</p>
 */
public class ListDevicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListDevicesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDevicesResponseBody create() {
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

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
        public Builder data(java.util.List < Data> data) {
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDevicesResponseBody build() {
            return new ListDevicesResponseBody(this);
        } 

    } 

    public static class ConnectConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectScript")
        private String connectScript;

        @com.aliyun.core.annotation.NameInMap("PeripheralPid")
        private String peripheralPid;

        @com.aliyun.core.annotation.NameInMap("PeripheralVid")
        private String peripheralVid;

        @com.aliyun.core.annotation.NameInMap("RedirectPolicy")
        private Integer redirectPolicy;

        private ConnectConfigs(Builder builder) {
            this.connectScript = builder.connectScript;
            this.peripheralPid = builder.peripheralPid;
            this.peripheralVid = builder.peripheralVid;
            this.redirectPolicy = builder.redirectPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectConfigs create() {
            return builder().build();
        }

        /**
         * @return connectScript
         */
        public String getConnectScript() {
            return this.connectScript;
        }

        /**
         * @return peripheralPid
         */
        public String getPeripheralPid() {
            return this.peripheralPid;
        }

        /**
         * @return peripheralVid
         */
        public String getPeripheralVid() {
            return this.peripheralVid;
        }

        /**
         * @return redirectPolicy
         */
        public Integer getRedirectPolicy() {
            return this.redirectPolicy;
        }

        public static final class Builder {
            private String connectScript; 
            private String peripheralPid; 
            private String peripheralVid; 
            private Integer redirectPolicy; 

            /**
             * ConnectScript.
             */
            public Builder connectScript(String connectScript) {
                this.connectScript = connectScript;
                return this;
            }

            /**
             * PeripheralPid.
             */
            public Builder peripheralPid(String peripheralPid) {
                this.peripheralPid = peripheralPid;
                return this;
            }

            /**
             * PeripheralVid.
             */
            public Builder peripheralVid(String peripheralVid) {
                this.peripheralVid = peripheralVid;
                return this;
            }

            /**
             * RedirectPolicy.
             */
            public Builder redirectPolicy(Integer redirectPolicy) {
                this.redirectPolicy = redirectPolicy;
                return this;
            }

            public ConnectConfigs build() {
                return new ConnectConfigs(this);
            } 

        } 

    }
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
    public static class EndUserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdDomain")
        private String adDomain;

        @com.aliyun.core.annotation.NameInMap("BindTime")
        private String bindTime;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("SerialNo")
        private String serialNo;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("UserType")
        private String userType;

        private EndUserList(Builder builder) {
            this.adDomain = builder.adDomain;
            this.bindTime = builder.bindTime;
            this.directoryId = builder.directoryId;
            this.endUserId = builder.endUserId;
            this.id = builder.id;
            this.serialNo = builder.serialNo;
            this.tenantId = builder.tenantId;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndUserList create() {
            return builder().build();
        }

        /**
         * @return adDomain
         */
        public String getAdDomain() {
            return this.adDomain;
        }

        /**
         * @return bindTime
         */
        public String getBindTime() {
            return this.bindTime;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return serialNo
         */
        public String getSerialNo() {
            return this.serialNo;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String adDomain; 
            private String bindTime; 
            private String directoryId; 
            private String endUserId; 
            private Long id; 
            private String serialNo; 
            private String tenantId; 
            private String userType; 

            /**
             * AdDomain.
             */
            public Builder adDomain(String adDomain) {
                this.adDomain = adDomain;
                return this;
            }

            /**
             * BindTime.
             */
            public Builder bindTime(String bindTime) {
                this.bindTime = bindTime;
                return this;
            }

            /**
             * DirectoryId.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * EndUserId.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
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
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * UserType.
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public EndUserList build() {
                return new EndUserList(this);
            } 

        } 

    }
    public static class LabelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("LabelId")
        private String labelId;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private LabelList(Builder builder) {
            this.content = builder.content;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.labelId = builder.labelId;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabelList create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return labelId
         */
        public String getLabelId() {
            return this.labelId;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String content; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String labelId; 
            private String tenantId; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * LabelId.
             */
            public Builder labelId(String labelId) {
                this.labelId = labelId;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public LabelList build() {
                return new LabelList(this);
            } 

        } 

    }
    public static class PeripheralConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultPolicy")
        private Integer defaultPolicy;

        @com.aliyun.core.annotation.NameInMap("PolicyStrategy")
        private Integer policyStrategy;

        @com.aliyun.core.annotation.NameInMap("UsbAndInternalCamera")
        private Integer usbAndInternalCamera;

        @com.aliyun.core.annotation.NameInMap("UsbPrinter")
        private Integer usbPrinter;

        @com.aliyun.core.annotation.NameInMap("UsbStorage")
        private Integer usbStorage;

        private PeripheralConfig(Builder builder) {
            this.defaultPolicy = builder.defaultPolicy;
            this.policyStrategy = builder.policyStrategy;
            this.usbAndInternalCamera = builder.usbAndInternalCamera;
            this.usbPrinter = builder.usbPrinter;
            this.usbStorage = builder.usbStorage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeripheralConfig create() {
            return builder().build();
        }

        /**
         * @return defaultPolicy
         */
        public Integer getDefaultPolicy() {
            return this.defaultPolicy;
        }

        /**
         * @return policyStrategy
         */
        public Integer getPolicyStrategy() {
            return this.policyStrategy;
        }

        /**
         * @return usbAndInternalCamera
         */
        public Integer getUsbAndInternalCamera() {
            return this.usbAndInternalCamera;
        }

        /**
         * @return usbPrinter
         */
        public Integer getUsbPrinter() {
            return this.usbPrinter;
        }

        /**
         * @return usbStorage
         */
        public Integer getUsbStorage() {
            return this.usbStorage;
        }

        public static final class Builder {
            private Integer defaultPolicy; 
            private Integer policyStrategy; 
            private Integer usbAndInternalCamera; 
            private Integer usbPrinter; 
            private Integer usbStorage; 

            /**
             * DefaultPolicy.
             */
            public Builder defaultPolicy(Integer defaultPolicy) {
                this.defaultPolicy = defaultPolicy;
                return this;
            }

            /**
             * PolicyStrategy.
             */
            public Builder policyStrategy(Integer policyStrategy) {
                this.policyStrategy = policyStrategy;
                return this;
            }

            /**
             * UsbAndInternalCamera.
             */
            public Builder usbAndInternalCamera(Integer usbAndInternalCamera) {
                this.usbAndInternalCamera = usbAndInternalCamera;
                return this;
            }

            /**
             * UsbPrinter.
             */
            public Builder usbPrinter(Integer usbPrinter) {
                this.usbPrinter = usbPrinter;
                return this;
            }

            /**
             * UsbStorage.
             */
            public Builder usbStorage(Integer usbStorage) {
                this.usbStorage = usbStorage;
                return this;
            }

            public PeripheralConfig build() {
                return new PeripheralConfig(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveTime")
        private String activeTime;

        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("AutoLockScreenTime")
        private Integer autoLockScreenTime;

        @com.aliyun.core.annotation.NameInMap("AutoLogin")
        private Integer autoLogin;

        @com.aliyun.core.annotation.NameInMap("AutoType")
        private String autoType;

        @com.aliyun.core.annotation.NameInMap("Bluetooth")
        private String bluetooth;

        @com.aliyun.core.annotation.NameInMap("BuildId")
        private String buildId;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientType")
        private String clientType;

        @com.aliyun.core.annotation.NameInMap("ConnectConfigs")
        private java.util.List < ConnectConfigs> connectConfigs;

        @com.aliyun.core.annotation.NameInMap("CustomIdleAction")
        private Integer customIdleAction;

        @com.aliyun.core.annotation.NameInMap("CustomPowerOn")
        private Integer customPowerOn;

        @com.aliyun.core.annotation.NameInMap("CustomProperty")
        private String customProperty;

        @com.aliyun.core.annotation.NameInMap("CustomResourcePackage")
        private CustomResourcePackage customResourcePackage;

        @com.aliyun.core.annotation.NameInMap("DefinePowerButton")
        private Integer definePowerButton;

        @com.aliyun.core.annotation.NameInMap("DeviceIpV4")
        private String deviceIpV4;

        @com.aliyun.core.annotation.NameInMap("DeviceLock")
        private Integer deviceLock;

        @com.aliyun.core.annotation.NameInMap("DeviceMqttConnectionStatus")
        private Integer deviceMqttConnectionStatus;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("DeviceOS")
        private String deviceOS;

        @com.aliyun.core.annotation.NameInMap("DevicePlatform")
        private String devicePlatform;

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

        @com.aliyun.core.annotation.NameInMap("EndUserList")
        private java.util.List < EndUserList> endUserList;

        @com.aliyun.core.annotation.NameInMap("EtherMac")
        private String etherMac;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GmtSync")
        private String gmtSync;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IdleTime")
        private Integer idleTime;

        @com.aliyun.core.annotation.NameInMap("IsActive")
        private String isActive;

        @com.aliyun.core.annotation.NameInMap("LabelList")
        private java.util.List < LabelList> labelList;

        @com.aliyun.core.annotation.NameInMap("LastLoginUser")
        private String lastLoginUser;

        @com.aliyun.core.annotation.NameInMap("LocalUsbPrint")
        private Integer localUsbPrint;

        @com.aliyun.core.annotation.NameInMap("LocationInfo")
        private String locationInfo;

        @com.aliyun.core.annotation.NameInMap("LockPassword")
        private String lockPassword;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("PeripheralConfig")
        private PeripheralConfig peripheralConfig;

        @com.aliyun.core.annotation.NameInMap("ScheduledPowerOff")
        private String scheduledPowerOff;

        @com.aliyun.core.annotation.NameInMap("SecureNetworkType")
        private String secureNetworkType;

        @com.aliyun.core.annotation.NameInMap("SerialNo")
        private String serialNo;

        @com.aliyun.core.annotation.NameInMap("SleepTime")
        private Integer sleepTime;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("UsbStorage")
        private Integer usbStorage;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("Wlan")
        private String wlan;

        private Data(Builder builder) {
            this.activeTime = builder.activeTime;
            this.alias = builder.alias;
            this.autoLockScreenTime = builder.autoLockScreenTime;
            this.autoLogin = builder.autoLogin;
            this.autoType = builder.autoType;
            this.bluetooth = builder.bluetooth;
            this.buildId = builder.buildId;
            this.clientId = builder.clientId;
            this.clientType = builder.clientType;
            this.connectConfigs = builder.connectConfigs;
            this.customIdleAction = builder.customIdleAction;
            this.customPowerOn = builder.customPowerOn;
            this.customProperty = builder.customProperty;
            this.customResourcePackage = builder.customResourcePackage;
            this.definePowerButton = builder.definePowerButton;
            this.deviceIpV4 = builder.deviceIpV4;
            this.deviceLock = builder.deviceLock;
            this.deviceMqttConnectionStatus = builder.deviceMqttConnectionStatus;
            this.deviceName = builder.deviceName;
            this.deviceOS = builder.deviceOS;
            this.devicePlatform = builder.devicePlatform;
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
            this.endUserList = builder.endUserList;
            this.etherMac = builder.etherMac;
            this.gmtModified = builder.gmtModified;
            this.gmtSync = builder.gmtSync;
            this.id = builder.id;
            this.idleTime = builder.idleTime;
            this.isActive = builder.isActive;
            this.labelList = builder.labelList;
            this.lastLoginUser = builder.lastLoginUser;
            this.localUsbPrint = builder.localUsbPrint;
            this.locationInfo = builder.locationInfo;
            this.lockPassword = builder.lockPassword;
            this.model = builder.model;
            this.orderId = builder.orderId;
            this.peripheralConfig = builder.peripheralConfig;
            this.scheduledPowerOff = builder.scheduledPowerOff;
            this.secureNetworkType = builder.secureNetworkType;
            this.serialNo = builder.serialNo;
            this.sleepTime = builder.sleepTime;
            this.source = builder.source;
            this.tenantId = builder.tenantId;
            this.usbStorage = builder.usbStorage;
            this.uuid = builder.uuid;
            this.wlan = builder.wlan;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activeTime
         */
        public String getActiveTime() {
            return this.activeTime;
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
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
         * @return autoType
         */
        public String getAutoType() {
            return this.autoType;
        }

        /**
         * @return bluetooth
         */
        public String getBluetooth() {
            return this.bluetooth;
        }

        /**
         * @return buildId
         */
        public String getBuildId() {
            return this.buildId;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clientType
         */
        public String getClientType() {
            return this.clientType;
        }

        /**
         * @return connectConfigs
         */
        public java.util.List < ConnectConfigs> getConnectConfigs() {
            return this.connectConfigs;
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
         * @return customProperty
         */
        public String getCustomProperty() {
            return this.customProperty;
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
         * @return deviceIpV4
         */
        public String getDeviceIpV4() {
            return this.deviceIpV4;
        }

        /**
         * @return deviceLock
         */
        public Integer getDeviceLock() {
            return this.deviceLock;
        }

        /**
         * @return deviceMqttConnectionStatus
         */
        public Integer getDeviceMqttConnectionStatus() {
            return this.deviceMqttConnectionStatus;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return deviceOS
         */
        public String getDeviceOS() {
            return this.deviceOS;
        }

        /**
         * @return devicePlatform
         */
        public String getDevicePlatform() {
            return this.devicePlatform;
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
         * @return endUserList
         */
        public java.util.List < EndUserList> getEndUserList() {
            return this.endUserList;
        }

        /**
         * @return etherMac
         */
        public String getEtherMac() {
            return this.etherMac;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gmtSync
         */
        public String getGmtSync() {
            return this.gmtSync;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return idleTime
         */
        public Integer getIdleTime() {
            return this.idleTime;
        }

        /**
         * @return isActive
         */
        public String getIsActive() {
            return this.isActive;
        }

        /**
         * @return labelList
         */
        public java.util.List < LabelList> getLabelList() {
            return this.labelList;
        }

        /**
         * @return lastLoginUser
         */
        public String getLastLoginUser() {
            return this.lastLoginUser;
        }

        /**
         * @return localUsbPrint
         */
        public Integer getLocalUsbPrint() {
            return this.localUsbPrint;
        }

        /**
         * @return locationInfo
         */
        public String getLocationInfo() {
            return this.locationInfo;
        }

        /**
         * @return lockPassword
         */
        public String getLockPassword() {
            return this.lockPassword;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return peripheralConfig
         */
        public PeripheralConfig getPeripheralConfig() {
            return this.peripheralConfig;
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
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return usbStorage
         */
        public Integer getUsbStorage() {
            return this.usbStorage;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return wlan
         */
        public String getWlan() {
            return this.wlan;
        }

        public static final class Builder {
            private String activeTime; 
            private String alias; 
            private Integer autoLockScreenTime; 
            private Integer autoLogin; 
            private String autoType; 
            private String bluetooth; 
            private String buildId; 
            private String clientId; 
            private String clientType; 
            private java.util.List < ConnectConfigs> connectConfigs; 
            private Integer customIdleAction; 
            private Integer customPowerOn; 
            private String customProperty; 
            private CustomResourcePackage customResourcePackage; 
            private Integer definePowerButton; 
            private String deviceIpV4; 
            private Integer deviceLock; 
            private Integer deviceMqttConnectionStatus; 
            private String deviceName; 
            private String deviceOS; 
            private String devicePlatform; 
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
            private java.util.List < EndUserList> endUserList; 
            private String etherMac; 
            private String gmtModified; 
            private String gmtSync; 
            private Long id; 
            private Integer idleTime; 
            private String isActive; 
            private java.util.List < LabelList> labelList; 
            private String lastLoginUser; 
            private Integer localUsbPrint; 
            private String locationInfo; 
            private String lockPassword; 
            private String model; 
            private String orderId; 
            private PeripheralConfig peripheralConfig; 
            private String scheduledPowerOff; 
            private String secureNetworkType; 
            private String serialNo; 
            private Integer sleepTime; 
            private String source; 
            private String tenantId; 
            private Integer usbStorage; 
            private String uuid; 
            private String wlan; 

            /**
             * ActiveTime.
             */
            public Builder activeTime(String activeTime) {
                this.activeTime = activeTime;
                return this;
            }

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

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
             * AutoType.
             */
            public Builder autoType(String autoType) {
                this.autoType = autoType;
                return this;
            }

            /**
             * Bluetooth.
             */
            public Builder bluetooth(String bluetooth) {
                this.bluetooth = bluetooth;
                return this;
            }

            /**
             * BuildId.
             */
            public Builder buildId(String buildId) {
                this.buildId = buildId;
                return this;
            }

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * ClientType.
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * ConnectConfigs.
             */
            public Builder connectConfigs(java.util.List < ConnectConfigs> connectConfigs) {
                this.connectConfigs = connectConfigs;
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
             * CustomProperty.
             */
            public Builder customProperty(String customProperty) {
                this.customProperty = customProperty;
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
             * DeviceIpV4.
             */
            public Builder deviceIpV4(String deviceIpV4) {
                this.deviceIpV4 = deviceIpV4;
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
             * DeviceMqttConnectionStatus.
             */
            public Builder deviceMqttConnectionStatus(Integer deviceMqttConnectionStatus) {
                this.deviceMqttConnectionStatus = deviceMqttConnectionStatus;
                return this;
            }

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * DeviceOS.
             */
            public Builder deviceOS(String deviceOS) {
                this.deviceOS = deviceOS;
                return this;
            }

            /**
             * DevicePlatform.
             */
            public Builder devicePlatform(String devicePlatform) {
                this.devicePlatform = devicePlatform;
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
             * EndUserList.
             */
            public Builder endUserList(java.util.List < EndUserList> endUserList) {
                this.endUserList = endUserList;
                return this;
            }

            /**
             * EtherMac.
             */
            public Builder etherMac(String etherMac) {
                this.etherMac = etherMac;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GmtSync.
             */
            public Builder gmtSync(String gmtSync) {
                this.gmtSync = gmtSync;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
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
             * IsActive.
             */
            public Builder isActive(String isActive) {
                this.isActive = isActive;
                return this;
            }

            /**
             * LabelList.
             */
            public Builder labelList(java.util.List < LabelList> labelList) {
                this.labelList = labelList;
                return this;
            }

            /**
             * LastLoginUser.
             */
            public Builder lastLoginUser(String lastLoginUser) {
                this.lastLoginUser = lastLoginUser;
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
             * LocationInfo.
             */
            public Builder locationInfo(String locationInfo) {
                this.locationInfo = locationInfo;
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
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * PeripheralConfig.
             */
            public Builder peripheralConfig(PeripheralConfig peripheralConfig) {
                this.peripheralConfig = peripheralConfig;
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
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
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
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * Wlan.
             */
            public Builder wlan(String wlan) {
                this.wlan = wlan;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

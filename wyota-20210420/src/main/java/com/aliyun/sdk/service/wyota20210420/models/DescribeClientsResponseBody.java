// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeClientsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClientsResponseBody</p>
 */
public class DescribeClientsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeClientsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClientsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeClientsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

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
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeClientsResponseBody build() {
            return new DescribeClientsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClientsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClientsResponseBody</p>
     */
    public static class FunctionSupport extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnablePolicy")
        private Boolean enablePolicy;

        @com.aliyun.core.annotation.NameInMap("PasswordFreeLoginForbiddenReason")
        private String passwordFreeLoginForbiddenReason;

        @com.aliyun.core.annotation.NameInMap("SupportAssistLogin")
        private Boolean supportAssistLogin;

        @com.aliyun.core.annotation.NameInMap("SupportDiagnose")
        private Boolean supportDiagnose;

        @com.aliyun.core.annotation.NameInMap("SupportLimitLoginUser")
        private Boolean supportLimitLoginUser;

        @com.aliyun.core.annotation.NameInMap("SupportLocalDeviceSn")
        private Boolean supportLocalDeviceSn;

        @com.aliyun.core.annotation.NameInMap("SupportManage")
        private Boolean supportManage;

        @com.aliyun.core.annotation.NameInMap("SupportModifyPolicy")
        private Boolean supportModifyPolicy;

        @com.aliyun.core.annotation.NameInMap("SupportPasswordFreeLogin")
        private Boolean supportPasswordFreeLogin;

        @com.aliyun.core.annotation.NameInMap("SupportReboot")
        private Boolean supportReboot;

        @com.aliyun.core.annotation.NameInMap("SupportReset")
        private Boolean supportReset;

        @com.aliyun.core.annotation.NameInMap("SupportResetPin")
        private Boolean supportResetPin;

        @com.aliyun.core.annotation.NameInMap("SupportStop")
        private Boolean supportStop;

        @com.aliyun.core.annotation.NameInMap("SupportUpgrade")
        private Boolean supportUpgrade;

        @com.aliyun.core.annotation.NameInMap("UnsupportAssistLoginReason")
        private String unsupportAssistLoginReason;

        @com.aliyun.core.annotation.NameInMap("UnsupportManageReason")
        private String unsupportManageReason;

        @com.aliyun.core.annotation.NameInMap("UnsupportedLocalDeviceSnReason")
        private String unsupportedLocalDeviceSnReason;

        @com.aliyun.core.annotation.NameInMap("VersionSupported")
        private Boolean versionSupported;

        @com.aliyun.core.annotation.NameInMap("VersionTooLow")
        private Boolean versionTooLow;

        private FunctionSupport(Builder builder) {
            this.enablePolicy = builder.enablePolicy;
            this.passwordFreeLoginForbiddenReason = builder.passwordFreeLoginForbiddenReason;
            this.supportAssistLogin = builder.supportAssistLogin;
            this.supportDiagnose = builder.supportDiagnose;
            this.supportLimitLoginUser = builder.supportLimitLoginUser;
            this.supportLocalDeviceSn = builder.supportLocalDeviceSn;
            this.supportManage = builder.supportManage;
            this.supportModifyPolicy = builder.supportModifyPolicy;
            this.supportPasswordFreeLogin = builder.supportPasswordFreeLogin;
            this.supportReboot = builder.supportReboot;
            this.supportReset = builder.supportReset;
            this.supportResetPin = builder.supportResetPin;
            this.supportStop = builder.supportStop;
            this.supportUpgrade = builder.supportUpgrade;
            this.unsupportAssistLoginReason = builder.unsupportAssistLoginReason;
            this.unsupportManageReason = builder.unsupportManageReason;
            this.unsupportedLocalDeviceSnReason = builder.unsupportedLocalDeviceSnReason;
            this.versionSupported = builder.versionSupported;
            this.versionTooLow = builder.versionTooLow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FunctionSupport create() {
            return builder().build();
        }

        /**
         * @return enablePolicy
         */
        public Boolean getEnablePolicy() {
            return this.enablePolicy;
        }

        /**
         * @return passwordFreeLoginForbiddenReason
         */
        public String getPasswordFreeLoginForbiddenReason() {
            return this.passwordFreeLoginForbiddenReason;
        }

        /**
         * @return supportAssistLogin
         */
        public Boolean getSupportAssistLogin() {
            return this.supportAssistLogin;
        }

        /**
         * @return supportDiagnose
         */
        public Boolean getSupportDiagnose() {
            return this.supportDiagnose;
        }

        /**
         * @return supportLimitLoginUser
         */
        public Boolean getSupportLimitLoginUser() {
            return this.supportLimitLoginUser;
        }

        /**
         * @return supportLocalDeviceSn
         */
        public Boolean getSupportLocalDeviceSn() {
            return this.supportLocalDeviceSn;
        }

        /**
         * @return supportManage
         */
        public Boolean getSupportManage() {
            return this.supportManage;
        }

        /**
         * @return supportModifyPolicy
         */
        public Boolean getSupportModifyPolicy() {
            return this.supportModifyPolicy;
        }

        /**
         * @return supportPasswordFreeLogin
         */
        public Boolean getSupportPasswordFreeLogin() {
            return this.supportPasswordFreeLogin;
        }

        /**
         * @return supportReboot
         */
        public Boolean getSupportReboot() {
            return this.supportReboot;
        }

        /**
         * @return supportReset
         */
        public Boolean getSupportReset() {
            return this.supportReset;
        }

        /**
         * @return supportResetPin
         */
        public Boolean getSupportResetPin() {
            return this.supportResetPin;
        }

        /**
         * @return supportStop
         */
        public Boolean getSupportStop() {
            return this.supportStop;
        }

        /**
         * @return supportUpgrade
         */
        public Boolean getSupportUpgrade() {
            return this.supportUpgrade;
        }

        /**
         * @return unsupportAssistLoginReason
         */
        public String getUnsupportAssistLoginReason() {
            return this.unsupportAssistLoginReason;
        }

        /**
         * @return unsupportManageReason
         */
        public String getUnsupportManageReason() {
            return this.unsupportManageReason;
        }

        /**
         * @return unsupportedLocalDeviceSnReason
         */
        public String getUnsupportedLocalDeviceSnReason() {
            return this.unsupportedLocalDeviceSnReason;
        }

        /**
         * @return versionSupported
         */
        public Boolean getVersionSupported() {
            return this.versionSupported;
        }

        /**
         * @return versionTooLow
         */
        public Boolean getVersionTooLow() {
            return this.versionTooLow;
        }

        public static final class Builder {
            private Boolean enablePolicy; 
            private String passwordFreeLoginForbiddenReason; 
            private Boolean supportAssistLogin; 
            private Boolean supportDiagnose; 
            private Boolean supportLimitLoginUser; 
            private Boolean supportLocalDeviceSn; 
            private Boolean supportManage; 
            private Boolean supportModifyPolicy; 
            private Boolean supportPasswordFreeLogin; 
            private Boolean supportReboot; 
            private Boolean supportReset; 
            private Boolean supportResetPin; 
            private Boolean supportStop; 
            private Boolean supportUpgrade; 
            private String unsupportAssistLoginReason; 
            private String unsupportManageReason; 
            private String unsupportedLocalDeviceSnReason; 
            private Boolean versionSupported; 
            private Boolean versionTooLow; 

            private Builder() {
            } 

            private Builder(FunctionSupport model) {
                this.enablePolicy = model.enablePolicy;
                this.passwordFreeLoginForbiddenReason = model.passwordFreeLoginForbiddenReason;
                this.supportAssistLogin = model.supportAssistLogin;
                this.supportDiagnose = model.supportDiagnose;
                this.supportLimitLoginUser = model.supportLimitLoginUser;
                this.supportLocalDeviceSn = model.supportLocalDeviceSn;
                this.supportManage = model.supportManage;
                this.supportModifyPolicy = model.supportModifyPolicy;
                this.supportPasswordFreeLogin = model.supportPasswordFreeLogin;
                this.supportReboot = model.supportReboot;
                this.supportReset = model.supportReset;
                this.supportResetPin = model.supportResetPin;
                this.supportStop = model.supportStop;
                this.supportUpgrade = model.supportUpgrade;
                this.unsupportAssistLoginReason = model.unsupportAssistLoginReason;
                this.unsupportManageReason = model.unsupportManageReason;
                this.unsupportedLocalDeviceSnReason = model.unsupportedLocalDeviceSnReason;
                this.versionSupported = model.versionSupported;
                this.versionTooLow = model.versionTooLow;
            } 

            /**
             * EnablePolicy.
             */
            public Builder enablePolicy(Boolean enablePolicy) {
                this.enablePolicy = enablePolicy;
                return this;
            }

            /**
             * PasswordFreeLoginForbiddenReason.
             */
            public Builder passwordFreeLoginForbiddenReason(String passwordFreeLoginForbiddenReason) {
                this.passwordFreeLoginForbiddenReason = passwordFreeLoginForbiddenReason;
                return this;
            }

            /**
             * SupportAssistLogin.
             */
            public Builder supportAssistLogin(Boolean supportAssistLogin) {
                this.supportAssistLogin = supportAssistLogin;
                return this;
            }

            /**
             * SupportDiagnose.
             */
            public Builder supportDiagnose(Boolean supportDiagnose) {
                this.supportDiagnose = supportDiagnose;
                return this;
            }

            /**
             * SupportLimitLoginUser.
             */
            public Builder supportLimitLoginUser(Boolean supportLimitLoginUser) {
                this.supportLimitLoginUser = supportLimitLoginUser;
                return this;
            }

            /**
             * SupportLocalDeviceSn.
             */
            public Builder supportLocalDeviceSn(Boolean supportLocalDeviceSn) {
                this.supportLocalDeviceSn = supportLocalDeviceSn;
                return this;
            }

            /**
             * SupportManage.
             */
            public Builder supportManage(Boolean supportManage) {
                this.supportManage = supportManage;
                return this;
            }

            /**
             * SupportModifyPolicy.
             */
            public Builder supportModifyPolicy(Boolean supportModifyPolicy) {
                this.supportModifyPolicy = supportModifyPolicy;
                return this;
            }

            /**
             * SupportPasswordFreeLogin.
             */
            public Builder supportPasswordFreeLogin(Boolean supportPasswordFreeLogin) {
                this.supportPasswordFreeLogin = supportPasswordFreeLogin;
                return this;
            }

            /**
             * SupportReboot.
             */
            public Builder supportReboot(Boolean supportReboot) {
                this.supportReboot = supportReboot;
                return this;
            }

            /**
             * SupportReset.
             */
            public Builder supportReset(Boolean supportReset) {
                this.supportReset = supportReset;
                return this;
            }

            /**
             * SupportResetPin.
             */
            public Builder supportResetPin(Boolean supportResetPin) {
                this.supportResetPin = supportResetPin;
                return this;
            }

            /**
             * SupportStop.
             */
            public Builder supportStop(Boolean supportStop) {
                this.supportStop = supportStop;
                return this;
            }

            /**
             * SupportUpgrade.
             */
            public Builder supportUpgrade(Boolean supportUpgrade) {
                this.supportUpgrade = supportUpgrade;
                return this;
            }

            /**
             * UnsupportAssistLoginReason.
             */
            public Builder unsupportAssistLoginReason(String unsupportAssistLoginReason) {
                this.unsupportAssistLoginReason = unsupportAssistLoginReason;
                return this;
            }

            /**
             * UnsupportManageReason.
             */
            public Builder unsupportManageReason(String unsupportManageReason) {
                this.unsupportManageReason = unsupportManageReason;
                return this;
            }

            /**
             * UnsupportedLocalDeviceSnReason.
             */
            public Builder unsupportedLocalDeviceSnReason(String unsupportedLocalDeviceSnReason) {
                this.unsupportedLocalDeviceSnReason = unsupportedLocalDeviceSnReason;
                return this;
            }

            /**
             * VersionSupported.
             */
            public Builder versionSupported(Boolean versionSupported) {
                this.versionSupported = versionSupported;
                return this;
            }

            /**
             * VersionTooLow.
             */
            public Builder versionTooLow(Boolean versionTooLow) {
                this.versionTooLow = versionTooLow;
                return this;
            }

            public FunctionSupport build() {
                return new FunctionSupport(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClientsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClientsResponseBody</p>
     */
    public static class HardwareInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bluetooth")
        private String bluetooth;

        @com.aliyun.core.annotation.NameInMap("ChipId")
        private String chipId;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("Mac")
        private String mac;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("Storage")
        private String storage;

        @com.aliyun.core.annotation.NameInMap("Wlan")
        private String wlan;

        private HardwareInfo(Builder builder) {
            this.bluetooth = builder.bluetooth;
            this.chipId = builder.chipId;
            this.cpu = builder.cpu;
            this.mac = builder.mac;
            this.memory = builder.memory;
            this.storage = builder.storage;
            this.wlan = builder.wlan;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HardwareInfo create() {
            return builder().build();
        }

        /**
         * @return bluetooth
         */
        public String getBluetooth() {
            return this.bluetooth;
        }

        /**
         * @return chipId
         */
        public String getChipId() {
            return this.chipId;
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return storage
         */
        public String getStorage() {
            return this.storage;
        }

        /**
         * @return wlan
         */
        public String getWlan() {
            return this.wlan;
        }

        public static final class Builder {
            private String bluetooth; 
            private String chipId; 
            private String cpu; 
            private String mac; 
            private String memory; 
            private String storage; 
            private String wlan; 

            private Builder() {
            } 

            private Builder(HardwareInfo model) {
                this.bluetooth = model.bluetooth;
                this.chipId = model.chipId;
                this.cpu = model.cpu;
                this.mac = model.mac;
                this.memory = model.memory;
                this.storage = model.storage;
                this.wlan = model.wlan;
            } 

            /**
             * Bluetooth.
             */
            public Builder bluetooth(String bluetooth) {
                this.bluetooth = bluetooth;
                return this;
            }

            /**
             * <p>chipId</p>
             * 
             * <strong>example:</strong>
             * <p>7fa062813c5ac970</p>
             */
            public Builder chipId(String chipId) {
                this.chipId = chipId;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Mac.
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * Storage.
             */
            public Builder storage(String storage) {
                this.storage = storage;
                return this;
            }

            /**
             * <p>wifi mac</p>
             * 
             * <strong>example:</strong>
             * <p>54:f2:9f:bc:fe:cc</p>
             */
            public Builder wlan(String wlan) {
                this.wlan = wlan;
                return this;
            }

            public HardwareInfo build() {
                return new HardwareInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClientsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClientsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("AreaSite")
        private String areaSite;

        @com.aliyun.core.annotation.NameInMap("BindUserCount")
        private Integer bindUserCount;

        @com.aliyun.core.annotation.NameInMap("BindUserId")
        private String bindUserId;

        @com.aliyun.core.annotation.NameInMap("BuildId")
        private String buildId;

        @com.aliyun.core.annotation.NameInMap("ClientType")
        private Integer clientType;

        @com.aliyun.core.annotation.NameInMap("ClientVersion")
        private String clientVersion;

        @com.aliyun.core.annotation.NameInMap("CurrentConnectDesktop")
        private String currentConnectDesktop;

        @com.aliyun.core.annotation.NameInMap("CurrentLoginUser")
        private String currentLoginUser;

        @com.aliyun.core.annotation.NameInMap("CustomResInvalidReason")
        private String customResInvalidReason;

        @com.aliyun.core.annotation.NameInMap("CustomResourceId")
        private String customResourceId;

        @com.aliyun.core.annotation.NameInMap("CustomResourceName")
        private String customResourceName;

        @com.aliyun.core.annotation.NameInMap("CustomResourceStatus")
        private Boolean customResourceStatus;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopRegionId")
        private String desktopRegionId;

        @com.aliyun.core.annotation.NameInMap("DeviceOs")
        private String deviceOs;

        @com.aliyun.core.annotation.NameInMap("FunctionSupport")
        private FunctionSupport functionSupport;

        @com.aliyun.core.annotation.NameInMap("HardwareInfo")
        private HardwareInfo hardwareInfo;

        @com.aliyun.core.annotation.NameInMap("HostOsInfo")
        private String hostOsInfo;

        @com.aliyun.core.annotation.NameInMap("InManage")
        private Boolean inManage;

        @com.aliyun.core.annotation.NameInMap("IpGeoLocation")
        private String ipGeoLocation;

        @com.aliyun.core.annotation.NameInMap("Ipv4")
        private String ipv4;

        @com.aliyun.core.annotation.NameInMap("LastLoginUser")
        private String lastLoginUser;

        @com.aliyun.core.annotation.NameInMap("LocalDeviceSn")
        private String localDeviceSn;

        @com.aliyun.core.annotation.NameInMap("LocationInfo")
        private String locationInfo;

        @com.aliyun.core.annotation.NameInMap("LoginUser")
        private String loginUser;

        @com.aliyun.core.annotation.NameInMap("MainBizType")
        private String mainBizType;

        @com.aliyun.core.annotation.NameInMap("ManageTime")
        private String manageTime;

        @com.aliyun.core.annotation.NameInMap("ManageTimestamp")
        private Long manageTimestamp;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("ModelPreviewUrl")
        private String modelPreviewUrl;

        @com.aliyun.core.annotation.NameInMap("Online")
        private Boolean online;

        @com.aliyun.core.annotation.NameInMap("OnlineStatus")
        private Boolean onlineStatus;

        @com.aliyun.core.annotation.NameInMap("PasswordFreeLoginUser")
        private String passwordFreeLoginUser;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("PublicIpv4")
        private String publicIpv4;

        @com.aliyun.core.annotation.NameInMap("SetPasswordFreeLoginUserTime")
        private String setPasswordFreeLoginUserTime;

        @com.aliyun.core.annotation.NameInMap("TerminalGroupId")
        private String terminalGroupId;

        @com.aliyun.core.annotation.NameInMap("UpgradeDownloadType")
        private String upgradeDownloadType;

        @com.aliyun.core.annotation.NameInMap("UserBindCount")
        private Integer userBindCount;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("WosAppVersion")
        private String wosAppVersion;

        private Data(Builder builder) {
            this.aliUid = builder.aliUid;
            this.alias = builder.alias;
            this.areaSite = builder.areaSite;
            this.bindUserCount = builder.bindUserCount;
            this.bindUserId = builder.bindUserId;
            this.buildId = builder.buildId;
            this.clientType = builder.clientType;
            this.clientVersion = builder.clientVersion;
            this.currentConnectDesktop = builder.currentConnectDesktop;
            this.currentLoginUser = builder.currentLoginUser;
            this.customResInvalidReason = builder.customResInvalidReason;
            this.customResourceId = builder.customResourceId;
            this.customResourceName = builder.customResourceName;
            this.customResourceStatus = builder.customResourceStatus;
            this.desktopId = builder.desktopId;
            this.desktopRegionId = builder.desktopRegionId;
            this.deviceOs = builder.deviceOs;
            this.functionSupport = builder.functionSupport;
            this.hardwareInfo = builder.hardwareInfo;
            this.hostOsInfo = builder.hostOsInfo;
            this.inManage = builder.inManage;
            this.ipGeoLocation = builder.ipGeoLocation;
            this.ipv4 = builder.ipv4;
            this.lastLoginUser = builder.lastLoginUser;
            this.localDeviceSn = builder.localDeviceSn;
            this.locationInfo = builder.locationInfo;
            this.loginUser = builder.loginUser;
            this.mainBizType = builder.mainBizType;
            this.manageTime = builder.manageTime;
            this.manageTimestamp = builder.manageTimestamp;
            this.model = builder.model;
            this.modelPreviewUrl = builder.modelPreviewUrl;
            this.online = builder.online;
            this.onlineStatus = builder.onlineStatus;
            this.passwordFreeLoginUser = builder.passwordFreeLoginUser;
            this.platform = builder.platform;
            this.productName = builder.productName;
            this.publicIpv4 = builder.publicIpv4;
            this.setPasswordFreeLoginUserTime = builder.setPasswordFreeLoginUserTime;
            this.terminalGroupId = builder.terminalGroupId;
            this.upgradeDownloadType = builder.upgradeDownloadType;
            this.userBindCount = builder.userBindCount;
            this.uuid = builder.uuid;
            this.wosAppVersion = builder.wosAppVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return areaSite
         */
        public String getAreaSite() {
            return this.areaSite;
        }

        /**
         * @return bindUserCount
         */
        public Integer getBindUserCount() {
            return this.bindUserCount;
        }

        /**
         * @return bindUserId
         */
        public String getBindUserId() {
            return this.bindUserId;
        }

        /**
         * @return buildId
         */
        public String getBuildId() {
            return this.buildId;
        }

        /**
         * @return clientType
         */
        public Integer getClientType() {
            return this.clientType;
        }

        /**
         * @return clientVersion
         */
        public String getClientVersion() {
            return this.clientVersion;
        }

        /**
         * @return currentConnectDesktop
         */
        public String getCurrentConnectDesktop() {
            return this.currentConnectDesktop;
        }

        /**
         * @return currentLoginUser
         */
        public String getCurrentLoginUser() {
            return this.currentLoginUser;
        }

        /**
         * @return customResInvalidReason
         */
        public String getCustomResInvalidReason() {
            return this.customResInvalidReason;
        }

        /**
         * @return customResourceId
         */
        public String getCustomResourceId() {
            return this.customResourceId;
        }

        /**
         * @return customResourceName
         */
        public String getCustomResourceName() {
            return this.customResourceName;
        }

        /**
         * @return customResourceStatus
         */
        public Boolean getCustomResourceStatus() {
            return this.customResourceStatus;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return desktopRegionId
         */
        public String getDesktopRegionId() {
            return this.desktopRegionId;
        }

        /**
         * @return deviceOs
         */
        public String getDeviceOs() {
            return this.deviceOs;
        }

        /**
         * @return functionSupport
         */
        public FunctionSupport getFunctionSupport() {
            return this.functionSupport;
        }

        /**
         * @return hardwareInfo
         */
        public HardwareInfo getHardwareInfo() {
            return this.hardwareInfo;
        }

        /**
         * @return hostOsInfo
         */
        public String getHostOsInfo() {
            return this.hostOsInfo;
        }

        /**
         * @return inManage
         */
        public Boolean getInManage() {
            return this.inManage;
        }

        /**
         * @return ipGeoLocation
         */
        public String getIpGeoLocation() {
            return this.ipGeoLocation;
        }

        /**
         * @return ipv4
         */
        public String getIpv4() {
            return this.ipv4;
        }

        /**
         * @return lastLoginUser
         */
        public String getLastLoginUser() {
            return this.lastLoginUser;
        }

        /**
         * @return localDeviceSn
         */
        public String getLocalDeviceSn() {
            return this.localDeviceSn;
        }

        /**
         * @return locationInfo
         */
        public String getLocationInfo() {
            return this.locationInfo;
        }

        /**
         * @return loginUser
         */
        public String getLoginUser() {
            return this.loginUser;
        }

        /**
         * @return mainBizType
         */
        public String getMainBizType() {
            return this.mainBizType;
        }

        /**
         * @return manageTime
         */
        public String getManageTime() {
            return this.manageTime;
        }

        /**
         * @return manageTimestamp
         */
        public Long getManageTimestamp() {
            return this.manageTimestamp;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return modelPreviewUrl
         */
        public String getModelPreviewUrl() {
            return this.modelPreviewUrl;
        }

        /**
         * @return online
         */
        public Boolean getOnline() {
            return this.online;
        }

        /**
         * @return onlineStatus
         */
        public Boolean getOnlineStatus() {
            return this.onlineStatus;
        }

        /**
         * @return passwordFreeLoginUser
         */
        public String getPasswordFreeLoginUser() {
            return this.passwordFreeLoginUser;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return publicIpv4
         */
        public String getPublicIpv4() {
            return this.publicIpv4;
        }

        /**
         * @return setPasswordFreeLoginUserTime
         */
        public String getSetPasswordFreeLoginUserTime() {
            return this.setPasswordFreeLoginUserTime;
        }

        /**
         * @return terminalGroupId
         */
        public String getTerminalGroupId() {
            return this.terminalGroupId;
        }

        /**
         * @return upgradeDownloadType
         */
        public String getUpgradeDownloadType() {
            return this.upgradeDownloadType;
        }

        /**
         * @return userBindCount
         */
        public Integer getUserBindCount() {
            return this.userBindCount;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return wosAppVersion
         */
        public String getWosAppVersion() {
            return this.wosAppVersion;
        }

        public static final class Builder {
            private Long aliUid; 
            private String alias; 
            private String areaSite; 
            private Integer bindUserCount; 
            private String bindUserId; 
            private String buildId; 
            private Integer clientType; 
            private String clientVersion; 
            private String currentConnectDesktop; 
            private String currentLoginUser; 
            private String customResInvalidReason; 
            private String customResourceId; 
            private String customResourceName; 
            private Boolean customResourceStatus; 
            private String desktopId; 
            private String desktopRegionId; 
            private String deviceOs; 
            private FunctionSupport functionSupport; 
            private HardwareInfo hardwareInfo; 
            private String hostOsInfo; 
            private Boolean inManage; 
            private String ipGeoLocation; 
            private String ipv4; 
            private String lastLoginUser; 
            private String localDeviceSn; 
            private String locationInfo; 
            private String loginUser; 
            private String mainBizType; 
            private String manageTime; 
            private Long manageTimestamp; 
            private String model; 
            private String modelPreviewUrl; 
            private Boolean online; 
            private Boolean onlineStatus; 
            private String passwordFreeLoginUser; 
            private String platform; 
            private String productName; 
            private String publicIpv4; 
            private String setPasswordFreeLoginUserTime; 
            private String terminalGroupId; 
            private String upgradeDownloadType; 
            private Integer userBindCount; 
            private String uuid; 
            private String wosAppVersion; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliUid = model.aliUid;
                this.alias = model.alias;
                this.areaSite = model.areaSite;
                this.bindUserCount = model.bindUserCount;
                this.bindUserId = model.bindUserId;
                this.buildId = model.buildId;
                this.clientType = model.clientType;
                this.clientVersion = model.clientVersion;
                this.currentConnectDesktop = model.currentConnectDesktop;
                this.currentLoginUser = model.currentLoginUser;
                this.customResInvalidReason = model.customResInvalidReason;
                this.customResourceId = model.customResourceId;
                this.customResourceName = model.customResourceName;
                this.customResourceStatus = model.customResourceStatus;
                this.desktopId = model.desktopId;
                this.desktopRegionId = model.desktopRegionId;
                this.deviceOs = model.deviceOs;
                this.functionSupport = model.functionSupport;
                this.hardwareInfo = model.hardwareInfo;
                this.hostOsInfo = model.hostOsInfo;
                this.inManage = model.inManage;
                this.ipGeoLocation = model.ipGeoLocation;
                this.ipv4 = model.ipv4;
                this.lastLoginUser = model.lastLoginUser;
                this.localDeviceSn = model.localDeviceSn;
                this.locationInfo = model.locationInfo;
                this.loginUser = model.loginUser;
                this.mainBizType = model.mainBizType;
                this.manageTime = model.manageTime;
                this.manageTimestamp = model.manageTimestamp;
                this.model = model.model;
                this.modelPreviewUrl = model.modelPreviewUrl;
                this.online = model.online;
                this.onlineStatus = model.onlineStatus;
                this.passwordFreeLoginUser = model.passwordFreeLoginUser;
                this.platform = model.platform;
                this.productName = model.productName;
                this.publicIpv4 = model.publicIpv4;
                this.setPasswordFreeLoginUserTime = model.setPasswordFreeLoginUserTime;
                this.terminalGroupId = model.terminalGroupId;
                this.upgradeDownloadType = model.upgradeDownloadType;
                this.userBindCount = model.userBindCount;
                this.uuid = model.uuid;
                this.wosAppVersion = model.wosAppVersion;
            } 

            /**
             * <p>aliUid</p>
             * 
             * <strong>example:</strong>
             * <p>1627390268362106</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
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
             * AreaSite.
             */
            public Builder areaSite(String areaSite) {
                this.areaSite = areaSite;
                return this;
            }

            /**
             * BindUserCount.
             */
            public Builder bindUserCount(Integer bindUserCount) {
                this.bindUserCount = bindUserCount;
                return this;
            }

            /**
             * BindUserId.
             */
            public Builder bindUserId(String bindUserId) {
                this.bindUserId = bindUserId;
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
             * ClientType.
             */
            public Builder clientType(Integer clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * ClientVersion.
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * CurrentConnectDesktop.
             */
            public Builder currentConnectDesktop(String currentConnectDesktop) {
                this.currentConnectDesktop = currentConnectDesktop;
                return this;
            }

            /**
             * CurrentLoginUser.
             */
            public Builder currentLoginUser(String currentLoginUser) {
                this.currentLoginUser = currentLoginUser;
                return this;
            }

            /**
             * CustomResInvalidReason.
             */
            public Builder customResInvalidReason(String customResInvalidReason) {
                this.customResInvalidReason = customResInvalidReason;
                return this;
            }

            /**
             * CustomResourceId.
             */
            public Builder customResourceId(String customResourceId) {
                this.customResourceId = customResourceId;
                return this;
            }

            /**
             * CustomResourceName.
             */
            public Builder customResourceName(String customResourceName) {
                this.customResourceName = customResourceName;
                return this;
            }

            /**
             * CustomResourceStatus.
             */
            public Builder customResourceStatus(Boolean customResourceStatus) {
                this.customResourceStatus = customResourceStatus;
                return this;
            }

            /**
             * DesktopId.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * DesktopRegionId.
             */
            public Builder desktopRegionId(String desktopRegionId) {
                this.desktopRegionId = desktopRegionId;
                return this;
            }

            /**
             * DeviceOs.
             */
            public Builder deviceOs(String deviceOs) {
                this.deviceOs = deviceOs;
                return this;
            }

            /**
             * FunctionSupport.
             */
            public Builder functionSupport(FunctionSupport functionSupport) {
                this.functionSupport = functionSupport;
                return this;
            }

            /**
             * HardwareInfo.
             */
            public Builder hardwareInfo(HardwareInfo hardwareInfo) {
                this.hardwareInfo = hardwareInfo;
                return this;
            }

            /**
             * HostOsInfo.
             */
            public Builder hostOsInfo(String hostOsInfo) {
                this.hostOsInfo = hostOsInfo;
                return this;
            }

            /**
             * InManage.
             */
            public Builder inManage(Boolean inManage) {
                this.inManage = inManage;
                return this;
            }

            /**
             * IpGeoLocation.
             */
            public Builder ipGeoLocation(String ipGeoLocation) {
                this.ipGeoLocation = ipGeoLocation;
                return this;
            }

            /**
             * <p>ipv4</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder ipv4(String ipv4) {
                this.ipv4 = ipv4;
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
             * LocalDeviceSn.
             */
            public Builder localDeviceSn(String localDeviceSn) {
                this.localDeviceSn = localDeviceSn;
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
             * LoginUser.
             */
            public Builder loginUser(String loginUser) {
                this.loginUser = loginUser;
                return this;
            }

            /**
             * MainBizType.
             */
            public Builder mainBizType(String mainBizType) {
                this.mainBizType = mainBizType;
                return this;
            }

            /**
             * ManageTime.
             */
            public Builder manageTime(String manageTime) {
                this.manageTime = manageTime;
                return this;
            }

            /**
             * ManageTimestamp.
             */
            public Builder manageTimestamp(Long manageTimestamp) {
                this.manageTimestamp = manageTimestamp;
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
             * ModelPreviewUrl.
             */
            public Builder modelPreviewUrl(String modelPreviewUrl) {
                this.modelPreviewUrl = modelPreviewUrl;
                return this;
            }

            /**
             * Online.
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * OnlineStatus.
             */
            public Builder onlineStatus(Boolean onlineStatus) {
                this.onlineStatus = onlineStatus;
                return this;
            }

            /**
             * PasswordFreeLoginUser.
             */
            public Builder passwordFreeLoginUser(String passwordFreeLoginUser) {
                this.passwordFreeLoginUser = passwordFreeLoginUser;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>productName</p>
             * 
             * <strong>example:</strong>
             * <p>dm</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * PublicIpv4.
             */
            public Builder publicIpv4(String publicIpv4) {
                this.publicIpv4 = publicIpv4;
                return this;
            }

            /**
             * SetPasswordFreeLoginUserTime.
             */
            public Builder setPasswordFreeLoginUserTime(String setPasswordFreeLoginUserTime) {
                this.setPasswordFreeLoginUserTime = setPasswordFreeLoginUserTime;
                return this;
            }

            /**
             * TerminalGroupId.
             */
            public Builder terminalGroupId(String terminalGroupId) {
                this.terminalGroupId = terminalGroupId;
                return this;
            }

            /**
             * UpgradeDownloadType.
             */
            public Builder upgradeDownloadType(String upgradeDownloadType) {
                this.upgradeDownloadType = upgradeDownloadType;
                return this;
            }

            /**
             * UserBindCount.
             */
            public Builder userBindCount(Integer userBindCount) {
                this.userBindCount = userBindCount;
                return this;
            }

            /**
             * <p>uuid</p>
             * 
             * <strong>example:</strong>
             * <p>04873D3898B51A7DF2455C1E1DC9****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>appVersion</p>
             * 
             * <strong>example:</strong>
             * <p>7.0.2-RS-***</p>
             */
            public Builder wosAppVersion(String wosAppVersion) {
                this.wosAppVersion = wosAppVersion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

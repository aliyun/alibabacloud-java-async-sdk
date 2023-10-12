// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDevicesResponseBody</p>
 */
public class ListDevicesResponseBody extends TeaModel {
    @NameInMap("AmountDetail")
    private String amountDetail;

    @NameInMap("AmountUsed")
    private Integer amountUsed;

    @NameInMap("Devices")
    private java.util.List < Devices> devices;

    @NameInMap("IotCoefficient")
    private Integer iotCoefficient;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NetworkCoefficient")
    private Integer networkCoefficient;

    @NameInMap("NetworkMaintenanceCoefficient")
    private Integer networkMaintenanceCoefficient;

    @NameInMap("NextToken")
    private Integer nextToken;

    @NameInMap("OtherCoefficient")
    private Integer otherCoefficient;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServerCoefficient")
    private Integer serverCoefficient;

    @NameInMap("ServerMaintenanceCoefficient")
    private Integer serverMaintenanceCoefficient;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListDevicesResponseBody(Builder builder) {
        this.amountDetail = builder.amountDetail;
        this.amountUsed = builder.amountUsed;
        this.devices = builder.devices;
        this.iotCoefficient = builder.iotCoefficient;
        this.maxResults = builder.maxResults;
        this.networkCoefficient = builder.networkCoefficient;
        this.networkMaintenanceCoefficient = builder.networkMaintenanceCoefficient;
        this.nextToken = builder.nextToken;
        this.otherCoefficient = builder.otherCoefficient;
        this.requestId = builder.requestId;
        this.serverCoefficient = builder.serverCoefficient;
        this.serverMaintenanceCoefficient = builder.serverMaintenanceCoefficient;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return amountDetail
     */
    public String getAmountDetail() {
        return this.amountDetail;
    }

    /**
     * @return amountUsed
     */
    public Integer getAmountUsed() {
        return this.amountUsed;
    }

    /**
     * @return devices
     */
    public java.util.List < Devices> getDevices() {
        return this.devices;
    }

    /**
     * @return iotCoefficient
     */
    public Integer getIotCoefficient() {
        return this.iotCoefficient;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return networkCoefficient
     */
    public Integer getNetworkCoefficient() {
        return this.networkCoefficient;
    }

    /**
     * @return networkMaintenanceCoefficient
     */
    public Integer getNetworkMaintenanceCoefficient() {
        return this.networkMaintenanceCoefficient;
    }

    /**
     * @return nextToken
     */
    public Integer getNextToken() {
        return this.nextToken;
    }

    /**
     * @return otherCoefficient
     */
    public Integer getOtherCoefficient() {
        return this.otherCoefficient;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serverCoefficient
     */
    public Integer getServerCoefficient() {
        return this.serverCoefficient;
    }

    /**
     * @return serverMaintenanceCoefficient
     */
    public Integer getServerMaintenanceCoefficient() {
        return this.serverMaintenanceCoefficient;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String amountDetail; 
        private Integer amountUsed; 
        private java.util.List < Devices> devices; 
        private Integer iotCoefficient; 
        private Integer maxResults; 
        private Integer networkCoefficient; 
        private Integer networkMaintenanceCoefficient; 
        private Integer nextToken; 
        private Integer otherCoefficient; 
        private String requestId; 
        private Integer serverCoefficient; 
        private Integer serverMaintenanceCoefficient; 
        private Integer totalCount; 

        /**
         * AmountDetail.
         */
        public Builder amountDetail(String amountDetail) {
            this.amountDetail = amountDetail;
            return this;
        }

        /**
         * AmountUsed.
         */
        public Builder amountUsed(Integer amountUsed) {
            this.amountUsed = amountUsed;
            return this;
        }

        /**
         * Devices.
         */
        public Builder devices(java.util.List < Devices> devices) {
            this.devices = devices;
            return this;
        }

        /**
         * IotCoefficient.
         */
        public Builder iotCoefficient(Integer iotCoefficient) {
            this.iotCoefficient = iotCoefficient;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NetworkCoefficient.
         */
        public Builder networkCoefficient(Integer networkCoefficient) {
            this.networkCoefficient = networkCoefficient;
            return this;
        }

        /**
         * NetworkMaintenanceCoefficient.
         */
        public Builder networkMaintenanceCoefficient(Integer networkMaintenanceCoefficient) {
            this.networkMaintenanceCoefficient = networkMaintenanceCoefficient;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(Integer nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OtherCoefficient.
         */
        public Builder otherCoefficient(Integer otherCoefficient) {
            this.otherCoefficient = otherCoefficient;
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
         * ServerCoefficient.
         */
        public Builder serverCoefficient(Integer serverCoefficient) {
            this.serverCoefficient = serverCoefficient;
            return this;
        }

        /**
         * ServerMaintenanceCoefficient.
         */
        public Builder serverMaintenanceCoefficient(Integer serverMaintenanceCoefficient) {
            this.serverMaintenanceCoefficient = serverMaintenanceCoefficient;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDevicesResponseBody build() {
            return new ListDevicesResponseBody(this);
        } 

    } 

    public static class Devices extends TeaModel {
        @NameInMap("DeviceFormId")
        private String deviceFormId;

        @NameInMap("DeviceFormName")
        private String deviceFormName;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("EnablePassword")
        private String enablePassword;

        @NameInMap("ExtAttributes")
        private String extAttributes;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("LoginPassword")
        private String loginPassword;

        @NameInMap("LoginType")
        private String loginType;

        @NameInMap("LoginUsername")
        private String loginUsername;

        @NameInMap("Mac")
        private String mac;

        @NameInMap("Model")
        private String model;

        @NameInMap("PhysicalSpaceId")
        private String physicalSpaceId;

        @NameInMap("PhysicalSpaceName")
        private String physicalSpaceName;

        @NameInMap("SecurityDomain")
        private String securityDomain;

        @NameInMap("ServiceStatus")
        private String serviceStatus;

        @NameInMap("Sn")
        private String sn;

        @NameInMap("SnmpAccountType")
        private String snmpAccountType;

        @NameInMap("SnmpAccountVersion")
        private String snmpAccountVersion;

        @NameInMap("SnmpAuthPassphrase")
        private String snmpAuthPassphrase;

        @NameInMap("SnmpAuthProtocol")
        private String snmpAuthProtocol;

        @NameInMap("SnmpCommunity")
        private String snmpCommunity;

        @NameInMap("SnmpPrivacyPassphrase")
        private String snmpPrivacyPassphrase;

        @NameInMap("SnmpPrivacyProtocol")
        private String snmpPrivacyProtocol;

        @NameInMap("SnmpSecurityLevel")
        private String snmpSecurityLevel;

        @NameInMap("SnmpUsername")
        private String snmpUsername;

        @NameInMap("Vendor")
        private String vendor;

        private Devices(Builder builder) {
            this.deviceFormId = builder.deviceFormId;
            this.deviceFormName = builder.deviceFormName;
            this.deviceId = builder.deviceId;
            this.enablePassword = builder.enablePassword;
            this.extAttributes = builder.extAttributes;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.hostName = builder.hostName;
            this.ip = builder.ip;
            this.loginPassword = builder.loginPassword;
            this.loginType = builder.loginType;
            this.loginUsername = builder.loginUsername;
            this.mac = builder.mac;
            this.model = builder.model;
            this.physicalSpaceId = builder.physicalSpaceId;
            this.physicalSpaceName = builder.physicalSpaceName;
            this.securityDomain = builder.securityDomain;
            this.serviceStatus = builder.serviceStatus;
            this.sn = builder.sn;
            this.snmpAccountType = builder.snmpAccountType;
            this.snmpAccountVersion = builder.snmpAccountVersion;
            this.snmpAuthPassphrase = builder.snmpAuthPassphrase;
            this.snmpAuthProtocol = builder.snmpAuthProtocol;
            this.snmpCommunity = builder.snmpCommunity;
            this.snmpPrivacyPassphrase = builder.snmpPrivacyPassphrase;
            this.snmpPrivacyProtocol = builder.snmpPrivacyProtocol;
            this.snmpSecurityLevel = builder.snmpSecurityLevel;
            this.snmpUsername = builder.snmpUsername;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Devices create() {
            return builder().build();
        }

        /**
         * @return deviceFormId
         */
        public String getDeviceFormId() {
            return this.deviceFormId;
        }

        /**
         * @return deviceFormName
         */
        public String getDeviceFormName() {
            return this.deviceFormName;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return enablePassword
         */
        public String getEnablePassword() {
            return this.enablePassword;
        }

        /**
         * @return extAttributes
         */
        public String getExtAttributes() {
            return this.extAttributes;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return loginPassword
         */
        public String getLoginPassword() {
            return this.loginPassword;
        }

        /**
         * @return loginType
         */
        public String getLoginType() {
            return this.loginType;
        }

        /**
         * @return loginUsername
         */
        public String getLoginUsername() {
            return this.loginUsername;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return physicalSpaceId
         */
        public String getPhysicalSpaceId() {
            return this.physicalSpaceId;
        }

        /**
         * @return physicalSpaceName
         */
        public String getPhysicalSpaceName() {
            return this.physicalSpaceName;
        }

        /**
         * @return securityDomain
         */
        public String getSecurityDomain() {
            return this.securityDomain;
        }

        /**
         * @return serviceStatus
         */
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        /**
         * @return snmpAccountType
         */
        public String getSnmpAccountType() {
            return this.snmpAccountType;
        }

        /**
         * @return snmpAccountVersion
         */
        public String getSnmpAccountVersion() {
            return this.snmpAccountVersion;
        }

        /**
         * @return snmpAuthPassphrase
         */
        public String getSnmpAuthPassphrase() {
            return this.snmpAuthPassphrase;
        }

        /**
         * @return snmpAuthProtocol
         */
        public String getSnmpAuthProtocol() {
            return this.snmpAuthProtocol;
        }

        /**
         * @return snmpCommunity
         */
        public String getSnmpCommunity() {
            return this.snmpCommunity;
        }

        /**
         * @return snmpPrivacyPassphrase
         */
        public String getSnmpPrivacyPassphrase() {
            return this.snmpPrivacyPassphrase;
        }

        /**
         * @return snmpPrivacyProtocol
         */
        public String getSnmpPrivacyProtocol() {
            return this.snmpPrivacyProtocol;
        }

        /**
         * @return snmpSecurityLevel
         */
        public String getSnmpSecurityLevel() {
            return this.snmpSecurityLevel;
        }

        /**
         * @return snmpUsername
         */
        public String getSnmpUsername() {
            return this.snmpUsername;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String deviceFormId; 
            private String deviceFormName; 
            private String deviceId; 
            private String enablePassword; 
            private String extAttributes; 
            private String gmtCreate; 
            private String gmtModified; 
            private String hostName; 
            private String ip; 
            private String loginPassword; 
            private String loginType; 
            private String loginUsername; 
            private String mac; 
            private String model; 
            private String physicalSpaceId; 
            private String physicalSpaceName; 
            private String securityDomain; 
            private String serviceStatus; 
            private String sn; 
            private String snmpAccountType; 
            private String snmpAccountVersion; 
            private String snmpAuthPassphrase; 
            private String snmpAuthProtocol; 
            private String snmpCommunity; 
            private String snmpPrivacyPassphrase; 
            private String snmpPrivacyProtocol; 
            private String snmpSecurityLevel; 
            private String snmpUsername; 
            private String vendor; 

            /**
             * DeviceFormId.
             */
            public Builder deviceFormId(String deviceFormId) {
                this.deviceFormId = deviceFormId;
                return this;
            }

            /**
             * DeviceFormName.
             */
            public Builder deviceFormName(String deviceFormName) {
                this.deviceFormName = deviceFormName;
                return this;
            }

            /**
             * 设备ID
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * EnablePassword.
             */
            public Builder enablePassword(String enablePassword) {
                this.enablePassword = enablePassword;
                return this;
            }

            /**
             * 设备额外属性(JSON)
             */
            public Builder extAttributes(String extAttributes) {
                this.extAttributes = extAttributes;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
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
             * 主机名
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * 设备IP
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * 登录账号
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * 登录类型，SSH或者TELNET
             */
            public Builder loginType(String loginType) {
                this.loginType = loginType;
                return this;
            }

            /**
             * 登录账号
             */
            public Builder loginUsername(String loginUsername) {
                this.loginUsername = loginUsername;
                return this;
            }

            /**
             * 设备MAC地址
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * 设备型号
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * 物理空间ID
             */
            public Builder physicalSpaceId(String physicalSpaceId) {
                this.physicalSpaceId = physicalSpaceId;
                return this;
            }

            /**
             * 物理空间名称
             */
            public Builder physicalSpaceName(String physicalSpaceName) {
                this.physicalSpaceName = physicalSpaceName;
                return this;
            }

            /**
             * 设备安全域
             */
            public Builder securityDomain(String securityDomain) {
                this.securityDomain = securityDomain;
                return this;
            }

            /**
             * 设备状态
             */
            public Builder serviceStatus(String serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * 设备SN
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            /**
             * SNMP 账号类型
             */
            public Builder snmpAccountType(String snmpAccountType) {
                this.snmpAccountType = snmpAccountType;
                return this;
            }

            /**
             * SNMP版本号
             */
            public Builder snmpAccountVersion(String snmpAccountVersion) {
                this.snmpAccountVersion = snmpAccountVersion;
                return this;
            }

            /**
             * SNMP Auth PassPhrase
             */
            public Builder snmpAuthPassphrase(String snmpAuthPassphrase) {
                this.snmpAuthPassphrase = snmpAuthPassphrase;
                return this;
            }

            /**
             * SNMP Auth Protocol
             */
            public Builder snmpAuthProtocol(String snmpAuthProtocol) {
                this.snmpAuthProtocol = snmpAuthProtocol;
                return this;
            }

            /**
             * SNMP Community
             */
            public Builder snmpCommunity(String snmpCommunity) {
                this.snmpCommunity = snmpCommunity;
                return this;
            }

            /**
             * SNMP Privacy Passphrase
             */
            public Builder snmpPrivacyPassphrase(String snmpPrivacyPassphrase) {
                this.snmpPrivacyPassphrase = snmpPrivacyPassphrase;
                return this;
            }

            /**
             * SNMP Privacy Protocol
             */
            public Builder snmpPrivacyProtocol(String snmpPrivacyProtocol) {
                this.snmpPrivacyProtocol = snmpPrivacyProtocol;
                return this;
            }

            /**
             * SNMP 安全级别
             */
            public Builder snmpSecurityLevel(String snmpSecurityLevel) {
                this.snmpSecurityLevel = snmpSecurityLevel;
                return this;
            }

            /**
             * SNMP 用户名
             */
            public Builder snmpUsername(String snmpUsername) {
                this.snmpUsername = snmpUsername;
                return this;
            }

            /**
             * 设备厂商
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public Devices build() {
                return new Devices(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceResponseBody</p>
 */
public class GetDeviceResponseBody extends TeaModel {
    @NameInMap("Device")
    private Device device;

    @NameInMap("RequestId")
    private String requestId;

    private GetDeviceResponseBody(Builder builder) {
        this.device = builder.device;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceResponseBody create() {
        return builder().build();
    }

    /**
     * @return device
     */
    public Device getDevice() {
        return this.device;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Device device; 
        private String requestId; 

        /**
         * Device.
         */
        public Builder device(Device device) {
            this.device = device;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDeviceResponseBody build() {
            return new GetDeviceResponseBody(this);
        } 

    } 

    public static class Device extends TeaModel {
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

        private Device(Builder builder) {
            this.deviceFormId = builder.deviceFormId;
            this.deviceFormName = builder.deviceFormName;
            this.deviceId = builder.deviceId;
            this.enablePassword = builder.enablePassword;
            this.extAttributes = builder.extAttributes;
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

        public static Device create() {
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
             * enable密码
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

            public Device build() {
                return new Device(this);
            } 

        } 

    }
}

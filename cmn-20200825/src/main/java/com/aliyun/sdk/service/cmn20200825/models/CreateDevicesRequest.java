// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDevicesRequest} extends {@link RequestModel}
 *
 * <p>CreateDevicesRequest</p>
 */
public class CreateDevicesRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Body
    @NameInMap("DeviceFormId")
    @Validation(required = true)
    private String deviceFormId;

    @Body
    @NameInMap("DeviceParamModelList")
    private java.util.List < DeviceParamModelList> deviceParamModelList;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private CreateDevicesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.deviceFormId = builder.deviceFormId;
        this.deviceParamModelList = builder.deviceParamModelList;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deviceFormId
     */
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

    /**
     * @return deviceParamModelList
     */
    public java.util.List < DeviceParamModelList> getDeviceParamModelList() {
        return this.deviceParamModelList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<CreateDevicesRequest, Builder> {
        private String clientToken; 
        private String deviceFormId; 
        private java.util.List < DeviceParamModelList> deviceParamModelList; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDevicesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.deviceFormId = request.deviceFormId;
            this.deviceParamModelList = request.deviceParamModelList;
            this.instanceId = request.instanceId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DeviceFormId.
         */
        public Builder deviceFormId(String deviceFormId) {
            this.putBodyParameter("DeviceFormId", deviceFormId);
            this.deviceFormId = deviceFormId;
            return this;
        }

        /**
         * DeviceParamModelList.
         */
        public Builder deviceParamModelList(java.util.List < DeviceParamModelList> deviceParamModelList) {
            String deviceParamModelListShrink = shrink(deviceParamModelList, "DeviceParamModelList", "json");
            this.putBodyParameter("DeviceParamModelList", deviceParamModelListShrink);
            this.deviceParamModelList = deviceParamModelList;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public CreateDevicesRequest build() {
            return new CreateDevicesRequest(this);
        } 

    } 

    public static class DeviceParamModelList extends TeaModel {
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

        @NameInMap("PhysicalSpaceName")
        @Validation(required = true)
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

        private DeviceParamModelList(Builder builder) {
            this.enablePassword = builder.enablePassword;
            this.extAttributes = builder.extAttributes;
            this.hostName = builder.hostName;
            this.ip = builder.ip;
            this.loginPassword = builder.loginPassword;
            this.loginType = builder.loginType;
            this.loginUsername = builder.loginUsername;
            this.mac = builder.mac;
            this.model = builder.model;
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

        public static DeviceParamModelList create() {
            return builder().build();
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
            private String enablePassword; 
            private String extAttributes; 
            private String hostName; 
            private String ip; 
            private String loginPassword; 
            private String loginType; 
            private String loginUsername; 
            private String mac; 
            private String model; 
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
             * EnablePassword.
             */
            public Builder enablePassword(String enablePassword) {
                this.enablePassword = enablePassword;
                return this;
            }

            /**
             * ExtAttributes.
             */
            public Builder extAttributes(String extAttributes) {
                this.extAttributes = extAttributes;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * LoginPassword.
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * LoginType.
             */
            public Builder loginType(String loginType) {
                this.loginType = loginType;
                return this;
            }

            /**
             * LoginUsername.
             */
            public Builder loginUsername(String loginUsername) {
                this.loginUsername = loginUsername;
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
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * PhysicalSpaceName.
             */
            public Builder physicalSpaceName(String physicalSpaceName) {
                this.physicalSpaceName = physicalSpaceName;
                return this;
            }

            /**
             * SecurityDomain.
             */
            public Builder securityDomain(String securityDomain) {
                this.securityDomain = securityDomain;
                return this;
            }

            /**
             * ServiceStatus.
             */
            public Builder serviceStatus(String serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * Sn.
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            /**
             * SnmpAccountType.
             */
            public Builder snmpAccountType(String snmpAccountType) {
                this.snmpAccountType = snmpAccountType;
                return this;
            }

            /**
             * SnmpAccountVersion.
             */
            public Builder snmpAccountVersion(String snmpAccountVersion) {
                this.snmpAccountVersion = snmpAccountVersion;
                return this;
            }

            /**
             * SnmpAuthPassphrase.
             */
            public Builder snmpAuthPassphrase(String snmpAuthPassphrase) {
                this.snmpAuthPassphrase = snmpAuthPassphrase;
                return this;
            }

            /**
             * SnmpAuthProtocol.
             */
            public Builder snmpAuthProtocol(String snmpAuthProtocol) {
                this.snmpAuthProtocol = snmpAuthProtocol;
                return this;
            }

            /**
             * SnmpCommunity.
             */
            public Builder snmpCommunity(String snmpCommunity) {
                this.snmpCommunity = snmpCommunity;
                return this;
            }

            /**
             * SnmpPrivacyPassphrase.
             */
            public Builder snmpPrivacyPassphrase(String snmpPrivacyPassphrase) {
                this.snmpPrivacyPassphrase = snmpPrivacyPassphrase;
                return this;
            }

            /**
             * SnmpPrivacyProtocol.
             */
            public Builder snmpPrivacyProtocol(String snmpPrivacyProtocol) {
                this.snmpPrivacyProtocol = snmpPrivacyProtocol;
                return this;
            }

            /**
             * SnmpSecurityLevel.
             */
            public Builder snmpSecurityLevel(String snmpSecurityLevel) {
                this.snmpSecurityLevel = snmpSecurityLevel;
                return this;
            }

            /**
             * SnmpUsername.
             */
            public Builder snmpUsername(String snmpUsername) {
                this.snmpUsername = snmpUsername;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public DeviceParamModelList build() {
                return new DeviceParamModelList(this);
            } 

        } 

    }
}

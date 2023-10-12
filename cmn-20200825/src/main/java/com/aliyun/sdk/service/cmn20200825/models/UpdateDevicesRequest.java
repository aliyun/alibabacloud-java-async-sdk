// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDevicesRequest} extends {@link RequestModel}
 *
 * <p>UpdateDevicesRequest</p>
 */
public class UpdateDevicesRequest extends Request {
    @Body
    @NameInMap("DeviceIds")
    @Validation(required = true)
    private java.util.List < String > deviceIds;

    @Body
    @NameInMap("EnablePassword")
    private String enablePassword;

    @Body
    @NameInMap("ExtAttributes")
    private String extAttributes;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("LoginPassword")
    private String loginPassword;

    @Body
    @NameInMap("LoginType")
    private String loginType;

    @Body
    @NameInMap("LoginUsername")
    private String loginUsername;

    @Body
    @NameInMap("Model")
    private String model;

    @Body
    @NameInMap("PhysicalSpaceId")
    private String physicalSpaceId;

    @Body
    @NameInMap("PhysicalSpaceName")
    private String physicalSpaceName;

    @Body
    @NameInMap("SecurityDomain")
    private String securityDomain;

    @Body
    @NameInMap("ServiceStatus")
    private String serviceStatus;

    @Body
    @NameInMap("SnmpAccountType")
    private String snmpAccountType;

    @Body
    @NameInMap("SnmpAccountVersion")
    private String snmpAccountVersion;

    @Body
    @NameInMap("SnmpAuthPassphrase")
    private String snmpAuthPassphrase;

    @Body
    @NameInMap("SnmpAuthProtocol")
    private String snmpAuthProtocol;

    @Body
    @NameInMap("SnmpCommunity")
    private String snmpCommunity;

    @Body
    @NameInMap("SnmpPrivacyPassphrase")
    private String snmpPrivacyPassphrase;

    @Body
    @NameInMap("SnmpPrivacyProtocol")
    private String snmpPrivacyProtocol;

    @Body
    @NameInMap("SnmpSecurityLevel")
    private String snmpSecurityLevel;

    @Body
    @NameInMap("SnmpUsername")
    private String snmpUsername;

    @Body
    @NameInMap("Vendor")
    private String vendor;

    private UpdateDevicesRequest(Builder builder) {
        super(builder);
        this.deviceIds = builder.deviceIds;
        this.enablePassword = builder.enablePassword;
        this.extAttributes = builder.extAttributes;
        this.instanceId = builder.instanceId;
        this.loginPassword = builder.loginPassword;
        this.loginType = builder.loginType;
        this.loginUsername = builder.loginUsername;
        this.model = builder.model;
        this.physicalSpaceId = builder.physicalSpaceId;
        this.physicalSpaceName = builder.physicalSpaceName;
        this.securityDomain = builder.securityDomain;
        this.serviceStatus = builder.serviceStatus;
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

    public static UpdateDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceIds
     */
    public java.util.List < String > getDeviceIds() {
        return this.deviceIds;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<UpdateDevicesRequest, Builder> {
        private java.util.List < String > deviceIds; 
        private String enablePassword; 
        private String extAttributes; 
        private String instanceId; 
        private String loginPassword; 
        private String loginType; 
        private String loginUsername; 
        private String model; 
        private String physicalSpaceId; 
        private String physicalSpaceName; 
        private String securityDomain; 
        private String serviceStatus; 
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

        private Builder() {
            super();
        } 

        private Builder(UpdateDevicesRequest request) {
            super(request);
            this.deviceIds = request.deviceIds;
            this.enablePassword = request.enablePassword;
            this.extAttributes = request.extAttributes;
            this.instanceId = request.instanceId;
            this.loginPassword = request.loginPassword;
            this.loginType = request.loginType;
            this.loginUsername = request.loginUsername;
            this.model = request.model;
            this.physicalSpaceId = request.physicalSpaceId;
            this.physicalSpaceName = request.physicalSpaceName;
            this.securityDomain = request.securityDomain;
            this.serviceStatus = request.serviceStatus;
            this.snmpAccountType = request.snmpAccountType;
            this.snmpAccountVersion = request.snmpAccountVersion;
            this.snmpAuthPassphrase = request.snmpAuthPassphrase;
            this.snmpAuthProtocol = request.snmpAuthProtocol;
            this.snmpCommunity = request.snmpCommunity;
            this.snmpPrivacyPassphrase = request.snmpPrivacyPassphrase;
            this.snmpPrivacyProtocol = request.snmpPrivacyProtocol;
            this.snmpSecurityLevel = request.snmpSecurityLevel;
            this.snmpUsername = request.snmpUsername;
            this.vendor = request.vendor;
        } 

        /**
         * 设备ID
         */
        public Builder deviceIds(java.util.List < String > deviceIds) {
            String deviceIdsShrink = shrink(deviceIds, "DeviceIds", "json");
            this.putBodyParameter("DeviceIds", deviceIdsShrink);
            this.deviceIds = deviceIds;
            return this;
        }

        /**
         * EnablePassword.
         */
        public Builder enablePassword(String enablePassword) {
            this.putBodyParameter("EnablePassword", enablePassword);
            this.enablePassword = enablePassword;
            return this;
        }

        /**
         * ExtAttributes.
         */
        public Builder extAttributes(String extAttributes) {
            this.putBodyParameter("ExtAttributes", extAttributes);
            this.extAttributes = extAttributes;
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

        /**
         * 设备TELNET账号
         */
        public Builder loginPassword(String loginPassword) {
            this.putBodyParameter("LoginPassword", loginPassword);
            this.loginPassword = loginPassword;
            return this;
        }

        /**
         * 设备SSH登录账号
         */
        public Builder loginType(String loginType) {
            this.putBodyParameter("LoginType", loginType);
            this.loginType = loginType;
            return this;
        }

        /**
         * 设备SSH登录密码
         */
        public Builder loginUsername(String loginUsername) {
            this.putBodyParameter("LoginUsername", loginUsername);
            this.loginUsername = loginUsername;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * PhysicalSpaceId.
         */
        public Builder physicalSpaceId(String physicalSpaceId) {
            this.putBodyParameter("PhysicalSpaceId", physicalSpaceId);
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }

        /**
         * PhysicalSpaceName.
         */
        public Builder physicalSpaceName(String physicalSpaceName) {
            this.putBodyParameter("PhysicalSpaceName", physicalSpaceName);
            this.physicalSpaceName = physicalSpaceName;
            return this;
        }

        /**
         * SecurityDomain.
         */
        public Builder securityDomain(String securityDomain) {
            this.putBodyParameter("SecurityDomain", securityDomain);
            this.securityDomain = securityDomain;
            return this;
        }

        /**
         * ServiceStatus.
         */
        public Builder serviceStatus(String serviceStatus) {
            this.putBodyParameter("ServiceStatus", serviceStatus);
            this.serviceStatus = serviceStatus;
            return this;
        }

        /**
         * 账号类型
         */
        public Builder snmpAccountType(String snmpAccountType) {
            this.putBodyParameter("SnmpAccountType", snmpAccountType);
            this.snmpAccountType = snmpAccountType;
            return this;
        }

        /**
         * SNMP版本号
         */
        public Builder snmpAccountVersion(String snmpAccountVersion) {
            this.putBodyParameter("SnmpAccountVersion", snmpAccountVersion);
            this.snmpAccountVersion = snmpAccountVersion;
            return this;
        }

        /**
         * Auth PassPhrase
         */
        public Builder snmpAuthPassphrase(String snmpAuthPassphrase) {
            this.putBodyParameter("SnmpAuthPassphrase", snmpAuthPassphrase);
            this.snmpAuthPassphrase = snmpAuthPassphrase;
            return this;
        }

        /**
         * SnmpAuthProtocol.
         */
        public Builder snmpAuthProtocol(String snmpAuthProtocol) {
            this.putBodyParameter("SnmpAuthProtocol", snmpAuthProtocol);
            this.snmpAuthProtocol = snmpAuthProtocol;
            return this;
        }

        /**
         * Community
         */
        public Builder snmpCommunity(String snmpCommunity) {
            this.putBodyParameter("SnmpCommunity", snmpCommunity);
            this.snmpCommunity = snmpCommunity;
            return this;
        }

        /**
         * Privacy Passphase
         */
        public Builder snmpPrivacyPassphrase(String snmpPrivacyPassphrase) {
            this.putBodyParameter("SnmpPrivacyPassphrase", snmpPrivacyPassphrase);
            this.snmpPrivacyPassphrase = snmpPrivacyPassphrase;
            return this;
        }

        /**
         * Privacy Protocol
         */
        public Builder snmpPrivacyProtocol(String snmpPrivacyProtocol) {
            this.putBodyParameter("SnmpPrivacyProtocol", snmpPrivacyProtocol);
            this.snmpPrivacyProtocol = snmpPrivacyProtocol;
            return this;
        }

        /**
         * 安全级别
         */
        public Builder snmpSecurityLevel(String snmpSecurityLevel) {
            this.putBodyParameter("SnmpSecurityLevel", snmpSecurityLevel);
            this.snmpSecurityLevel = snmpSecurityLevel;
            return this;
        }

        /**
         * 用户名
         */
        public Builder snmpUsername(String snmpUsername) {
            this.putBodyParameter("SnmpUsername", snmpUsername);
            this.snmpUsername = snmpUsername;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.putBodyParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public UpdateDevicesRequest build() {
            return new UpdateDevicesRequest(this);
        } 

    } 

}

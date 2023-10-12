// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDeviceRequest} extends {@link RequestModel}
 *
 * <p>UpdateDeviceRequest</p>
 */
public class UpdateDeviceRequest extends Request {
    @Body
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Body
    @NameInMap("EnablePassword")
    private String enablePassword;

    @Body
    @NameInMap("ExtAttributes")
    private String extAttributes;

    @Body
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Ip")
    private String ip;

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
    @NameInMap("Mac")
    private String mac;

    @Body
    @NameInMap("Model")
    private String model;

    @Body
    @NameInMap("PhysicalSpaceId")
    private String physicalSpaceId;

    @Body
    @NameInMap("SecurityDomain")
    private String securityDomain;

    @Body
    @NameInMap("ServiceStatus")
    private String serviceStatus;

    @Body
    @NameInMap("Sn")
    private String sn;

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

    private UpdateDeviceRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.enablePassword = builder.enablePassword;
        this.extAttributes = builder.extAttributes;
        this.hostName = builder.hostName;
        this.instanceId = builder.instanceId;
        this.ip = builder.ip;
        this.loginPassword = builder.loginPassword;
        this.loginType = builder.loginType;
        this.loginUsername = builder.loginUsername;
        this.mac = builder.mac;
        this.model = builder.model;
        this.physicalSpaceId = builder.physicalSpaceId;
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

    public static UpdateDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<UpdateDeviceRequest, Builder> {
        private String deviceId; 
        private String enablePassword; 
        private String extAttributes; 
        private String hostName; 
        private String instanceId; 
        private String ip; 
        private String loginPassword; 
        private String loginType; 
        private String loginUsername; 
        private String mac; 
        private String model; 
        private String physicalSpaceId; 
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

        private Builder() {
            super();
        } 

        private Builder(UpdateDeviceRequest request) {
            super(request);
            this.deviceId = request.deviceId;
            this.enablePassword = request.enablePassword;
            this.extAttributes = request.extAttributes;
            this.hostName = request.hostName;
            this.instanceId = request.instanceId;
            this.ip = request.ip;
            this.loginPassword = request.loginPassword;
            this.loginType = request.loginType;
            this.loginUsername = request.loginUsername;
            this.mac = request.mac;
            this.model = request.model;
            this.physicalSpaceId = request.physicalSpaceId;
            this.securityDomain = request.securityDomain;
            this.serviceStatus = request.serviceStatus;
            this.sn = request.sn;
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
        public Builder deviceId(String deviceId) {
            this.putBodyParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * enable密码
         */
        public Builder enablePassword(String enablePassword) {
            this.putBodyParameter("EnablePassword", enablePassword);
            this.enablePassword = enablePassword;
            return this;
        }

        /**
         * 设备额外属性(JSON)
         */
        public Builder extAttributes(String extAttributes) {
            this.putBodyParameter("ExtAttributes", extAttributes);
            this.extAttributes = extAttributes;
            return this;
        }

        /**
         * 主机名
         */
        public Builder hostName(String hostName) {
            this.putBodyParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 设备IP
         */
        public Builder ip(String ip) {
            this.putBodyParameter("Ip", ip);
            this.ip = ip;
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
         * 设备MAC地址
         */
        public Builder mac(String mac) {
            this.putBodyParameter("Mac", mac);
            this.mac = mac;
            return this;
        }

        /**
         * 设备型号
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * 物理空间
         */
        public Builder physicalSpaceId(String physicalSpaceId) {
            this.putBodyParameter("PhysicalSpaceId", physicalSpaceId);
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }

        /**
         * 设备安全域
         */
        public Builder securityDomain(String securityDomain) {
            this.putBodyParameter("SecurityDomain", securityDomain);
            this.securityDomain = securityDomain;
            return this;
        }

        /**
         * 设备状态
         */
        public Builder serviceStatus(String serviceStatus) {
            this.putBodyParameter("ServiceStatus", serviceStatus);
            this.serviceStatus = serviceStatus;
            return this;
        }

        /**
         * 设备SN
         */
        public Builder sn(String sn) {
            this.putBodyParameter("Sn", sn);
            this.sn = sn;
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
         * SNMP Auth PassPhrase
         */
        public Builder snmpAuthPassphrase(String snmpAuthPassphrase) {
            this.putBodyParameter("SnmpAuthPassphrase", snmpAuthPassphrase);
            this.snmpAuthPassphrase = snmpAuthPassphrase;
            return this;
        }

        /**
         * Auth Protocol
         */
        public Builder snmpAuthProtocol(String snmpAuthProtocol) {
            this.putBodyParameter("SnmpAuthProtocol", snmpAuthProtocol);
            this.snmpAuthProtocol = snmpAuthProtocol;
            return this;
        }

        /**
         * SNMP Community
         */
        public Builder snmpCommunity(String snmpCommunity) {
            this.putBodyParameter("SnmpCommunity", snmpCommunity);
            this.snmpCommunity = snmpCommunity;
            return this;
        }

        /**
         * SNMP Privacy Passphrase
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
         * 设备厂商
         */
        public Builder vendor(String vendor) {
            this.putBodyParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public UpdateDeviceRequest build() {
            return new UpdateDeviceRequest(this);
        } 

    } 

}

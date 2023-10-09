// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartInstanceRequest} extends {@link RequestModel}
 *
 * <p>StartInstanceRequest</p>
 */
public class StartInstanceRequest extends Request {
    @Query
    @NameInMap("Config")
    private String config;

    @Query
    @NameInMap("CrossZone")
    private Boolean crossZone;

    @Query
    @NameInMap("DeployModule")
    private String deployModule;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IsEipInner")
    private Boolean isEipInner;

    @Query
    @NameInMap("IsForceSelectedZones")
    private Boolean isForceSelectedZones;

    @Query
    @NameInMap("IsSetUserAndPassword")
    private Boolean isSetUserAndPassword;

    @Query
    @NameInMap("KMSKeyId")
    private String KMSKeyId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Notifier")
    private String notifier;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SecurityGroup")
    private String securityGroup;

    @Query
    @NameInMap("SelectedZones")
    private String selectedZones;

    @Query
    @NameInMap("ServiceVersion")
    private String serviceVersion;

    @Query
    @NameInMap("UserPhoneNum")
    private String userPhoneNum;

    @Query
    @NameInMap("Username")
    private String username;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private StartInstanceRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.crossZone = builder.crossZone;
        this.deployModule = builder.deployModule;
        this.instanceId = builder.instanceId;
        this.isEipInner = builder.isEipInner;
        this.isForceSelectedZones = builder.isForceSelectedZones;
        this.isSetUserAndPassword = builder.isSetUserAndPassword;
        this.KMSKeyId = builder.KMSKeyId;
        this.name = builder.name;
        this.notifier = builder.notifier;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.securityGroup = builder.securityGroup;
        this.selectedZones = builder.selectedZones;
        this.serviceVersion = builder.serviceVersion;
        this.userPhoneNum = builder.userPhoneNum;
        this.username = builder.username;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return crossZone
     */
    public Boolean getCrossZone() {
        return this.crossZone;
    }

    /**
     * @return deployModule
     */
    public String getDeployModule() {
        return this.deployModule;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isEipInner
     */
    public Boolean getIsEipInner() {
        return this.isEipInner;
    }

    /**
     * @return isForceSelectedZones
     */
    public Boolean getIsForceSelectedZones() {
        return this.isForceSelectedZones;
    }

    /**
     * @return isSetUserAndPassword
     */
    public Boolean getIsSetUserAndPassword() {
        return this.isSetUserAndPassword;
    }

    /**
     * @return KMSKeyId
     */
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return notifier
     */
    public String getNotifier() {
        return this.notifier;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityGroup
     */
    public String getSecurityGroup() {
        return this.securityGroup;
    }

    /**
     * @return selectedZones
     */
    public String getSelectedZones() {
        return this.selectedZones;
    }

    /**
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * @return userPhoneNum
     */
    public String getUserPhoneNum() {
        return this.userPhoneNum;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<StartInstanceRequest, Builder> {
        private String config; 
        private Boolean crossZone; 
        private String deployModule; 
        private String instanceId; 
        private Boolean isEipInner; 
        private Boolean isForceSelectedZones; 
        private Boolean isSetUserAndPassword; 
        private String KMSKeyId; 
        private String name; 
        private String notifier; 
        private String password; 
        private String regionId; 
        private String securityGroup; 
        private String selectedZones; 
        private String serviceVersion; 
        private String userPhoneNum; 
        private String username; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(StartInstanceRequest request) {
            super(request);
            this.config = request.config;
            this.crossZone = request.crossZone;
            this.deployModule = request.deployModule;
            this.instanceId = request.instanceId;
            this.isEipInner = request.isEipInner;
            this.isForceSelectedZones = request.isForceSelectedZones;
            this.isSetUserAndPassword = request.isSetUserAndPassword;
            this.KMSKeyId = request.KMSKeyId;
            this.name = request.name;
            this.notifier = request.notifier;
            this.password = request.password;
            this.regionId = request.regionId;
            this.securityGroup = request.securityGroup;
            this.selectedZones = request.selectedZones;
            this.serviceVersion = request.serviceVersion;
            this.userPhoneNum = request.userPhoneNum;
            this.username = request.username;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * The initial configuration of the instance. The value must be a valid JSON string.
         * <p>
         * 
         * If you do not specify a value for this parameter, the value is left empty by default.
         * 
         * The following parameters can be configured for **Config**:
         * 
         * *   **enable.vpc_sasl_ssl**: specifies whether to enable VPC transmission encryption. Valid values:
         * 
         *     *   **true**: enables VPC transmission encryption. If VPC transmission encryption is enabled, you must also enable the access control list (ACL) feature.
         *     *   **false**: disables VPC transmission encryption. This is the default value.
         * 
         * *   **enable.acl**: specifies whether to enable ACL. Valid values:
         * 
         *     *   **true**: enables the ACL feature.
         *     *   **false**: disables the ACL feature. This is the default value.
         * 
         * *   **kafka.log.retention.hours**: the maximum period for which messages can be retained when the remaining disk space is sufficient. Unit: hours. Valid values: 24 to 480. Default value: **72**. When the disk usage reaches 85%, the system deletes messages in the order in which they are stored, starting from the earliest stored message. This ensures that the performance of the service is not degraded.
         * 
         * *   **kafka.message.max.bytes**: the maximum size of messages that Message Queue for Apache Kafka can send and receive. Unit: bytes. Valid values: 1048576 to 10485760. Default value: **1048576**. Before you change the maximum message size to a new value, make sure that the new value matches the configuration on the producers and consumers in the instance.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * CrossZone.
         */
        public Builder crossZone(Boolean crossZone) {
            this.putQueryParameter("CrossZone", crossZone);
            this.crossZone = crossZone;
            return this;
        }

        /**
         * The deployment mode of the instance. Valid values:
         * <p>
         * 
         * *   **vpc**: deploys the instance that allows access only from a VPC.
         * *   **eip**: deploys the instance that allows access from the Internet and a VPC.
         * 
         * The deployment mode of the instance must match the type of the instance. If the instance allows access only from a VPC, set the value to **vpc**. If the instance allows access from the Internet and a VPC, set the value to **eip**.
         */
        public Builder deployModule(String deployModule) {
            this.putQueryParameter("DeployModule", deployModule);
            this.deployModule = deployModule;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies whether the instance supports elastic IP addresses (EIPs). Valid values:
         * <p>
         * 
         * *   **true**: supports EIPs and allows access from the Internet and a VPC.
         * *   **false**: does not support EIPs and allows access only from a VPC.
         * 
         * The value of this parameter must match the type of the instance. For example, if the instance allows access only from a VPC, set this parameter to **false**.
         */
        public Builder isEipInner(Boolean isEipInner) {
            this.putQueryParameter("IsEipInner", isEipInner);
            this.isEipInner = isEipInner;
            return this;
        }

        /**
         * Specifies whether to forcibly deploy the instance in the selected zones.
         */
        public Builder isForceSelectedZones(Boolean isForceSelectedZones) {
            this.putQueryParameter("IsForceSelectedZones", isForceSelectedZones);
            this.isForceSelectedZones = isForceSelectedZones;
            return this;
        }

        /**
         * Specifies whether to set a new username and password. Valid values:
         * <p>
         * 
         * *   **true**: sets a new username and password.
         * *   **false**: does not set a new username or password.
         * 
         * This parameter is available only if you deploy an instance that allows access from the Internet and a VPC.
         */
        public Builder isSetUserAndPassword(Boolean isSetUserAndPassword) {
            this.putQueryParameter("IsSetUserAndPassword", isSetUserAndPassword);
            this.isSetUserAndPassword = isSetUserAndPassword;
            return this;
        }

        /**
         * The ID of the key that is used for disk encryption in the region where the instance is deployed. You can obtain the ID of the key in the [Key Management Service (KMS) console](https://kms.console.aliyun.com/?spm=a2c4g.11186623.2.5.336745b8hfiU21) or create a key. For more information, see [Manage CMKs](~~181610~~).
         * <p>
         * 
         * If this parameter is configured, disk encryption is enabled for the instance. You cannot disable disk encryption after disk encryption is enabled. When you call this operation, the system checks whether the AliyunServiceRoleForAlikafkaInstanceEncryption service-linked role is created. If the role is not created, the system automatically creates the role. For more information, see [Service-linked roles](~~190460~~).
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.putQueryParameter("KMSKeyId", KMSKeyId);
            this.KMSKeyId = KMSKeyId;
            return this;
        }

        /**
         * The name of the instance.
         * <p>
         * 
         * >  If you specify a value for this parameter, make sure that the specified value is unique in the region of the instance.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The alert contact.
         */
        public Builder notifier(String notifier) {
            this.putQueryParameter("Notifier", notifier);
            this.notifier = notifier;
            return this;
        }

        /**
         * The password that corresponds to the username.
         * <p>
         * 
         * This parameter is available only if you deploy an instance that allows access from the Internet and a VPC.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The region ID of the instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The security group of the instance.
         * <p>
         * 
         * If you do not configure this parameter, Message Queue for Apache Kafka automatically configures a security group for the instance. If you want to configure this parameter, you must create a security group for the instance in advance. For more information, see [Create a security group](~~25468~~).
         */
        public Builder securityGroup(String securityGroup) {
            this.putQueryParameter("SecurityGroup", securityGroup);
            this.securityGroup = securityGroup;
            return this;
        }

        /**
         * The zones among which you want to deploy the instance.
         */
        public Builder selectedZones(String selectedZones) {
            this.putQueryParameter("SelectedZones", selectedZones);
            this.selectedZones = selectedZones;
            return this;
        }

        /**
         * The version number of the instance. Valid values: 0.10.2 and 2.2.0.
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * The mobile phone number of the alert contact.
         */
        public Builder userPhoneNum(String userPhoneNum) {
            this.putQueryParameter("UserPhoneNum", userPhoneNum);
            this.userPhoneNum = userPhoneNum;
            return this;
        }

        /**
         * The username that is used to access the instance.
         * <p>
         * 
         * This parameter is available only if you deploy an instance that allows access from the Internet and a VPC.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * The ID of the vSwitch to which you want to connect the instance.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) in which you want to deploy the instance.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The ID of the zone in which you want to deploy the instance.
         * <p>
         * 
         * *   The zone ID of the instance must be the same as that of the vSwitch.
         * *   The value must be in the format of zoneX or Region ID-X. For example, you can set this parameter to zonea or cn-hangzhou-k.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public StartInstanceRequest build() {
            return new StartInstanceRequest(this);
        } 

    } 

}

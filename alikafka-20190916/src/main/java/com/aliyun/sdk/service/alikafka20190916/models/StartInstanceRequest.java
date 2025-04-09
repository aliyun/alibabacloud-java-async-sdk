// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
 * {@link StartInstanceRequest} extends {@link RequestModel}
 *
 * <p>StartInstanceRequest</p>
 */
public class StartInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossZone")
    private Boolean crossZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployModule")
    private String deployModule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsEipInner")
    private Boolean isEipInner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsForceSelectedZones")
    private Boolean isForceSelectedZones;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSetUserAndPassword")
    private Boolean isSetUserAndPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KMSKeyId")
    private String KMSKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Notifier")
    private String notifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroup")
    private String securityGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectedZones")
    private String selectedZones;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceVersion")
    private String serviceVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPhoneNum")
    private String userPhoneNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private java.util.List<String> vSwitchIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
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
        this.vSwitchIds = builder.vSwitchIds;
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
     * @return vSwitchIds
     */
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
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
        private java.util.List<String> vSwitchIds; 
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
            this.vSwitchIds = request.vSwitchIds;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The initial configurations of the ApsaraMQ for Kafka instance. The values must be valid JSON strings. If you do not specify this parameter, it is left empty.</p>
         * <blockquote>
         * <ul>
         * <li>You cannot configure this parameter when you deploy an ApsaraMQ for Confluent instance.</li>
         * <li>You cannot configure enable.acl for instances whose versions are earlier than 2.2.0.</li>
         * </ul>
         * </blockquote>
         * <p>The <strong>Config</strong> parameter supports the following parameters:</p>
         * <ul>
         * <li><p><strong>enable.vpc_sasl_ssl</strong>: specifies whether to enable VPC transmission encryption. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables VPC transmission encryption. If you enable VPC transmission encryption, you must also enable access control list (ACL).</li>
         * <li><strong>false</strong>: disables VPC transmission encryption. This is the default value.</li>
         * </ul>
         * </li>
         * <li><p><strong>enable.acl</strong>: specifies whether to enable ACL. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables ACL.</li>
         * <li><strong>false</strong>: disables the ACL feature. This is the default value.</li>
         * </ul>
         * </li>
         * <li><p><strong>kafka.log.retention.hours</strong>: the maximum message retention period when the disk capacity is sufficient. Unit: hours. Valid values: 24 to 480. Default value: <strong>72</strong>. When the disk usage reaches 85%, the disk capacity is insufficient. In this case, the system deletes the earliest stored messages to ensure service availability.</p>
         * </li>
         * <li><p><strong>kafka.message.max.bytes</strong>: the maximum size of a message that can be sent and received by ApsaraMQ for Kafka. Unit: bytes. Valid values: 1048576 to 10485760. Default value: <strong>1048576</strong>. Before you change the maximum message size to a new value, make sure that the new value matches the configurations of the producers and consumers.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;kafka.log.retention.hours&quot;:&quot;33&quot;}</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>Specifies whether cross-zone deployment is required. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder crossZone(Boolean crossZone) {
            this.putQueryParameter("CrossZone", crossZone);
            this.crossZone = crossZone;
            return this;
        }

        /**
         * <p>The deployment mode. If the instance is an ApsaraMQ for Kafka V2 instance, this parameter is required. If the instance is an ApsaraMQ for Kafka V3 instance or an ApsaraMQ for Confluent instance, this parameter is optional. Valid values:</p>
         * <ul>
         * <li><strong>vpc</strong>: deploys the instance in a virtual private cloud (VPC).</li>
         * <li><strong>eip</strong>: deploys the instance over the Internet and in the VPC.</li>
         * </ul>
         * <p>The deployment mode of the ApsaraMQ for Kafka instance must be consistent with the instance type. If the instance is a VPC-connected instance, set this parameter to <strong>vpc</strong>. If the instance is an Internet- and VPC-connected instance, set this parameter to <strong>eip</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder deployModule(String deployModule) {
            this.putQueryParameter("DeployModule", deployModule);
            this.deployModule = deployModule;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_post-cn-v0h1fgs2****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether the instance supports elastic IP addresses (EIPs). Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: supports EIPs and allows access from the Internet and a VPC.</li>
         * <li><strong>false</strong>: does not support EIPs and allows access only from a VPC.</li>
         * </ul>
         * <p>The value of this parameter must match the type of the instance. For example, if the instance allows access only from a VPC, set this parameter to <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isEipInner(Boolean isEipInner) {
            this.putQueryParameter("IsEipInner", isEipInner);
            this.isEipInner = isEipInner;
            return this;
        }

        /**
         * <p>Specifies whether to forcibly deploy the instance in the selected zones.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isForceSelectedZones(Boolean isForceSelectedZones) {
            this.putQueryParameter("IsForceSelectedZones", isForceSelectedZones);
            this.isForceSelectedZones = isForceSelectedZones;
            return this;
        }

        /**
         * <p>Specifies whether to set a new username and password. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: sets a new username and password.</li>
         * <li><strong>false</strong>: does not set a new username or password.</li>
         * </ul>
         * <p>This parameter is available only if you deploy an instance that allows access from the Internet and a VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isSetUserAndPassword(Boolean isSetUserAndPassword) {
            this.putQueryParameter("IsSetUserAndPassword", isSetUserAndPassword);
            this.isSetUserAndPassword = isSetUserAndPassword;
            return this;
        }

        /**
         * <p>The ID of the key that is used for disk encryption in the region where the instance is deployed. You can obtain the ID of the key in the <a href="https://kms.console.aliyun.com/?spm=a2c4g.11186623.2.5.336745b8hfiU21">Key Management Service (KMS) console</a> or create a key. For more information, see <a href="https://help.aliyun.com/document_detail/181610.html">Manage CMKs</a>.</p>
         * <p>If this parameter is configured, disk encryption is enabled for the instance. You cannot disable disk encryption after disk encryption is enabled. When you call this operation, the system checks whether the AliyunServiceRoleForAlikafkaInstanceEncryption service-linked role is created. If the role is not created, the system automatically creates the role. For more information, see <a href="https://help.aliyun.com/document_detail/190460.html">Service-linked roles</a>.</p>
         * <blockquote>
         * <p>When you deploy a serverless ApsaraMQ for Kafka V3 instance, you cannot configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0d24xxxx-da7b-4786-b981-9a164dxxxxxx</p>
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.putQueryParameter("KMSKeyId", KMSKeyId);
            this.KMSKeyId = KMSKeyId;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * <blockquote>
         * <p> If you specify a value for this parameter, make sure that the specified value is unique in the region of the instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>newInstanceName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>Mr. Wang</p>
         */
        public Builder notifier(String notifier) {
            this.putQueryParameter("Notifier", notifier);
            this.notifier = notifier;
            return this;
        }

        /**
         * <p>The instance password.</p>
         * <ul>
         * <li>This parameter is available only for Internet- and VPC- connected ApsaraMQ for Kafka V2 and V3 instances.</li>
         * <li>If the instance is an ApsaraMQ for Confluent instance, this parameter is required. The value of this parameter must be 8 to 32 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported: ! @ # $ % ^ &amp; * () _ + - =</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The security group of the instance.</p>
         * <p>If you do not specify this parameter, ApsaraMQ for Kafka automatically configures a security group for your instance. If you specify this parameter, you must create a security group in advance. For more information, see <a href="https://help.aliyun.com/document_detail/25468.html">Create a security group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp13wfx7kz9pko****</p>
         */
        public Builder securityGroup(String securityGroup) {
            this.putQueryParameter("SecurityGroup", securityGroup);
            this.securityGroup = securityGroup;
            return this;
        }

        /**
         * <p>The two-dimensional arrays that consist of the candidate set for primary zones and the candidate set for secondary zones. Custom code in the <code>zone {zone}</code> format and standard code in the <code>cn-RegionID-{zone}</code> format are supported.</p>
         * <ul>
         * <li>If you set CrossZone to true and specify Zone H and Zone F as the candidate set for primary zones and Zone K as the candidate set for secondary zones, set this parameter to <code>[[&quot;zoneh&quot;,&quot;zonef&quot;],[&quot;zonek&quot;]]</code>.</li>
         * </ul>
         * <blockquote>
         * <p>If you specify multiple zones as the primary or secondary zones, the system deploys the instance in one of the zones without prioritizing them. For example, if you set this parameter to <code>[[&quot;zoneh&quot;,&quot;zonef&quot;],[&quot;zonek&quot;]]</code>, the primary zone in which the instance is deployed can be Zone H or Zone F, and the secondary zone is Zone K.</p>
         * </blockquote>
         * <ul>
         * <li>If you set CrossZone to false and want to deploy the instance in Zone K, set this parameter to <code>[[&quot;zonek&quot;],[]]</code>. In this case, the value of this parameter must still be two-dimensional arrays, but the array that specifies the candidate for secondary zones is left empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[[&quot;zonel&quot;],[&quot;zonek&quot;]]</p>
         */
        public Builder selectedZones(String selectedZones) {
            this.putQueryParameter("SelectedZones", selectedZones);
            this.selectedZones = selectedZones;
            return this;
        }

        /**
         * <p>The version of the ApsaraMQ for Kafka instance. Valid values:</p>
         * <ul>
         * <li>ApsaraMQ for Kafka V2 instances: 2.2.0 and 2.6.2.</li>
         * <li>ApsaraMQ for Kafka V3 instances: 3.3.1.</li>
         * <li>ApsaraMQ for Confluent instances: 7.4.0.</li>
         * </ul>
         * <p>Default value:</p>
         * <ul>
         * <li>ApsaraMQ for Kafka V2 instances: 2.2.0.</li>
         * <li>ApsaraMQ for Kafka V3 instances: 3.3.1.</li>
         * <li>ApsaraMQ for Confluent instances: 7.4.0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ApsaraMQ for Kafka V2 instances: 2.2.0
         * ApsaraMQ for Kafka V3 instances: 3.3.1
         * ApsaraMQ for Confluent instances: 7.4.0</p>
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * <p>The mobile phone number of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>1581234****</p>
         */
        public Builder userPhoneNum(String userPhoneNum) {
            this.putQueryParameter("UserPhoneNum", userPhoneNum);
            this.userPhoneNum = userPhoneNum;
            return this;
        }

        /**
         * <p>The instance username.</p>
         * <ul>
         * <li>This parameter is available only for Internet- and VPC- connected ApsaraMQ for Kafka V2 and V3 instances.</li>
         * <li>If the instance is an ApsaraMQ for Confluent instance, set this parameter to root or leave this parameter empty.</li>
         * </ul>
         * <p>Default value for ApsaraMQ for Kafka V2 and V3 instances: username. Default value for ApsaraMQ for Confluent instances: root.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * <p>The ID of the vSwitch to which you want to connect the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1j3sg5979fstnpl****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The IDs of the vSwitches with which the instance is associated. If the instance is an ApsaraMQ for Kafka V2 or V3 instance, this parameter is required. If the instance is an ApsaraMQ for Confluent instance, you must configure one of VSwitchIds and VSwitchId. If you configure both of the parameters, the value of VSwitchIds takes effect.</p>
         */
        public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
            this.putQueryParameter("VSwitchIds", vSwitchIds);
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) in which you want to deploy the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1r4eg3yrxmygv****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The ID of the zone where you want to deploy the ApsaraMQ for Kafka instance.</p>
         * <ul>
         * <li>The zone ID of the ApsaraMQ for Kafka instance must be the same as that of the vSwitch.</li>
         * <li>The value must be in the zoneX or Region ID-X format. Examples: zonea and cn-hangzhou-k.</li>
         * </ul>
         * <blockquote>
         * <p> If resources in the specified zone is insufficient, the instance may be deployed in another zone.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-k</p>
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

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
         * <p>The initial configurations of the ApsaraMQ for Kafka instance. The value must be a valid JSON string. If you do not specify this parameter, the default value is empty.</p>
         * <blockquote>
         * <ul>
         * <li><p>You cannot specify the Config parameter when you deploy a Confluent instance.</p>
         * </li>
         * <li><p>The enable.acl configuration is not supported for instances of versions earlier than 2.2.0. Only Professional Edition and Serverless instances support access control lists (ACLs).</p>
         * </li>
         * </ul>
         * </blockquote>
         * <p>The following parameters of <strong>Config</strong> are supported for reserved instances:</p>
         * <ul>
         * <li><p><strong>enable.vpc_sasl_ssl</strong></p>
         * </li>
         * <li><p><strong>enable.acl</strong></p>
         * </li>
         * <li><p><strong>kafka.log.retention.hours</strong></p>
         * </li>
         * <li><p><strong>kafka.message.max.bytes</strong></p>
         * </li>
         * </ul>
         * <p>The following parameters of <strong>Config</strong> are supported for Serverless instances:</p>
         * <ul>
         * <li><p><strong>enable.vpc_sasl_ssl</strong></p>
         * </li>
         * <li><p><strong>enable.acl</strong></p>
         * </li>
         * <li><p><strong>log.retention.hours</strong></p>
         * </li>
         * <li><p><strong>offsets.retention.minutes</strong></p>
         * </li>
         * <li><p><strong>message.max.bytes</strong></p>
         * </li>
         * <li><p><strong>auto.create.topics.enable</strong></p>
         * </li>
         * <li><p><strong>num.partitions</strong></p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>For more information, see <a href="https://help.aliyun.com/zh/apsaramq-for-kafka/cloud-message-queue-for-kafka/developer-reference/api-alikafka-2019-09-16-updateinstanceconfig?spm=a2c4g.11186623.0.0.3e9e2a04vLr5nF">UpdateInstanceConfig</a>.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p>For more information, see <a href="https://www.alibabacloud.com/help/zh/apsaramq-for-kafka/cloud-message-queue-for-kafka/developer-reference/api-alikafka-2019-09-16-updateinstanceconfig?spm=a2c63.p38356.0.i1">UpdateInstanceConfig</a>.</p>
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
         * <p>Specifies whether to deploy the instance across zones.</p>
         * <ul>
         * <li><p>true: Deploy the instance across zones.</p>
         * </li>
         * <li><p>false: Do not deploy the instance across zones.</p>
         * </li>
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
         * <p>The deployment mode of the instance. This parameter is required for provisioned instances. This parameter is not required for Serverless and Confluent instances. Valid values:</p>
         * <ul>
         * <li><p><strong>vpc</strong>: VPC instance</p>
         * </li>
         * <li><p><strong>eip</strong>: Internet/VPC instance</p>
         * </li>
         * </ul>
         * <p>The deployment mode of the instance must be consistent with the instance type. If the instance is a VPC instance, set this parameter to <strong>vpc</strong>. If the instance is an Internet/VPC instance, set this parameter to <strong>eip</strong>.</p>
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
         * <p>Specifies whether to enable elastic IP addresses (EIPs). Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The instance is an Internet/VPC instance.</p>
         * </li>
         * <li><p><strong>false</strong>: The instance is a VPC instance.</p>
         * </li>
         * </ul>
         * <p>The value of this parameter must be consistent with the instance type. For example, if the instance is a VPC instance, you must set this parameter to <strong>false</strong>.</p>
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
         * <li><p><strong>true</strong>: Set a new username and password.</p>
         * </li>
         * <li><p><strong>false</strong>: Do not set a new username and password.</p>
         * </li>
         * </ul>
         * <p>This parameter is supported only for Internet/VPC instances.</p>
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
         * <p>The ID of the key that is used for disk encryption in the same region. You can view the key ID in the <a href="https://kms.console.aliyun.com/?spm=a2c4g.11186623.2.5.336745b8hfiU21">Key Management Service (KMS) console</a> or create a key. For more information, see <a href="https://help.aliyun.com/document_detail/181610.html">Manage keys</a>.</p>
         * <p>If you specify this parameter, disk encryption is enabled. You cannot disable disk encryption after it is enabled. When you call this operation, the system checks whether the AliyunServiceRoleForAlikafkaInstanceEncryption service-linked role is created. If the role is not created, the system automatically creates the role. For more information, see <a href="https://help.aliyun.com/document_detail/190460.html">Service-linked Role</a>.</p>
         * <blockquote>
         * <ul>
         * <li>You cannot specify the KMSKeyId parameter when you deploy a Serverless instance.</li>
         * </ul>
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
         * <p>This parameter is not supported for Serverless and Confluent instances.</p>
         * <blockquote>
         * <p>If you specify this parameter, make sure that the value is unique in the same region.</p>
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
         * <p>The password.</p>
         * <ul>
         * <li><p>For provisioned and Serverless instances, this parameter is supported only for Internet/VPC instances.</p>
         * </li>
         * <li><p>This parameter is required for Confluent instances. The password must be 8 to 32 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters are !@#$%^&amp;\*()_+-=.</p>
         * </li>
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
         * <p>If you do not specify this parameter, ApsaraMQ for Kafka automatically configures a security group for your instance. If you want to specify this parameter, you must create a security group for the instance in advance. For more information, see <a href="https://help.aliyun.com/document_detail/25468.html">Create a security group</a>.</p>
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
         * <p>A two-dimensional array that consists of the candidate set of the primary zone and the candidate set of the secondary zone. The values can be custom codes (<code>zone{zone}</code>) or standard codes (<code>cn-RegionID-{zone}</code>).</p>
         * <ul>
         * <li><p>If you want to deploy the instance across zones (isCrossZone=true), the candidate set of the primary zone is Zone H or Zone F, and the candidate set of the secondary zone is Zone K, set this parameter to <code>[[\\&quot;zoneh\\&quot;,\\&quot;zonef\\&quot;],[\\&quot;zonek\\&quot;]]</code>. This example uses custom codes.</p>
         * <blockquote>
         * <p>If you specify multiple zones for the primary or secondary zone, the system selects one of the zones for deployment without a priority. For example, if you set the parameter to <code>[[\\&quot;zoneh\\&quot;,\\&quot;zonef\\&quot;],[\\&quot;zonek\\&quot;]]</code>, the primary zone of the deployed instance is Zone H or Zone F, and the secondary zone is Zone K.</p>
         * </blockquote>
         * </li>
         * <li><p>If you do not want to deploy the instance across zones (isCrossZone=false) and want to deploy the instance in Zone K, set this parameter to <code>[[\\&quot;zonek\\&quot;],[]]</code>. This example uses a custom code. Note that you must still specify two arrays. The second array, which represents the candidate set of the secondary zone, can be empty [].</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Relationship between the SelectedZones and VSwitchIds parameters for provisioned instances</p>
         * <ul>
         * <li>If you specify only VSwitchIds and do not specify SelectedZones, the system preferentially selects the zones that correspond to the vSwitches in VSwitchIds.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[[\&quot;zonel\&quot;],[\&quot;zonek\&quot;]]</p>
         */
        public Builder selectedZones(String selectedZones) {
            this.putQueryParameter("SelectedZones", selectedZones);
            this.selectedZones = selectedZones;
            return this;
        }

        /**
         * <p>The version of the ApsaraMQ for Kafka instance that you want to deploy.</p>
         * <ul>
         * <li><p>For provisioned instances, valid values are 2.2.0 and 2.6.2.</p>
         * </li>
         * <li><p>For Serverless instances, the valid value is 3.3.1.</p>
         * </li>
         * <li><p>For Confluent instances, the valid value is 7.4.0.</p>
         * </li>
         * </ul>
         * <p>Default value:</p>
         * <ul>
         * <li><p>Provisioned instances: 2.2.0</p>
         * </li>
         * <li><p>Serverless instances: 3.3.1</p>
         * </li>
         * <li><p>Confluent instances: 7.4.0</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Reserved Instance Series: 2.2.0
         * Serverless Instance Series: 3.3.1
         * Confluent Series: 7.4.0</p>
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
         * <p>The username.</p>
         * <ul>
         * <li><p>For provisioned and Serverless instances, this parameter is supported only for Internet/VPC instances.</p>
         * </li>
         * <li><p>For Confluent instances, you can set this parameter only to root or leave it empty.</p>
         * </li>
         * </ul>
         * <p>Default value: For provisioned and Serverless instances, the default value is username. For Confluent instances, the default value is root.</p>
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
         * <p>The ID of the vSwitch to which the instance is deployed.</p>
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
         * <p>The list of vSwitch IDs. This parameter is required for provisioned and Serverless instances. This parameter is supported for Confluent instances. You must specify at least one of VSwitchIds and VSwitchId. If you specify both, VSwitchIds takes precedence.</p>
         */
        public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
            this.putQueryParameter("VSwitchIds", vSwitchIds);
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * <p>The ID of the VPC in which the instance is deployed.</p>
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
         * <p>The ID of the zone in which the instance is deployed.</p>
         * <ul>
         * <li><p>The value must be the zone ID of the vSwitch.</p>
         * </li>
         * <li><p>The value can be in the zoneX or RegionId-X format. For example, you can set the value to zonea or cn-hangzhou-k.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If resources in the specified zone are insufficient, the instance may be deployed in another zone.</p>
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

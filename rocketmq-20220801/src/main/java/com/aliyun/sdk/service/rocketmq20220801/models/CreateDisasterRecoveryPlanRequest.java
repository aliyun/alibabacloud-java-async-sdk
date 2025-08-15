// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link CreateDisasterRecoveryPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateDisasterRecoveryPlanRequest</p>
 */
public class CreateDisasterRecoveryPlanRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoSyncCheckpoint")
    private Boolean autoSyncCheckpoint;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("planDesc")
    private String planDesc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("planName")
    private String planName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("planType")
    private String planType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("syncCheckpointEnabled")
    private Boolean syncCheckpointEnabled;

    private CreateDisasterRecoveryPlanRequest(Builder builder) {
        super(builder);
        this.autoSyncCheckpoint = builder.autoSyncCheckpoint;
        this.instances = builder.instances;
        this.planDesc = builder.planDesc;
        this.planName = builder.planName;
        this.planType = builder.planType;
        this.syncCheckpointEnabled = builder.syncCheckpointEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDisasterRecoveryPlanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoSyncCheckpoint
     */
    public Boolean getAutoSyncCheckpoint() {
        return this.autoSyncCheckpoint;
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return planDesc
     */
    public String getPlanDesc() {
        return this.planDesc;
    }

    /**
     * @return planName
     */
    public String getPlanName() {
        return this.planName;
    }

    /**
     * @return planType
     */
    public String getPlanType() {
        return this.planType;
    }

    /**
     * @return syncCheckpointEnabled
     */
    public Boolean getSyncCheckpointEnabled() {
        return this.syncCheckpointEnabled;
    }

    public static final class Builder extends Request.Builder<CreateDisasterRecoveryPlanRequest, Builder> {
        private Boolean autoSyncCheckpoint; 
        private java.util.List<Instances> instances; 
        private String planDesc; 
        private String planName; 
        private String planType; 
        private Boolean syncCheckpointEnabled; 

        private Builder() {
            super();
        } 

        private Builder(CreateDisasterRecoveryPlanRequest request) {
            super(request);
            this.autoSyncCheckpoint = request.autoSyncCheckpoint;
            this.instances = request.instances;
            this.planDesc = request.planDesc;
            this.planName = request.planName;
            this.planType = request.planType;
            this.syncCheckpointEnabled = request.syncCheckpointEnabled;
        } 

        /**
         * <p>Specifies whether to enable automatic consumer progress synchronization.</p>
         * <blockquote>
         * <p> This parameter takes effect only when you set <code>syncCheckpointEnabled</code> to true.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoSyncCheckpoint(Boolean autoSyncCheckpoint) {
            this.putBodyParameter("autoSyncCheckpoint", autoSyncCheckpoint);
            this.autoSyncCheckpoint = autoSyncCheckpoint;
            return this;
        }

        /**
         * <p>The instances involved in the Global Replicator task. You must specify this parameter.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.putBodyParameter("instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * <p>The description of the Global Replicator task.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder planDesc(String planDesc) {
            this.putBodyParameter("planDesc", planDesc);
            this.planDesc = planDesc;
            return this;
        }

        /**
         * <p>The name of the Global Replicator task. You must specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder planName(String planName) {
            this.putBodyParameter("planName", planName);
            this.planName = planName;
            return this;
        }

        /**
         * <p>The type of the Global Replicator task. You must specify this parameter. For more information, see <a href="https://help.aliyun.com/document_detail/2843187.html">Global Replicator</a>. Valid values:</p>
         * <ul>
         * <li>ACTIVE_PASSIVE: one-way backup</li>
         * <li>ACTIVE_ACTIVE: two-way backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE_ACTIVE</p>
         */
        public Builder planType(String planType) {
            this.putBodyParameter("planType", planType);
            this.planType = planType;
            return this;
        }

        /**
         * <p>Specifies whether to enable consumer progress synchronization.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder syncCheckpointEnabled(Boolean syncCheckpointEnabled) {
            this.putBodyParameter("syncCheckpointEnabled", syncCheckpointEnabled);
            this.syncCheckpointEnabled = syncCheckpointEnabled;
            return this;
        }

        @Override
        public CreateDisasterRecoveryPlanRequest build() {
            return new CreateDisasterRecoveryPlanRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDisasterRecoveryPlanRequest} extends {@link TeaModel}
     *
     * <p>CreateDisasterRecoveryPlanRequest</p>
     */
    public static class MessageProperty extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("propertyKey")
        private String propertyKey;

        @com.aliyun.core.annotation.NameInMap("propertyValue")
        private String propertyValue;

        private MessageProperty(Builder builder) {
            this.propertyKey = builder.propertyKey;
            this.propertyValue = builder.propertyValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageProperty create() {
            return builder().build();
        }

        /**
         * @return propertyKey
         */
        public String getPropertyKey() {
            return this.propertyKey;
        }

        /**
         * @return propertyValue
         */
        public String getPropertyValue() {
            return this.propertyValue;
        }

        public static final class Builder {
            private String propertyKey; 
            private String propertyValue; 

            private Builder() {
            } 

            private Builder(MessageProperty model) {
                this.propertyKey = model.propertyKey;
                this.propertyValue = model.propertyValue;
            } 

            /**
             * <p>The attribute key.</p>
             * 
             * <strong>example:</strong>
             * <p>aaa</p>
             */
            public Builder propertyKey(String propertyKey) {
                this.propertyKey = propertyKey;
                return this;
            }

            /**
             * <p>The attribute value.</p>
             * 
             * <strong>example:</strong>
             * <p>bbb</p>
             */
            public Builder propertyValue(String propertyValue) {
                this.propertyValue = propertyValue;
                return this;
            }

            public MessageProperty build() {
                return new MessageProperty(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDisasterRecoveryPlanRequest} extends {@link TeaModel}
     *
     * <p>CreateDisasterRecoveryPlanRequest</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("consumerGroupId")
        private String consumerGroupId;

        @com.aliyun.core.annotation.NameInMap("endpointUrl")
        private String endpointUrl;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("instanceRole")
        private String instanceRole;

        @com.aliyun.core.annotation.NameInMap("instanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("messageProperty")
        private MessageProperty messageProperty;

        @com.aliyun.core.annotation.NameInMap("networkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("securityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        @com.aliyun.core.annotation.NameInMap("vSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        private Instances(Builder builder) {
            this.authType = builder.authType;
            this.consumerGroupId = builder.consumerGroupId;
            this.endpointUrl = builder.endpointUrl;
            this.instanceId = builder.instanceId;
            this.instanceRole = builder.instanceRole;
            this.instanceType = builder.instanceType;
            this.messageProperty = builder.messageProperty;
            this.networkType = builder.networkType;
            this.password = builder.password;
            this.regionId = builder.regionId;
            this.securityGroupId = builder.securityGroupId;
            this.username = builder.username;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return consumerGroupId
         */
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        /**
         * @return endpointUrl
         */
        public String getEndpointUrl() {
            return this.endpointUrl;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceRole
         */
        public String getInstanceRole() {
            return this.instanceRole;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return messageProperty
         */
        public MessageProperty getMessageProperty() {
            return this.messageProperty;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
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
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
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

        public static final class Builder {
            private String authType; 
            private String consumerGroupId; 
            private String endpointUrl; 
            private String instanceId; 
            private String instanceRole; 
            private String instanceType; 
            private MessageProperty messageProperty; 
            private String networkType; 
            private String password; 
            private String regionId; 
            private String securityGroupId; 
            private String username; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.authType = model.authType;
                this.consumerGroupId = model.consumerGroupId;
                this.endpointUrl = model.endpointUrl;
                this.instanceId = model.instanceId;
                this.instanceRole = model.instanceRole;
                this.instanceType = model.instanceType;
                this.messageProperty = model.messageProperty;
                this.networkType = model.networkType;
                this.password = model.password;
                this.regionId = model.regionId;
                this.securityGroupId = model.securityGroupId;
                this.username = model.username;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The authentication method. If you set instanceType to ALIYUN_ROCKETMQ and the instance is an ApsaraMQ for RocketMQ 4.0 instance, you do not need to specify this parameter.</p>
             * <ul>
             * <li>NO_AUTH: no authentication</li>
             * <li>ACL_AUTH: access control list (ACL)-based authentication</li>
             * </ul>
             * <p>Valid values:</p>
             * <ul>
             * <li>NO_AUTH: no authentication</li>
             * <li>ACL_AUTH: access control list (ACL)-based authentication</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACL_AUTH</p>
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * <p>The ID of the consumer group.</p>
             * 
             * <strong>example:</strong>
             * <p>GID_DS_XXX_YYY</p>
             */
            public Builder consumerGroupId(String consumerGroupId) {
                this.consumerGroupId = consumerGroupId;
                return this;
            }

            /**
             * <p>The instance endpoint. This parameter is required only if you set instanceType to EXTERNAL_ROCKETMQ.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder endpointUrl(String endpointUrl) {
                this.endpointUrl = endpointUrl;
                return this;
            }

            /**
             * <p>The instance ID. This parameter is required only if you set instanceType to ALIYUN_ROCKETMQ.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq-cn-******</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance role. Valid values:</p>
             * <ul>
             * <li>ACTIVE: primary instance</li>
             * <li>Passive: secondary instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PASSIVE</p>
             */
            public Builder instanceRole(String instanceRole) {
                this.instanceRole = instanceRole;
                return this;
            }

            /**
             * <p>The instance type. Valid values:</p>
             * <ul>
             * <li>ALIYUN_ROCKETMQ: ApsaraMQ for RocketMQ instance</li>
             * <li>EXTERNAL_ROCKETMQ: external RocketMQ instance</li>
             * </ul>
             * <p>Valid values:</p>
             * <ul>
             * <li>ALIYUN_ROCKETMQ: ApsaraMQ for RocketMQ instance</li>
             * <li>EXTERNAL_ROCKETMQ: external RocketMQ instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN_ROCKETMQ</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The message attribute. When you synchronize a message to the destination cluster, the system automatically adds the attribute to the message for SQL-based filtering.</p>
             */
            public Builder messageProperty(MessageProperty messageProperty) {
                this.messageProperty = messageProperty;
                return this;
            }

            /**
             * <p>The network type. This parameter is required only if you set instanceType to EXTERNAL_ROCKETMQ. Valid values:</p>
             * <ul>
             * <li>TCP_INTERNET: Internet over TCP</li>
             * <li>TCP_VPC: virtual private cloud (VPC) over TCP.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP_INTERNET</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The password used for authentication. This parameter is required only if you set authType to ACL_AUTH. If you set instanceType to ALIYUN_ROCKETMQ, you do not need to specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The region where the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the security group to which the instance belongs. This parameter is required only if you set instanceType to EXTERNAL_ROCKETMQ and networkType to TCP_VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp17hpmgz9******</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The username used for authentication. This parameter is required only if you set authType to ACL_AUTH.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * <p>The ID of the vSwitch with which the instance is associated. This parameter is required only if you set instanceType to EXTERNAL_ROCKETMQ and networkType to TCP_VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf6gwtbn6etadpv******</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the VPC with which the instance is associated. This parameter is required only if you set instanceType to EXTERNAL_ROCKETMQ and networkType to TCP_VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-wz9qt50xhtj9krb******</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}

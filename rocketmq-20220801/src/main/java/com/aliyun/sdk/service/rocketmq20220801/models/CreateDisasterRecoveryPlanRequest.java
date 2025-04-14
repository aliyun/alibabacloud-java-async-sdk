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
         * <p>Whether to enable automatic synchronization of consumption progress.</p>
         * <blockquote>
         * <p>This is effective only when consumption progress synchronization is enabled, i.e., the value of <code>syncCheckpointEnabled</code> is true.</p>
         * </blockquote>
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
         * <p>Instances involved in the backup plan. Required</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.putBodyParameter("instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * <p>Plan description</p>
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
         * <p>Plan name, required</p>
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
         * <p>Backup plan type, required. Please refer to the <a href="https://help.aliyun.com/document_detail/2843187.html">documentation</a>.
         * Parameter values are as follows:</p>
         * <ul>
         * <li>ACTIVE_PASSIVE: One-way backup</li>
         * <li>ACTIVE_ACTIVE: Two-way backup</li>
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
         * <p>Switch for synchronizing consumption progress</p>
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
             * <p>Property key</p>
             * 
             * <strong>example:</strong>
             * <p>aaa</p>
             */
            public Builder propertyKey(String propertyKey) {
                this.propertyKey = propertyKey;
                return this;
            }

            /**
             * <p>Property value</p>
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
             * <p>Authentication method. Not required for instanceType of ALIYUN_ROCKETMQ and version 4.0</p>
             * <ul>
             * <li>NO_AUTH: No authentication required</li>
             * <li>ACL_AUTH: ACL authentication</li>
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
             * <p>Endpoint URL, not required for instanceType of ALIYUN_ROCKETMQ, but required for EXTERNAL_ROCKETMQ</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder endpointUrl(String endpointUrl) {
                this.endpointUrl = endpointUrl;
                return this;
            }

            /**
             * <p>Instance ID, not required for instanceType of EXTERNAL_ROCKETMQ, but required for ALIYUN_ROCKETMQ</p>
             * 
             * <strong>example:</strong>
             * <p>rmq-cn-******</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Instance role, either primary or secondary</p>
             * <ul>
             * <li>ACTIVE: Primary</li>
             * <li>PASSIVE: Secondary</li>
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
             * <p>Instance type</p>
             * <ul>
             * <li>ALIYUN_ROCKETMQ: Alibaba Cloud instance</li>
             * <li>EXTERNAL_ROCKETMQ: External instance, open-source instance, open-source cluster</li>
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
             * <p>Message filtering properties. When messages are synchronized to the target cluster, this property will be automatically added for SQL filtering during message consumption.</p>
             */
            public Builder messageProperty(MessageProperty messageProperty) {
                this.messageProperty = messageProperty;
                return this;
            }

            /**
             * <p>Network type, not required for instanceType of ALIYUN_ROCKETMQ, but required for EXTERNAL_ROCKETMQ
             * Parameter values are as follows:</p>
             * <ul>
             * <li>TCP_INTERNET: TCP public network</li>
             * <li>TCP_VPC: TCP VPC (Virtual Private Cloud)</li>
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
             * <p>Authentication password, required when authType is ACL_AUTH. Not required for instanceType of ALIYUN_ROCKETMQ</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>Region where the instance is located</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Security group ID, required only when the <code>instanceType</code> is EXTERNAL_ROCKETMQ and <code>networkType</code> is TCP_VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp17hpmgz9******</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>Authentication username, required when authType is ACL_AUTH</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * <p>The ID of the switch associated with the instance, required only when the <code>instanceType</code> is EXTERNAL_ROCKETMQ and <code>networkType</code> is TCP_VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf6gwtbn6etadpv******</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the private network associated with the created instance. The instanceType instance type is only EXTERNAL_ROCKETMQ. It is required when the networkType is TCP_VPC.</p>
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

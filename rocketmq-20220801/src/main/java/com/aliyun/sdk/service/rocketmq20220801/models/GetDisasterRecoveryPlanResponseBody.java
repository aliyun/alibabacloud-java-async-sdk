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
 * {@link GetDisasterRecoveryPlanResponseBody} extends {@link TeaModel}
 *
 * <p>GetDisasterRecoveryPlanResponseBody</p>
 */
public class GetDisasterRecoveryPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("dynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("dynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetDisasterRecoveryPlanResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDisasterRecoveryPlanResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDisasterRecoveryPlanResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details about the access denial. This parameter is returned only if the access is denied because the Resource Access Management (RAM) user does not have the required permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceId</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7358418D-83BD-507A-8079-611C63E0xxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDisasterRecoveryPlanResponseBody build() {
            return new GetDisasterRecoveryPlanResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDisasterRecoveryPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetDisasterRecoveryPlanResponseBody</p>
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
             * <p>xxx</p>
             */
            public Builder propertyKey(String propertyKey) {
                this.propertyKey = propertyKey;
                return this;
            }

            /**
             * <p>Property value</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
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
     * {@link GetDisasterRecoveryPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetDisasterRecoveryPlanResponseBody</p>
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
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq-cn-gpz3qtcdxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Instance role, either primary or secondary </p>
             * <ul>
             * <li>ACTIVE: Primary</li>
             * <li>PASSIVE: Secondary</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
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
             * <p>Network type, not required for instanceType of ALIYUN_ROCKETMQ, but required for EXTERNAL_ROCKETMQ Parameter values are as follows:</p>
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
             * <p>Region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Security group ID, required only when the instanceType is EXTERNAL_ROCKETMQ and networkType is TCP_VPC.</p>
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
             * <p>The ID of the switch associated with the instance, required only when the instanceType is EXTERNAL_ROCKETMQ and networkType is TCP_VPC.</p>
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
    /**
     * 
     * {@link GetDisasterRecoveryPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetDisasterRecoveryPlanResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoSyncCheckpoint")
        private Boolean autoSyncCheckpoint;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("extInfo")
        private java.util.Map<String, String> extInfo;

        @com.aliyun.core.annotation.NameInMap("instances")
        private java.util.List<Instances> instances;

        @com.aliyun.core.annotation.NameInMap("planDesc")
        private String planDesc;

        @com.aliyun.core.annotation.NameInMap("planId")
        private Long planId;

        @com.aliyun.core.annotation.NameInMap("planName")
        private String planName;

        @com.aliyun.core.annotation.NameInMap("planStatus")
        private String planStatus;

        @com.aliyun.core.annotation.NameInMap("planType")
        private String planType;

        @com.aliyun.core.annotation.NameInMap("syncCheckpointEnabled")
        private Boolean syncCheckpointEnabled;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        private Data(Builder builder) {
            this.autoSyncCheckpoint = builder.autoSyncCheckpoint;
            this.createTime = builder.createTime;
            this.extInfo = builder.extInfo;
            this.instances = builder.instances;
            this.planDesc = builder.planDesc;
            this.planId = builder.planId;
            this.planName = builder.planName;
            this.planStatus = builder.planStatus;
            this.planType = builder.planType;
            this.syncCheckpointEnabled = builder.syncCheckpointEnabled;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return autoSyncCheckpoint
         */
        public Boolean getAutoSyncCheckpoint() {
            return this.autoSyncCheckpoint;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return extInfo
         */
        public java.util.Map<String, String> getExtInfo() {
            return this.extInfo;
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
         * @return planId
         */
        public Long getPlanId() {
            return this.planId;
        }

        /**
         * @return planName
         */
        public String getPlanName() {
            return this.planName;
        }

        /**
         * @return planStatus
         */
        public String getPlanStatus() {
            return this.planStatus;
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

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Boolean autoSyncCheckpoint; 
            private String createTime; 
            private java.util.Map<String, String> extInfo; 
            private java.util.List<Instances> instances; 
            private String planDesc; 
            private Long planId; 
            private String planName; 
            private String planStatus; 
            private String planType; 
            private Boolean syncCheckpointEnabled; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.autoSyncCheckpoint = model.autoSyncCheckpoint;
                this.createTime = model.createTime;
                this.extInfo = model.extInfo;
                this.instances = model.instances;
                this.planDesc = model.planDesc;
                this.planId = model.planId;
                this.planName = model.planName;
                this.planStatus = model.planStatus;
                this.planType = model.planType;
                this.syncCheckpointEnabled = model.syncCheckpointEnabled;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>Whether to enable automatic synchronization of consumption progress.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoSyncCheckpoint(Boolean autoSyncCheckpoint) {
                this.autoSyncCheckpoint = autoSyncCheckpoint;
                return this;
            }

            /**
             * <p>The time when the backup plan was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-01 20:05:50</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Additional Information</p>
             */
            public Builder extInfo(java.util.Map<String, String> extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * <p>Instances involved in the backup plan</p>
             */
            public Builder instances(java.util.List<Instances> instances) {
                this.instances = instances;
                return this;
            }

            /**
             * <p>The describe of the global message backup plan.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx</p>
             */
            public Builder planDesc(String planDesc) {
                this.planDesc = planDesc;
                return this;
            }

            /**
             * <p>The ID of the global message backup plan.</p>
             * 
             * <strong>example:</strong>
             * <p>1300000016</p>
             */
            public Builder planId(Long planId) {
                this.planId = planId;
                return this;
            }

            /**
             * <p>The name of the global message backup plan.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * <p>The status of the global message backup plan.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder planStatus(String planStatus) {
                this.planStatus = planStatus;
                return this;
            }

            /**
             * <p>The type of the global message backup plan.
             * values are as follows:</p>
             * <ul>
             * <li>ACTIVE_PASSIVE: One-way backup</li>
             * <li>ACTIVE_ACTIVE: Two-way backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE_PASSIVE</p>
             */
            public Builder planType(String planType) {
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
                this.syncCheckpointEnabled = syncCheckpointEnabled;
                return this;
            }

            /**
             * <p>The time when the backup plan was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-01 20:05:50</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

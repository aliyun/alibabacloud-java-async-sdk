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
 * {@link ListDisasterRecoveryPlansResponseBody} extends {@link TeaModel}
 *
 * <p>ListDisasterRecoveryPlansResponseBody</p>
 */
public class ListDisasterRecoveryPlansResponseBody extends TeaModel {
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

    private ListDisasterRecoveryPlansResponseBody(Builder builder) {
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

    public static ListDisasterRecoveryPlansResponseBody create() {
        return builder().build();
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

        /**
         * accessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * dynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * dynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDisasterRecoveryPlansResponseBody build() {
            return new ListDisasterRecoveryPlansResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDisasterRecoveryPlansResponseBody} extends {@link TeaModel}
     *
     * <p>ListDisasterRecoveryPlansResponseBody</p>
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

            /**
             * propertyKey.
             */
            public Builder propertyKey(String propertyKey) {
                this.propertyKey = propertyKey;
                return this;
            }

            /**
             * propertyValue.
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
     * {@link ListDisasterRecoveryPlansResponseBody} extends {@link TeaModel}
     *
     * <p>ListDisasterRecoveryPlansResponseBody</p>
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

            /**
             * authType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * endpointUrl.
             */
            public Builder endpointUrl(String endpointUrl) {
                this.endpointUrl = endpointUrl;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * instanceRole.
             */
            public Builder instanceRole(String instanceRole) {
                this.instanceRole = instanceRole;
                return this;
            }

            /**
             * instanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * messageProperty.
             */
            public Builder messageProperty(MessageProperty messageProperty) {
                this.messageProperty = messageProperty;
                return this;
            }

            /**
             * networkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * securityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * vSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>VPC ID</p>
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
     * {@link ListDisasterRecoveryPlansResponseBody} extends {@link TeaModel}
     *
     * <p>ListDisasterRecoveryPlansResponseBody</p>
     */
    public static class List extends TeaModel {
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

        private List(Builder builder) {
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

        public static List create() {
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

            /**
             * autoSyncCheckpoint.
             */
            public Builder autoSyncCheckpoint(Boolean autoSyncCheckpoint) {
                this.autoSyncCheckpoint = autoSyncCheckpoint;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * extInfo.
             */
            public Builder extInfo(java.util.Map<String, String> extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * instances.
             */
            public Builder instances(java.util.List<Instances> instances) {
                this.instances = instances;
                return this;
            }

            /**
             * planDesc.
             */
            public Builder planDesc(String planDesc) {
                this.planDesc = planDesc;
                return this;
            }

            /**
             * planId.
             */
            public Builder planId(Long planId) {
                this.planId = planId;
                return this;
            }

            /**
             * planName.
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * planStatus.
             */
            public Builder planStatus(String planStatus) {
                this.planStatus = planStatus;
                return this;
            }

            /**
             * planType.
             */
            public Builder planType(String planType) {
                this.planType = planType;
                return this;
            }

            /**
             * syncCheckpointEnabled.
             */
            public Builder syncCheckpointEnabled(Boolean syncCheckpointEnabled) {
                this.syncCheckpointEnabled = syncCheckpointEnabled;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDisasterRecoveryPlansResponseBody} extends {@link TeaModel}
     *
     * <p>ListDisasterRecoveryPlansResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("list")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("scrollId")
        private String scrollId;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.scrollId = builder.scrollId;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return scrollId
         */
        public String getScrollId() {
            return this.scrollId;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Long pageNumber; 
            private Long pageSize; 
            private String scrollId; 
            private Long totalCount; 

            /**
             * list.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * pageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * scrollId.
             */
            public Builder scrollId(String scrollId) {
                this.scrollId = scrollId;
                return this;
            }

            /**
             * totalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link QueryQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>QueryQuotaResponseBody</p>
 */
public class QueryQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private QueryQuotaResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryQuotaResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpCode; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * httpCode.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryQuotaResponseBody build() {
            return new QueryQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>QueryQuotaResponseBody</p>
     */
    public static class BillingPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billingMethod")
        private String billingMethod;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("odpsSpecCode")
        private String odpsSpecCode;

        @com.aliyun.core.annotation.NameInMap("orderId")
        private String orderId;

        private BillingPolicy(Builder builder) {
            this.billingMethod = builder.billingMethod;
            this.instanceId = builder.instanceId;
            this.odpsSpecCode = builder.odpsSpecCode;
            this.orderId = builder.orderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BillingPolicy create() {
            return builder().build();
        }

        /**
         * @return billingMethod
         */
        public String getBillingMethod() {
            return this.billingMethod;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return odpsSpecCode
         */
        public String getOdpsSpecCode() {
            return this.odpsSpecCode;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        public static final class Builder {
            private String billingMethod; 
            private String instanceId; 
            private String odpsSpecCode; 
            private String orderId; 

            /**
             * billingMethod.
             */
            public Builder billingMethod(String billingMethod) {
                this.billingMethod = billingMethod;
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
             * odpsSpecCode.
             */
            public Builder odpsSpecCode(String odpsSpecCode) {
                this.odpsSpecCode = odpsSpecCode;
                return this;
            }

            /**
             * orderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            public BillingPolicy build() {
                return new BillingPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>QueryQuotaResponseBody</p>
     */
    public static class SaleTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("resourceIds")
        private java.util.List<String> resourceIds;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        private SaleTag(Builder builder) {
            this.resourceIds = builder.resourceIds;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleTag create() {
            return builder().build();
        }

        /**
         * @return resourceIds
         */
        public java.util.List<String> getResourceIds() {
            return this.resourceIds;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private java.util.List<String> resourceIds; 
            private String resourceType; 

            /**
             * resourceIds.
             */
            public Builder resourceIds(java.util.List<String> resourceIds) {
                this.resourceIds = resourceIds;
                return this;
            }

            /**
             * resourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public SaleTag build() {
                return new SaleTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>QueryQuotaResponseBody</p>
     */
    public static class ScheduleInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currPlan")
        private String currPlan;

        @com.aliyun.core.annotation.NameInMap("currTime")
        private String currTime;

        @com.aliyun.core.annotation.NameInMap("nextPlan")
        private String nextPlan;

        @com.aliyun.core.annotation.NameInMap("nextTime")
        private String nextTime;

        @com.aliyun.core.annotation.NameInMap("oncePlan")
        private String oncePlan;

        @com.aliyun.core.annotation.NameInMap("onceTime")
        private String onceTime;

        @com.aliyun.core.annotation.NameInMap("operatorName")
        private String operatorName;

        @com.aliyun.core.annotation.NameInMap("timezone")
        private String timezone;

        private ScheduleInfo(Builder builder) {
            this.currPlan = builder.currPlan;
            this.currTime = builder.currTime;
            this.nextPlan = builder.nextPlan;
            this.nextTime = builder.nextTime;
            this.oncePlan = builder.oncePlan;
            this.onceTime = builder.onceTime;
            this.operatorName = builder.operatorName;
            this.timezone = builder.timezone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleInfo create() {
            return builder().build();
        }

        /**
         * @return currPlan
         */
        public String getCurrPlan() {
            return this.currPlan;
        }

        /**
         * @return currTime
         */
        public String getCurrTime() {
            return this.currTime;
        }

        /**
         * @return nextPlan
         */
        public String getNextPlan() {
            return this.nextPlan;
        }

        /**
         * @return nextTime
         */
        public String getNextTime() {
            return this.nextTime;
        }

        /**
         * @return oncePlan
         */
        public String getOncePlan() {
            return this.oncePlan;
        }

        /**
         * @return onceTime
         */
        public String getOnceTime() {
            return this.onceTime;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        public static final class Builder {
            private String currPlan; 
            private String currTime; 
            private String nextPlan; 
            private String nextTime; 
            private String oncePlan; 
            private String onceTime; 
            private String operatorName; 
            private String timezone; 

            /**
             * currPlan.
             */
            public Builder currPlan(String currPlan) {
                this.currPlan = currPlan;
                return this;
            }

            /**
             * currTime.
             */
            public Builder currTime(String currTime) {
                this.currTime = currTime;
                return this;
            }

            /**
             * nextPlan.
             */
            public Builder nextPlan(String nextPlan) {
                this.nextPlan = nextPlan;
                return this;
            }

            /**
             * nextTime.
             */
            public Builder nextTime(String nextTime) {
                this.nextTime = nextTime;
                return this;
            }

            /**
             * oncePlan.
             */
            public Builder oncePlan(String oncePlan) {
                this.oncePlan = oncePlan;
                return this;
            }

            /**
             * onceTime.
             */
            public Builder onceTime(String onceTime) {
                this.onceTime = onceTime;
                return this;
            }

            /**
             * operatorName.
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * timezone.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            public ScheduleInfo build() {
                return new ScheduleInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>QueryQuotaResponseBody</p>
     */
    public static class SubQuotaInfoListBillingPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billingMethod")
        private String billingMethod;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("odpsSpecCode")
        private String odpsSpecCode;

        @com.aliyun.core.annotation.NameInMap("orderId")
        private String orderId;

        private SubQuotaInfoListBillingPolicy(Builder builder) {
            this.billingMethod = builder.billingMethod;
            this.instanceId = builder.instanceId;
            this.odpsSpecCode = builder.odpsSpecCode;
            this.orderId = builder.orderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubQuotaInfoListBillingPolicy create() {
            return builder().build();
        }

        /**
         * @return billingMethod
         */
        public String getBillingMethod() {
            return this.billingMethod;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return odpsSpecCode
         */
        public String getOdpsSpecCode() {
            return this.odpsSpecCode;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        public static final class Builder {
            private String billingMethod; 
            private String instanceId; 
            private String odpsSpecCode; 
            private String orderId; 

            /**
             * billingMethod.
             */
            public Builder billingMethod(String billingMethod) {
                this.billingMethod = billingMethod;
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
             * odpsSpecCode.
             */
            public Builder odpsSpecCode(String odpsSpecCode) {
                this.odpsSpecCode = odpsSpecCode;
                return this;
            }

            /**
             * orderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            public SubQuotaInfoListBillingPolicy build() {
                return new SubQuotaInfoListBillingPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>QueryQuotaResponseBody</p>
     */
    public static class SubQuotaInfoListSaleTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("resourceIds")
        private java.util.List<String> resourceIds;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        private SubQuotaInfoListSaleTag(Builder builder) {
            this.resourceIds = builder.resourceIds;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubQuotaInfoListSaleTag create() {
            return builder().build();
        }

        /**
         * @return resourceIds
         */
        public java.util.List<String> getResourceIds() {
            return this.resourceIds;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private java.util.List<String> resourceIds; 
            private String resourceType; 

            /**
             * resourceIds.
             */
            public Builder resourceIds(java.util.List<String> resourceIds) {
                this.resourceIds = resourceIds;
                return this;
            }

            /**
             * resourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public SubQuotaInfoListSaleTag build() {
                return new SubQuotaInfoListSaleTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>QueryQuotaResponseBody</p>
     */
    public static class SubQuotaInfoListScheduleInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currPlan")
        private String currPlan;

        @com.aliyun.core.annotation.NameInMap("currTime")
        private String currTime;

        @com.aliyun.core.annotation.NameInMap("nextPlan")
        private String nextPlan;

        @com.aliyun.core.annotation.NameInMap("nextTime")
        private String nextTime;

        @com.aliyun.core.annotation.NameInMap("oncePlan")
        private String oncePlan;

        @com.aliyun.core.annotation.NameInMap("onceTime")
        private String onceTime;

        @com.aliyun.core.annotation.NameInMap("operatorName")
        private String operatorName;

        @com.aliyun.core.annotation.NameInMap("timezone")
        private String timezone;

        private SubQuotaInfoListScheduleInfo(Builder builder) {
            this.currPlan = builder.currPlan;
            this.currTime = builder.currTime;
            this.nextPlan = builder.nextPlan;
            this.nextTime = builder.nextTime;
            this.oncePlan = builder.oncePlan;
            this.onceTime = builder.onceTime;
            this.operatorName = builder.operatorName;
            this.timezone = builder.timezone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubQuotaInfoListScheduleInfo create() {
            return builder().build();
        }

        /**
         * @return currPlan
         */
        public String getCurrPlan() {
            return this.currPlan;
        }

        /**
         * @return currTime
         */
        public String getCurrTime() {
            return this.currTime;
        }

        /**
         * @return nextPlan
         */
        public String getNextPlan() {
            return this.nextPlan;
        }

        /**
         * @return nextTime
         */
        public String getNextTime() {
            return this.nextTime;
        }

        /**
         * @return oncePlan
         */
        public String getOncePlan() {
            return this.oncePlan;
        }

        /**
         * @return onceTime
         */
        public String getOnceTime() {
            return this.onceTime;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        public static final class Builder {
            private String currPlan; 
            private String currTime; 
            private String nextPlan; 
            private String nextTime; 
            private String oncePlan; 
            private String onceTime; 
            private String operatorName; 
            private String timezone; 

            /**
             * currPlan.
             */
            public Builder currPlan(String currPlan) {
                this.currPlan = currPlan;
                return this;
            }

            /**
             * currTime.
             */
            public Builder currTime(String currTime) {
                this.currTime = currTime;
                return this;
            }

            /**
             * nextPlan.
             */
            public Builder nextPlan(String nextPlan) {
                this.nextPlan = nextPlan;
                return this;
            }

            /**
             * nextTime.
             */
            public Builder nextTime(String nextTime) {
                this.nextTime = nextTime;
                return this;
            }

            /**
             * oncePlan.
             */
            public Builder oncePlan(String oncePlan) {
                this.oncePlan = oncePlan;
                return this;
            }

            /**
             * onceTime.
             */
            public Builder onceTime(String onceTime) {
                this.onceTime = onceTime;
                return this;
            }

            /**
             * operatorName.
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * timezone.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            public SubQuotaInfoListScheduleInfo build() {
                return new SubQuotaInfoListScheduleInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>QueryQuotaResponseBody</p>
     */
    public static class SubQuotaInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billingPolicy")
        private SubQuotaInfoListBillingPolicy billingPolicy;

        @com.aliyun.core.annotation.NameInMap("cluster")
        private String cluster;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("creatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("groupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("parameter")
        private java.util.Map<String, ?> parameter;

        @com.aliyun.core.annotation.NameInMap("parentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("saleTag")
        private SubQuotaInfoListSaleTag saleTag;

        @com.aliyun.core.annotation.NameInMap("scheduleInfo")
        private SubQuotaInfoListScheduleInfo scheduleInfo;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private SubQuotaInfoList(Builder builder) {
            this.billingPolicy = builder.billingPolicy;
            this.cluster = builder.cluster;
            this.createTime = builder.createTime;
            this.creatorId = builder.creatorId;
            this.groupName = builder.groupName;
            this.id = builder.id;
            this.name = builder.name;
            this.nickName = builder.nickName;
            this.parameter = builder.parameter;
            this.parentId = builder.parentId;
            this.regionId = builder.regionId;
            this.saleTag = builder.saleTag;
            this.scheduleInfo = builder.scheduleInfo;
            this.status = builder.status;
            this.tag = builder.tag;
            this.tenantId = builder.tenantId;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubQuotaInfoList create() {
            return builder().build();
        }

        /**
         * @return billingPolicy
         */
        public SubQuotaInfoListBillingPolicy getBillingPolicy() {
            return this.billingPolicy;
        }

        /**
         * @return cluster
         */
        public String getCluster() {
            return this.cluster;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return parameter
         */
        public java.util.Map<String, ?> getParameter() {
            return this.parameter;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return saleTag
         */
        public SubQuotaInfoListSaleTag getSaleTag() {
            return this.saleTag;
        }

        /**
         * @return scheduleInfo
         */
        public SubQuotaInfoListScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private SubQuotaInfoListBillingPolicy billingPolicy; 
            private String cluster; 
            private Long createTime; 
            private String creatorId; 
            private String groupName; 
            private String id; 
            private String name; 
            private String nickName; 
            private java.util.Map<String, ?> parameter; 
            private String parentId; 
            private String regionId; 
            private SubQuotaInfoListSaleTag saleTag; 
            private SubQuotaInfoListScheduleInfo scheduleInfo; 
            private String status; 
            private String tag; 
            private String tenantId; 
            private String type; 
            private String version; 

            /**
             * billingPolicy.
             */
            public Builder billingPolicy(SubQuotaInfoListBillingPolicy billingPolicy) {
                this.billingPolicy = billingPolicy;
                return this;
            }

            /**
             * cluster.
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * creatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * groupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * nickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * parameter.
             */
            public Builder parameter(java.util.Map<String, ?> parameter) {
                this.parameter = parameter;
                return this;
            }

            /**
             * parentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
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
             * saleTag.
             */
            public Builder saleTag(SubQuotaInfoListSaleTag saleTag) {
                this.saleTag = saleTag;
                return this;
            }

            /**
             * scheduleInfo.
             */
            public Builder scheduleInfo(SubQuotaInfoListScheduleInfo scheduleInfo) {
                this.scheduleInfo = scheduleInfo;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * tenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public SubQuotaInfoList build() {
                return new SubQuotaInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>QueryQuotaResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billingPolicy")
        private BillingPolicy billingPolicy;

        @com.aliyun.core.annotation.NameInMap("cluster")
        private String cluster;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("creatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("groupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("parameter")
        private java.util.Map<String, ?> parameter;

        @com.aliyun.core.annotation.NameInMap("parentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("saleTag")
        private SaleTag saleTag;

        @com.aliyun.core.annotation.NameInMap("scheduleInfo")
        private ScheduleInfo scheduleInfo;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("subQuotaInfoList")
        private java.util.List<SubQuotaInfoList> subQuotaInfoList;

        @com.aliyun.core.annotation.NameInMap("tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Data(Builder builder) {
            this.billingPolicy = builder.billingPolicy;
            this.cluster = builder.cluster;
            this.createTime = builder.createTime;
            this.creatorId = builder.creatorId;
            this.groupName = builder.groupName;
            this.id = builder.id;
            this.name = builder.name;
            this.nickName = builder.nickName;
            this.parameter = builder.parameter;
            this.parentId = builder.parentId;
            this.regionId = builder.regionId;
            this.saleTag = builder.saleTag;
            this.scheduleInfo = builder.scheduleInfo;
            this.status = builder.status;
            this.subQuotaInfoList = builder.subQuotaInfoList;
            this.tag = builder.tag;
            this.tenantId = builder.tenantId;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return billingPolicy
         */
        public BillingPolicy getBillingPolicy() {
            return this.billingPolicy;
        }

        /**
         * @return cluster
         */
        public String getCluster() {
            return this.cluster;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return parameter
         */
        public java.util.Map<String, ?> getParameter() {
            return this.parameter;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return saleTag
         */
        public SaleTag getSaleTag() {
            return this.saleTag;
        }

        /**
         * @return scheduleInfo
         */
        public ScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subQuotaInfoList
         */
        public java.util.List<SubQuotaInfoList> getSubQuotaInfoList() {
            return this.subQuotaInfoList;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private BillingPolicy billingPolicy; 
            private String cluster; 
            private Long createTime; 
            private String creatorId; 
            private String groupName; 
            private String id; 
            private String name; 
            private String nickName; 
            private java.util.Map<String, ?> parameter; 
            private String parentId; 
            private String regionId; 
            private SaleTag saleTag; 
            private ScheduleInfo scheduleInfo; 
            private String status; 
            private java.util.List<SubQuotaInfoList> subQuotaInfoList; 
            private String tag; 
            private String tenantId; 
            private String type; 
            private String version; 

            /**
             * billingPolicy.
             */
            public Builder billingPolicy(BillingPolicy billingPolicy) {
                this.billingPolicy = billingPolicy;
                return this;
            }

            /**
             * cluster.
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * creatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * groupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>quota ID</p>
             * 
             * <strong>example:</strong>
             * <p>2523</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * nickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * parameter.
             */
            public Builder parameter(java.util.Map<String, ?> parameter) {
                this.parameter = parameter;
                return this;
            }

            /**
             * parentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
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
             * saleTag.
             */
            public Builder saleTag(SaleTag saleTag) {
                this.saleTag = saleTag;
                return this;
            }

            /**
             * scheduleInfo.
             */
            public Builder scheduleInfo(ScheduleInfo scheduleInfo) {
                this.scheduleInfo = scheduleInfo;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * subQuotaInfoList.
             */
            public Builder subQuotaInfoList(java.util.List<SubQuotaInfoList> subQuotaInfoList) {
                this.subQuotaInfoList = subQuotaInfoList;
                return this;
            }

            /**
             * tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * tenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

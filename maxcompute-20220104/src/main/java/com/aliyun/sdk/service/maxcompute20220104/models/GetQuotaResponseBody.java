// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetQuotaResponseBody</p>
 */
public class GetQuotaResponseBody extends TeaModel {
    @NameInMap("billingPolicy")
    private BillingPolicy billingPolicy;

    @NameInMap("cluster")
    private String cluster;

    @NameInMap("createTime")
    private Long createTime;

    @NameInMap("creatorId")
    private String creatorId;

    @NameInMap("data")
    private Data data;

    @NameInMap("id")
    private String id;

    @NameInMap("name")
    private String name;

    @NameInMap("nickName")
    private String nickName;

    @NameInMap("parameter")
    private java.util.Map < String, ? > parameter;

    @NameInMap("parentId")
    private String parentId;

    @NameInMap("regionId")
    private String regionId;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("saleTag")
    private SaleTag saleTag;

    @NameInMap("scheduleInfo")
    private ScheduleInfo scheduleInfo;

    @NameInMap("status")
    private String status;

    @NameInMap("subQuotaInfoList")
    private java.util.List < SubQuotaInfoList> subQuotaInfoList;

    @NameInMap("tag")
    private String tag;

    @NameInMap("tenantId")
    private String tenantId;

    @NameInMap("type")
    private String type;

    @NameInMap("version")
    private String version;

    private GetQuotaResponseBody(Builder builder) {
        this.billingPolicy = builder.billingPolicy;
        this.cluster = builder.cluster;
        this.createTime = builder.createTime;
        this.creatorId = builder.creatorId;
        this.data = builder.data;
        this.id = builder.id;
        this.name = builder.name;
        this.nickName = builder.nickName;
        this.parameter = builder.parameter;
        this.parentId = builder.parentId;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
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

    public static GetQuotaResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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
    public java.util.Map < String, ? > getParameter() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
    public java.util.List < SubQuotaInfoList> getSubQuotaInfoList() {
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
        private Data data; 
        private String id; 
        private String name; 
        private String nickName; 
        private java.util.Map < String, ? > parameter; 
        private String parentId; 
        private String regionId; 
        private String requestId; 
        private SaleTag saleTag; 
        private ScheduleInfo scheduleInfo; 
        private String status; 
        private java.util.List < SubQuotaInfoList> subQuotaInfoList; 
        private String tag; 
        private String tenantId; 
        private String type; 
        private String version; 

        /**
         * The information about the order.
         */
        public Builder billingPolicy(BillingPolicy billingPolicy) {
            this.billingPolicy = billingPolicy;
            return this;
        }

        /**
         * The cluster ID.
         */
        public Builder cluster(String cluster) {
            this.cluster = cluster;
            return this;
        }

        /**
         * The time when the resource was created.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account that is used to create the resource.
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The quota ID.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * The name of the quota.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The alias of the quota.
         */
        public Builder nickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        /**
         * The description of the quota.
         */
        public Builder parameter(java.util.Map < String, ? > parameter) {
            this.parameter = parameter;
            return this;
        }

        /**
         * The ID of the parent resource.
         */
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The identifier of an object in a MaxCompute quota. This identifier is the same as the identifier in the sales bill of Alibaba Cloud. This parameter is used for tags.
         */
        public Builder saleTag(SaleTag saleTag) {
            this.saleTag = saleTag;
            return this;
        }

        /**
         * The information about the scheduling plan.
         */
        public Builder scheduleInfo(ScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }

        /**
         * The status of the resource.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The information about the level-2 quota.
         */
        public Builder subQuotaInfoList(java.util.List < SubQuotaInfoList> subQuotaInfoList) {
            this.subQuotaInfoList = subQuotaInfoList;
            return this;
        }

        /**
         * The tag of the resource for the quota.
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * The tenant ID.
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * The type of the resource system. This parameter corresponds to the resourceSystemType parameter of the cluster.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * The version number.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public GetQuotaResponseBody build() {
            return new GetQuotaResponseBody(this);
        } 

    } 

    public static class BillingPolicy extends TeaModel {
        @NameInMap("billingMethod")
        private String billingMethod;

        @NameInMap("odpsSpecCode")
        private String odpsSpecCode;

        @NameInMap("orderId")
        private String orderId;

        private BillingPolicy(Builder builder) {
            this.billingMethod = builder.billingMethod;
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
            private String odpsSpecCode; 
            private String orderId; 

            /**
             * The billing method of the quota. Valid values:
             * <p>
             * 
             * *   subscription: a subscription quota.
             * *   payasyougo: a pay-as-you-go quota.
             */
            public Builder billingMethod(String billingMethod) {
                this.billingMethod = billingMethod;
                return this;
            }

            /**
             * The specifications of the order.
             */
            public Builder odpsSpecCode(String odpsSpecCode) {
                this.odpsSpecCode = odpsSpecCode;
                return this;
            }

            /**
             * The order ID.
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
    public static class DataBillingPolicy extends TeaModel {
        @NameInMap("billingMethod")
        private String billingMethod;

        @NameInMap("odpsSpecCode")
        private String odpsSpecCode;

        @NameInMap("orderId")
        private String orderId;

        private DataBillingPolicy(Builder builder) {
            this.billingMethod = builder.billingMethod;
            this.odpsSpecCode = builder.odpsSpecCode;
            this.orderId = builder.orderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataBillingPolicy create() {
            return builder().build();
        }

        /**
         * @return billingMethod
         */
        public String getBillingMethod() {
            return this.billingMethod;
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
            private String odpsSpecCode; 
            private String orderId; 

            /**
             * The billing method of the quota. Valid values:
             * <p>
             * 
             * *   subscription: a subscription quota.
             * *   payasyougo: a pay-as-you-go quota.
             */
            public Builder billingMethod(String billingMethod) {
                this.billingMethod = billingMethod;
                return this;
            }

            /**
             * The specifications of the order.
             */
            public Builder odpsSpecCode(String odpsSpecCode) {
                this.odpsSpecCode = odpsSpecCode;
                return this;
            }

            /**
             * The order ID.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            public DataBillingPolicy build() {
                return new DataBillingPolicy(this);
            } 

        } 

    }
    public static class DataSaleTag extends TeaModel {
        @NameInMap("resourceIds")
        private java.util.List < String > resourceIds;

        @NameInMap("resourceType")
        private String resourceType;

        private DataSaleTag(Builder builder) {
            this.resourceIds = builder.resourceIds;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSaleTag create() {
            return builder().build();
        }

        /**
         * @return resourceIds
         */
        public java.util.List < String > getResourceIds() {
            return this.resourceIds;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private java.util.List < String > resourceIds; 
            private String resourceType; 

            /**
             * The identifier of an object in a MaxCompute quota. This identifier exists in the sales bill of Alibaba Cloud. You can use this identifier to associate the cost of a quota object with a tag.
             */
            public Builder resourceIds(java.util.List < String > resourceIds) {
                this.resourceIds = resourceIds;
                return this;
            }

            /**
             * The type of the object. Valid values: quota and project.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public DataSaleTag build() {
                return new DataSaleTag(this);
            } 

        } 

    }
    public static class DataScheduleInfo extends TeaModel {
        @NameInMap("currPlan")
        private String currPlan;

        @NameInMap("currTime")
        private String currTime;

        @NameInMap("nextPlan")
        private String nextPlan;

        @NameInMap("nextTime")
        private String nextTime;

        @NameInMap("oncePlan")
        private String oncePlan;

        @NameInMap("onceTime")
        private String onceTime;

        @NameInMap("operatorName")
        private String operatorName;

        @NameInMap("timezone")
        private String timezone;

        private DataScheduleInfo(Builder builder) {
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

        public static DataScheduleInfo create() {
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
             * The quota plan that takes effect based on the scheduling plan.
             */
            public Builder currPlan(String currPlan) {
                this.currPlan = currPlan;
                return this;
            }

            /**
             * The time when the current quota plan is scheduled.
             */
            public Builder currTime(String currTime) {
                this.currTime = currTime;
                return this;
            }

            /**
             * The next quota plan that will take effect based on the scheduling plan.
             */
            public Builder nextPlan(String nextPlan) {
                this.nextPlan = nextPlan;
                return this;
            }

            /**
             * The time when the next quota plan is scheduled.
             */
            public Builder nextTime(String nextTime) {
                this.nextTime = nextTime;
                return this;
            }

            /**
             * The quota plan that immediately takes effect. If the quota plan that immediately takes effect is different from the current quota plan, this parameter is not empty.
             */
            public Builder oncePlan(String oncePlan) {
                this.oncePlan = oncePlan;
                return this;
            }

            /**
             * The time when the quota plan immediately takes effect.
             */
            public Builder onceTime(String onceTime) {
                this.onceTime = onceTime;
                return this;
            }

            /**
             * The name of the operator.
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * The time zone of the project.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            public DataScheduleInfo build() {
                return new DataScheduleInfo(this);
            } 

        } 

    }
    public static class SubQuotaInfoListBillingPolicy extends TeaModel {
        @NameInMap("billingMethod")
        private String billingMethod;

        @NameInMap("odpsSpecCode")
        private String odpsSpecCode;

        @NameInMap("orderId")
        private String orderId;

        private SubQuotaInfoListBillingPolicy(Builder builder) {
            this.billingMethod = builder.billingMethod;
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
            private String odpsSpecCode; 
            private String orderId; 

            /**
             * The billing method of the quota. Valid values:
             * <p>
             * 
             * *   subscription: a subscription quota.
             * *   payasyougo: a pay-as-you-go quota.
             */
            public Builder billingMethod(String billingMethod) {
                this.billingMethod = billingMethod;
                return this;
            }

            /**
             * The specifications of the order.
             */
            public Builder odpsSpecCode(String odpsSpecCode) {
                this.odpsSpecCode = odpsSpecCode;
                return this;
            }

            /**
             * The order ID.
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
    public static class SubQuotaInfoListSaleTag extends TeaModel {
        @NameInMap("resourceIds")
        private java.util.List < String > resourceIds;

        @NameInMap("resourceType")
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
        public java.util.List < String > getResourceIds() {
            return this.resourceIds;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private java.util.List < String > resourceIds; 
            private String resourceType; 

            /**
             * The identifier of an object in a MaxCompute quota. This identifier exists in the sales bill of Alibaba Cloud. You can use this identifier to associate the cost of a quota object with a tag.
             */
            public Builder resourceIds(java.util.List < String > resourceIds) {
                this.resourceIds = resourceIds;
                return this;
            }

            /**
             * The type of the object. Valid values: quota and project.
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
    public static class SubQuotaInfoListScheduleInfo extends TeaModel {
        @NameInMap("currPlan")
        private String currPlan;

        @NameInMap("currTime")
        private String currTime;

        @NameInMap("nextPlan")
        private String nextPlan;

        @NameInMap("nextTime")
        private String nextTime;

        @NameInMap("oncePlan")
        private String oncePlan;

        @NameInMap("onceTime")
        private String onceTime;

        @NameInMap("operatorName")
        private String operatorName;

        @NameInMap("timezone")
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
             * The quota plan that takes effect based on the scheduling plan.
             */
            public Builder currPlan(String currPlan) {
                this.currPlan = currPlan;
                return this;
            }

            /**
             * The time when the current quota plan is scheduled.
             */
            public Builder currTime(String currTime) {
                this.currTime = currTime;
                return this;
            }

            /**
             * The next quota plan that will take effect based on the scheduling plan.
             */
            public Builder nextPlan(String nextPlan) {
                this.nextPlan = nextPlan;
                return this;
            }

            /**
             * The time when the next quota plan is scheduled.
             */
            public Builder nextTime(String nextTime) {
                this.nextTime = nextTime;
                return this;
            }

            /**
             * The quota plan that immediately takes effect. If the quota plan that immediately takes effect is different from the current quota plan, this parameter is not empty.
             */
            public Builder oncePlan(String oncePlan) {
                this.oncePlan = oncePlan;
                return this;
            }

            /**
             * The time when the quota plan immediately takes effect.
             */
            public Builder onceTime(String onceTime) {
                this.onceTime = onceTime;
                return this;
            }

            /**
             * The name of the operator.
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * The time zone of the project.
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
    public static class DataSubQuotaInfoList extends TeaModel {
        @NameInMap("billingPolicy")
        private SubQuotaInfoListBillingPolicy billingPolicy;

        @NameInMap("cluster")
        private String cluster;

        @NameInMap("createTime")
        private Long createTime;

        @NameInMap("creatorId")
        private String creatorId;

        @NameInMap("id")
        private String id;

        @NameInMap("name")
        private String name;

        @NameInMap("nickName")
        private String nickName;

        @NameInMap("parameter")
        private java.util.Map < String, ? > parameter;

        @NameInMap("parentId")
        private String parentId;

        @NameInMap("regionId")
        private String regionId;

        @NameInMap("saleTag")
        private SubQuotaInfoListSaleTag saleTag;

        @NameInMap("scheduleInfo")
        private SubQuotaInfoListScheduleInfo scheduleInfo;

        @NameInMap("status")
        private String status;

        @NameInMap("tag")
        private String tag;

        @NameInMap("tenantId")
        private String tenantId;

        @NameInMap("type")
        private String type;

        @NameInMap("version")
        private String version;

        private DataSubQuotaInfoList(Builder builder) {
            this.billingPolicy = builder.billingPolicy;
            this.cluster = builder.cluster;
            this.createTime = builder.createTime;
            this.creatorId = builder.creatorId;
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

        public static DataSubQuotaInfoList create() {
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
        public java.util.Map < String, ? > getParameter() {
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
            private String id; 
            private String name; 
            private String nickName; 
            private java.util.Map < String, ? > parameter; 
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
             * The information about the order.
             */
            public Builder billingPolicy(SubQuotaInfoListBillingPolicy billingPolicy) {
                this.billingPolicy = billingPolicy;
                return this;
            }

            /**
             * The cluster ID.
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * The time when the resource was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to create the resource.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * The ID of the level-2 quota.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the level-2 quota.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The nickname of the level-2 quota.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * The description of the quota.
             */
            public Builder parameter(java.util.Map < String, ? > parameter) {
                this.parameter = parameter;
                return this;
            }

            /**
             * The ID of the parent resource.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The identifier of an object in a MaxCompute quota. This identifier is the same as the identifier in the sales bill of Alibaba Cloud. This parameter is used for tags.
             */
            public Builder saleTag(SubQuotaInfoListSaleTag saleTag) {
                this.saleTag = saleTag;
                return this;
            }

            /**
             * The information about the scheduling plan.
             */
            public Builder scheduleInfo(SubQuotaInfoListScheduleInfo scheduleInfo) {
                this.scheduleInfo = scheduleInfo;
                return this;
            }

            /**
             * The status of the resource.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tag of the resource for the quota.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The tenant ID.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * The type of the resource system. This parameter corresponds to the resourceSystemType parameter of the cluster.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The version number.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public DataSubQuotaInfoList build() {
                return new DataSubQuotaInfoList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("billingPolicy")
        private DataBillingPolicy billingPolicy;

        @NameInMap("cluster")
        private String cluster;

        @NameInMap("createTime")
        private Long createTime;

        @NameInMap("creatorId")
        private String creatorId;

        @NameInMap("id")
        private String id;

        @NameInMap("name")
        private String name;

        @NameInMap("nickName")
        private String nickName;

        @NameInMap("parameter")
        private java.util.Map < String, ? > parameter;

        @NameInMap("parentId")
        private String parentId;

        @NameInMap("regionId")
        private String regionId;

        @NameInMap("saleTag")
        private DataSaleTag saleTag;

        @NameInMap("scheduleInfo")
        private DataScheduleInfo scheduleInfo;

        @NameInMap("status")
        private String status;

        @NameInMap("subQuotaInfoList")
        private java.util.List < DataSubQuotaInfoList> subQuotaInfoList;

        @NameInMap("tag")
        private String tag;

        @NameInMap("tenantId")
        private String tenantId;

        @NameInMap("type")
        private String type;

        @NameInMap("version")
        private String version;

        private Data(Builder builder) {
            this.billingPolicy = builder.billingPolicy;
            this.cluster = builder.cluster;
            this.createTime = builder.createTime;
            this.creatorId = builder.creatorId;
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
        public DataBillingPolicy getBillingPolicy() {
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
        public java.util.Map < String, ? > getParameter() {
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
        public DataSaleTag getSaleTag() {
            return this.saleTag;
        }

        /**
         * @return scheduleInfo
         */
        public DataScheduleInfo getScheduleInfo() {
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
        public java.util.List < DataSubQuotaInfoList> getSubQuotaInfoList() {
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
            private DataBillingPolicy billingPolicy; 
            private String cluster; 
            private Long createTime; 
            private String creatorId; 
            private String id; 
            private String name; 
            private String nickName; 
            private java.util.Map < String, ? > parameter; 
            private String parentId; 
            private String regionId; 
            private DataSaleTag saleTag; 
            private DataScheduleInfo scheduleInfo; 
            private String status; 
            private java.util.List < DataSubQuotaInfoList> subQuotaInfoList; 
            private String tag; 
            private String tenantId; 
            private String type; 
            private String version; 

            /**
             * The information about the order.
             */
            public Builder billingPolicy(DataBillingPolicy billingPolicy) {
                this.billingPolicy = billingPolicy;
                return this;
            }

            /**
             * The cluster ID.
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * The time when the resource was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to create the resource.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * The quota ID.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the quota.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The alias of the quota.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * The description of the quota.
             */
            public Builder parameter(java.util.Map < String, ? > parameter) {
                this.parameter = parameter;
                return this;
            }

            /**
             * The ID of the parent resource.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The identifier of an object in a MaxCompute quota. This identifier is the same as the identifier in the sales bill of Alibaba Cloud. This parameter is used for tags.
             */
            public Builder saleTag(DataSaleTag saleTag) {
                this.saleTag = saleTag;
                return this;
            }

            /**
             * The information about the scheduling plan.
             */
            public Builder scheduleInfo(DataScheduleInfo scheduleInfo) {
                this.scheduleInfo = scheduleInfo;
                return this;
            }

            /**
             * The status of the resource.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The information about the level-2 quota.
             */
            public Builder subQuotaInfoList(java.util.List < DataSubQuotaInfoList> subQuotaInfoList) {
                this.subQuotaInfoList = subQuotaInfoList;
                return this;
            }

            /**
             * The tag of the resource for the quota.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The tenant ID.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * The type of the resource system. This parameter corresponds to the resourceSystemType parameter of the cluster.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The version number.
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
    public static class SaleTag extends TeaModel {
        @NameInMap("resourceIds")
        private java.util.List < String > resourceIds;

        @NameInMap("resourceType")
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
        public java.util.List < String > getResourceIds() {
            return this.resourceIds;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private java.util.List < String > resourceIds; 
            private String resourceType; 

            /**
             * The identifier of an object in a MaxCompute quota. This identifier exists in the sales bill of Alibaba Cloud. You can use this identifier to associate the cost of a quota object with a tag.
             */
            public Builder resourceIds(java.util.List < String > resourceIds) {
                this.resourceIds = resourceIds;
                return this;
            }

            /**
             * The type of the object. Valid values: quota and project.
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
    public static class ScheduleInfo extends TeaModel {
        @NameInMap("currPlan")
        private String currPlan;

        @NameInMap("currTime")
        private String currTime;

        @NameInMap("nextPlan")
        private String nextPlan;

        @NameInMap("nextTime")
        private String nextTime;

        @NameInMap("oncePlan")
        private String oncePlan;

        @NameInMap("onceTime")
        private String onceTime;

        @NameInMap("operatorName")
        private String operatorName;

        @NameInMap("timezone")
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
             * The quota plan that takes effect based on the scheduling plan.
             */
            public Builder currPlan(String currPlan) {
                this.currPlan = currPlan;
                return this;
            }

            /**
             * The time when the current quota plan is scheduled.
             */
            public Builder currTime(String currTime) {
                this.currTime = currTime;
                return this;
            }

            /**
             * The next quota plan that will take effect based on the scheduling plan.
             */
            public Builder nextPlan(String nextPlan) {
                this.nextPlan = nextPlan;
                return this;
            }

            /**
             * The time when the next quota plan is scheduled.
             */
            public Builder nextTime(String nextTime) {
                this.nextTime = nextTime;
                return this;
            }

            /**
             * The quota plan that immediately takes effect. If the quota plan that immediately takes effect is different from the current quota plan, this parameter is not empty.
             */
            public Builder oncePlan(String oncePlan) {
                this.oncePlan = oncePlan;
                return this;
            }

            /**
             * The time when the quota plan immediately takes effect.
             */
            public Builder onceTime(String onceTime) {
                this.onceTime = onceTime;
                return this;
            }

            /**
             * The name of the operator.
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * The time zone of the project.
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
    public static class GetQuotaResponseBodySubQuotaInfoListBillingPolicy extends TeaModel {
        @NameInMap("billingMethod")
        private String billingMethod;

        @NameInMap("odpsSpecCode")
        private String odpsSpecCode;

        @NameInMap("orderId")
        private String orderId;

        private GetQuotaResponseBodySubQuotaInfoListBillingPolicy(Builder builder) {
            this.billingMethod = builder.billingMethod;
            this.odpsSpecCode = builder.odpsSpecCode;
            this.orderId = builder.orderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetQuotaResponseBodySubQuotaInfoListBillingPolicy create() {
            return builder().build();
        }

        /**
         * @return billingMethod
         */
        public String getBillingMethod() {
            return this.billingMethod;
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
            private String odpsSpecCode; 
            private String orderId; 

            /**
             * The billing method of the quota. Valid values:
             * <p>
             * 
             * *   subscription: a subscription quota.
             * *   payasyougo: a pay-as-you-go quota.
             */
            public Builder billingMethod(String billingMethod) {
                this.billingMethod = billingMethod;
                return this;
            }

            /**
             * The specifications of the order.
             */
            public Builder odpsSpecCode(String odpsSpecCode) {
                this.odpsSpecCode = odpsSpecCode;
                return this;
            }

            /**
             * The order ID.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            public GetQuotaResponseBodySubQuotaInfoListBillingPolicy build() {
                return new GetQuotaResponseBodySubQuotaInfoListBillingPolicy(this);
            } 

        } 

    }
    public static class GetQuotaResponseBodySubQuotaInfoListSaleTag extends TeaModel {
        @NameInMap("resourceIds")
        private java.util.List < String > resourceIds;

        @NameInMap("resourceType")
        private String resourceType;

        private GetQuotaResponseBodySubQuotaInfoListSaleTag(Builder builder) {
            this.resourceIds = builder.resourceIds;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetQuotaResponseBodySubQuotaInfoListSaleTag create() {
            return builder().build();
        }

        /**
         * @return resourceIds
         */
        public java.util.List < String > getResourceIds() {
            return this.resourceIds;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private java.util.List < String > resourceIds; 
            private String resourceType; 

            /**
             * The identifier of an object in a MaxCompute quota. This identifier exists in the sales bill of Alibaba Cloud. You can use this identifier to associate the cost of a quota object with a tag.
             */
            public Builder resourceIds(java.util.List < String > resourceIds) {
                this.resourceIds = resourceIds;
                return this;
            }

            /**
             * The type of the object. Valid values: quota and project.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public GetQuotaResponseBodySubQuotaInfoListSaleTag build() {
                return new GetQuotaResponseBodySubQuotaInfoListSaleTag(this);
            } 

        } 

    }
    public static class GetQuotaResponseBodySubQuotaInfoListScheduleInfo extends TeaModel {
        @NameInMap("currPlan")
        private String currPlan;

        @NameInMap("currTime")
        private String currTime;

        @NameInMap("nextPlan")
        private String nextPlan;

        @NameInMap("nextTime")
        private String nextTime;

        @NameInMap("oncePlan")
        private String oncePlan;

        @NameInMap("onceTime")
        private String onceTime;

        @NameInMap("operatorName")
        private String operatorName;

        @NameInMap("timezone")
        private String timezone;

        private GetQuotaResponseBodySubQuotaInfoListScheduleInfo(Builder builder) {
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

        public static GetQuotaResponseBodySubQuotaInfoListScheduleInfo create() {
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
             * The quota plan that takes effect based on the scheduling plan.
             */
            public Builder currPlan(String currPlan) {
                this.currPlan = currPlan;
                return this;
            }

            /**
             * The time when the current quota plan is scheduled.
             */
            public Builder currTime(String currTime) {
                this.currTime = currTime;
                return this;
            }

            /**
             * The next quota plan that will take effect based on the scheduling plan.
             */
            public Builder nextPlan(String nextPlan) {
                this.nextPlan = nextPlan;
                return this;
            }

            /**
             * The time when the next quota plan is scheduled.
             */
            public Builder nextTime(String nextTime) {
                this.nextTime = nextTime;
                return this;
            }

            /**
             * The quota plan that immediately takes effect. If the quota plan that immediately takes effect is different from the current quota plan, this parameter is not empty.
             */
            public Builder oncePlan(String oncePlan) {
                this.oncePlan = oncePlan;
                return this;
            }

            /**
             * The time when the quota plan immediately takes effect.
             */
            public Builder onceTime(String onceTime) {
                this.onceTime = onceTime;
                return this;
            }

            /**
             * The name of the operator.
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * The time zone of the project.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            public GetQuotaResponseBodySubQuotaInfoListScheduleInfo build() {
                return new GetQuotaResponseBodySubQuotaInfoListScheduleInfo(this);
            } 

        } 

    }
    public static class SubQuotaInfoList extends TeaModel {
        @NameInMap("billingPolicy")
        private GetQuotaResponseBodySubQuotaInfoListBillingPolicy billingPolicy;

        @NameInMap("cluster")
        private String cluster;

        @NameInMap("createTime")
        private Long createTime;

        @NameInMap("creatorId")
        private String creatorId;

        @NameInMap("id")
        private String id;

        @NameInMap("name")
        private String name;

        @NameInMap("nickName")
        private String nickName;

        @NameInMap("parameter")
        private java.util.Map < String, ? > parameter;

        @NameInMap("parentId")
        private String parentId;

        @NameInMap("regionId")
        private String regionId;

        @NameInMap("saleTag")
        private GetQuotaResponseBodySubQuotaInfoListSaleTag saleTag;

        @NameInMap("scheduleInfo")
        private GetQuotaResponseBodySubQuotaInfoListScheduleInfo scheduleInfo;

        @NameInMap("status")
        private String status;

        @NameInMap("tag")
        private String tag;

        @NameInMap("tenantId")
        private String tenantId;

        @NameInMap("type")
        private String type;

        @NameInMap("version")
        private String version;

        private SubQuotaInfoList(Builder builder) {
            this.billingPolicy = builder.billingPolicy;
            this.cluster = builder.cluster;
            this.createTime = builder.createTime;
            this.creatorId = builder.creatorId;
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
        public GetQuotaResponseBodySubQuotaInfoListBillingPolicy getBillingPolicy() {
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
        public java.util.Map < String, ? > getParameter() {
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
        public GetQuotaResponseBodySubQuotaInfoListSaleTag getSaleTag() {
            return this.saleTag;
        }

        /**
         * @return scheduleInfo
         */
        public GetQuotaResponseBodySubQuotaInfoListScheduleInfo getScheduleInfo() {
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
            private GetQuotaResponseBodySubQuotaInfoListBillingPolicy billingPolicy; 
            private String cluster; 
            private Long createTime; 
            private String creatorId; 
            private String id; 
            private String name; 
            private String nickName; 
            private java.util.Map < String, ? > parameter; 
            private String parentId; 
            private String regionId; 
            private GetQuotaResponseBodySubQuotaInfoListSaleTag saleTag; 
            private GetQuotaResponseBodySubQuotaInfoListScheduleInfo scheduleInfo; 
            private String status; 
            private String tag; 
            private String tenantId; 
            private String type; 
            private String version; 

            /**
             * The information about the order.
             */
            public Builder billingPolicy(GetQuotaResponseBodySubQuotaInfoListBillingPolicy billingPolicy) {
                this.billingPolicy = billingPolicy;
                return this;
            }

            /**
             * The cluster ID.
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * The time when the resource was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to create the resource.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * The ID of the level-2 quota.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the level-2 quota.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The alias of the level-2 quota.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * The description of the quota.
             */
            public Builder parameter(java.util.Map < String, ? > parameter) {
                this.parameter = parameter;
                return this;
            }

            /**
             * The ID of the parent resource.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The identifier of an object in a MaxCompute quota. This identifier is the same as the identifier in the sales bill of Alibaba Cloud. This parameter is used for tags.
             */
            public Builder saleTag(GetQuotaResponseBodySubQuotaInfoListSaleTag saleTag) {
                this.saleTag = saleTag;
                return this;
            }

            /**
             * The information about the scheduling plan.
             */
            public Builder scheduleInfo(GetQuotaResponseBodySubQuotaInfoListScheduleInfo scheduleInfo) {
                this.scheduleInfo = scheduleInfo;
                return this;
            }

            /**
             * The status of the resource.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tag of the resource for the quota.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The tenant ID.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * The type of the resource system. This parameter corresponds to the resourceSystemType parameter of the cluster.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The version number.
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
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQuotaPlanResponseBody} extends {@link TeaModel}
 *
 * <p>GetQuotaPlanResponseBody</p>
 */
public class GetQuotaPlanResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private GetQuotaPlanResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaPlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetQuotaPlanResponseBody build() {
            return new GetQuotaPlanResponseBody(this);
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
             * The ID of the order.
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

        private ScheduleInfo(Builder builder) {
            this.currPlan = builder.currPlan;
            this.currTime = builder.currTime;
            this.nextPlan = builder.nextPlan;
            this.nextTime = builder.nextTime;
            this.oncePlan = builder.oncePlan;
            this.onceTime = builder.onceTime;
            this.operatorName = builder.operatorName;
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

        public static final class Builder {
            private String currPlan; 
            private String currTime; 
            private String nextPlan; 
            private String nextTime; 
            private String oncePlan; 
            private String onceTime; 
            private String operatorName; 

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
             * If the quota plan that immediately takes effect is different from the current quota plan, this parameter is not empty.
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

            public ScheduleInfo build() {
                return new ScheduleInfo(this);
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
             * The ID of the order.
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

        private SubQuotaInfoListScheduleInfo(Builder builder) {
            this.currPlan = builder.currPlan;
            this.currTime = builder.currTime;
            this.nextPlan = builder.nextPlan;
            this.nextTime = builder.nextTime;
            this.oncePlan = builder.oncePlan;
            this.onceTime = builder.onceTime;
            this.operatorName = builder.operatorName;
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

        public static final class Builder {
            private String currPlan; 
            private String currTime; 
            private String nextPlan; 
            private String nextTime; 
            private String oncePlan; 
            private String onceTime; 
            private String operatorName; 

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
             * If the quota plan that immediately takes effect is different from the current quota plan, this parameter is not empty.
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

            public SubQuotaInfoListScheduleInfo build() {
                return new SubQuotaInfoListScheduleInfo(this);
            } 

        } 

    }
    public static class SubQuotaInfoList extends TeaModel {
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
            private SubQuotaInfoListScheduleInfo scheduleInfo; 
            private String status; 
            private String tag; 
            private String tenantId; 
            private String type; 
            private String version; 

            /**
             * The information of the order.
             */
            public Builder billingPolicy(SubQuotaInfoListBillingPolicy billingPolicy) {
                this.billingPolicy = billingPolicy;
                return this;
            }

            /**
             * The ID of the cluster.
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
             * The ID of the user who created the quota plan.
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
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The information of the scheduling plan.
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
             * The ID of the tenant.
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
    public static class Quota extends TeaModel {
        @NameInMap("billingPolicy")
        private BillingPolicy billingPolicy;

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

        private Quota(Builder builder) {
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

        public static Quota create() {
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
            private String id; 
            private String name; 
            private String nickName; 
            private java.util.Map < String, ? > parameter; 
            private String parentId; 
            private String regionId; 
            private ScheduleInfo scheduleInfo; 
            private String status; 
            private java.util.List < SubQuotaInfoList> subQuotaInfoList; 
            private String tag; 
            private String tenantId; 
            private String type; 
            private String version; 

            /**
             * The information of the order.
             */
            public Builder billingPolicy(BillingPolicy billingPolicy) {
                this.billingPolicy = billingPolicy;
                return this;
            }

            /**
             * The ID of the cluster.
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * The time when the quota plan was created.
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
             * The ID of the quota.
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
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The information of the scheduling plan.
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
             * The information of the level-2 quota.
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
             * The ID of the tenant.
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

            public Quota build() {
                return new Quota(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("createTime")
        private String createTime;

        @NameInMap("name")
        private String name;

        @NameInMap("quota")
        private Quota quota;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.name = builder.name;
            this.quota = builder.quota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return quota
         */
        public Quota getQuota() {
            return this.quota;
        }

        public static final class Builder {
            private String createTime; 
            private String name; 
            private Quota quota; 

            /**
             * The time when the quota plan was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The name of the quota plan.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The details of the quota.
             */
            public Builder quota(Quota quota) {
                this.quota = quota;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

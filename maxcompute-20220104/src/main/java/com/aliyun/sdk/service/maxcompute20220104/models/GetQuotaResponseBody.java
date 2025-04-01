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
 * {@link GetQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetQuotaResponseBody</p>
 */
public class GetQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("billingPolicy")
    private BillingPolicy billingPolicy;

    @com.aliyun.core.annotation.NameInMap("cluster")
    private String cluster;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("creatorId")
    private String creatorId;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

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

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

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

    public Builder toBuilder() {
        return new Builder(this);
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
        private Data data; 
        private String id; 
        private String name; 
        private String nickName; 
        private java.util.Map<String, ?> parameter; 
        private String parentId; 
        private String regionId; 
        private String requestId; 
        private SaleTag saleTag; 
        private ScheduleInfo scheduleInfo; 
        private String status; 
        private java.util.List<SubQuotaInfoList> subQuotaInfoList; 
        private String tag; 
        private String tenantId; 
        private String type; 
        private String version; 

        private Builder() {
        } 

        private Builder(GetQuotaResponseBody model) {
            this.billingPolicy = model.billingPolicy;
            this.cluster = model.cluster;
            this.createTime = model.createTime;
            this.creatorId = model.creatorId;
            this.data = model.data;
            this.id = model.id;
            this.name = model.name;
            this.nickName = model.nickName;
            this.parameter = model.parameter;
            this.parentId = model.parentId;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.saleTag = model.saleTag;
            this.scheduleInfo = model.scheduleInfo;
            this.status = model.status;
            this.subQuotaInfoList = model.subQuotaInfoList;
            this.tag = model.tag;
            this.tenantId = model.tenantId;
            this.type = model.type;
            this.version = model.version;
        } 

        /**
         * <p>The information about the order.</p>
         */
        public Builder billingPolicy(BillingPolicy billingPolicy) {
            this.billingPolicy = billingPolicy;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AT-120N</p>
         */
        public Builder cluster(String cluster) {
            this.cluster = cluster;
            return this;
        }

        /**
         * <p>The time when the resource was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-06T02:14:44Z</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account that is used to create the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>672863518</p>
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The quota ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The name of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>quota_a</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The alias of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>quota_nickname</p>
         */
        public Builder nickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        /**
         * <p>The description of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;minCU&quot;:10,	
         * &quot;adhocCU&quot;:0,
         * &quot;maxCU&quot;:10,
         * &quot;schedulerType&quot;:&quot;Fair&quot;,
         * }</p>
         */
        public Builder parameter(java.util.Map<String, ?> parameter) {
            this.parameter = parameter;
            return this;
        }

        /**
         * <p>The ID of the parent resource.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0b87b7a316654730544735643e9200</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The identifier of an object in a MaxCompute quota. This identifier is the same as the identifier in the sales bill of Alibaba Cloud. This parameter is used for tags.</p>
         */
        public Builder saleTag(SaleTag saleTag) {
            this.saleTag = saleTag;
            return this;
        }

        /**
         * <p>The information about the scheduling plan.</p>
         */
        public Builder scheduleInfo(ScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }

        /**
         * <p>The status of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The information about the level-2 quota.</p>
         */
        public Builder subQuotaInfoList(java.util.List<SubQuotaInfoList> subQuotaInfoList) {
            this.subQuotaInfoList = subQuotaInfoList;
            return this;
        }

        /**
         * <p>The tag of the resource for the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>478403690625249</p>
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The type of the resource system. This parameter corresponds to the resourceSystemType parameter of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>FUXI_ONLINE</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public GetQuotaResponseBody build() {
            return new GetQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaResponseBody</p>
     */
    public static class BillingPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billingMethod")
        private String billingMethod;

        @com.aliyun.core.annotation.NameInMap("odpsSpecCode")
        private String odpsSpecCode;

        @com.aliyun.core.annotation.NameInMap("orderId")
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

            private Builder() {
            } 

            private Builder(BillingPolicy model) {
                this.billingMethod = model.billingMethod;
                this.odpsSpecCode = model.odpsSpecCode;
                this.orderId = model.orderId;
            } 

            /**
             * <p>The billing method of the quota. Valid values:</p>
             * <ul>
             * <li>subscription: a subscription quota.</li>
             * <li>payasyougo: a pay-as-you-go quota.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>subscription</p>
             */
            public Builder billingMethod(String billingMethod) {
                this.billingMethod = billingMethod;
                return this;
            }

            /**
             * <p>The specifications of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>OdpsStandard</p>
             */
            public Builder odpsSpecCode(String odpsSpecCode) {
                this.odpsSpecCode = odpsSpecCode;
                return this;
            }

            /**
             * <p>The order ID.</p>
             * 
             * <strong>example:</strong>
             * <p>45245678</p>
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
     * {@link GetQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaResponseBody</p>
     */
    public static class DataBillingPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billingMethod")
        private String billingMethod;

        @com.aliyun.core.annotation.NameInMap("odpsSpecCode")
        private String odpsSpecCode;

        @com.aliyun.core.annotation.NameInMap("orderId")
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

            private Builder() {
            } 

            private Builder(DataBillingPolicy model) {
                this.billingMethod = model.billingMethod;
                this.odpsSpecCode = model.odpsSpecCode;
                this.orderId = model.orderId;
            } 

            /**
             * <p>The billing method of the quota. Valid values:</p>
             * <ul>
             * <li>subscription: a subscription quota.</li>
             * <li>payasyougo: a pay-as-you-go quota.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>subscription</p>
             */
            public Builder billingMethod(String billingMethod) {
                this.billingMethod = billingMethod;
                return this;
            }

            /**
             * <p>The specifications of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>OdpsStandard</p>
             */
            public Builder odpsSpecCode(String odpsSpecCode) {
                this.odpsSpecCode = odpsSpecCode;
                return this;
            }

            /**
             * <p>The order ID.</p>
             * 
             * <strong>example:</strong>
             * <p>45245678</p>
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
    /**
     * 
     * {@link GetQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaResponseBody</p>
     */
    public static class DataSaleTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("resourceIds")
        private java.util.List<String> resourceIds;

        @com.aliyun.core.annotation.NameInMap("resourceType")
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

            private Builder() {
            } 

            private Builder(DataSaleTag model) {
                this.resourceIds = model.resourceIds;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The identifier of an object in a MaxCompute quota. This identifier exists in the sales bill of Alibaba Cloud. You can use this identifier to associate the cost of a quota object with a tag.</p>
             */
            public Builder resourceIds(java.util.List<String> resourceIds) {
                this.resourceIds = resourceIds;
                return this;
            }

            /**
             * <p>The type of the object. Valid values: quota and project.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;quota&quot;</p>
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
    /**
     * 
     * {@link GetQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaResponseBody</p>
     */
    public static class DataScheduleInfo extends TeaModel {
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

            private Builder() {
            } 

            private Builder(DataScheduleInfo model) {
                this.currPlan = model.currPlan;
                this.currTime = model.currTime;
                this.nextPlan = model.nextPlan;
                this.nextTime = model.nextTime;
                this.oncePlan = model.oncePlan;
                this.onceTime = model.onceTime;
                this.operatorName = model.operatorName;
                this.timezone = model.timezone;
            } 

            /**
             * <p>The quota plan that takes effect based on the scheduling plan.</p>
             * 
             * <strong>example:</strong>
             * <p>planA</p>
             */
            public Builder currPlan(String currPlan) {
                this.currPlan = currPlan;
                return this;
            }

            /**
             * <p>The time when the current quota plan is scheduled.</p>
             * 
             * <strong>example:</strong>
             * <p>0800</p>
             */
            public Builder currTime(String currTime) {
                this.currTime = currTime;
                return this;
            }

            /**
             * <p>The next quota plan that will take effect based on the scheduling plan.</p>
             * 
             * <strong>example:</strong>
             * <p>planB</p>
             */
            public Builder nextPlan(String nextPlan) {
                this.nextPlan = nextPlan;
                return this;
            }

            /**
             * <p>The time when the next quota plan is scheduled.</p>
             * 
             * <strong>example:</strong>
             * <p>1700</p>
             */
            public Builder nextTime(String nextTime) {
                this.nextTime = nextTime;
                return this;
            }

            /**
             * <p>The quota plan that immediately takes effect. If the quota plan that immediately takes effect is different from the current quota plan, this parameter is not empty.</p>
             * 
             * <strong>example:</strong>
             * <p>planC</p>
             */
            public Builder oncePlan(String oncePlan) {
                this.oncePlan = oncePlan;
                return this;
            }

            /**
             * <p>The time when the quota plan immediately takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>1500</p>
             */
            public Builder onceTime(String onceTime) {
                this.onceTime = onceTime;
                return this;
            }

            /**
             * <p>The name of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>userA</p>
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * <p>The time zone of the project.</p>
             * 
             * <strong>example:</strong>
             * <p>UTC+8</p>
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
    /**
     * 
     * {@link GetQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaResponseBody</p>
     */
    public static class SubQuotaInfoListBillingPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billingMethod")
        private String billingMethod;

        @com.aliyun.core.annotation.NameInMap("odpsSpecCode")
        private String odpsSpecCode;

        @com.aliyun.core.annotation.NameInMap("orderId")
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

            private Builder() {
            } 

            private Builder(SubQuotaInfoListBillingPolicy model) {
                this.billingMethod = model.billingMethod;
                this.odpsSpecCode = model.odpsSpecCode;
                this.orderId = model.orderId;
            } 

            /**
             * <p>The billing method of the quota. Valid values:</p>
             * <ul>
             * <li>subscription: a subscription quota.</li>
             * <li>payasyougo: a pay-as-you-go quota.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>subscription</p>
             */
            public Builder billingMethod(String billingMethod) {
                this.billingMethod = billingMethod;
                return this;
            }

            /**
             * <p>The specifications of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>OdpsStandard</p>
             */
            public Builder odpsSpecCode(String odpsSpecCode) {
                this.odpsSpecCode = odpsSpecCode;
                return this;
            }

            /**
             * <p>The order ID.</p>
             * 
             * <strong>example:</strong>
             * <p>45245678</p>
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
     * {@link GetQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaResponseBody</p>
     */
    public static class Parameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("elasticReservedCU")
        private Long elasticReservedCU;

        @com.aliyun.core.annotation.NameInMap("enablePriority")
        private Boolean enablePriority;

        @com.aliyun.core.annotation.NameInMap("forceReservedMin")
        private Boolean forceReservedMin;

        @com.aliyun.core.annotation.NameInMap("maxCU")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long maxCU;

        @com.aliyun.core.annotation.NameInMap("minCU")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long minCU;

        @com.aliyun.core.annotation.NameInMap("schedulerType")
        private String schedulerType;

        @com.aliyun.core.annotation.NameInMap("singleJobCULimit")
        private Long singleJobCULimit;

        private Parameter(Builder builder) {
            this.elasticReservedCU = builder.elasticReservedCU;
            this.enablePriority = builder.enablePriority;
            this.forceReservedMin = builder.forceReservedMin;
            this.maxCU = builder.maxCU;
            this.minCU = builder.minCU;
            this.schedulerType = builder.schedulerType;
            this.singleJobCULimit = builder.singleJobCULimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameter create() {
            return builder().build();
        }

        /**
         * @return elasticReservedCU
         */
        public Long getElasticReservedCU() {
            return this.elasticReservedCU;
        }

        /**
         * @return enablePriority
         */
        public Boolean getEnablePriority() {
            return this.enablePriority;
        }

        /**
         * @return forceReservedMin
         */
        public Boolean getForceReservedMin() {
            return this.forceReservedMin;
        }

        /**
         * @return maxCU
         */
        public Long getMaxCU() {
            return this.maxCU;
        }

        /**
         * @return minCU
         */
        public Long getMinCU() {
            return this.minCU;
        }

        /**
         * @return schedulerType
         */
        public String getSchedulerType() {
            return this.schedulerType;
        }

        /**
         * @return singleJobCULimit
         */
        public Long getSingleJobCULimit() {
            return this.singleJobCULimit;
        }

        public static final class Builder {
            private Long elasticReservedCU; 
            private Boolean enablePriority; 
            private Boolean forceReservedMin; 
            private Long maxCU; 
            private Long minCU; 
            private String schedulerType; 
            private Long singleJobCULimit; 

            private Builder() {
            } 

            private Builder(Parameter model) {
                this.elasticReservedCU = model.elasticReservedCU;
                this.enablePriority = model.enablePriority;
                this.forceReservedMin = model.forceReservedMin;
                this.maxCU = model.maxCU;
                this.minCU = model.minCU;
                this.schedulerType = model.schedulerType;
                this.singleJobCULimit = model.singleJobCULimit;
            } 

            /**
             * elasticReservedCU.
             */
            public Builder elasticReservedCU(Long elasticReservedCU) {
                this.elasticReservedCU = elasticReservedCU;
                return this;
            }

            /**
             * enablePriority.
             */
            public Builder enablePriority(Boolean enablePriority) {
                this.enablePriority = enablePriority;
                return this;
            }

            /**
             * forceReservedMin.
             */
            public Builder forceReservedMin(Boolean forceReservedMin) {
                this.forceReservedMin = forceReservedMin;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder maxCU(Long maxCU) {
                this.maxCU = maxCU;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder minCU(Long minCU) {
                this.minCU = minCU;
                return this;
            }

            /**
             * schedulerType.
             */
            public Builder schedulerType(String schedulerType) {
                this.schedulerType = schedulerType;
                return this;
            }

            /**
             * singleJobCULimit.
             */
            public Builder singleJobCULimit(Long singleJobCULimit) {
                this.singleJobCULimit = singleJobCULimit;
                return this;
            }

            public Parameter build() {
                return new Parameter(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaResponseBody</p>
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

            private Builder() {
            } 

            private Builder(SubQuotaInfoListSaleTag model) {
                this.resourceIds = model.resourceIds;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The identifier of an object in a MaxCompute quota. This identifier exists in the sales bill of Alibaba Cloud. You can use this identifier to associate the cost of a quota object with a tag.</p>
             */
            public Builder resourceIds(java.util.List<String> resourceIds) {
                this.resourceIds = resourceIds;
                return this;
            }

            /**
             * <p>The type of the object. Valid values: quota and project.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;quota&quot;</p>
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
     * {@link GetQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaResponseBody</p>
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

            private Builder() {
            } 

            private Builder(SubQuotaInfoListScheduleInfo model) {
                this.currPlan = model.currPlan;
                this.currTime = model.currTime;
                this.nextPlan = model.nextPlan;
                this.nextTime = model.nextTime;
                this.oncePlan = model.oncePlan;
                this.onceTime = model.onceTime;
                this.operatorName = model.operatorName;
                this.timezone = model.timezone;
            } 

            /**
             * <p>The quota plan that takes effect based on the scheduling plan.</p>
             * 
             * <strong>example:</strong>
             * <p>planA</p>
             */
            public Builder currPlan(String currPlan) {
                this.currPlan = currPlan;
                return this;
            }

            /**
             * <p>The time when the current quota plan is scheduled.</p>
             * 
             * <strong>example:</strong>
             * <p>0800</p>
             */
            public Builder currTime(String currTime) {
                this.currTime = currTime;
                return this;
            }

            /**
             * <p>The next quota plan that will take effect based on the scheduling plan.</p>
             * 
             * <strong>example:</strong>
             * <p>planB</p>
             */
            public Builder nextPlan(String nextPlan) {
                this.nextPlan = nextPlan;
                return this;
            }

            /**
             * <p>The time when the next quota plan is scheduled.</p>
             * 
             * <strong>example:</strong>
             * <p>1700</p>
             */
            public Builder nextTime(String nextTime) {
                this.nextTime = nextTime;
                return this;
            }

            /**
             * <p>The quota plan that immediately takes effect. If the quota plan that immediately takes effect is different from the current quota plan, this parameter is not empty.</p>
             * 
             * <strong>example:</strong>
             * <p>planC</p>
             */
            public Builder oncePlan(String oncePlan) {
                this.oncePlan = oncePlan;
                return this;
            }

            /**
             * <p>The time when the quota plan immediately takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>1500</p>
             */
            public Builder onceTime(String onceTime) {
                this.onceTime = onceTime;
                return this;
            }

            /**
             * <p>The name of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>userA</p>
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * <p>The time zone of the project.</p>
             * 
             * <strong>example:</strong>
             * <p>UTC+8</p>
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
     * {@link GetQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaResponseBody</p>
     */
    public static class DataSubQuotaInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billingPolicy")
        private SubQuotaInfoListBillingPolicy billingPolicy;

        @com.aliyun.core.annotation.NameInMap("cluster")
        private String cluster;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("creatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("parameter")
        private Parameter parameter;

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
        public Parameter getParameter() {
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
            private Parameter parameter; 
            private String parentId; 
            private String regionId; 
            private SubQuotaInfoListSaleTag saleTag; 
            private SubQuotaInfoListScheduleInfo scheduleInfo; 
            private String status; 
            private String tag; 
            private String tenantId; 
            private String type; 
            private String version; 

            private Builder() {
            } 

            private Builder(DataSubQuotaInfoList model) {
                this.billingPolicy = model.billingPolicy;
                this.cluster = model.cluster;
                this.createTime = model.createTime;
                this.creatorId = model.creatorId;
                this.id = model.id;
                this.name = model.name;
                this.nickName = model.nickName;
                this.parameter = model.parameter;
                this.parentId = model.parentId;
                this.regionId = model.regionId;
                this.saleTag = model.saleTag;
                this.scheduleInfo = model.scheduleInfo;
                this.status = model.status;
                this.tag = model.tag;
                this.tenantId = model.tenantId;
                this.type = model.type;
                this.version = model.version;
            } 

            /**
             * <p>The information about the order.</p>
             */
            public Builder billingPolicy(SubQuotaInfoListBillingPolicy billingPolicy) {
                this.billingPolicy = billingPolicy;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>AT-120N</p>
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * <p>The time when the resource was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-06T02:14:44Z</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to create the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>672863518</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The ID of the level-2 quota.</p>
             * 
             * <strong>example:</strong>
             * <p>1000048</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the level-2 quota.</p>
             * 
             * <strong>example:</strong>
             * <p>subquotaA</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The nickname of the level-2 quota.</p>
             * 
             * <strong>example:</strong>
             * <p>subquotaA</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>The description of the quota.</p>
             */
            public Builder parameter(Parameter parameter) {
                this.parameter = parameter;
                return this;
            }

            /**
             * <p>The ID of the parent resource.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The identifier of an object in a MaxCompute quota. This identifier is the same as the identifier in the sales bill of Alibaba Cloud. This parameter is used for tags.</p>
             */
            public Builder saleTag(SubQuotaInfoListSaleTag saleTag) {
                this.saleTag = saleTag;
                return this;
            }

            /**
             * <p>The information about the scheduling plan.</p>
             */
            public Builder scheduleInfo(SubQuotaInfoListScheduleInfo scheduleInfo) {
                this.scheduleInfo = scheduleInfo;
                return this;
            }

            /**
             * <p>The status of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag of the resource for the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>478403690625249</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The type of the resource system. This parameter corresponds to the resourceSystemType parameter of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>FUXI_ONLINE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link GetQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billingPolicy")
        private DataBillingPolicy billingPolicy;

        @com.aliyun.core.annotation.NameInMap("cluster")
        private String cluster;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("creatorId")
        private String creatorId;

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
        private DataSaleTag saleTag;

        @com.aliyun.core.annotation.NameInMap("scheduleInfo")
        private DataScheduleInfo scheduleInfo;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("subQuotaInfoList")
        private java.util.List<DataSubQuotaInfoList> subQuotaInfoList;

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
        public java.util.List<DataSubQuotaInfoList> getSubQuotaInfoList() {
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
            private java.util.Map<String, ?> parameter; 
            private String parentId; 
            private String regionId; 
            private DataSaleTag saleTag; 
            private DataScheduleInfo scheduleInfo; 
            private String status; 
            private java.util.List<DataSubQuotaInfoList> subQuotaInfoList; 
            private String tag; 
            private String tenantId; 
            private String type; 
            private String version; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.billingPolicy = model.billingPolicy;
                this.cluster = model.cluster;
                this.createTime = model.createTime;
                this.creatorId = model.creatorId;
                this.id = model.id;
                this.name = model.name;
                this.nickName = model.nickName;
                this.parameter = model.parameter;
                this.parentId = model.parentId;
                this.regionId = model.regionId;
                this.saleTag = model.saleTag;
                this.scheduleInfo = model.scheduleInfo;
                this.status = model.status;
                this.subQuotaInfoList = model.subQuotaInfoList;
                this.tag = model.tag;
                this.tenantId = model.tenantId;
                this.type = model.type;
                this.version = model.version;
            } 

            /**
             * <p>The information about the order.</p>
             */
            public Builder billingPolicy(DataBillingPolicy billingPolicy) {
                this.billingPolicy = billingPolicy;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>AT-120N</p>
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * <p>The time when the resource was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-06T02:14:44Z</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to create the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>672863518</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The quota ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>quota_a</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The alias of the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>quota_nickname</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>The description of the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;minCU&quot;:10,	
             * &quot;adhocCU&quot;:0,
             * &quot;maxCU&quot;:10,
             * &quot;schedulerType&quot;:&quot;Fair&quot;,
             * }</p>
             */
            public Builder parameter(java.util.Map<String, ?> parameter) {
                this.parameter = parameter;
                return this;
            }

            /**
             * <p>The ID of the parent resource.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The identifier of an object in a MaxCompute quota. This identifier is the same as the identifier in the sales bill of Alibaba Cloud. This parameter is used for tags.</p>
             */
            public Builder saleTag(DataSaleTag saleTag) {
                this.saleTag = saleTag;
                return this;
            }

            /**
             * <p>The information about the scheduling plan.</p>
             */
            public Builder scheduleInfo(DataScheduleInfo scheduleInfo) {
                this.scheduleInfo = scheduleInfo;
                return this;
            }

            /**
             * <p>The status of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The information about the level-2 quota.</p>
             */
            public Builder subQuotaInfoList(java.util.List<DataSubQuotaInfoList> subQuotaInfoList) {
                this.subQuotaInfoList = subQuotaInfoList;
                return this;
            }

            /**
             * <p>The tag of the resource for the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>478403690625249</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The type of the resource system. This parameter corresponds to the resourceSystemType parameter of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>FUXI_ONLINE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link GetQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaResponseBody</p>
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

            private Builder() {
            } 

            private Builder(SaleTag model) {
                this.resourceIds = model.resourceIds;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The identifier of an object in a MaxCompute quota. This identifier exists in the sales bill of Alibaba Cloud. You can use this identifier to associate the cost of a quota object with a tag.</p>
             */
            public Builder resourceIds(java.util.List<String> resourceIds) {
                this.resourceIds = resourceIds;
                return this;
            }

            /**
             * <p>The type of the object. Valid values: quota and project.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;quota&quot;</p>
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
     * {@link GetQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ScheduleInfo model) {
                this.currPlan = model.currPlan;
                this.currTime = model.currTime;
                this.nextPlan = model.nextPlan;
                this.nextTime = model.nextTime;
                this.oncePlan = model.oncePlan;
                this.onceTime = model.onceTime;
                this.operatorName = model.operatorName;
                this.timezone = model.timezone;
            } 

            /**
             * <p>The quota plan that takes effect based on the scheduling plan.</p>
             * 
             * <strong>example:</strong>
             * <p>planA</p>
             */
            public Builder currPlan(String currPlan) {
                this.currPlan = currPlan;
                return this;
            }

            /**
             * <p>The time when the current quota plan is scheduled.</p>
             * 
             * <strong>example:</strong>
             * <p>0800</p>
             */
            public Builder currTime(String currTime) {
                this.currTime = currTime;
                return this;
            }

            /**
             * <p>The next quota plan that will take effect based on the scheduling plan.</p>
             * 
             * <strong>example:</strong>
             * <p>planB</p>
             */
            public Builder nextPlan(String nextPlan) {
                this.nextPlan = nextPlan;
                return this;
            }

            /**
             * <p>The time when the next quota plan is scheduled.</p>
             * 
             * <strong>example:</strong>
             * <p>1700</p>
             */
            public Builder nextTime(String nextTime) {
                this.nextTime = nextTime;
                return this;
            }

            /**
             * <p>The quota plan that immediately takes effect. If the quota plan that immediately takes effect is different from the current quota plan, this parameter is not empty.</p>
             * 
             * <strong>example:</strong>
             * <p>planC</p>
             */
            public Builder oncePlan(String oncePlan) {
                this.oncePlan = oncePlan;
                return this;
            }

            /**
             * <p>The time when the quota plan immediately takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>1500</p>
             */
            public Builder onceTime(String onceTime) {
                this.onceTime = onceTime;
                return this;
            }

            /**
             * <p>The name of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>userA</p>
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * <p>The time zone of the project.</p>
             * 
             * <strong>example:</strong>
             * <p>UTC+8</p>
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
     * {@link GetQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaResponseBody</p>
     */
    public static class GetQuotaResponseBodySubQuotaInfoListBillingPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billingMethod")
        private String billingMethod;

        @com.aliyun.core.annotation.NameInMap("odpsSpecCode")
        private String odpsSpecCode;

        @com.aliyun.core.annotation.NameInMap("orderId")
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

            private Builder() {
            } 

            private Builder(GetQuotaResponseBodySubQuotaInfoListBillingPolicy model) {
                this.billingMethod = model.billingMethod;
                this.odpsSpecCode = model.odpsSpecCode;
                this.orderId = model.orderId;
            } 

            /**
             * <p>The billing method of the quota. Valid values:</p>
             * <ul>
             * <li>subscription: a subscription quota.</li>
             * <li>payasyougo: a pay-as-you-go quota.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>subscription</p>
             */
            public Builder billingMethod(String billingMethod) {
                this.billingMethod = billingMethod;
                return this;
            }

            /**
             * <p>The specifications of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>OdpsStandard</p>
             */
            public Builder odpsSpecCode(String odpsSpecCode) {
                this.odpsSpecCode = odpsSpecCode;
                return this;
            }

            /**
             * <p>The order ID.</p>
             * 
             * <strong>example:</strong>
             * <p>45245678</p>
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
    /**
     * 
     * {@link GetQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaResponseBody</p>
     */
    public static class SubQuotaInfoListParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("elasticReservedCU")
        private Long elasticReservedCU;

        @com.aliyun.core.annotation.NameInMap("enablePriority")
        private Boolean enablePriority;

        @com.aliyun.core.annotation.NameInMap("forceReservedMin")
        private Boolean forceReservedMin;

        @com.aliyun.core.annotation.NameInMap("maxCU")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long maxCU;

        @com.aliyun.core.annotation.NameInMap("minCU")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long minCU;

        @com.aliyun.core.annotation.NameInMap("schedulerType")
        private String schedulerType;

        @com.aliyun.core.annotation.NameInMap("singleJobCULimit")
        private Long singleJobCULimit;

        private SubQuotaInfoListParameter(Builder builder) {
            this.elasticReservedCU = builder.elasticReservedCU;
            this.enablePriority = builder.enablePriority;
            this.forceReservedMin = builder.forceReservedMin;
            this.maxCU = builder.maxCU;
            this.minCU = builder.minCU;
            this.schedulerType = builder.schedulerType;
            this.singleJobCULimit = builder.singleJobCULimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubQuotaInfoListParameter create() {
            return builder().build();
        }

        /**
         * @return elasticReservedCU
         */
        public Long getElasticReservedCU() {
            return this.elasticReservedCU;
        }

        /**
         * @return enablePriority
         */
        public Boolean getEnablePriority() {
            return this.enablePriority;
        }

        /**
         * @return forceReservedMin
         */
        public Boolean getForceReservedMin() {
            return this.forceReservedMin;
        }

        /**
         * @return maxCU
         */
        public Long getMaxCU() {
            return this.maxCU;
        }

        /**
         * @return minCU
         */
        public Long getMinCU() {
            return this.minCU;
        }

        /**
         * @return schedulerType
         */
        public String getSchedulerType() {
            return this.schedulerType;
        }

        /**
         * @return singleJobCULimit
         */
        public Long getSingleJobCULimit() {
            return this.singleJobCULimit;
        }

        public static final class Builder {
            private Long elasticReservedCU; 
            private Boolean enablePriority; 
            private Boolean forceReservedMin; 
            private Long maxCU; 
            private Long minCU; 
            private String schedulerType; 
            private Long singleJobCULimit; 

            private Builder() {
            } 

            private Builder(SubQuotaInfoListParameter model) {
                this.elasticReservedCU = model.elasticReservedCU;
                this.enablePriority = model.enablePriority;
                this.forceReservedMin = model.forceReservedMin;
                this.maxCU = model.maxCU;
                this.minCU = model.minCU;
                this.schedulerType = model.schedulerType;
                this.singleJobCULimit = model.singleJobCULimit;
            } 

            /**
             * elasticReservedCU.
             */
            public Builder elasticReservedCU(Long elasticReservedCU) {
                this.elasticReservedCU = elasticReservedCU;
                return this;
            }

            /**
             * enablePriority.
             */
            public Builder enablePriority(Boolean enablePriority) {
                this.enablePriority = enablePriority;
                return this;
            }

            /**
             * forceReservedMin.
             */
            public Builder forceReservedMin(Boolean forceReservedMin) {
                this.forceReservedMin = forceReservedMin;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder maxCU(Long maxCU) {
                this.maxCU = maxCU;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder minCU(Long minCU) {
                this.minCU = minCU;
                return this;
            }

            /**
             * schedulerType.
             */
            public Builder schedulerType(String schedulerType) {
                this.schedulerType = schedulerType;
                return this;
            }

            /**
             * singleJobCULimit.
             */
            public Builder singleJobCULimit(Long singleJobCULimit) {
                this.singleJobCULimit = singleJobCULimit;
                return this;
            }

            public SubQuotaInfoListParameter build() {
                return new SubQuotaInfoListParameter(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaResponseBody</p>
     */
    public static class GetQuotaResponseBodySubQuotaInfoListSaleTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("resourceIds")
        private java.util.List<String> resourceIds;

        @com.aliyun.core.annotation.NameInMap("resourceType")
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

            private Builder() {
            } 

            private Builder(GetQuotaResponseBodySubQuotaInfoListSaleTag model) {
                this.resourceIds = model.resourceIds;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The identifier of an object in a MaxCompute quota. This identifier exists in the sales bill of Alibaba Cloud. You can use this identifier to associate the cost of a quota object with a tag.</p>
             */
            public Builder resourceIds(java.util.List<String> resourceIds) {
                this.resourceIds = resourceIds;
                return this;
            }

            /**
             * <p>The type of the object. Valid values: quota and project.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;quota&quot;</p>
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
    /**
     * 
     * {@link GetQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaResponseBody</p>
     */
    public static class GetQuotaResponseBodySubQuotaInfoListScheduleInfo extends TeaModel {
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

            private Builder() {
            } 

            private Builder(GetQuotaResponseBodySubQuotaInfoListScheduleInfo model) {
                this.currPlan = model.currPlan;
                this.currTime = model.currTime;
                this.nextPlan = model.nextPlan;
                this.nextTime = model.nextTime;
                this.oncePlan = model.oncePlan;
                this.onceTime = model.onceTime;
                this.operatorName = model.operatorName;
                this.timezone = model.timezone;
            } 

            /**
             * <p>The quota plan that takes effect based on the scheduling plan.</p>
             * 
             * <strong>example:</strong>
             * <p>planA</p>
             */
            public Builder currPlan(String currPlan) {
                this.currPlan = currPlan;
                return this;
            }

            /**
             * <p>The time when the current quota plan is scheduled.</p>
             * 
             * <strong>example:</strong>
             * <p>0800</p>
             */
            public Builder currTime(String currTime) {
                this.currTime = currTime;
                return this;
            }

            /**
             * <p>The next quota plan that will take effect based on the scheduling plan.</p>
             * 
             * <strong>example:</strong>
             * <p>planB</p>
             */
            public Builder nextPlan(String nextPlan) {
                this.nextPlan = nextPlan;
                return this;
            }

            /**
             * <p>The time when the next quota plan is scheduled.</p>
             * 
             * <strong>example:</strong>
             * <p>1700</p>
             */
            public Builder nextTime(String nextTime) {
                this.nextTime = nextTime;
                return this;
            }

            /**
             * <p>The quota plan that immediately takes effect. If the quota plan that immediately takes effect is different from the current quota plan, this parameter is not empty.</p>
             * 
             * <strong>example:</strong>
             * <p>planC</p>
             */
            public Builder oncePlan(String oncePlan) {
                this.oncePlan = oncePlan;
                return this;
            }

            /**
             * <p>The time when the quota plan immediately takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>1500</p>
             */
            public Builder onceTime(String onceTime) {
                this.onceTime = onceTime;
                return this;
            }

            /**
             * <p>The name of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>userA</p>
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * <p>The time zone of the project.</p>
             * 
             * <strong>example:</strong>
             * <p>UTC+8</p>
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
    /**
     * 
     * {@link GetQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaResponseBody</p>
     */
    public static class SubQuotaInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billingPolicy")
        private GetQuotaResponseBodySubQuotaInfoListBillingPolicy billingPolicy;

        @com.aliyun.core.annotation.NameInMap("cluster")
        private String cluster;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("creatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("parameter")
        private SubQuotaInfoListParameter parameter;

        @com.aliyun.core.annotation.NameInMap("parentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("saleTag")
        private GetQuotaResponseBodySubQuotaInfoListSaleTag saleTag;

        @com.aliyun.core.annotation.NameInMap("scheduleInfo")
        private GetQuotaResponseBodySubQuotaInfoListScheduleInfo scheduleInfo;

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
        public SubQuotaInfoListParameter getParameter() {
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
            private SubQuotaInfoListParameter parameter; 
            private String parentId; 
            private String regionId; 
            private GetQuotaResponseBodySubQuotaInfoListSaleTag saleTag; 
            private GetQuotaResponseBodySubQuotaInfoListScheduleInfo scheduleInfo; 
            private String status; 
            private String tag; 
            private String tenantId; 
            private String type; 
            private String version; 

            private Builder() {
            } 

            private Builder(SubQuotaInfoList model) {
                this.billingPolicy = model.billingPolicy;
                this.cluster = model.cluster;
                this.createTime = model.createTime;
                this.creatorId = model.creatorId;
                this.id = model.id;
                this.name = model.name;
                this.nickName = model.nickName;
                this.parameter = model.parameter;
                this.parentId = model.parentId;
                this.regionId = model.regionId;
                this.saleTag = model.saleTag;
                this.scheduleInfo = model.scheduleInfo;
                this.status = model.status;
                this.tag = model.tag;
                this.tenantId = model.tenantId;
                this.type = model.type;
                this.version = model.version;
            } 

            /**
             * <p>The information about the order.</p>
             */
            public Builder billingPolicy(GetQuotaResponseBodySubQuotaInfoListBillingPolicy billingPolicy) {
                this.billingPolicy = billingPolicy;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>AT-120N</p>
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * <p>The time when the resource was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-06T02:14:44Z</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to create the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>672863518</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The ID of the level-2 quota.</p>
             * 
             * <strong>example:</strong>
             * <p>1000048</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the level-2 quota.</p>
             * 
             * <strong>example:</strong>
             * <p>subquotaA</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The alias of the level-2 quota.</p>
             * 
             * <strong>example:</strong>
             * <p>subquotaA</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>The description of the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;minCU&quot;:10,	
             * &quot;adhocCU&quot;:0,
             * &quot;maxCU&quot;:10,
             * &quot;schedulerType&quot;:&quot;Fair&quot;,
             * }</p>
             */
            public Builder parameter(SubQuotaInfoListParameter parameter) {
                this.parameter = parameter;
                return this;
            }

            /**
             * <p>The ID of the parent resource.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The identifier of an object in a MaxCompute quota. This identifier is the same as the identifier in the sales bill of Alibaba Cloud. This parameter is used for tags.</p>
             */
            public Builder saleTag(GetQuotaResponseBodySubQuotaInfoListSaleTag saleTag) {
                this.saleTag = saleTag;
                return this;
            }

            /**
             * <p>The information about the scheduling plan.</p>
             */
            public Builder scheduleInfo(GetQuotaResponseBodySubQuotaInfoListScheduleInfo scheduleInfo) {
                this.scheduleInfo = scheduleInfo;
                return this;
            }

            /**
             * <p>The status of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag of the resource for the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>478403690625249</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The type of the resource system. This parameter corresponds to the resourceSystemType parameter of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>FUXI_ONLINE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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

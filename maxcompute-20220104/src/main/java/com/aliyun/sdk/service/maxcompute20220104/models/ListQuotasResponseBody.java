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
 * {@link ListQuotasResponseBody} extends {@link TeaModel}
 *
 * <p>ListQuotasResponseBody</p>
 */
public class ListQuotasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("marker")
    private String marker;

    @com.aliyun.core.annotation.NameInMap("maxItem")
    private Long maxItem;

    @com.aliyun.core.annotation.NameInMap("quotaInfoList")
    private java.util.List<QuotaInfoList> quotaInfoList;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListQuotasResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.data = builder.data;
        this.marker = builder.marker;
        this.maxItem = builder.maxItem;
        this.quotaInfoList = builder.quotaInfoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotasResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return maxItem
     */
    public Long getMaxItem() {
        return this.maxItem;
    }

    /**
     * @return quotaInfoList
     */
    public java.util.List<QuotaInfoList> getQuotaInfoList() {
        return this.quotaInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private Data data; 
        private String marker; 
        private Long maxItem; 
        private java.util.List<QuotaInfoList> quotaInfoList; 
        private String requestId; 

        /**
         * <p>A pagination token. Only continuous page turning is supported. If NextToken is not empty, the next page exists. The value of NextToken can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2w6Olxc+cMPjUtUMo/CvPe4IK7f7kIQFrIZjyc</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * <p>Indicates the marker after which the returned list begins.</p>
         * 
         * <strong>example:</strong>
         * <p>cHlvZHBzX3VkZl8xMDExNV8xNDU3NDI4NDkzKg==</p>
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxItem(Long maxItem) {
            this.maxItem = maxItem;
            return this;
        }

        /**
         * <p>The list of quotas.</p>
         */
        public Builder quotaInfoList(java.util.List<QuotaInfoList> quotaInfoList) {
            this.quotaInfoList = quotaInfoList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc12e6f16677875480593081d2956</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListQuotasResponseBody build() {
            return new ListQuotasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>Department</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>a12351qHDP6YEQMt</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasResponseBody</p>
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
     * {@link ListQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasResponseBody</p>
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
     * {@link ListQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasResponseBody</p>
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
     * {@link ListQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasResponseBody</p>
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
     * {@link ListQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasResponseBody</p>
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
     * {@link ListQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasResponseBody</p>
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
     * {@link ListQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasResponseBody</p>
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
             * <p>The information of the order.</p>
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
             * <p>The information of the scheduling plan.</p>
             */
            public Builder scheduleInfo(SubQuotaInfoListScheduleInfo scheduleInfo) {
                this.scheduleInfo = scheduleInfo;
                return this;
            }

            /**
             * <p>The status of the endpoint group.</p>
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
             * <p>280747109771520</p>
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
             * <p>The version of the algorithm image.</p>
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
    /**
     * 
     * {@link ListQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasResponseBody</p>
     */
    public static class DataQuotaInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("billingPolicy")
        private BillingPolicy billingPolicy;

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

        private DataQuotaInfoList(Builder builder) {
            this.tags = builder.tags;
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

        public static DataQuotaInfoList create() {
            return builder().build();
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
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
            private java.util.List<Tags> tags; 
            private BillingPolicy billingPolicy; 
            private String cluster; 
            private Long createTime; 
            private String creatorId; 
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
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The information of the order.</p>
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
            public Builder saleTag(SaleTag saleTag) {
                this.saleTag = saleTag;
                return this;
            }

            /**
             * <p>The information of the scheduling plan.</p>
             */
            public Builder scheduleInfo(ScheduleInfo scheduleInfo) {
                this.scheduleInfo = scheduleInfo;
                return this;
            }

            /**
             * <p>The status of the endpoint group.</p>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The information of the level-2 quota.</p>
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
             * <p>280747109771520</p>
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

            public DataQuotaInfoList build() {
                return new DataQuotaInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("marker")
        private String marker;

        @com.aliyun.core.annotation.NameInMap("maxItem")
        private Long maxItem;

        @com.aliyun.core.annotation.NameInMap("quotaInfoList")
        private java.util.List<DataQuotaInfoList> quotaInfoList;

        private Data(Builder builder) {
            this.nextToken = builder.nextToken;
            this.marker = builder.marker;
            this.maxItem = builder.maxItem;
            this.quotaInfoList = builder.quotaInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return marker
         */
        public String getMarker() {
            return this.marker;
        }

        /**
         * @return maxItem
         */
        public Long getMaxItem() {
            return this.maxItem;
        }

        /**
         * @return quotaInfoList
         */
        public java.util.List<DataQuotaInfoList> getQuotaInfoList() {
            return this.quotaInfoList;
        }

        public static final class Builder {
            private String nextToken; 
            private String marker; 
            private Long maxItem; 
            private java.util.List<DataQuotaInfoList> quotaInfoList; 

            /**
             * <p>A pagination token. Only continuous page turning is supported. If NextToken is not empty, the next page exists. The value of NextToken can be used in the next request to retrieve a new page of results.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;abcde&quot;</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>Indicates the marker after which the returned list begins.</p>
             * 
             * <strong>example:</strong>
             * <p>cHlvZHBzX3VkZl8xMDExNV8xNDU3NDI4NDkzKg==</p>
             */
            public Builder marker(String marker) {
                this.marker = marker;
                return this;
            }

            /**
             * <p>The maximum number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxItem(Long maxItem) {
                this.maxItem = maxItem;
                return this;
            }

            /**
             * <p>The list of quotas.</p>
             */
            public Builder quotaInfoList(java.util.List<DataQuotaInfoList> quotaInfoList) {
                this.quotaInfoList = quotaInfoList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasResponseBody</p>
     */
    public static class QuotaInfoListTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private QuotaInfoListTags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaInfoListTags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>Department</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public QuotaInfoListTags build() {
                return new QuotaInfoListTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasResponseBody</p>
     */
    public static class QuotaInfoListBillingPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billingMethod")
        private String billingMethod;

        @com.aliyun.core.annotation.NameInMap("odpsSpecCode")
        private String odpsSpecCode;

        @com.aliyun.core.annotation.NameInMap("orderId")
        private String orderId;

        private QuotaInfoListBillingPolicy(Builder builder) {
            this.billingMethod = builder.billingMethod;
            this.odpsSpecCode = builder.odpsSpecCode;
            this.orderId = builder.orderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaInfoListBillingPolicy create() {
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

            public QuotaInfoListBillingPolicy build() {
                return new QuotaInfoListBillingPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasResponseBody</p>
     */
    public static class QuotaInfoListSaleTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("resourceIds")
        private java.util.List<String> resourceIds;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        private QuotaInfoListSaleTag(Builder builder) {
            this.resourceIds = builder.resourceIds;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaInfoListSaleTag create() {
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
             * <p>&quot;project&quot;</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public QuotaInfoListSaleTag build() {
                return new QuotaInfoListSaleTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasResponseBody</p>
     */
    public static class QuotaInfoListScheduleInfo extends TeaModel {
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

        private QuotaInfoListScheduleInfo(Builder builder) {
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

        public static QuotaInfoListScheduleInfo create() {
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

            public QuotaInfoListScheduleInfo build() {
                return new QuotaInfoListScheduleInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasResponseBody</p>
     */
    public static class QuotaInfoListSubQuotaInfoListBillingPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billingMethod")
        private String billingMethod;

        @com.aliyun.core.annotation.NameInMap("odpsSpecCode")
        private String odpsSpecCode;

        @com.aliyun.core.annotation.NameInMap("orderId")
        private String orderId;

        private QuotaInfoListSubQuotaInfoListBillingPolicy(Builder builder) {
            this.billingMethod = builder.billingMethod;
            this.odpsSpecCode = builder.odpsSpecCode;
            this.orderId = builder.orderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaInfoListSubQuotaInfoListBillingPolicy create() {
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

            public QuotaInfoListSubQuotaInfoListBillingPolicy build() {
                return new QuotaInfoListSubQuotaInfoListBillingPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasResponseBody</p>
     */
    public static class QuotaInfoListSubQuotaInfoListSaleTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("resourceIds")
        private java.util.List<String> resourceIds;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        private QuotaInfoListSubQuotaInfoListSaleTag(Builder builder) {
            this.resourceIds = builder.resourceIds;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaInfoListSubQuotaInfoListSaleTag create() {
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

            public QuotaInfoListSubQuotaInfoListSaleTag build() {
                return new QuotaInfoListSubQuotaInfoListSaleTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasResponseBody</p>
     */
    public static class QuotaInfoListSubQuotaInfoListScheduleInfo extends TeaModel {
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

        private QuotaInfoListSubQuotaInfoListScheduleInfo(Builder builder) {
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

        public static QuotaInfoListSubQuotaInfoListScheduleInfo create() {
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

            public QuotaInfoListSubQuotaInfoListScheduleInfo build() {
                return new QuotaInfoListSubQuotaInfoListScheduleInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasResponseBody</p>
     */
    public static class QuotaInfoListSubQuotaInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billingPolicy")
        private QuotaInfoListSubQuotaInfoListBillingPolicy billingPolicy;

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
        private QuotaInfoListSubQuotaInfoListSaleTag saleTag;

        @com.aliyun.core.annotation.NameInMap("scheduleInfo")
        private QuotaInfoListSubQuotaInfoListScheduleInfo scheduleInfo;

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

        private QuotaInfoListSubQuotaInfoList(Builder builder) {
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

        public static QuotaInfoListSubQuotaInfoList create() {
            return builder().build();
        }

        /**
         * @return billingPolicy
         */
        public QuotaInfoListSubQuotaInfoListBillingPolicy getBillingPolicy() {
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
        public QuotaInfoListSubQuotaInfoListSaleTag getSaleTag() {
            return this.saleTag;
        }

        /**
         * @return scheduleInfo
         */
        public QuotaInfoListSubQuotaInfoListScheduleInfo getScheduleInfo() {
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
            private QuotaInfoListSubQuotaInfoListBillingPolicy billingPolicy; 
            private String cluster; 
            private Long createTime; 
            private String creatorId; 
            private String id; 
            private String name; 
            private String nickName; 
            private java.util.Map<String, ?> parameter; 
            private String parentId; 
            private String regionId; 
            private QuotaInfoListSubQuotaInfoListSaleTag saleTag; 
            private QuotaInfoListSubQuotaInfoListScheduleInfo scheduleInfo; 
            private String status; 
            private String tag; 
            private String tenantId; 
            private String type; 
            private String version; 

            /**
             * <p>The information of the order.</p>
             */
            public Builder billingPolicy(QuotaInfoListSubQuotaInfoListBillingPolicy billingPolicy) {
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
            public Builder parameter(java.util.Map<String, ?> parameter) {
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
            public Builder saleTag(QuotaInfoListSubQuotaInfoListSaleTag saleTag) {
                this.saleTag = saleTag;
                return this;
            }

            /**
             * <p>The information of the scheduling plan.</p>
             */
            public Builder scheduleInfo(QuotaInfoListSubQuotaInfoListScheduleInfo scheduleInfo) {
                this.scheduleInfo = scheduleInfo;
                return this;
            }

            /**
             * <p>The status of the endpoint group.</p>
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
             * <p>280747109771520</p>
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

            public QuotaInfoListSubQuotaInfoList build() {
                return new QuotaInfoListSubQuotaInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasResponseBody</p>
     */
    public static class QuotaInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<QuotaInfoListTags> tags;

        @com.aliyun.core.annotation.NameInMap("billingPolicy")
        private QuotaInfoListBillingPolicy billingPolicy;

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
        private QuotaInfoListSaleTag saleTag;

        @com.aliyun.core.annotation.NameInMap("scheduleInfo")
        private QuotaInfoListScheduleInfo scheduleInfo;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("subQuotaInfoList")
        private java.util.List<QuotaInfoListSubQuotaInfoList> subQuotaInfoList;

        @com.aliyun.core.annotation.NameInMap("tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private QuotaInfoList(Builder builder) {
            this.tags = builder.tags;
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

        public static QuotaInfoList create() {
            return builder().build();
        }

        /**
         * @return tags
         */
        public java.util.List<QuotaInfoListTags> getTags() {
            return this.tags;
        }

        /**
         * @return billingPolicy
         */
        public QuotaInfoListBillingPolicy getBillingPolicy() {
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
        public QuotaInfoListSaleTag getSaleTag() {
            return this.saleTag;
        }

        /**
         * @return scheduleInfo
         */
        public QuotaInfoListScheduleInfo getScheduleInfo() {
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
        public java.util.List<QuotaInfoListSubQuotaInfoList> getSubQuotaInfoList() {
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
            private java.util.List<QuotaInfoListTags> tags; 
            private QuotaInfoListBillingPolicy billingPolicy; 
            private String cluster; 
            private Long createTime; 
            private String creatorId; 
            private String id; 
            private String name; 
            private String nickName; 
            private java.util.Map<String, ?> parameter; 
            private String parentId; 
            private String regionId; 
            private QuotaInfoListSaleTag saleTag; 
            private QuotaInfoListScheduleInfo scheduleInfo; 
            private String status; 
            private java.util.List<QuotaInfoListSubQuotaInfoList> subQuotaInfoList; 
            private String tag; 
            private String tenantId; 
            private String type; 
            private String version; 

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List<QuotaInfoListTags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The information of the order.</p>
             */
            public Builder billingPolicy(QuotaInfoListBillingPolicy billingPolicy) {
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
            public Builder saleTag(QuotaInfoListSaleTag saleTag) {
                this.saleTag = saleTag;
                return this;
            }

            /**
             * <p>The information of the scheduling plan.</p>
             */
            public Builder scheduleInfo(QuotaInfoListScheduleInfo scheduleInfo) {
                this.scheduleInfo = scheduleInfo;
                return this;
            }

            /**
             * <p>The status of the endpoint group.</p>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The information of the level-2 quota.</p>
             */
            public Builder subQuotaInfoList(java.util.List<QuotaInfoListSubQuotaInfoList> subQuotaInfoList) {
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
             * <p>280747109771520</p>
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
             * <p>The version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public QuotaInfoList build() {
                return new QuotaInfoList(this);
            } 

        } 

    }
}

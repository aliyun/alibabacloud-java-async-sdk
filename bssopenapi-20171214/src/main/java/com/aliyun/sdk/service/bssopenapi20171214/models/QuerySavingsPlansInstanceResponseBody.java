// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySavingsPlansInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySavingsPlansInstanceResponseBody</p>
 */
public class QuerySavingsPlansInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QuerySavingsPlansInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySavingsPlansInstanceResponseBody create() {
        return builder().build();
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The return data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the operation was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QuerySavingsPlansInstanceResponseBody build() {
            return new QuerySavingsPlansInstanceResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationStatus")
        private String allocationStatus;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("CurrentPoolValue")
        private String currentPoolValue;

        @com.aliyun.core.annotation.NameInMap("Cycle")
        private String cycle;

        @com.aliyun.core.annotation.NameInMap("DeductCycleType")
        private String deductCycleType;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EndTimestamp")
        private Long endTimestamp;

        @com.aliyun.core.annotation.NameInMap("InstanceFamily")
        private String instanceFamily;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LastBillTotalUsage")
        private String lastBillTotalUsage;

        @com.aliyun.core.annotation.NameInMap("LastBillUtilization")
        private String lastBillUtilization;

        @com.aliyun.core.annotation.NameInMap("PayMode")
        private String payMode;

        @com.aliyun.core.annotation.NameInMap("PoolValue")
        private String poolValue;

        @com.aliyun.core.annotation.NameInMap("PrepayFee")
        private String prepayFee;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RestPoolValue")
        private String restPoolValue;

        @com.aliyun.core.annotation.NameInMap("SavingsType")
        private String savingsType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StartTimestamp")
        private Long startTimestamp;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TotalSave")
        private String totalSave;

        @com.aliyun.core.annotation.NameInMap("Utilization")
        private String utilization;

        private Items(Builder builder) {
            this.allocationStatus = builder.allocationStatus;
            this.commodityCode = builder.commodityCode;
            this.currency = builder.currency;
            this.currentPoolValue = builder.currentPoolValue;
            this.cycle = builder.cycle;
            this.deductCycleType = builder.deductCycleType;
            this.endTime = builder.endTime;
            this.endTimestamp = builder.endTimestamp;
            this.instanceFamily = builder.instanceFamily;
            this.instanceId = builder.instanceId;
            this.lastBillTotalUsage = builder.lastBillTotalUsage;
            this.lastBillUtilization = builder.lastBillUtilization;
            this.payMode = builder.payMode;
            this.poolValue = builder.poolValue;
            this.prepayFee = builder.prepayFee;
            this.region = builder.region;
            this.restPoolValue = builder.restPoolValue;
            this.savingsType = builder.savingsType;
            this.startTime = builder.startTime;
            this.startTimestamp = builder.startTimestamp;
            this.status = builder.status;
            this.tags = builder.tags;
            this.totalSave = builder.totalSave;
            this.utilization = builder.utilization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return allocationStatus
         */
        public String getAllocationStatus() {
            return this.allocationStatus;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return currentPoolValue
         */
        public String getCurrentPoolValue() {
            return this.currentPoolValue;
        }

        /**
         * @return cycle
         */
        public String getCycle() {
            return this.cycle;
        }

        /**
         * @return deductCycleType
         */
        public String getDeductCycleType() {
            return this.deductCycleType;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return endTimestamp
         */
        public Long getEndTimestamp() {
            return this.endTimestamp;
        }

        /**
         * @return instanceFamily
         */
        public String getInstanceFamily() {
            return this.instanceFamily;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return lastBillTotalUsage
         */
        public String getLastBillTotalUsage() {
            return this.lastBillTotalUsage;
        }

        /**
         * @return lastBillUtilization
         */
        public String getLastBillUtilization() {
            return this.lastBillUtilization;
        }

        /**
         * @return payMode
         */
        public String getPayMode() {
            return this.payMode;
        }

        /**
         * @return poolValue
         */
        public String getPoolValue() {
            return this.poolValue;
        }

        /**
         * @return prepayFee
         */
        public String getPrepayFee() {
            return this.prepayFee;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return restPoolValue
         */
        public String getRestPoolValue() {
            return this.restPoolValue;
        }

        /**
         * @return savingsType
         */
        public String getSavingsType() {
            return this.savingsType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return startTimestamp
         */
        public Long getStartTimestamp() {
            return this.startTimestamp;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return totalSave
         */
        public String getTotalSave() {
            return this.totalSave;
        }

        /**
         * @return utilization
         */
        public String getUtilization() {
            return this.utilization;
        }

        public static final class Builder {
            private String allocationStatus; 
            private String commodityCode; 
            private String currency; 
            private String currentPoolValue; 
            private String cycle; 
            private String deductCycleType; 
            private String endTime; 
            private Long endTimestamp; 
            private String instanceFamily; 
            private String instanceId; 
            private String lastBillTotalUsage; 
            private String lastBillUtilization; 
            private String payMode; 
            private String poolValue; 
            private String prepayFee; 
            private String region; 
            private String restPoolValue; 
            private String savingsType; 
            private String startTime; 
            private Long startTimestamp; 
            private String status; 
            private java.util.List < Tags> tags; 
            private String totalSave; 
            private String utilization; 

            /**
             * The allocation status. Valid values:
             * <p>
             * 
             * *   unallocated
             * *   allocated
             * *   beAllocated
             */
            public Builder allocationStatus(String allocationStatus) {
                this.allocationStatus = allocationStatus;
                return this;
            }

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * The currency. Valid values: CNY and USD.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * CurrentPoolValue.
             */
            public Builder currentPoolValue(String currentPoolValue) {
                this.currentPoolValue = currentPoolValue;
                return this;
            }

            /**
             * Cycle.
             */
            public Builder cycle(String cycle) {
                this.cycle = cycle;
                return this;
            }

            /**
             * DeductCycleType.
             */
            public Builder deductCycleType(String deductCycleType) {
                this.deductCycleType = deductCycleType;
                return this;
            }

            /**
             * The time when the instance expires. The time is in the format of yyyy-MM-dd HH:mm:ss.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EndTimestamp.
             */
            public Builder endTimestamp(Long endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * The instance family information. For an instance of the Elastic Compute Service (ECS) compute type, the value indicates the ECS instance family or the ECS instance family package.
             */
            public Builder instanceFamily(String instanceFamily) {
                this.instanceFamily = instanceFamily;
                return this;
            }

            /**
             * The ID of the savings plan instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * LastBillTotalUsage.
             */
            public Builder lastBillTotalUsage(String lastBillTotalUsage) {
                this.lastBillTotalUsage = lastBillTotalUsage;
                return this;
            }

            /**
             * LastBillUtilization.
             */
            public Builder lastBillUtilization(String lastBillUtilization) {
                this.lastBillUtilization = lastBillUtilization;
                return this;
            }

            /**
             * The payment type. Valid values:
             * <p>
             * 
             * *   total: All Upfront
             * *   half: Partial Upfront
             * *   zero: No Upfront
             */
            public Builder payMode(String payMode) {
                this.payMode = payMode;
                return this;
            }

            /**
             * The commitment.
             */
            public Builder poolValue(String poolValue) {
                this.poolValue = poolValue;
                return this;
            }

            /**
             * The prepaid amount.
             */
            public Builder prepayFee(String prepayFee) {
                this.prepayFee = prepayFee;
                return this;
            }

            /**
             * The region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * RestPoolValue.
             */
            public Builder restPoolValue(String restPoolValue) {
                this.restPoolValue = restPoolValue;
                return this;
            }

            /**
             * The type of the savings plan. Valid values:
             * <p>
             * 
             * *   universal: general-purpose
             * *   ecs: ECS compute
             */
            public Builder savingsType(String savingsType) {
                this.savingsType = savingsType;
                return this;
            }

            /**
             * The time when the instance takes effect. The time is in the format of yyyy-MM-dd HH:mm:ss.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StartTimestamp.
             */
            public Builder startTimestamp(Long startTimestamp) {
                this.startTimestamp = startTimestamp;
                return this;
            }

            /**
             * The status of the instance. Valid values:
             * <p>
             * 
             * *   NORMAL: normal
             * *   LIMIT: stopped due to overdue payment
             * *   RELEASE: released
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The details about the tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The total amount that is saved.
             */
            public Builder totalSave(String totalSave) {
                this.totalSave = totalSave;
                return this;
            }

            /**
             * The total usage.
             */
            public Builder utilization(String utilization) {
                this.utilization = utilization;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List < Items> items;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.items = builder.items;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Items> items; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The details about the instances.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

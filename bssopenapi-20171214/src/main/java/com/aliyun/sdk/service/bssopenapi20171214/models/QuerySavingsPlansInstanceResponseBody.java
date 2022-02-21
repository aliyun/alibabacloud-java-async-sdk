// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySavingsPlansInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySavingsPlansInstanceResponseBody</p>
 */
public class QuerySavingsPlansInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
        @NameInMap("AllocationStatus")
        private String allocationStatus;

        @NameInMap("Currency")
        private String currency;

        @NameInMap("Cycle")
        private String cycle;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("EndTimestamp")
        private Long endTimestamp;

        @NameInMap("InstanceFamily")
        private String instanceFamily;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LastBillTotalUsage")
        private String lastBillTotalUsage;

        @NameInMap("LastBillUtilization")
        private String lastBillUtilization;

        @NameInMap("PayMode")
        private String payMode;

        @NameInMap("PoolValue")
        private String poolValue;

        @NameInMap("PrepayFee")
        private String prepayFee;

        @NameInMap("Region")
        private String region;

        @NameInMap("SavingsType")
        private String savingsType;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("StartTimestamp")
        private Long startTimestamp;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("TotalSave")
        private String totalSave;

        @NameInMap("Utilization")
        private String utilization;

        private Items(Builder builder) {
            this.allocationStatus = builder.allocationStatus;
            this.currency = builder.currency;
            this.cycle = builder.cycle;
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
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return cycle
         */
        public String getCycle() {
            return this.cycle;
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
            private String currency; 
            private String cycle; 
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
            private String savingsType; 
            private String startTime; 
            private Long startTimestamp; 
            private String status; 
            private java.util.List < Tags> tags; 
            private String totalSave; 
            private String utilization; 

            /**
             * AllocationStatus.
             */
            public Builder allocationStatus(String allocationStatus) {
                this.allocationStatus = allocationStatus;
                return this;
            }

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
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
             * EndTime.
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
             * InstanceFamily.
             */
            public Builder instanceFamily(String instanceFamily) {
                this.instanceFamily = instanceFamily;
                return this;
            }

            /**
             * InstanceId.
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
             * PayMode.
             */
            public Builder payMode(String payMode) {
                this.payMode = payMode;
                return this;
            }

            /**
             * PoolValue.
             */
            public Builder poolValue(String poolValue) {
                this.poolValue = poolValue;
                return this;
            }

            /**
             * PrepayFee.
             */
            public Builder prepayFee(String prepayFee) {
                this.prepayFee = prepayFee;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * SavingsType.
             */
            public Builder savingsType(String savingsType) {
                this.savingsType = savingsType;
                return this;
            }

            /**
             * StartTime.
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TotalSave.
             */
            public Builder totalSave(String totalSave) {
                this.totalSave = totalSave;
                return this;
            }

            /**
             * Utilization.
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
        @NameInMap("Items")
        private java.util.List < Items> items;

        @NameInMap("PageNum")
        private Integer pageNum;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
             * Items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
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

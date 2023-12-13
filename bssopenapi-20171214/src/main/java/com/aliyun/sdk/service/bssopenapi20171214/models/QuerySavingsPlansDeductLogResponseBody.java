// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySavingsPlansDeductLogResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySavingsPlansDeductLogResponseBody</p>
 */
public class QuerySavingsPlansDeductLogResponseBody extends TeaModel {
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

    private QuerySavingsPlansDeductLogResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySavingsPlansDeductLogResponseBody create() {
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

        public QuerySavingsPlansDeductLogResponseBody build() {
            return new QuerySavingsPlansDeductLogResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("BillModule")
        private String billModule;

        @NameInMap("BillingCycle")
        private String billingCycle;

        @NameInMap("BillingOfficialPrice")
        private String billingOfficialPrice;

        @NameInMap("DeductCommodity")
        private String deductCommodity;

        @NameInMap("DeductFee")
        private String deductFee;

        @NameInMap("DeductInstanceId")
        private String deductInstanceId;

        @NameInMap("DeductRate")
        private String deductRate;

        @NameInMap("DeductedOfficialPrice")
        private String deductedOfficialPrice;

        @NameInMap("DiscountRate")
        private String discountRate;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceSpec")
        private String instanceSpec;

        @NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @NameInMap("OwnerId")
        private Long ownerId;

        @NameInMap("Region")
        private String region;

        @NameInMap("SavingsType")
        private String savingsType;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("UserId")
        private Long userId;

        private Items(Builder builder) {
            this.billModule = builder.billModule;
            this.billingCycle = builder.billingCycle;
            this.billingOfficialPrice = builder.billingOfficialPrice;
            this.deductCommodity = builder.deductCommodity;
            this.deductFee = builder.deductFee;
            this.deductInstanceId = builder.deductInstanceId;
            this.deductRate = builder.deductRate;
            this.deductedOfficialPrice = builder.deductedOfficialPrice;
            this.discountRate = builder.discountRate;
            this.endTime = builder.endTime;
            this.instanceId = builder.instanceId;
            this.instanceSpec = builder.instanceSpec;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.ownerId = builder.ownerId;
            this.region = builder.region;
            this.savingsType = builder.savingsType;
            this.startTime = builder.startTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return billModule
         */
        public String getBillModule() {
            return this.billModule;
        }

        /**
         * @return billingCycle
         */
        public String getBillingCycle() {
            return this.billingCycle;
        }

        /**
         * @return billingOfficialPrice
         */
        public String getBillingOfficialPrice() {
            return this.billingOfficialPrice;
        }

        /**
         * @return deductCommodity
         */
        public String getDeductCommodity() {
            return this.deductCommodity;
        }

        /**
         * @return deductFee
         */
        public String getDeductFee() {
            return this.deductFee;
        }

        /**
         * @return deductInstanceId
         */
        public String getDeductInstanceId() {
            return this.deductInstanceId;
        }

        /**
         * @return deductRate
         */
        public String getDeductRate() {
            return this.deductRate;
        }

        /**
         * @return deductedOfficialPrice
         */
        public String getDeductedOfficialPrice() {
            return this.deductedOfficialPrice;
        }

        /**
         * @return discountRate
         */
        public String getDiscountRate() {
            return this.discountRate;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceSpec
         */
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        /**
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        /**
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
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
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String billModule; 
            private String billingCycle; 
            private String billingOfficialPrice; 
            private String deductCommodity; 
            private String deductFee; 
            private String deductInstanceId; 
            private String deductRate; 
            private String deductedOfficialPrice; 
            private String discountRate; 
            private String endTime; 
            private String instanceId; 
            private String instanceSpec; 
            private String instanceTypeFamily; 
            private Long ownerId; 
            private String region; 
            private String savingsType; 
            private String startTime; 
            private Long userId; 

            /**
             * The billable item for which the fee is deducted.
             */
            public Builder billModule(String billModule) {
                this.billModule = billModule;
                return this;
            }

            /**
             * BillingCycle.
             */
            public Builder billingCycle(String billingCycle) {
                this.billingCycle = billingCycle;
                return this;
            }

            /**
             * BillingOfficialPrice.
             */
            public Builder billingOfficialPrice(String billingOfficialPrice) {
                this.billingOfficialPrice = billingOfficialPrice;
                return this;
            }

            /**
             * The service for which the fee is deducted.
             */
            public Builder deductCommodity(String deductCommodity) {
                this.deductCommodity = deductCommodity;
                return this;
            }

            /**
             * The deducted amount.
             */
            public Builder deductFee(String deductFee) {
                this.deductFee = deductFee;
                return this;
            }

            /**
             * The ID of the instance for which the fee is deducted.
             */
            public Builder deductInstanceId(String deductInstanceId) {
                this.deductInstanceId = deductInstanceId;
                return this;
            }

            /**
             * The deduction rate.
             */
            public Builder deductRate(String deductRate) {
                this.deductRate = deductRate;
                return this;
            }

            /**
             * DeductedOfficialPrice.
             */
            public Builder deductedOfficialPrice(String deductedOfficialPrice) {
                this.deductedOfficialPrice = deductedOfficialPrice;
                return this;
            }

            /**
             * The discount used for the current deduction.
             */
            public Builder discountRate(String discountRate) {
                this.discountRate = discountRate;
                return this;
            }

            /**
             * The end of the billing cycle for which the fee is deducted.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
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
             * InstanceSpec.
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * InstanceTypeFamily.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
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
             * The beginning of the billing cycle for which the fee is deducted. The time is in the format of yyyy-MM-dd HH:mm:ss.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
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
             * The deduction details.
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

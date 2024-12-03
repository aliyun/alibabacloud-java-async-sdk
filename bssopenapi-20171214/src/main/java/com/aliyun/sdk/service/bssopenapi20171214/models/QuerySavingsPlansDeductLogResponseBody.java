// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QuerySavingsPlansDeductLogResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySavingsPlansDeductLogResponseBody</p>
 */
public class QuerySavingsPlansDeductLogResponseBody extends TeaModel {
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>PARAM_ERROR</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The return data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>61293E7A-3406-4447-8620-EC88B0AA66AD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QuerySavingsPlansDeductLogResponseBody build() {
            return new QuerySavingsPlansDeductLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySavingsPlansDeductLogResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySavingsPlansDeductLogResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BillModule")
        private String billModule;

        @com.aliyun.core.annotation.NameInMap("BillingCycle")
        private String billingCycle;

        @com.aliyun.core.annotation.NameInMap("BillingOfficialPrice")
        private String billingOfficialPrice;

        @com.aliyun.core.annotation.NameInMap("DeductCommodity")
        private String deductCommodity;

        @com.aliyun.core.annotation.NameInMap("DeductFee")
        private String deductFee;

        @com.aliyun.core.annotation.NameInMap("DeductInstanceId")
        private String deductInstanceId;

        @com.aliyun.core.annotation.NameInMap("DeductRate")
        private String deductRate;

        @com.aliyun.core.annotation.NameInMap("DeductedOfficialPrice")
        private String deductedOfficialPrice;

        @com.aliyun.core.annotation.NameInMap("DiscountRate")
        private String discountRate;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceSpec")
        private String instanceSpec;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SavingsType")
        private String savingsType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
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
             * <p>The billable item for which the fee is deducted.</p>
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
             * <p>The service for which the fee is deducted.</p>
             */
            public Builder deductCommodity(String deductCommodity) {
                this.deductCommodity = deductCommodity;
                return this;
            }

            /**
             * <p>The deducted amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0.52</p>
             */
            public Builder deductFee(String deductFee) {
                this.deductFee = deductFee;
                return this;
            }

            /**
             * <p>The ID of the instance for which the fee is deducted.</p>
             * 
             * <strong>example:</strong>
             * <p>i-XXXXXXXXX</p>
             */
            public Builder deductInstanceId(String deductInstanceId) {
                this.deductInstanceId = deductInstanceId;
                return this;
            }

            /**
             * <p>The deduction rate.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
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
             * <p>The discount used for the current deduction.</p>
             * 
             * <strong>example:</strong>
             * <p>0.069</p>
             */
            public Builder discountRate(String discountRate) {
                this.discountRate = discountRate;
                return this;
            }

            /**
             * <p>The end of the billing cycle for which the fee is deducted.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-01 01:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the savings plan instance.</p>
             * 
             * <strong>example:</strong>
             * <p>spn-xxxxxxx</p>
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
             * <p>The type of the savings plan. Valid values:</p>
             * <ul>
             * <li>universal: general-purpose</li>
             * <li>ecs: ECS compute</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder savingsType(String savingsType) {
                this.savingsType = savingsType;
                return this;
            }

            /**
             * <p>The beginning of the billing cycle for which the fee is deducted. The time is in the format of yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-01 00:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>1906589291020438</p>
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
    /**
     * 
     * {@link QuerySavingsPlansDeductLogResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySavingsPlansDeductLogResponseBody</p>
     */
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
             * <p>The deduction details.</p>
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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

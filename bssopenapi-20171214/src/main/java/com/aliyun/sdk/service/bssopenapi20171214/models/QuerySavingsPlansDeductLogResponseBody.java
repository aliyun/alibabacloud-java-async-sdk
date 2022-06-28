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

        public QuerySavingsPlansDeductLogResponseBody build() {
            return new QuerySavingsPlansDeductLogResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("BillModule")
        private String billModule;

        @NameInMap("DeductCommodity")
        private String deductCommodity;

        @NameInMap("DeductFee")
        private String deductFee;

        @NameInMap("DeductInstanceId")
        private String deductInstanceId;

        @NameInMap("DeductRate")
        private String deductRate;

        @NameInMap("DiscountRate")
        private String discountRate;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("OwnerId")
        private Long ownerId;

        @NameInMap("SavingsType")
        private String savingsType;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("UserId")
        private Long userId;

        private Items(Builder builder) {
            this.billModule = builder.billModule;
            this.deductCommodity = builder.deductCommodity;
            this.deductFee = builder.deductFee;
            this.deductInstanceId = builder.deductInstanceId;
            this.deductRate = builder.deductRate;
            this.discountRate = builder.discountRate;
            this.endTime = builder.endTime;
            this.instanceId = builder.instanceId;
            this.ownerId = builder.ownerId;
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
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
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
            private String deductCommodity; 
            private String deductFee; 
            private String deductInstanceId; 
            private String deductRate; 
            private String discountRate; 
            private String endTime; 
            private String instanceId; 
            private Long ownerId; 
            private String savingsType; 
            private String startTime; 
            private Long userId; 

            /**
             * BillModule.
             */
            public Builder billModule(String billModule) {
                this.billModule = billModule;
                return this;
            }

            /**
             * DeductCommodity.
             */
            public Builder deductCommodity(String deductCommodity) {
                this.deductCommodity = deductCommodity;
                return this;
            }

            /**
             * DeductFee.
             */
            public Builder deductFee(String deductFee) {
                this.deductFee = deductFee;
                return this;
            }

            /**
             * DeductInstanceId.
             */
            public Builder deductInstanceId(String deductInstanceId) {
                this.deductInstanceId = deductInstanceId;
                return this;
            }

            /**
             * DeductRate.
             */
            public Builder deductRate(String deductRate) {
                this.deductRate = deductRate;
                return this;
            }

            /**
             * DiscountRate.
             */
            public Builder discountRate(String discountRate) {
                this.discountRate = discountRate;
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * UserId.
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

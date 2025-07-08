// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QueryMonthlyBillRentalResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMonthlyBillRentalResponseBody</p>
 */
public class QueryMonthlyBillRentalResponseBody extends TeaModel {
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

    private QueryMonthlyBillRentalResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMonthlyBillRentalResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryMonthlyBillRentalResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

        public QueryMonthlyBillRentalResponseBody build() {
            return new QueryMonthlyBillRentalResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMonthlyBillRentalResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMonthlyBillRentalResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billTime")
        private Long billTime;

        @com.aliyun.core.annotation.NameInMap("itemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("itemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("offerTime")
        private Long offerTime;

        @com.aliyun.core.annotation.NameInMap("rental")
        private String rental;

        @com.aliyun.core.annotation.NameInMap("subItemId")
        private String subItemId;

        @com.aliyun.core.annotation.NameInMap("subItemName")
        private String subItemName;

        private Records(Builder builder) {
            this.billTime = builder.billTime;
            this.itemId = builder.itemId;
            this.itemName = builder.itemName;
            this.offerTime = builder.offerTime;
            this.rental = builder.rental;
            this.subItemId = builder.subItemId;
            this.subItemName = builder.subItemName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return billTime
         */
        public Long getBillTime() {
            return this.billTime;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return offerTime
         */
        public Long getOfferTime() {
            return this.offerTime;
        }

        /**
         * @return rental
         */
        public String getRental() {
            return this.rental;
        }

        /**
         * @return subItemId
         */
        public String getSubItemId() {
            return this.subItemId;
        }

        /**
         * @return subItemName
         */
        public String getSubItemName() {
            return this.subItemName;
        }

        public static final class Builder {
            private Long billTime; 
            private String itemId; 
            private String itemName; 
            private Long offerTime; 
            private String rental; 
            private String subItemId; 
            private String subItemName; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.billTime = model.billTime;
                this.itemId = model.itemId;
                this.itemName = model.itemName;
                this.offerTime = model.offerTime;
                this.rental = model.rental;
                this.subItemId = model.subItemId;
                this.subItemName = model.subItemName;
            } 

            /**
             * billTime.
             */
            public Builder billTime(Long billTime) {
                this.billTime = billTime;
                return this;
            }

            /**
             * itemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * itemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * offerTime.
             */
            public Builder offerTime(Long offerTime) {
                this.offerTime = offerTime;
                return this;
            }

            /**
             * rental.
             */
            public Builder rental(String rental) {
                this.rental = rental;
                return this;
            }

            /**
             * subItemId.
             */
            public Builder subItemId(String subItemId) {
                this.subItemId = subItemId;
                return this;
            }

            /**
             * subItemName.
             */
            public Builder subItemName(String subItemName) {
                this.subItemName = subItemName;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMonthlyBillRentalResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMonthlyBillRentalResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("pageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("records")
        private java.util.List<Records> records;

        @com.aliyun.core.annotation.NameInMap("rentalSum")
        private String rentalSum;

        @com.aliyun.core.annotation.NameInMap("total")
        private Long total;

        private Data(Builder builder) {
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.rentalSum = builder.rentalSum;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        /**
         * @return rentalSum
         */
        public String getRentalSum() {
            return this.rentalSum;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer pageNo; 
            private Integer pageSize; 
            private java.util.List<Records> records; 
            private String rentalSum; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.records = model.records;
                this.rentalSum = model.rentalSum;
                this.total = model.total;
            } 

            /**
             * pageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * records.
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * rentalSum.
             */
            public Builder rentalSum(String rentalSum) {
                this.rentalSum = rentalSum;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

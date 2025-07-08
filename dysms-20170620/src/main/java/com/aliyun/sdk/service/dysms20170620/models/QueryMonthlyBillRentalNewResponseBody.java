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
 * {@link QueryMonthlyBillRentalNewResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMonthlyBillRentalNewResponseBody</p>
 */
public class QueryMonthlyBillRentalNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Records")
    private java.util.List<Records> records;

    @com.aliyun.core.annotation.NameInMap("RentalSum")
    private String rentalSum;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private QueryMonthlyBillRentalNewResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.records = builder.records;
        this.rentalSum = builder.rentalSum;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMonthlyBillRentalNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(QueryMonthlyBillRentalNewResponseBody model) {
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.records = model.records;
            this.rentalSum = model.rentalSum;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
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
         * Records.
         */
        public Builder records(java.util.List<Records> records) {
            this.records = records;
            return this;
        }

        /**
         * RentalSum.
         */
        public Builder rentalSum(String rentalSum) {
            this.rentalSum = rentalSum;
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
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public QueryMonthlyBillRentalNewResponseBody build() {
            return new QueryMonthlyBillRentalNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMonthlyBillRentalNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMonthlyBillRentalNewResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BillTime")
        private Long billTime;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("OfferTime")
        private Long offerTime;

        @com.aliyun.core.annotation.NameInMap("Rental")
        private String rental;

        @com.aliyun.core.annotation.NameInMap("SubItemId")
        private String subItemId;

        @com.aliyun.core.annotation.NameInMap("SubItemName")
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
             * BillTime.
             */
            public Builder billTime(Long billTime) {
                this.billTime = billTime;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * OfferTime.
             */
            public Builder offerTime(Long offerTime) {
                this.offerTime = offerTime;
                return this;
            }

            /**
             * Rental.
             */
            public Builder rental(String rental) {
                this.rental = rental;
                return this;
            }

            /**
             * SubItemId.
             */
            public Builder subItemId(String subItemId) {
                this.subItemId = subItemId;
                return this;
            }

            /**
             * SubItemName.
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
}

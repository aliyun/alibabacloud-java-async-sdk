// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnUserBillTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnUserBillTypeResponseBody</p>
 */
public class DescribeCdnUserBillTypeResponseBody extends TeaModel {
    @NameInMap("BillTypeData")
    private BillTypeData billTypeData;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCdnUserBillTypeResponseBody(Builder builder) {
        this.billTypeData = builder.billTypeData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnUserBillTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return billTypeData
     */
    public BillTypeData getBillTypeData() {
        return this.billTypeData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BillTypeData billTypeData; 
        private String requestId; 

        /**
         * BillTypeData.
         */
        public Builder billTypeData(BillTypeData billTypeData) {
            this.billTypeData = billTypeData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnUserBillTypeResponseBody build() {
            return new DescribeCdnUserBillTypeResponseBody(this);
        } 

    } 

    public static class BillTypeDataItem extends TeaModel {
        @NameInMap("BillType")
        private String billType;

        @NameInMap("BillingCycle")
        private String billingCycle;

        @NameInMap("Dimension")
        private String dimension;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Product")
        private String product;

        @NameInMap("StartTime")
        private String startTime;

        private BillTypeDataItem(Builder builder) {
            this.billType = builder.billType;
            this.billingCycle = builder.billingCycle;
            this.dimension = builder.dimension;
            this.endTime = builder.endTime;
            this.product = builder.product;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BillTypeDataItem create() {
            return builder().build();
        }

        /**
         * @return billType
         */
        public String getBillType() {
            return this.billType;
        }

        /**
         * @return billingCycle
         */
        public String getBillingCycle() {
            return this.billingCycle;
        }

        /**
         * @return dimension
         */
        public String getDimension() {
            return this.dimension;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String billType; 
            private String billingCycle; 
            private String dimension; 
            private String endTime; 
            private String product; 
            private String startTime; 

            /**
             * BillType.
             */
            public Builder billType(String billType) {
                this.billType = billType;
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
             * Dimension.
             */
            public Builder dimension(String dimension) {
                this.dimension = dimension;
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
             * Product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public BillTypeDataItem build() {
                return new BillTypeDataItem(this);
            } 

        } 

    }
    public static class BillTypeData extends TeaModel {
        @NameInMap("BillTypeDataItem")
        private java.util.List < BillTypeDataItem> billTypeDataItem;

        private BillTypeData(Builder builder) {
            this.billTypeDataItem = builder.billTypeDataItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BillTypeData create() {
            return builder().build();
        }

        /**
         * @return billTypeDataItem
         */
        public java.util.List < BillTypeDataItem> getBillTypeDataItem() {
            return this.billTypeDataItem;
        }

        public static final class Builder {
            private java.util.List < BillTypeDataItem> billTypeDataItem; 

            /**
             * BillTypeDataItem.
             */
            public Builder billTypeDataItem(java.util.List < BillTypeDataItem> billTypeDataItem) {
                this.billTypeDataItem = billTypeDataItem;
                return this;
            }

            public BillTypeData build() {
                return new BillTypeData(this);
            } 

        } 

    }
}

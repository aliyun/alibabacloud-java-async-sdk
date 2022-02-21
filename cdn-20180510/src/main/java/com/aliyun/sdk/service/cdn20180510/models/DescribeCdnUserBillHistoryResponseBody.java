// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnUserBillHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnUserBillHistoryResponseBody</p>
 */
public class DescribeCdnUserBillHistoryResponseBody extends TeaModel {
    @NameInMap("BillHistoryData")
    private BillHistoryData billHistoryData;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCdnUserBillHistoryResponseBody(Builder builder) {
        this.billHistoryData = builder.billHistoryData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnUserBillHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return billHistoryData
     */
    public BillHistoryData getBillHistoryData() {
        return this.billHistoryData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BillHistoryData billHistoryData; 
        private String requestId; 

        /**
         * BillHistoryData.
         */
        public Builder billHistoryData(BillHistoryData billHistoryData) {
            this.billHistoryData = billHistoryData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnUserBillHistoryResponseBody build() {
            return new DescribeCdnUserBillHistoryResponseBody(this);
        } 

    } 

    public static class BillingDataItem extends TeaModel {
        @NameInMap("Bandwidth")
        private Float bandwidth;

        @NameInMap("CdnRegion")
        private String cdnRegion;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("Count")
        private Float count;

        @NameInMap("Flow")
        private Float flow;

        private BillingDataItem(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.cdnRegion = builder.cdnRegion;
            this.chargeType = builder.chargeType;
            this.count = builder.count;
            this.flow = builder.flow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BillingDataItem create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Float getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return cdnRegion
         */
        public String getCdnRegion() {
            return this.cdnRegion;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return count
         */
        public Float getCount() {
            return this.count;
        }

        /**
         * @return flow
         */
        public Float getFlow() {
            return this.flow;
        }

        public static final class Builder {
            private Float bandwidth; 
            private String cdnRegion; 
            private String chargeType; 
            private Float count; 
            private Float flow; 

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Float bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * CdnRegion.
             */
            public Builder cdnRegion(String cdnRegion) {
                this.cdnRegion = cdnRegion;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Float count) {
                this.count = count;
                return this;
            }

            /**
             * Flow.
             */
            public Builder flow(Float flow) {
                this.flow = flow;
                return this;
            }

            public BillingDataItem build() {
                return new BillingDataItem(this);
            } 

        } 

    }
    public static class BillingData extends TeaModel {
        @NameInMap("BillingDataItem")
        private java.util.List < BillingDataItem> billingDataItem;

        private BillingData(Builder builder) {
            this.billingDataItem = builder.billingDataItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BillingData create() {
            return builder().build();
        }

        /**
         * @return billingDataItem
         */
        public java.util.List < BillingDataItem> getBillingDataItem() {
            return this.billingDataItem;
        }

        public static final class Builder {
            private java.util.List < BillingDataItem> billingDataItem; 

            /**
             * BillingDataItem.
             */
            public Builder billingDataItem(java.util.List < BillingDataItem> billingDataItem) {
                this.billingDataItem = billingDataItem;
                return this;
            }

            public BillingData build() {
                return new BillingData(this);
            } 

        } 

    }
    public static class BillHistoryDataItem extends TeaModel {
        @NameInMap("BillTime")
        private String billTime;

        @NameInMap("BillType")
        private String billType;

        @NameInMap("BillingData")
        private BillingData billingData;

        @NameInMap("Dimension")
        private String dimension;

        private BillHistoryDataItem(Builder builder) {
            this.billTime = builder.billTime;
            this.billType = builder.billType;
            this.billingData = builder.billingData;
            this.dimension = builder.dimension;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BillHistoryDataItem create() {
            return builder().build();
        }

        /**
         * @return billTime
         */
        public String getBillTime() {
            return this.billTime;
        }

        /**
         * @return billType
         */
        public String getBillType() {
            return this.billType;
        }

        /**
         * @return billingData
         */
        public BillingData getBillingData() {
            return this.billingData;
        }

        /**
         * @return dimension
         */
        public String getDimension() {
            return this.dimension;
        }

        public static final class Builder {
            private String billTime; 
            private String billType; 
            private BillingData billingData; 
            private String dimension; 

            /**
             * BillTime.
             */
            public Builder billTime(String billTime) {
                this.billTime = billTime;
                return this;
            }

            /**
             * BillType.
             */
            public Builder billType(String billType) {
                this.billType = billType;
                return this;
            }

            /**
             * BillingData.
             */
            public Builder billingData(BillingData billingData) {
                this.billingData = billingData;
                return this;
            }

            /**
             * Dimension.
             */
            public Builder dimension(String dimension) {
                this.dimension = dimension;
                return this;
            }

            public BillHistoryDataItem build() {
                return new BillHistoryDataItem(this);
            } 

        } 

    }
    public static class BillHistoryData extends TeaModel {
        @NameInMap("BillHistoryDataItem")
        private java.util.List < BillHistoryDataItem> billHistoryDataItem;

        private BillHistoryData(Builder builder) {
            this.billHistoryDataItem = builder.billHistoryDataItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BillHistoryData create() {
            return builder().build();
        }

        /**
         * @return billHistoryDataItem
         */
        public java.util.List < BillHistoryDataItem> getBillHistoryDataItem() {
            return this.billHistoryDataItem;
        }

        public static final class Builder {
            private java.util.List < BillHistoryDataItem> billHistoryDataItem; 

            /**
             * BillHistoryDataItem.
             */
            public Builder billHistoryDataItem(java.util.List < BillHistoryDataItem> billHistoryDataItem) {
                this.billHistoryDataItem = billHistoryDataItem;
                return this;
            }

            public BillHistoryData build() {
                return new BillHistoryData(this);
            } 

        } 

    }
}

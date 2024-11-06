// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnUserBillHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnUserBillHistoryResponseBody</p>
 */
public class DescribeDcdnUserBillHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BillHistoryData")
    private BillHistoryData billHistoryData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnUserBillHistoryResponseBody(Builder builder) {
        this.billHistoryData = builder.billHistoryData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnUserBillHistoryResponseBody create() {
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
         * <p>The billing history returned.</p>
         */
        public Builder billHistoryData(BillHistoryData billHistoryData) {
            this.billHistoryData = billHistoryData;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ED61C6C3-8241-4187-AAA7-5157AE175CEC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnUserBillHistoryResponseBody build() {
            return new DescribeDcdnUserBillHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnUserBillHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnUserBillHistoryResponseBody</p>
     */
    public static class BillingDataItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Float bandwidth;

        @com.aliyun.core.annotation.NameInMap("CdnRegion")
        private String cdnRegion;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Float count;

        @com.aliyun.core.annotation.NameInMap("Flow")
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
             * <p>The bandwidth. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>4839</p>
             */
            public Builder bandwidth(Float bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The region for which the billing records are generated. Valid values: <strong>CN</strong>, <strong>OverSeas</strong>, <strong>AP1</strong>, <strong>AP2</strong>, <strong>AP3</strong>, <strong>NA</strong>, <strong>SA</strong>, <strong>EU</strong>, and <strong>MEAA</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>AP1</p>
             */
            public Builder cdnRegion(String cdnRegion) {
                this.cdnRegion = cdnRegion;
                return this;
            }

            /**
             * <p>The billing method of the disk. Valid values: <strong>StaticHttp</strong>, <strong>DynamicHttp</strong>, and <strong>DynamicHttps</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>DynamicHttp</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The number of billing entries.</p>
             * 
             * <strong>example:</strong>
             * <p>205624</p>
             */
            public Builder count(Float count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The amount of network traffic. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2456</p>
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
    /**
     * 
     * {@link DescribeDcdnUserBillHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnUserBillHistoryResponseBody</p>
     */
    public static class BillingData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BillingDataItem")
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
    /**
     * 
     * {@link DescribeDcdnUserBillHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnUserBillHistoryResponseBody</p>
     */
    public static class BillHistoryDataItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BillTime")
        private String billTime;

        @com.aliyun.core.annotation.NameInMap("BillType")
        private String billType;

        @com.aliyun.core.annotation.NameInMap("BillingData")
        private BillingData billingData;

        @com.aliyun.core.annotation.NameInMap("Dimension")
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
             * <p>The beginning of the time range that was queried.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-09-30T17:00:00Z</p>
             */
            public Builder billTime(String billTime) {
                this.billTime = billTime;
                return this;
            }

            /**
             * <p>The metering method.</p>
             * 
             * <strong>example:</strong>
             * <p>month_4th_day_bandwidth</p>
             */
            public Builder billType(String billType) {
                this.billType = billType;
                return this;
            }

            /**
             * <p>The billable items.</p>
             */
            public Builder billingData(BillingData billingData) {
                this.billingData = billingData;
                return this;
            }

            /**
             * <p>The dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>vas</p>
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
    /**
     * 
     * {@link DescribeDcdnUserBillHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnUserBillHistoryResponseBody</p>
     */
    public static class BillHistoryData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BillHistoryDataItem")
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

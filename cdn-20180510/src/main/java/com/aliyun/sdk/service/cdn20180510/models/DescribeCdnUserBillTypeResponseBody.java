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
         * Details about the metering methods returned.
         */
        public Builder billTypeData(BillTypeData billTypeData) {
            this.billTypeData = billTypeData;
            return this;
        }

        /**
         * The ID of the request.
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
             * The metering method.
             * <p>
             * 
             * > If the metering method is suffixed with \*\*\_overseas\*\*, the billable region is outside the Chinese mainland. For example, "BillType": "month_avg_day_bandwidth_overseas" indicates that the metering method is pay by average daily peak bandwidth per month in a billable region outside the Chinese mainland.
             * 
             * Valid values:
             * 
             * *   hour_flow: pay by hourly data transfer
             * *   day_bandwidth: pay by daily bandwidth
             * *   month\_95: pay by monthly 95th percentile bandwidth
             * *   month_avg_day_bandwidth: pay by average daily peak bandwidth per month
             * *   month\_4th_day_bandwidth: pay by monthly 4th peak bandwidth
             * *   month_avg_day\_95: pay by average daily 95th percentile bandwidth per month
             * *   month\_95\_night_half: pay by 95th percentile bandwidth with 50% off from 00:00 to 08:00
             * *   hour_vas: pay by value-added services per hour
             * *   quic_hour_count: pay by hourly QUIC requests
             * *   day_count: pay by daily requests
             * *   hour_count: pay by hourly requests
             * *   day\_95: pay by daily 95th percentile bandwidth
             */
            public Builder billType(String billType) {
                this.billType = billType;
                return this;
            }

            /**
             * The billing cycle.
             */
            public Builder billingCycle(String billingCycle) {
                this.billingCycle = billingCycle;
                return this;
            }

            /**
             * The dimension. Valid values:
             * <p>
             * 
             * *   flow: traffic and bandwidth
             * *   vas: value-added services (HTTPS and requests for dynamic content)
             * *   quic: the number of QUIC requests
             * *   websocket: the WebSocket communications protocol
             * *   rtlog2sls: log entries delivered to Log Service in real time
             * *   stationflow: traffic over the internal network
             */
            public Builder dimension(String dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * The time when the metering method ended.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The name of the product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * The time when the metering method started.
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

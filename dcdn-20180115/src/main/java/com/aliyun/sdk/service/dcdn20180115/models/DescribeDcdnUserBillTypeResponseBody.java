// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnUserBillTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnUserBillTypeResponseBody</p>
 */
public class DescribeDcdnUserBillTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BillTypeData")
    private BillTypeData billTypeData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnUserBillTypeResponseBody(Builder builder) {
        this.billTypeData = builder.billTypeData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnUserBillTypeResponseBody create() {
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
         * The information about the metering method.
         */
        public Builder billTypeData(BillTypeData billTypeData) {
            this.billTypeData = billTypeData;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnUserBillTypeResponseBody build() {
            return new DescribeDcdnUserBillTypeResponseBody(this);
        } 

    } 

    public static class BillTypeDataItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BillType")
        private String billType;

        @com.aliyun.core.annotation.NameInMap("BillingCycle")
        private String billingCycle;

        @com.aliyun.core.annotation.NameInMap("Dimension")
        private String dimension;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("StartTime")
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
             * The metering method. Valid values:
             * <p>
             * 
             * *   **hour_flow**: pay by hourly traffic
             * *   **day_bandwidth**: pay by daily bandwidth
             * *   **month\_95**: pay by monthly 95th percentile
             * *   **month_avg_day_bandwidth**: pay by average daily peak bandwidth per month
             * *   **month\_4th_day_bandwidth**: pay by 4th peak bandwidth per month
             * *   **month_avg_day\_95**: pay by average daily 95th percentile per month
             * *   **month\_95\_night_half**: pay by 95th percentile (50% off during nighttime)
             * *   **hour_vas**: pay by value-added service per month
             * *   **quic_hour_count**: pay by QUIC request per hour
             * *   **hour_count**: pay by request per hour
             * *   **rtlog_count_day**: pay by the number of real-time logs per day
             */
            public Builder billType(String billType) {
                this.billType = billType;
                return this;
            }

            /**
             * The metering cycle.
             */
            public Builder billingCycle(String billingCycle) {
                this.billingCycle = billingCycle;
                return this;
            }

            /**
             * The dimension. Valid values:
             * <p>
             * 
             * *   **flow**: network traffic and bandwidth
             * *   **vas**: value-added services (HTTPS and requests for dynamic content)
             * *   **websocket**: WebSocket
             * *   **quic**: QUIC requests
             * *   **rtlog2sls**: log entries delivered to Log Service in real time
             */
            public Builder dimension(String dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * The time when the metering method ends.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The name of the service.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * The time when the metering method takes effect.
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
        @com.aliyun.core.annotation.NameInMap("BillTypeDataItem")
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

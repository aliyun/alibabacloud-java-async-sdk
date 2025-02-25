// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The information about the metering method.</p>
         */
        public Builder billTypeData(BillTypeData billTypeData) {
            this.billTypeData = billTypeData;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C370DAF1-C838-4288-A1A0-9A87633D248E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnUserBillTypeResponseBody build() {
            return new DescribeDcdnUserBillTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnUserBillTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnUserBillTypeResponseBody</p>
     */
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
             * <p>The metering method. Valid values:</p>
             * <ul>
             * <li><strong>hour_flow</strong>: pay by hourly traffic</li>
             * <li><strong>day_bandwidth</strong>: pay by daily bandwidth</li>
             * <li><strong>month_95</strong>: pay by monthly 95th percentile</li>
             * <li><strong>month_avg_day_bandwidth</strong>: pay by average daily peak bandwidth per month</li>
             * <li><strong>month_4th_day_bandwidth</strong>: pay by 4th peak bandwidth per month</li>
             * <li><strong>month_avg_day_95</strong>: pay by average daily 95th percentile per month</li>
             * <li><strong>month_95_night_half</strong>: pay by 95th percentile (50% off during nighttime)</li>
             * <li><strong>hour_vas</strong>: pay by value-added service per month</li>
             * <li><strong>quic_hour_count</strong>: pay by QUIC request per hour</li>
             * <li><strong>hour_count</strong>: pay by request per hour</li>
             * <li><strong>rtlog_count_day</strong>: pay by the number of real-time logs per day</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>month_avg_day_bandwidth_overseas</p>
             */
            public Builder billType(String billType) {
                this.billType = billType;
                return this;
            }

            /**
             * <p>The metering cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>month</p>
             */
            public Builder billingCycle(String billingCycle) {
                this.billingCycle = billingCycle;
                return this;
            }

            /**
             * <p>The dimension. Valid values:</p>
             * <ul>
             * <li><strong>flow</strong>: network traffic and bandwidth</li>
             * <li><strong>vas</strong>: value-added services (HTTPS and requests for dynamic content)</li>
             * <li><strong>websocket</strong>: WebSocket</li>
             * <li><strong>quic</strong>: QUIC requests</li>
             * <li><strong>rtlog2sls</strong>: log entries delivered to Log Service in real time</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>flow</p>
             */
            public Builder dimension(String dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * <p>The time when the metering method ends.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-10-31T16:00:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>dcdn</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>The time when the metering method takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-10-30T16:00:00Z</p>
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
    /**
     * 
     * {@link DescribeDcdnUserBillTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnUserBillTypeResponseBody</p>
     */
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

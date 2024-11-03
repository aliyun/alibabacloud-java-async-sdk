// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCdnUserBillTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnUserBillTypeResponseBody</p>
 */
public class DescribeCdnUserBillTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BillTypeData")
    private BillTypeData billTypeData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>Details about the metering methods returned.</p>
         */
        public Builder billTypeData(BillTypeData billTypeData) {
            this.billTypeData = billTypeData;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C370DAF1-C838-4288-A1A0-9A87633D248E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnUserBillTypeResponseBody build() {
            return new DescribeCdnUserBillTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCdnUserBillTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnUserBillTypeResponseBody</p>
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
             * <p>The metering method.</p>
             * <blockquote>
             * <p>If the metering method is suffixed with **_overseas**, the billable region is outside the Chinese mainland. For example, &quot;BillType&quot;: &quot;month_avg_day_bandwidth_overseas&quot; indicates that the metering method is pay by average daily peak bandwidth per month in a billable region outside the Chinese mainland.</p>
             * </blockquote>
             * <p>Valid values:</p>
             * <ul>
             * <li>hour_flow: pay by hourly data transfer</li>
             * <li>day_bandwidth: pay by daily bandwidth</li>
             * <li>month_95: pay by monthly 95th percentile bandwidth</li>
             * <li>month_avg_day_bandwidth: pay by average daily peak bandwidth per month</li>
             * <li>month_4th_day_bandwidth: pay by monthly 4th peak bandwidth</li>
             * <li>month_avg_day_95: pay by average daily 95th percentile bandwidth per month</li>
             * <li>month_95_night_half: pay by 95th percentile bandwidth with 50% off from 00:00 to 08:00</li>
             * <li>hour_vas: pay by value-added services per hour</li>
             * <li>quic_hour_count: pay by hourly QUIC requests</li>
             * <li>day_count: pay by daily requests</li>
             * <li>hour_count: pay by hourly requests</li>
             * <li>day_95: pay by daily 95th percentile bandwidth</li>
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
             * <p>The billing cycle.</p>
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
             * <li>flow: traffic and bandwidth</li>
             * <li>vas: value-added services (HTTPS and requests for dynamic content)</li>
             * <li>quic: the number of QUIC requests</li>
             * <li>websocket: the WebSocket communications protocol</li>
             * <li>rtlog2sls: log entries delivered to Log Service in real time</li>
             * <li>stationflow: traffic over the internal network</li>
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
             * <p>The time when the metering method ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-10-31T16:00:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The name of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>cdn</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>The time when the metering method started.</p>
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
     * {@link DescribeCdnUserBillTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnUserBillTypeResponseBody</p>
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

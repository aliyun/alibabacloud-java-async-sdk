// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeCdnUserBillPredictionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnUserBillPredictionResponseBody</p>
 */
public class DescribeCdnUserBillPredictionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BillPredictionData")
    private BillPredictionData billPredictionData;

    @com.aliyun.core.annotation.NameInMap("BillType")
    private String billType;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeCdnUserBillPredictionResponseBody(Builder builder) {
        this.billPredictionData = builder.billPredictionData;
        this.billType = builder.billType;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnUserBillPredictionResponseBody create() {
        return builder().build();
    }

    /**
     * @return billPredictionData
     */
    public BillPredictionData getBillPredictionData() {
        return this.billPredictionData;
    }

    /**
     * @return billType
     */
    public String getBillType() {
        return this.billType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private BillPredictionData billPredictionData; 
        private String billType; 
        private String endTime; 
        private String requestId; 
        private String startTime; 

        /**
         * <p>The estimated bill data.</p>
         */
        public Builder billPredictionData(BillPredictionData billPredictionData) {
            this.billPredictionData = billPredictionData;
            return this;
        }

        /**
         * <p>The metering method.</p>
         * <blockquote>
         * <p>If the metering method ends with _overseas, the billable region is outside the Chinese mainland. For example, BillType&quot;: &quot;month_avg_day_bandwidth_overseas specifies a billable region outside the Chinese mainland and that the metering method is pay by daily peak bandwidth per month.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>hour_flow: pay by hourly data transfer</li>
         * <li>day_bandwidth: pay by daily bandwidth</li>
         * <li>month_95: pay by monthly 95th percentile bandwidth.</li>
         * <li>month_avg_day_bandwidth: pay by average daily peak bandwidth per month</li>
         * <li>month_4th_day_bandwidth: pay by monthly 4th peak bandwidth</li>
         * <li>month_avg_day_95: pay by average daily 95th percentile bandwidth per month</li>
         * <li>month_95_night_half: pay by 95th percentile bandwidth with 50% off from 00:00 to 08:00.</li>
         * <li>hour_vas: pay by value-added services per hour</li>
         * <li>day_count: pay by daily requests</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>month_95</p>
         */
        public Builder billType(String billType) {
            this.billType = billType;
            return this;
        }

        /**
         * <p>The end time of the estimation.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-10-25T10:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
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

        /**
         * <p>The start time of the estimation.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-09-30T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeCdnUserBillPredictionResponseBody build() {
            return new DescribeCdnUserBillPredictionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCdnUserBillPredictionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnUserBillPredictionResponseBody</p>
     */
    public static class BillPredictionDataItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Area")
        private String area;

        @com.aliyun.core.annotation.NameInMap("TimeStp")
        private String timeStp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private BillPredictionDataItem(Builder builder) {
            this.area = builder.area;
            this.timeStp = builder.timeStp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BillPredictionDataItem create() {
            return builder().build();
        }

        /**
         * @return area
         */
        public String getArea() {
            return this.area;
        }

        /**
         * @return timeStp
         */
        public String getTimeStp() {
            return this.timeStp;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String area; 
            private String timeStp; 
            private Float value; 

            /**
             * <p>The billable region.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * <p>The time when the value used as the estimated value is generated. This parameter is returned only if the metering method is pay by 95th percentile, pay by 95th percentile bandwidth with 50% off from 00:00 to 08:00, or pay by 4th peak bandwidth per month.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-10-15T16:00:00Z</p>
             */
            public Builder timeStp(String timeStp) {
                this.timeStp = timeStp;
                return this;
            }

            /**
             * <p>The estimated value.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public BillPredictionDataItem build() {
                return new BillPredictionDataItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnUserBillPredictionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnUserBillPredictionResponseBody</p>
     */
    public static class BillPredictionData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BillPredictionDataItem")
        private java.util.List<BillPredictionDataItem> billPredictionDataItem;

        private BillPredictionData(Builder builder) {
            this.billPredictionDataItem = builder.billPredictionDataItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BillPredictionData create() {
            return builder().build();
        }

        /**
         * @return billPredictionDataItem
         */
        public java.util.List<BillPredictionDataItem> getBillPredictionDataItem() {
            return this.billPredictionDataItem;
        }

        public static final class Builder {
            private java.util.List<BillPredictionDataItem> billPredictionDataItem; 

            /**
             * BillPredictionDataItem.
             */
            public Builder billPredictionDataItem(java.util.List<BillPredictionDataItem> billPredictionDataItem) {
                this.billPredictionDataItem = billPredictionDataItem;
                return this;
            }

            public BillPredictionData build() {
                return new BillPredictionData(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnUserBillPredictionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnUserBillPredictionResponseBody</p>
 */
public class DescribeCdnUserBillPredictionResponseBody extends TeaModel {
    @NameInMap("BillPredictionData")
    private BillPredictionData billPredictionData;

    @NameInMap("BillType")
    private String billType;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
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
         * The estimated bill data.
         */
        public Builder billPredictionData(BillPredictionData billPredictionData) {
            this.billPredictionData = billPredictionData;
            return this;
        }

        /**
         * The metering method.
         * <p>
         * 
         * > If the metering method ends with \_overseas, the billable region is outside the Chinese mainland. For example, BillType": "month_avg_day_bandwidth_overseas specifies a billable region outside the Chinese mainland and that the metering method is pay by daily peak bandwidth per month.
         * 
         * Valid values:
         * 
         * *   hour_flow: pay by hourly data transfer
         * *   day_bandwidth: pay by daily bandwidth
         * *   month\_95: pay by monthly 95th percentile bandwidth.
         * *   month_avg_day_bandwidth: pay by average daily peak bandwidth per month
         * *   month\_4th_day_bandwidth: pay by monthly 4th peak bandwidth
         * *   month_avg_day\_95: pay by average daily 95th percentile bandwidth per month
         * *   month\_95\_night_half: pay by 95th percentile bandwidth with 50% off from 00:00 to 08:00.
         * *   hour_vas: pay by value-added services per hour
         * *   day_count: pay by daily requests
         */
        public Builder billType(String billType) {
            this.billType = billType;
            return this;
        }

        /**
         * The end time of the estimation.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The start time of the estimation.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeCdnUserBillPredictionResponseBody build() {
            return new DescribeCdnUserBillPredictionResponseBody(this);
        } 

    } 

    public static class BillPredictionDataItem extends TeaModel {
        @NameInMap("Area")
        private String area;

        @NameInMap("TimeStp")
        private String timeStp;

        @NameInMap("Value")
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
             * The billable region.
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * The time when the value used as the estimated value is generated. This parameter is returned only if the metering method is pay by 95th percentile, pay by 95th percentile bandwidth with 50% off from 00:00 to 08:00, or pay by 4th peak bandwidth per month.
             */
            public Builder timeStp(String timeStp) {
                this.timeStp = timeStp;
                return this;
            }

            /**
             * The estimated value.
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
    public static class BillPredictionData extends TeaModel {
        @NameInMap("BillPredictionDataItem")
        private java.util.List < BillPredictionDataItem> billPredictionDataItem;

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
        public java.util.List < BillPredictionDataItem> getBillPredictionDataItem() {
            return this.billPredictionDataItem;
        }

        public static final class Builder {
            private java.util.List < BillPredictionDataItem> billPredictionDataItem; 

            /**
             * BillPredictionDataItem.
             */
            public Builder billPredictionDataItem(java.util.List < BillPredictionDataItem> billPredictionDataItem) {
                this.billPredictionDataItem = billPredictionDataItem;
                return this;
            }

            public BillPredictionData build() {
                return new BillPredictionData(this);
            } 

        } 

    }
}

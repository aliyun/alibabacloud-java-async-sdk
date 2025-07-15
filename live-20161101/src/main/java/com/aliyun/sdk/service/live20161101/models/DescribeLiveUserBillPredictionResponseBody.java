// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveUserBillPredictionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveUserBillPredictionResponseBody</p>
 */
public class DescribeLiveUserBillPredictionResponseBody extends TeaModel {
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

    private DescribeLiveUserBillPredictionResponseBody(Builder builder) {
        this.billPredictionData = builder.billPredictionData;
        this.billType = builder.billType;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveUserBillPredictionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveUserBillPredictionResponseBody model) {
            this.billPredictionData = model.billPredictionData;
            this.billType = model.billType;
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The estimated bill data.</p>
         */
        public Builder billPredictionData(BillPredictionData billPredictionData) {
            this.billPredictionData = billPredictionData;
            return this;
        }

        /**
         * <p>The metering method. Valid values:</p>
         * <ul>
         * <li>hour_flow: pay by hourly data transfer</li>
         * <li>day_bandwidth: pay by daily bandwidth</li>
         * <li>month_95: pay by monthly 95th percentile bandwidth</li>
         * <li>month_avg_day_bandwidth: pay by average daily peak bandwidth per month</li>
         * <li>month_4th_day_bandwidth: pay by 4th peak bandwidth per month</li>
         * <li>month_avg_day_95: pay by average daily 95th percentile bandwidth per month</li>
         * <li>month_95_night_half: pay by 95th percentile bandwidth with 50% off from 00:00 to 08:00</li>
         * <li>hour_vas: pay by value-added services per hour</li>
         * <li>day_count: pay by daily requests</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>day_bandwidth</p>
         */
        public Builder billType(String billType) {
            this.billType = billType;
            return this;
        }

        /**
         * <p>The end time. If you do not specify the request parameter EndTime, the end time is the current time by default. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-10-25T10:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B95BE680-5A6A-1CAD-8AB1-09DFF5D6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start time. If you do not specify the request parameter StartTime, the start time is 00:00 on the first day of the month by default. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-09-30T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeLiveUserBillPredictionResponseBody build() {
            return new DescribeLiveUserBillPredictionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveUserBillPredictionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUserBillPredictionResponseBody</p>
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

            private Builder() {
            } 

            private Builder(BillPredictionDataItem model) {
                this.area = model.area;
                this.timeStp = model.timeStp;
                this.value = model.value;
            } 

            /**
             * <p>The billable region. Valid values:</p>
             * <ul>
             * <li>CN: Chinese mainland</li>
             * <li>OverSeas: countries and regions outside the Chinese mainland</li>
             * <li>AP1: Asia Pacific 1, including Hong Kong (China), Macao (China), Taiwan (China), Japan, and other Southeast Asia countries and regions except Vietnam and Indonesia</li>
             * <li>AP2: Asia Pacific 2, including Indonesia, South Korea, and Vietnam</li>
             * <li>AP3: Asia Pacific 3, including Australia and New Zealand</li>
             * <li>NA: North America, including US and Canada</li>
             * <li>SA: South America, specifically meaning Brazil</li>
             * <li>EU: Europe, including Ukraine, UK, France, Netherlands, Spain, Italy, Sweden, and Germany</li>
             * <li>MEAA: Middle East and Africa, including South Africa, Oman, UAE, and Kuwait</li>
             * </ul>
             * <p>By default, data of all regions is aggregated and returned.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * <p>The time at which the estimated value occurs. This parameter is returned only if the metering method is pay by 95th percentile bandwidth, pay by 95th percentile bandwidth with 50% off from 00:00 to 08:00, or pay by 4th peak bandwidth per month.</p>
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
     * {@link DescribeLiveUserBillPredictionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUserBillPredictionResponseBody</p>
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

            private Builder() {
            } 

            private Builder(BillPredictionData model) {
                this.billPredictionDataItem = model.billPredictionDataItem;
            } 

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

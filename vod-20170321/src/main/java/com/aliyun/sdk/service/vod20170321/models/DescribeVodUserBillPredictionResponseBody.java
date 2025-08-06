// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodUserBillPredictionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodUserBillPredictionResponseBody</p>
 */
public class DescribeVodUserBillPredictionResponseBody extends TeaModel {
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

    private DescribeVodUserBillPredictionResponseBody(Builder builder) {
        this.billPredictionData = builder.billPredictionData;
        this.billType = builder.billType;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodUserBillPredictionResponseBody create() {
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

        private Builder(DescribeVodUserBillPredictionResponseBody model) {
            this.billPredictionData = model.billPredictionData;
            this.billType = model.billType;
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * BillPredictionData.
         */
        public Builder billPredictionData(BillPredictionData billPredictionData) {
            this.billPredictionData = billPredictionData;
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
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeVodUserBillPredictionResponseBody build() {
            return new DescribeVodUserBillPredictionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodUserBillPredictionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodUserBillPredictionResponseBody</p>
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
             * Area.
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * TimeStp.
             */
            public Builder timeStp(String timeStp) {
                this.timeStp = timeStp;
                return this;
            }

            /**
             * Value.
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
     * {@link DescribeVodUserBillPredictionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodUserBillPredictionResponseBody</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserBandWidthDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserBandWidthDataResponseBody</p>
 */
public class DescribeUserBandWidthDataResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("MonitorData")
    private MonitorData monitorData;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeUserBandWidthDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.monitorData = builder.monitorData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserBandWidthDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return monitorData
     */
    public MonitorData getMonitorData() {
        return this.monitorData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private MonitorData monitorData; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * MonitorData.
         */
        public Builder monitorData(MonitorData monitorData) {
            this.monitorData = monitorData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserBandWidthDataResponseBody build() {
            return new DescribeUserBandWidthDataResponseBody(this);
        } 

    } 

    public static class BandWidthMonitorData extends TeaModel {
        @NameInMap("DownBandWidth")
        private Integer downBandWidth;

        @NameInMap("InternetRX")
        private Integer internetRX;

        @NameInMap("InternetTX")
        private Integer internetTX;

        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("UpBandWidth")
        private Integer upBandWidth;

        private BandWidthMonitorData(Builder builder) {
            this.downBandWidth = builder.downBandWidth;
            this.internetRX = builder.internetRX;
            this.internetTX = builder.internetTX;
            this.timeStamp = builder.timeStamp;
            this.upBandWidth = builder.upBandWidth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BandWidthMonitorData create() {
            return builder().build();
        }

        /**
         * @return downBandWidth
         */
        public Integer getDownBandWidth() {
            return this.downBandWidth;
        }

        /**
         * @return internetRX
         */
        public Integer getInternetRX() {
            return this.internetRX;
        }

        /**
         * @return internetTX
         */
        public Integer getInternetTX() {
            return this.internetTX;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return upBandWidth
         */
        public Integer getUpBandWidth() {
            return this.upBandWidth;
        }

        public static final class Builder {
            private Integer downBandWidth; 
            private Integer internetRX; 
            private Integer internetTX; 
            private String timeStamp; 
            private Integer upBandWidth; 

            /**
             * DownBandWidth.
             */
            public Builder downBandWidth(Integer downBandWidth) {
                this.downBandWidth = downBandWidth;
                return this;
            }

            /**
             * InternetRX.
             */
            public Builder internetRX(Integer internetRX) {
                this.internetRX = internetRX;
                return this;
            }

            /**
             * InternetTX.
             */
            public Builder internetTX(Integer internetTX) {
                this.internetTX = internetTX;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * UpBandWidth.
             */
            public Builder upBandWidth(Integer upBandWidth) {
                this.upBandWidth = upBandWidth;
                return this;
            }

            public BandWidthMonitorData build() {
                return new BandWidthMonitorData(this);
            } 

        } 

    }
    public static class MonitorData extends TeaModel {
        @NameInMap("BandWidthMonitorData")
        private java.util.List < BandWidthMonitorData> bandWidthMonitorData;

        @NameInMap("MaxDownBandWidth")
        private String maxDownBandWidth;

        @NameInMap("MaxUpBandWidth")
        private String maxUpBandWidth;

        private MonitorData(Builder builder) {
            this.bandWidthMonitorData = builder.bandWidthMonitorData;
            this.maxDownBandWidth = builder.maxDownBandWidth;
            this.maxUpBandWidth = builder.maxUpBandWidth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorData create() {
            return builder().build();
        }

        /**
         * @return bandWidthMonitorData
         */
        public java.util.List < BandWidthMonitorData> getBandWidthMonitorData() {
            return this.bandWidthMonitorData;
        }

        /**
         * @return maxDownBandWidth
         */
        public String getMaxDownBandWidth() {
            return this.maxDownBandWidth;
        }

        /**
         * @return maxUpBandWidth
         */
        public String getMaxUpBandWidth() {
            return this.maxUpBandWidth;
        }

        public static final class Builder {
            private java.util.List < BandWidthMonitorData> bandWidthMonitorData; 
            private String maxDownBandWidth; 
            private String maxUpBandWidth; 

            /**
             * BandWidthMonitorData.
             */
            public Builder bandWidthMonitorData(java.util.List < BandWidthMonitorData> bandWidthMonitorData) {
                this.bandWidthMonitorData = bandWidthMonitorData;
                return this;
            }

            /**
             * MaxDownBandWidth.
             */
            public Builder maxDownBandWidth(String maxDownBandWidth) {
                this.maxDownBandWidth = maxDownBandWidth;
                return this;
            }

            /**
             * MaxUpBandWidth.
             */
            public Builder maxUpBandWidth(String maxUpBandWidth) {
                this.maxUpBandWidth = maxUpBandWidth;
                return this;
            }

            public MonitorData build() {
                return new MonitorData(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEpnBandWidthDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEpnBandWidthDataResponseBody</p>
 */
public class DescribeEpnBandWidthDataResponseBody extends TeaModel {
    @NameInMap("MonitorData")
    private MonitorData monitorData;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeEpnBandWidthDataResponseBody(Builder builder) {
        this.monitorData = builder.monitorData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEpnBandWidthDataResponseBody create() {
        return builder().build();
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
        private MonitorData monitorData; 
        private String requestId; 

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

        public DescribeEpnBandWidthDataResponseBody build() {
            return new DescribeEpnBandWidthDataResponseBody(this);
        } 

    } 

    public static class BandWidthMonitorData extends TeaModel {
        @NameInMap("DownBandWidth")
        private Long downBandWidth;

        @NameInMap("InternetRX")
        private Long internetRX;

        @NameInMap("InternetTX")
        private Long internetTX;

        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("UpBandWidth")
        private Long upBandWidth;

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
        public Long getDownBandWidth() {
            return this.downBandWidth;
        }

        /**
         * @return internetRX
         */
        public Long getInternetRX() {
            return this.internetRX;
        }

        /**
         * @return internetTX
         */
        public Long getInternetTX() {
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
        public Long getUpBandWidth() {
            return this.upBandWidth;
        }

        public static final class Builder {
            private Long downBandWidth; 
            private Long internetRX; 
            private Long internetTX; 
            private String timeStamp; 
            private Long upBandWidth; 

            /**
             * DownBandWidth.
             */
            public Builder downBandWidth(Long downBandWidth) {
                this.downBandWidth = downBandWidth;
                return this;
            }

            /**
             * InternetRX.
             */
            public Builder internetRX(Long internetRX) {
                this.internetRX = internetRX;
                return this;
            }

            /**
             * InternetTX.
             */
            public Builder internetTX(Long internetTX) {
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
            public Builder upBandWidth(Long upBandWidth) {
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
        private Long maxDownBandWidth;

        @NameInMap("MaxUpBandWidth")
        private Long maxUpBandWidth;

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
        public Long getMaxDownBandWidth() {
            return this.maxDownBandWidth;
        }

        /**
         * @return maxUpBandWidth
         */
        public Long getMaxUpBandWidth() {
            return this.maxUpBandWidth;
        }

        public static final class Builder {
            private java.util.List < BandWidthMonitorData> bandWidthMonitorData; 
            private Long maxDownBandWidth; 
            private Long maxUpBandWidth; 

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
            public Builder maxDownBandWidth(Long maxDownBandWidth) {
                this.maxDownBandWidth = maxDownBandWidth;
                return this;
            }

            /**
             * MaxUpBandWidth.
             */
            public Builder maxUpBandWidth(Long maxUpBandWidth) {
                this.maxUpBandWidth = maxUpBandWidth;
                return this;
            }

            public MonitorData build() {
                return new MonitorData(this);
            } 

        } 

    }
}

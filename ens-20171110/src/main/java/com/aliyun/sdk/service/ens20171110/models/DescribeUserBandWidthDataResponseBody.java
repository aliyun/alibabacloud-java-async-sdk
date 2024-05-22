// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserBandWidthDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserBandWidthDataResponseBody</p>
 */
public class DescribeUserBandWidthDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("MonitorData")
    private MonitorData monitorData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The returned service code. 0 indicates that the request was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The monitoring data.
         */
        public Builder monitorData(MonitorData monitorData) {
            this.monitorData = monitorData;
            return this;
        }

        /**
         * The ID of the request.
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
        @com.aliyun.core.annotation.NameInMap("DownBandWidth")
        private Long downBandWidth;

        @com.aliyun.core.annotation.NameInMap("InternetRX")
        private Long internetRX;

        @com.aliyun.core.annotation.NameInMap("InternetTX")
        private Long internetTX;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("UpBandWidth")
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
             * The outbound bandwidth. Unit: bit/s.
             */
            public Builder downBandWidth(Long downBandWidth) {
                this.downBandWidth = downBandWidth;
                return this;
            }

            /**
             * The Internet traffic to the instance. Unit: bytes.
             */
            public Builder internetRX(Long internetRX) {
                this.internetRX = internetRX;
                return this;
            }

            /**
             * The Internet traffic from the instance. Unit: bytes.
             */
            public Builder internetTX(Long internetTX) {
                this.internetTX = internetTX;
                return this;
            }

            /**
             * The timestamp when the monitoring data was queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * The inbound bandwidth. Unit: bit/s.
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
        @com.aliyun.core.annotation.NameInMap("BandWidthMonitorData")
        private java.util.List < BandWidthMonitorData> bandWidthMonitorData;

        @com.aliyun.core.annotation.NameInMap("MaxDownBandWidth")
        private String maxDownBandWidth;

        @com.aliyun.core.annotation.NameInMap("MaxUpBandWidth")
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
             * The bandwidth data.
             */
            public Builder bandWidthMonitorData(java.util.List < BandWidthMonitorData> bandWidthMonitorData) {
                this.bandWidthMonitorData = bandWidthMonitorData;
                return this;
            }

            /**
             * The maximum outbound bandwidth within the queried time range. Unit: bit/s.
             */
            public Builder maxDownBandWidth(String maxDownBandWidth) {
                this.maxDownBandWidth = maxDownBandWidth;
                return this;
            }

            /**
             * The maximum inbound bandwidth within the queried time range. Unit: bit/s.
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

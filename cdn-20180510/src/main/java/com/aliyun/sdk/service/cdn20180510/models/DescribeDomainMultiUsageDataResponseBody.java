// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainMultiUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainMultiUsageDataResponseBody</p>
 */
public class DescribeDomainMultiUsageDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RequestPerInterval")
    private RequestPerInterval requestPerInterval;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("TrafficPerInterval")
    private TrafficPerInterval trafficPerInterval;

    private DescribeDomainMultiUsageDataResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.requestPerInterval = builder.requestPerInterval;
        this.startTime = builder.startTime;
        this.trafficPerInterval = builder.trafficPerInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainMultiUsageDataResponseBody create() {
        return builder().build();
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
     * @return requestPerInterval
     */
    public RequestPerInterval getRequestPerInterval() {
        return this.requestPerInterval;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return trafficPerInterval
     */
    public TrafficPerInterval getTrafficPerInterval() {
        return this.trafficPerInterval;
    }

    public static final class Builder {
        private String endTime; 
        private String requestId; 
        private RequestPerInterval requestPerInterval; 
        private String startTime; 
        private TrafficPerInterval trafficPerInterval; 

        /**
         * The end of the time range that was queried.
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
         * The information about requests collected every 5 minutes.
         */
        public Builder requestPerInterval(RequestPerInterval requestPerInterval) {
            this.requestPerInterval = requestPerInterval;
            return this;
        }

        /**
         * The start of the time range that was queried.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The statistics of network traffic collected every 5 minutes.
         */
        public Builder trafficPerInterval(TrafficPerInterval trafficPerInterval) {
            this.trafficPerInterval = trafficPerInterval;
            return this;
        }

        public DescribeDomainMultiUsageDataResponseBody build() {
            return new DescribeDomainMultiUsageDataResponseBody(this);
        } 

    } 

    public static class RequestDataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Request")
        private Long request;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RequestDataModule(Builder builder) {
            this.domain = builder.domain;
            this.request = builder.request;
            this.timeStamp = builder.timeStamp;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestDataModule create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return request
         */
        public Long getRequest() {
            return this.request;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String domain; 
            private Long request; 
            private String timeStamp; 
            private String type; 

            /**
             * The accelerated domain name.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The number of requests.
             */
            public Builder request(Long request) {
                this.request = request;
                return this;
            }

            /**
             * The timestamp of the returned number of requests.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * The type.
             * <p>
             * 
             * >  The value is Simple for Alibaba Cloud CDN.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RequestDataModule build() {
                return new RequestDataModule(this);
            } 

        } 

    }
    public static class RequestPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestDataModule")
        private java.util.List < RequestDataModule> requestDataModule;

        private RequestPerInterval(Builder builder) {
            this.requestDataModule = builder.requestDataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestPerInterval create() {
            return builder().build();
        }

        /**
         * @return requestDataModule
         */
        public java.util.List < RequestDataModule> getRequestDataModule() {
            return this.requestDataModule;
        }

        public static final class Builder {
            private java.util.List < RequestDataModule> requestDataModule; 

            /**
             * RequestDataModule.
             */
            public Builder requestDataModule(java.util.List < RequestDataModule> requestDataModule) {
                this.requestDataModule = requestDataModule;
                return this;
            }

            public RequestPerInterval build() {
                return new RequestPerInterval(this);
            } 

        } 

    }
    public static class TrafficDataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Area")
        private String area;

        @com.aliyun.core.annotation.NameInMap("Bps")
        private Float bps;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private TrafficDataModule(Builder builder) {
            this.area = builder.area;
            this.bps = builder.bps;
            this.domain = builder.domain;
            this.timeStamp = builder.timeStamp;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficDataModule create() {
            return builder().build();
        }

        /**
         * @return area
         */
        public String getArea() {
            return this.area;
        }

        /**
         * @return bps
         */
        public Float getBps() {
            return this.bps;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String area; 
            private Float bps; 
            private String domain; 
            private String timeStamp; 
            private String type; 

            /**
             * The name of the region.
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * The bandwidth. Unit: bit/s.
             */
            public Builder bps(Float bps) {
                this.bps = bps;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The startstamp of the returned usage data.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * The type of requests. Valid values:
             * <p>
             * 
             * *   **StaticHttps**: static HTTPS requests
             * *   **DynamicHttps**: dynamic HTTPS requests
             * *   **DynamicHttp**: dynamic HTTP requests
             * *   **StaticQuic**: static QUIC requests
             * *   **DynamicQuic**: dynamic QUIC requests
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TrafficDataModule build() {
                return new TrafficDataModule(this);
            } 

        } 

    }
    public static class TrafficPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TrafficDataModule")
        private java.util.List < TrafficDataModule> trafficDataModule;

        private TrafficPerInterval(Builder builder) {
            this.trafficDataModule = builder.trafficDataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficPerInterval create() {
            return builder().build();
        }

        /**
         * @return trafficDataModule
         */
        public java.util.List < TrafficDataModule> getTrafficDataModule() {
            return this.trafficDataModule;
        }

        public static final class Builder {
            private java.util.List < TrafficDataModule> trafficDataModule; 

            /**
             * TrafficDataModule.
             */
            public Builder trafficDataModule(java.util.List < TrafficDataModule> trafficDataModule) {
                this.trafficDataModule = trafficDataModule;
                return this;
            }

            public TrafficPerInterval build() {
                return new TrafficPerInterval(this);
            } 

        } 

    }
}

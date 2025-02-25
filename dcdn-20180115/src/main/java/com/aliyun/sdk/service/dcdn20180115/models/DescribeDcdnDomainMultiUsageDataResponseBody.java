// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainMultiUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainMultiUsageDataResponseBody</p>
 */
public class DescribeDcdnDomainMultiUsageDataResponseBody extends TeaModel {
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

    private DescribeDcdnDomainMultiUsageDataResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.requestPerInterval = builder.requestPerInterval;
        this.startTime = builder.startTime;
        this.trafficPerInterval = builder.trafficPerInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainMultiUsageDataResponseBody create() {
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
         * <p>The end of the time range that was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T21:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3C6CCEC4-6B88-4D4A-93E4-D47B3D92CF8F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about requests collected every 5 minutes.</p>
         */
        public Builder requestPerInterval(RequestPerInterval requestPerInterval) {
            this.requestPerInterval = requestPerInterval;
            return this;
        }

        /**
         * <p>The beginning of the time range that was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T20:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The statistics of network traffic collected every 5 minutes.</p>
         */
        public Builder trafficPerInterval(TrafficPerInterval trafficPerInterval) {
            this.trafficPerInterval = trafficPerInterval;
            return this;
        }

        public DescribeDcdnDomainMultiUsageDataResponseBody build() {
            return new DescribeDcdnDomainMultiUsageDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnDomainMultiUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainMultiUsageDataResponseBody</p>
     */
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
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>1128</p>
             */
            public Builder request(Long request) {
                this.request = request;
                return this;
            }

            /**
             * <p>The timestamp of the data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-10T20:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The type of the requests. Valid values: StaticHttps, DynamicHttps, DynamicHttp, StaticQuic, and DynamicQuic.</p>
             * 
             * <strong>example:</strong>
             * <p>DynamicHttp</p>
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
    /**
     * 
     * {@link DescribeDcdnDomainMultiUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainMultiUsageDataResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeDcdnDomainMultiUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainMultiUsageDataResponseBody</p>
     */
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
             * <p>The name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * <p>The number of bits per second.</p>
             * 
             * <strong>example:</strong>
             * <p>11288111.1</p>
             */
            public Builder bps(Float bps) {
                this.bps = bps;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The timestamp of the data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-10T20:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The type of the network traffic. Valid values: Simple, IPA, and WebSocket.</p>
             * 
             * <strong>example:</strong>
             * <p>Simple</p>
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
    /**
     * 
     * {@link DescribeDcdnDomainMultiUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainMultiUsageDataResponseBody</p>
     */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainMultiUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainMultiUsageDataResponseBody</p>
 */
public class DescribeDcdnDomainMultiUsageDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RequestPerInterval")
    private RequestPerInterval requestPerInterval;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("TrafficPerInterval")
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
         * RequestPerInterval.
         */
        public Builder requestPerInterval(RequestPerInterval requestPerInterval) {
            this.requestPerInterval = requestPerInterval;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * TrafficPerInterval.
         */
        public Builder trafficPerInterval(TrafficPerInterval trafficPerInterval) {
            this.trafficPerInterval = trafficPerInterval;
            return this;
        }

        public DescribeDcdnDomainMultiUsageDataResponseBody build() {
            return new DescribeDcdnDomainMultiUsageDataResponseBody(this);
        } 

    } 

    public static class RequestDataModule extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("Request")
        private Long request;

        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("Type")
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
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Request.
             */
            public Builder request(Long request) {
                this.request = request;
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
             * Type.
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
        @NameInMap("RequestDataModule")
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
        @NameInMap("Area")
        private String area;

        @NameInMap("Bps")
        private Float bps;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("Type")
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
             * Area.
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * Bps.
             */
            public Builder bps(Float bps) {
                this.bps = bps;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
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
             * Type.
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
        @NameInMap("TrafficDataModule")
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

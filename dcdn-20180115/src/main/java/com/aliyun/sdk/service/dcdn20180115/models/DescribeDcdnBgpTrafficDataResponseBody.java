// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnBgpTrafficDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnBgpTrafficDataResponseBody</p>
 */
public class DescribeDcdnBgpTrafficDataResponseBody extends TeaModel {
    @NameInMap("BgpDataInterval")
    private java.util.List < BgpDataInterval> bgpDataInterval;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeDcdnBgpTrafficDataResponseBody(Builder builder) {
        this.bgpDataInterval = builder.bgpDataInterval;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnBgpTrafficDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return bgpDataInterval
     */
    public java.util.List < BgpDataInterval> getBgpDataInterval() {
        return this.bgpDataInterval;
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
        private java.util.List < BgpDataInterval> bgpDataInterval; 
        private String endTime; 
        private String requestId; 
        private String startTime; 

        /**
         * The BGP traffic at each time interval.
         */
        public Builder bgpDataInterval(java.util.List < BgpDataInterval> bgpDataInterval) {
            this.bgpDataInterval = bgpDataInterval;
            return this;
        }

        /**
         * The end of the time range during which data was queried.
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
         * The start of the time range during which data was queried.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDcdnBgpTrafficDataResponseBody build() {
            return new DescribeDcdnBgpTrafficDataResponseBody(this);
        } 

    } 

    public static class BgpDataInterval extends TeaModel {
        @NameInMap("In")
        private Long in;

        @NameInMap("Out")
        private Long out;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private BgpDataInterval(Builder builder) {
            this.in = builder.in;
            this.out = builder.out;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BgpDataInterval create() {
            return builder().build();
        }

        /**
         * @return in
         */
        public Long getIn() {
            return this.in;
        }

        /**
         * @return out
         */
        public Long getOut() {
            return this.out;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Long in; 
            private Long out; 
            private String timeStamp; 

            /**
             * The inbound traffic. Unit: bytes.
             */
            public Builder in(Long in) {
                this.in = in;
                return this;
            }

            /**
             * The outbound traffic. Unit: bytes.
             */
            public Builder out(Long out) {
                this.out = out;
                return this;
            }

            /**
             * The timestamp of the data returned.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public BgpDataInterval build() {
                return new BgpDataInterval(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnBgpTrafficDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnBgpTrafficDataResponseBody</p>
 */
public class DescribeDcdnBgpTrafficDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BgpDataInterval")
    private java.util.List < BgpDataInterval> bgpDataInterval;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
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
         * <p>The BGP traffic at each time interval.</p>
         */
        public Builder bgpDataInterval(java.util.List < BgpDataInterval> bgpDataInterval) {
            this.bgpDataInterval = bgpDataInterval;
            return this;
        }

        /**
         * <p>The end of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-11-30T00:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E9D3257A-1B7C-414C-90C1-8D07AC47BCAC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-11-29T00:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDcdnBgpTrafficDataResponseBody build() {
            return new DescribeDcdnBgpTrafficDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnBgpTrafficDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnBgpTrafficDataResponseBody</p>
     */
    public static class BgpDataInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("In")
        private Long in;

        @com.aliyun.core.annotation.NameInMap("Out")
        private Long out;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
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
             * <p>The inbound traffic. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>318</p>
             */
            public Builder in(Long in) {
                this.in = in;
                return this;
            }

            /**
             * <p>The outbound traffic. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>183</p>
             */
            public Builder out(Long out) {
                this.out = out;
                return this;
            }

            /**
             * <p>The timestamp of the data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-11-29T20:00:00Z</p>
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

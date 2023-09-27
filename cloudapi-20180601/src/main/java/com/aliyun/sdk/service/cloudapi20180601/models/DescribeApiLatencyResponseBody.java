// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiLatencyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiLatencyResponseBody</p>
 */
public class DescribeApiLatencyResponseBody extends TeaModel {
    @NameInMap("Latencys")
    private Latencys latencys;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeApiLatencyResponseBody(Builder builder) {
        this.latencys = builder.latencys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiLatencyResponseBody create() {
        return builder().build();
    }

    /**
     * @return latencys
     */
    public Latencys getLatencys() {
        return this.latencys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Latencys latencys; 
        private String requestId; 

        /**
         * Latencys.
         */
        public Builder latencys(Latencys latencys) {
            this.latencys = latencys;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApiLatencyResponseBody build() {
            return new DescribeApiLatencyResponseBody(this);
        } 

    } 

    public static class Latency extends TeaModel {
        @NameInMap("Time")
        private String time;

        @NameInMap("Value")
        private String value;

        private Latency(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Latency create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String time; 
            private String value; 

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Latency build() {
                return new Latency(this);
            } 

        } 

    }
    public static class Latencys extends TeaModel {
        @NameInMap("Latency")
        private java.util.List < Latency> latency;

        private Latencys(Builder builder) {
            this.latency = builder.latency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Latencys create() {
            return builder().build();
        }

        /**
         * @return latency
         */
        public java.util.List < Latency> getLatency() {
            return this.latency;
        }

        public static final class Builder {
            private java.util.List < Latency> latency; 

            /**
             * Latency.
             */
            public Builder latency(java.util.List < Latency> latency) {
                this.latency = latency;
                return this;
            }

            public Latencys build() {
                return new Latencys(this);
            } 

        } 

    }
}

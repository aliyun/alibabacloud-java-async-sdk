// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterIceMediaConvertUHDUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeterIceMediaConvertUHDUsageResponseBody</p>
 */
public class DescribeMeterIceMediaConvertUHDUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMeterIceMediaConvertUHDUsageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterIceMediaConvertUHDUsageResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMeterIceMediaConvertUHDUsageResponseBody build() {
            return new DescribeMeterIceMediaConvertUHDUsageResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Duration")
        private Long duration;

        @NameInMap("Specification")
        private String specification;

        @NameInMap("Time")
        private Long time;

        private Data(Builder builder) {
            this.duration = builder.duration;
            this.specification = builder.specification;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return specification
         */
        public String getSpecification() {
            return this.specification;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private Long duration; 
            private String specification; 
            private Long time; 

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Specification.
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

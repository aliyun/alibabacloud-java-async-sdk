// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMeterImsMediaConvertUHDUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeterImsMediaConvertUHDUsageResponseBody</p>
 */
public class DescribeMeterImsMediaConvertUHDUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMeterImsMediaConvertUHDUsageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterImsMediaConvertUHDUsageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeMeterImsMediaConvertUHDUsageResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The usage statistics of IMS on UHD transcoding of MPS.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA98A0C-7870-15FE-B96F-8880BB600A2C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMeterImsMediaConvertUHDUsageResponseBody build() {
            return new DescribeMeterImsMediaConvertUHDUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMeterImsMediaConvertUHDUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMeterImsMediaConvertUHDUsageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Specification")
        private String specification;

        @com.aliyun.core.annotation.NameInMap("Time")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.duration = model.duration;
                this.specification = model.specification;
                this.time = model.time;
            } 

            /**
             * <p>The usage duration, in minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>308028</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The transcoding specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>SuperResolution.Standard.1080P</p>
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            /**
             * <p>The beginning time of usage. The value is a 10-digit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1656950400</p>
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

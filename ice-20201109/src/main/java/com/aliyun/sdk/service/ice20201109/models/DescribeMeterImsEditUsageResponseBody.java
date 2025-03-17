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
 * {@link DescribeMeterImsEditUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeterImsEditUsageResponseBody</p>
 */
public class DescribeMeterImsEditUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMeterImsEditUsageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterImsEditUsageResponseBody create() {
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

        private Builder(DescribeMeterImsEditUsageResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The usage statistics of IMS on VOD editing.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7F3AE2C6-5CC6-5712-BAC5-5A735A157687</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMeterImsEditUsageResponseBody build() {
            return new DescribeMeterImsEditUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMeterImsEditUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMeterImsEditUsageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        private Data(Builder builder) {
            this.duration = builder.duration;
            this.profile = builder.profile;
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
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private Long duration; 
            private String profile; 
            private Long time; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.duration = model.duration;
                this.profile = model.profile;
                this.time = model.time;
            } 

            /**
             * <p>The usage duration, in minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>1.23</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The video profile.</p>
             * 
             * <strong>example:</strong>
             * <p>1080P</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
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

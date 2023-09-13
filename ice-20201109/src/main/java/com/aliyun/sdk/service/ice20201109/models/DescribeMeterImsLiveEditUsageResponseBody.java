// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterImsLiveEditUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeterImsLiveEditUsageResponseBody</p>
 */
public class DescribeMeterImsLiveEditUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMeterImsLiveEditUsageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterImsLiveEditUsageResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMeterImsLiveEditUsageResponseBody build() {
            return new DescribeMeterImsLiveEditUsageResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Duration")
        private Long duration;

        @NameInMap("Profile")
        private String profile;

        @NameInMap("Time")
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

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Profile.
             */
            public Builder profile(String profile) {
                this.profile = profile;
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

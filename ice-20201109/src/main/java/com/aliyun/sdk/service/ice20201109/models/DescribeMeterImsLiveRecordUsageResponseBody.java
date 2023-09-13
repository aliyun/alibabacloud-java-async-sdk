// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterImsLiveRecordUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeterImsLiveRecordUsageResponseBody</p>
 */
public class DescribeMeterImsLiveRecordUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMeterImsLiveRecordUsageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterImsLiveRecordUsageResponseBody create() {
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

        public DescribeMeterImsLiveRecordUsageResponseBody build() {
            return new DescribeMeterImsLiveRecordUsageResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Channels")
        private Double channels;

        @NameInMap("Duration")
        private Long duration;

        @NameInMap("Time")
        private Long time;

        @NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.channels = builder.channels;
            this.duration = builder.duration;
            this.time = builder.time;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return channels
         */
        public Double getChannels() {
            return this.channels;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Double channels; 
            private Long duration; 
            private Long time; 
            private String type; 

            /**
             * Channels.
             */
            public Builder channels(Double channels) {
                this.channels = channels;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

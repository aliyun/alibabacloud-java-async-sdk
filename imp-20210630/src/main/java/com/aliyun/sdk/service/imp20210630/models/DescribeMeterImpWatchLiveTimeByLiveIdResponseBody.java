// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterImpWatchLiveTimeByLiveIdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeterImpWatchLiveTimeByLiveIdResponseBody</p>
 */
public class DescribeMeterImpWatchLiveTimeByLiveIdResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMeterImpWatchLiveTimeByLiveIdResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterImpWatchLiveTimeByLiveIdResponseBody create() {
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

        public DescribeMeterImpWatchLiveTimeByLiveIdResponseBody build() {
            return new DescribeMeterImpWatchLiveTimeByLiveIdResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("WatchTimeInLatency")
        private Long watchTimeInLatency;

        @NameInMap("WatchTimeInLowLatency")
        private Long watchTimeInLowLatency;

        private Data(Builder builder) {
            this.watchTimeInLatency = builder.watchTimeInLatency;
            this.watchTimeInLowLatency = builder.watchTimeInLowLatency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return watchTimeInLatency
         */
        public Long getWatchTimeInLatency() {
            return this.watchTimeInLatency;
        }

        /**
         * @return watchTimeInLowLatency
         */
        public Long getWatchTimeInLowLatency() {
            return this.watchTimeInLowLatency;
        }

        public static final class Builder {
            private Long watchTimeInLatency; 
            private Long watchTimeInLowLatency; 

            /**
             * WatchTimeInLatency.
             */
            public Builder watchTimeInLatency(Long watchTimeInLatency) {
                this.watchTimeInLatency = watchTimeInLatency;
                return this;
            }

            /**
             * WatchTimeInLowLatency.
             */
            public Builder watchTimeInLowLatency(Long watchTimeInLowLatency) {
                this.watchTimeInLowLatency = watchTimeInLowLatency;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

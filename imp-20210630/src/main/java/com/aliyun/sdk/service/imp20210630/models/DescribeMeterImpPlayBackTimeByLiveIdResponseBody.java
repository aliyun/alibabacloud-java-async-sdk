// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterImpPlayBackTimeByLiveIdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeterImpPlayBackTimeByLiveIdResponseBody</p>
 */
public class DescribeMeterImpPlayBackTimeByLiveIdResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMeterImpPlayBackTimeByLiveIdResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterImpPlayBackTimeByLiveIdResponseBody create() {
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

        public DescribeMeterImpPlayBackTimeByLiveIdResponseBody build() {
            return new DescribeMeterImpPlayBackTimeByLiveIdResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("WatchTime")
        private Long watchTime;

        private Data(Builder builder) {
            this.watchTime = builder.watchTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return watchTime
         */
        public Long getWatchTime() {
            return this.watchTime;
        }

        public static final class Builder {
            private Long watchTime; 

            /**
             * WatchTime.
             */
            public Builder watchTime(Long watchTime) {
                this.watchTime = watchTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

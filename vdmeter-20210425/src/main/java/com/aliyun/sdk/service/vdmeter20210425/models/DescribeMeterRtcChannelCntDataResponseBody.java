// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterRtcChannelCntDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeterRtcChannelCntDataResponseBody</p>
 */
public class DescribeMeterRtcChannelCntDataResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMeterRtcChannelCntDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterRtcChannelCntDataResponseBody create() {
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

        public DescribeMeterRtcChannelCntDataResponseBody build() {
            return new DescribeMeterRtcChannelCntDataResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ChannelCnt")
        private Long channelCnt;

        @NameInMap("Timestamp")
        private String timestamp;

        private Data(Builder builder) {
            this.channelCnt = builder.channelCnt;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return channelCnt
         */
        public Long getChannelCnt() {
            return this.channelCnt;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Long channelCnt; 
            private String timestamp; 

            /**
             * ChannelCnt.
             */
            public Builder channelCnt(Long channelCnt) {
                this.channelCnt = channelCnt;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

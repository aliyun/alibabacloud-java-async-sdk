// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterRtcUserCntDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeterRtcUserCntDataResponseBody</p>
 */
public class DescribeMeterRtcUserCntDataResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMeterRtcUserCntDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterRtcUserCntDataResponseBody create() {
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

        public DescribeMeterRtcUserCntDataResponseBody build() {
            return new DescribeMeterRtcUserCntDataResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ActiveUserCnt")
        private Long activeUserCnt;

        @NameInMap("Timestamp")
        private Long timestamp;

        private Data(Builder builder) {
            this.activeUserCnt = builder.activeUserCnt;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activeUserCnt
         */
        public Long getActiveUserCnt() {
            return this.activeUserCnt;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Long activeUserCnt; 
            private Long timestamp; 

            /**
             * ActiveUserCnt.
             */
            public Builder activeUserCnt(Long activeUserCnt) {
                this.activeUserCnt = activeUserCnt;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

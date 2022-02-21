// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetadataAmountResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetadataAmountResponseBody</p>
 */
public class GetMetadataAmountResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetMetadataAmountResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetadataAmountResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
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

        public GetMetadataAmountResponseBody build() {
            return new GetMetadataAmountResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CurrentExchanges")
        private Integer currentExchanges;

        @NameInMap("CurrentQueues")
        private Integer currentQueues;

        @NameInMap("CurrentVirtualHosts")
        private Integer currentVirtualHosts;

        @NameInMap("MaxExchanges")
        private Integer maxExchanges;

        @NameInMap("MaxQueues")
        private Integer maxQueues;

        @NameInMap("MaxVirtualHosts")
        private Integer maxVirtualHosts;

        private Data(Builder builder) {
            this.currentExchanges = builder.currentExchanges;
            this.currentQueues = builder.currentQueues;
            this.currentVirtualHosts = builder.currentVirtualHosts;
            this.maxExchanges = builder.maxExchanges;
            this.maxQueues = builder.maxQueues;
            this.maxVirtualHosts = builder.maxVirtualHosts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentExchanges
         */
        public Integer getCurrentExchanges() {
            return this.currentExchanges;
        }

        /**
         * @return currentQueues
         */
        public Integer getCurrentQueues() {
            return this.currentQueues;
        }

        /**
         * @return currentVirtualHosts
         */
        public Integer getCurrentVirtualHosts() {
            return this.currentVirtualHosts;
        }

        /**
         * @return maxExchanges
         */
        public Integer getMaxExchanges() {
            return this.maxExchanges;
        }

        /**
         * @return maxQueues
         */
        public Integer getMaxQueues() {
            return this.maxQueues;
        }

        /**
         * @return maxVirtualHosts
         */
        public Integer getMaxVirtualHosts() {
            return this.maxVirtualHosts;
        }

        public static final class Builder {
            private Integer currentExchanges; 
            private Integer currentQueues; 
            private Integer currentVirtualHosts; 
            private Integer maxExchanges; 
            private Integer maxQueues; 
            private Integer maxVirtualHosts; 

            /**
             * CurrentExchanges.
             */
            public Builder currentExchanges(Integer currentExchanges) {
                this.currentExchanges = currentExchanges;
                return this;
            }

            /**
             * CurrentQueues.
             */
            public Builder currentQueues(Integer currentQueues) {
                this.currentQueues = currentQueues;
                return this;
            }

            /**
             * CurrentVirtualHosts.
             */
            public Builder currentVirtualHosts(Integer currentVirtualHosts) {
                this.currentVirtualHosts = currentVirtualHosts;
                return this;
            }

            /**
             * MaxExchanges.
             */
            public Builder maxExchanges(Integer maxExchanges) {
                this.maxExchanges = maxExchanges;
                return this;
            }

            /**
             * MaxQueues.
             */
            public Builder maxQueues(Integer maxQueues) {
                this.maxQueues = maxQueues;
                return this;
            }

            /**
             * MaxVirtualHosts.
             */
            public Builder maxVirtualHosts(Integer maxVirtualHosts) {
                this.maxVirtualHosts = maxVirtualHosts;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

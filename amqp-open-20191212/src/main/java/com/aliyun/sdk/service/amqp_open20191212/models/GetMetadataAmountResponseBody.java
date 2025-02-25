// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

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
 * {@link GetMetadataAmountResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetadataAmountResponseBody</p>
 */
public class GetMetadataAmountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B75ACF23-2BEB-44AC-A0B6-AE14EDCA***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMetadataAmountResponseBody build() {
            return new GetMetadataAmountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMetadataAmountResponseBody} extends {@link TeaModel}
     *
     * <p>GetMetadataAmountResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentExchanges")
        private Integer currentExchanges;

        @com.aliyun.core.annotation.NameInMap("CurrentQueues")
        private Integer currentQueues;

        @com.aliyun.core.annotation.NameInMap("CurrentVirtualHosts")
        private Integer currentVirtualHosts;

        @com.aliyun.core.annotation.NameInMap("MaxExchanges")
        private Integer maxExchanges;

        @com.aliyun.core.annotation.NameInMap("MaxQueues")
        private Integer maxQueues;

        @com.aliyun.core.annotation.NameInMap("MaxVirtualHosts")
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
             * <p>The number of created exchanges on the ApsaraMQ for RabbitMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder currentExchanges(Integer currentExchanges) {
                this.currentExchanges = currentExchanges;
                return this;
            }

            /**
             * <p>The number of created queues on the ApsaraMQ for RabbitMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentQueues(Integer currentQueues) {
                this.currentQueues = currentQueues;
                return this;
            }

            /**
             * <p>The number of created vhosts on the ApsaraMQ for RabbitMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentVirtualHosts(Integer currentVirtualHosts) {
                this.currentVirtualHosts = currentVirtualHosts;
                return this;
            }

            /**
             * <p>The maximum number of exchanges that can be created on the ApsaraMQ for RabbitMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder maxExchanges(Integer maxExchanges) {
                this.maxExchanges = maxExchanges;
                return this;
            }

            /**
             * <p>The maximum number of queues that can be created on the ApsaraMQ for RabbitMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder maxQueues(Integer maxQueues) {
                this.maxQueues = maxQueues;
                return this;
            }

            /**
             * <p>The maximum number of vhosts that can be created on the ApsaraMQ for RabbitMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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

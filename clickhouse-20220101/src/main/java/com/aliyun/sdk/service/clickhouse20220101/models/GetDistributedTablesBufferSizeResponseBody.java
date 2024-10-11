// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDistributedTablesBufferSizeResponseBody} extends {@link TeaModel}
 *
 * <p>GetDistributedTablesBufferSizeResponseBody</p>
 */
public class GetDistributedTablesBufferSizeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDistributedTablesBufferSizeResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDistributedTablesBufferSizeResponseBody create() {
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

        public GetDistributedTablesBufferSizeResponseBody build() {
            return new GetDistributedTablesBufferSizeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDistributedTablesBufferSizeResponseBody} extends {@link TeaModel}
     *
     * <p>GetDistributedTablesBufferSizeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BufferSizeGiB")
        private Integer bufferSizeGiB;

        private Data(Builder builder) {
            this.bufferSizeGiB = builder.bufferSizeGiB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bufferSizeGiB
         */
        public Integer getBufferSizeGiB() {
            return this.bufferSizeGiB;
        }

        public static final class Builder {
            private Integer bufferSizeGiB; 

            /**
             * BufferSizeGiB.
             */
            public Builder bufferSizeGiB(Integer bufferSizeGiB) {
                this.bufferSizeGiB = bufferSizeGiB;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

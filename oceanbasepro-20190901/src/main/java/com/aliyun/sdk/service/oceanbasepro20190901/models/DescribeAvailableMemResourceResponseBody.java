// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableMemResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableMemResourceResponseBody</p>
 */
public class DescribeAvailableMemResourceResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAvailableMemResourceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableMemResourceResponseBody create() {
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
         * 可用的内存资源信息。
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAvailableMemResourceResponseBody build() {
            return new DescribeAvailableMemResourceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("MaxMem")
        private Long maxMem;

        @NameInMap("MinMem")
        private Long minMem;

        @NameInMap("UsedMem")
        private Long usedMem;

        private Data(Builder builder) {
            this.maxMem = builder.maxMem;
            this.minMem = builder.minMem;
            this.usedMem = builder.usedMem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return maxMem
         */
        public Long getMaxMem() {
            return this.maxMem;
        }

        /**
         * @return minMem
         */
        public Long getMinMem() {
            return this.minMem;
        }

        /**
         * @return usedMem
         */
        public Long getUsedMem() {
            return this.usedMem;
        }

        public static final class Builder {
            private Long maxMem; 
            private Long minMem; 
            private Long usedMem; 

            /**
             * 单个unit最大可申请的内存大小，单位：GB。
             */
            public Builder maxMem(Long maxMem) {
                this.maxMem = maxMem;
                return this;
            }

            /**
             * 单个unit最小需要申请的内存大小，单位：GB。
             */
            public Builder minMem(Long minMem) {
                this.minMem = minMem;
                return this;
            }

            /**
             * 租户的unit个数。
             */
            public Builder usedMem(Long usedMem) {
                this.usedMem = usedMem;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

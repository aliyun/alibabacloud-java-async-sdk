// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableMemResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableMemResourceResponseBody</p>
 */
public class DescribeAvailableMemResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The available memory size.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
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
        @com.aliyun.core.annotation.NameInMap("MaxMem")
        private Long maxMem;

        @com.aliyun.core.annotation.NameInMap("MinMem")
        private Long minMem;

        @com.aliyun.core.annotation.NameInMap("SafeMem")
        private String safeMem;

        @com.aliyun.core.annotation.NameInMap("UsedMem")
        private Long usedMem;

        private Data(Builder builder) {
            this.maxMem = builder.maxMem;
            this.minMem = builder.minMem;
            this.safeMem = builder.safeMem;
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
         * @return safeMem
         */
        public String getSafeMem() {
            return this.safeMem;
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
            private String safeMem; 
            private Long usedMem; 

            /**
             * The maximum memory size for each resource unit, in GB.
             */
            public Builder maxMem(Long maxMem) {
                this.maxMem = maxMem;
                return this;
            }

            /**
             * The minimum memory size required for each resource unit, in GB.
             */
            public Builder minMem(Long minMem) {
                this.minMem = minMem;
                return this;
            }

            /**
             * The maximum allowed memory usage, in GB.
             */
            public Builder safeMem(String safeMem) {
                this.safeMem = safeMem;
                return this;
            }

            /**
             * The number of resource units in the tenant.
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

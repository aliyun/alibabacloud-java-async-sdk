// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAvailableMemResourceResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The available memory size.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAvailableMemResourceResponseBody build() {
            return new DescribeAvailableMemResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAvailableMemResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableMemResourceResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.maxMem = model.maxMem;
                this.minMem = model.minMem;
                this.safeMem = model.safeMem;
                this.usedMem = model.usedMem;
            } 

            /**
             * <p>The maximum memory size for each resource unit, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxMem(Long maxMem) {
                this.maxMem = maxMem;
                return this;
            }

            /**
             * <p>The minimum memory size required for each resource unit, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder minMem(Long minMem) {
                this.minMem = minMem;
                return this;
            }

            /**
             * <p>The maximum allowed memory usage, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0</p>
             */
            public Builder safeMem(String safeMem) {
                this.safeMem = safeMem;
                return this;
            }

            /**
             * <p>The number of resource units in the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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

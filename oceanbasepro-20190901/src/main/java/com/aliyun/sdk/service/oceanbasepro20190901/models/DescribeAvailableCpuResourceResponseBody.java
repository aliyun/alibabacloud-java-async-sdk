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
 * {@link DescribeAvailableCpuResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableCpuResourceResponseBody</p>
 */
public class DescribeAvailableCpuResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAvailableCpuResourceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableCpuResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAvailableCpuResourceResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
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

        public DescribeAvailableCpuResourceResponseBody build() {
            return new DescribeAvailableCpuResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAvailableCpuResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableCpuResourceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("MaxCpu")
        private Long maxCpu;

        @com.aliyun.core.annotation.NameInMap("MinCpu")
        private Long minCpu;

        @com.aliyun.core.annotation.NameInMap("ReviewCode")
        private String reviewCode;

        @com.aliyun.core.annotation.NameInMap("UnitNum")
        private Long unitNum;

        private Data(Builder builder) {
            this.comment = builder.comment;
            this.maxCpu = builder.maxCpu;
            this.minCpu = builder.minCpu;
            this.reviewCode = builder.reviewCode;
            this.unitNum = builder.unitNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return maxCpu
         */
        public Long getMaxCpu() {
            return this.maxCpu;
        }

        /**
         * @return minCpu
         */
        public Long getMinCpu() {
            return this.minCpu;
        }

        /**
         * @return reviewCode
         */
        public String getReviewCode() {
            return this.reviewCode;
        }

        /**
         * @return unitNum
         */
        public Long getUnitNum() {
            return this.unitNum;
        }

        public static final class Builder {
            private String comment; 
            private Long maxCpu; 
            private Long minCpu; 
            private String reviewCode; 
            private Long unitNum; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.comment = model.comment;
                this.maxCpu = model.maxCpu;
                this.minCpu = model.minCpu;
                this.reviewCode = model.reviewCode;
                this.unitNum = model.unitNum;
            } 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * MaxCpu.
             */
            public Builder maxCpu(Long maxCpu) {
                this.maxCpu = maxCpu;
                return this;
            }

            /**
             * MinCpu.
             */
            public Builder minCpu(Long minCpu) {
                this.minCpu = minCpu;
                return this;
            }

            /**
             * ReviewCode.
             */
            public Builder reviewCode(String reviewCode) {
                this.reviewCode = reviewCode;
                return this;
            }

            /**
             * UnitNum.
             */
            public Builder unitNum(Long unitNum) {
                this.unitNum = unitNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

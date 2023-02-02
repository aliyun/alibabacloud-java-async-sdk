// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableCpuResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableCpuResourceResponseBody</p>
 */
public class DescribeAvailableCpuResourceResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
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
         * The CPU resources available.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAvailableCpuResourceResponseBody build() {
            return new DescribeAvailableCpuResourceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("MaxCpu")
        private Long maxCpu;

        @NameInMap("MinCpu")
        private Long minCpu;

        @NameInMap("UnitNum")
        private Long unitNum;

        private Data(Builder builder) {
            this.maxCpu = builder.maxCpu;
            this.minCpu = builder.minCpu;
            this.unitNum = builder.unitNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return unitNum
         */
        public Long getUnitNum() {
            return this.unitNum;
        }

        public static final class Builder {
            private Long maxCpu; 
            private Long minCpu; 
            private Long unitNum; 

            /**
             * The maximum number of CPU cores per resource unit.
             */
            public Builder maxCpu(Long maxCpu) {
                this.maxCpu = maxCpu;
                return this;
            }

            /**
             * The minimum number of CPU cores per resource unit.
             */
            public Builder minCpu(Long minCpu) {
                this.minCpu = minCpu;
                return this;
            }

            /**
             * The number of resource units in the tenant.
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

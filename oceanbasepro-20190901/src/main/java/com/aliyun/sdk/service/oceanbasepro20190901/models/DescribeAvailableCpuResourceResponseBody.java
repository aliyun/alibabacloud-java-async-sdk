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
         * 可用的CPU资源信息。
         */
        public Builder data(java.util.List < Data> data) {
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
             * 单个unit最大可申请的CPU核数。
             */
            public Builder maxCpu(Long maxCpu) {
                this.maxCpu = maxCpu;
                return this;
            }

            /**
             * 单个unit最小需要申请的CPU核数。
             */
            public Builder minCpu(Long minCpu) {
                this.minCpu = minCpu;
                return this;
            }

            /**
             * 租户的unit个数。
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

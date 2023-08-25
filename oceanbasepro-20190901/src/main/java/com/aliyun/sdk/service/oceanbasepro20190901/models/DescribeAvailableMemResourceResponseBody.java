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
         * ```
         * <p>
         * http(s)://[Endpoint]/?Action=DescribeAvailableMemResource
         * &InstanceId=ob317v4uif****
         * &TenantId=ob2mr3oae0****
         * &UnitNum=2
         * &CpuNum=14
         * &Common request parameters
         * ```
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The number of CPU cores.
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
             * MaxMem.
             */
            public Builder maxMem(Long maxMem) {
                this.maxMem = maxMem;
                return this;
            }

            /**
             * You can call this operation to query the available memory resource of an OceanBase Database tenant.
             */
            public Builder minMem(Long minMem) {
                this.minMem = minMem;
                return this;
            }

            /**
             * UsedMem.
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

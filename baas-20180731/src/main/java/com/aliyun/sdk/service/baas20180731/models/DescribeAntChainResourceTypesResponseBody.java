// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainResourceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainResourceTypesResponseBody</p>
 */
public class DescribeAntChainResourceTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    private DescribeAntChainResourceTypesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainResourceTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public DescribeAntChainResourceTypesResponseBody build() {
            return new DescribeAntChainResourceTypesResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("Disk")
        private Integer disk;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("TypeId")
        private Integer typeId;

        private Result(Builder builder) {
            this.cpu = builder.cpu;
            this.disk = builder.disk;
            this.memory = builder.memory;
            this.typeId = builder.typeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return disk
         */
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return typeId
         */
        public Integer getTypeId() {
            return this.typeId;
        }

        public static final class Builder {
            private Integer cpu; 
            private Integer disk; 
            private Integer memory; 
            private Integer typeId; 

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Disk.
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * TypeId.
             */
            public Builder typeId(Integer typeId) {
                this.typeId = typeId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}

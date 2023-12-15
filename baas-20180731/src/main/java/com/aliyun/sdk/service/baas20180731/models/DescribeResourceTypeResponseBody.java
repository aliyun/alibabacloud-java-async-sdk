// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceTypeResponseBody</p>
 */
public class DescribeResourceTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private DescribeResourceTypeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceTypeResponseBody create() {
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

        public DescribeResourceTypeResponseBody build() {
            return new DescribeResourceTypeResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("Disk")
        private Integer disk;

        @NameInMap("Memory")
        private Integer memory;

        @NameInMap("TypeId")
        private Integer typeId;

        @NameInMap("TypeName")
        private String typeName;

        private Result(Builder builder) {
            this.cpu = builder.cpu;
            this.disk = builder.disk;
            this.memory = builder.memory;
            this.typeId = builder.typeId;
            this.typeName = builder.typeName;
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

        /**
         * @return typeName
         */
        public String getTypeName() {
            return this.typeName;
        }

        public static final class Builder {
            private Integer cpu; 
            private Integer disk; 
            private Integer memory; 
            private Integer typeId; 
            private String typeName; 

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

            /**
             * TypeName.
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}

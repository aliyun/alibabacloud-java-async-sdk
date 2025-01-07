// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link GetLdpsNamespacedQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetLdpsNamespacedQuotaResponseBody</p>
 */
public class GetLdpsNamespacedQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NamespacedQuotas")
    private java.util.List<NamespacedQuotas> namespacedQuotas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetLdpsNamespacedQuotaResponseBody(Builder builder) {
        this.namespacedQuotas = builder.namespacedQuotas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLdpsNamespacedQuotaResponseBody create() {
        return builder().build();
    }

    /**
     * @return namespacedQuotas
     */
    public java.util.List<NamespacedQuotas> getNamespacedQuotas() {
        return this.namespacedQuotas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<NamespacedQuotas> namespacedQuotas; 
        private String requestId; 

        /**
         * NamespacedQuotas.
         */
        public Builder namespacedQuotas(java.util.List<NamespacedQuotas> namespacedQuotas) {
            this.namespacedQuotas = namespacedQuotas;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLdpsNamespacedQuotaResponseBody build() {
            return new GetLdpsNamespacedQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLdpsNamespacedQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetLdpsNamespacedQuotaResponseBody</p>
     */
    public static class NamespacedQuotas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuAmount")
        private String cpuAmount;

        @com.aliyun.core.annotation.NameInMap("MemoryAmount")
        private String memoryAmount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UsedCpu")
        private String usedCpu;

        @com.aliyun.core.annotation.NameInMap("UsedMemory")
        private String usedMemory;

        private NamespacedQuotas(Builder builder) {
            this.cpuAmount = builder.cpuAmount;
            this.memoryAmount = builder.memoryAmount;
            this.name = builder.name;
            this.usedCpu = builder.usedCpu;
            this.usedMemory = builder.usedMemory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NamespacedQuotas create() {
            return builder().build();
        }

        /**
         * @return cpuAmount
         */
        public String getCpuAmount() {
            return this.cpuAmount;
        }

        /**
         * @return memoryAmount
         */
        public String getMemoryAmount() {
            return this.memoryAmount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return usedCpu
         */
        public String getUsedCpu() {
            return this.usedCpu;
        }

        /**
         * @return usedMemory
         */
        public String getUsedMemory() {
            return this.usedMemory;
        }

        public static final class Builder {
            private String cpuAmount; 
            private String memoryAmount; 
            private String name; 
            private String usedCpu; 
            private String usedMemory; 

            /**
             * CpuAmount.
             */
            public Builder cpuAmount(String cpuAmount) {
                this.cpuAmount = cpuAmount;
                return this;
            }

            /**
             * MemoryAmount.
             */
            public Builder memoryAmount(String memoryAmount) {
                this.memoryAmount = memoryAmount;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * UsedCpu.
             */
            public Builder usedCpu(String usedCpu) {
                this.usedCpu = usedCpu;
                return this;
            }

            /**
             * UsedMemory.
             */
            public Builder usedMemory(String usedMemory) {
                this.usedMemory = usedMemory;
                return this;
            }

            public NamespacedQuotas build() {
                return new NamespacedQuotas(this);
            } 

        } 

    }
}

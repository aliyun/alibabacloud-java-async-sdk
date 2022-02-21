// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceTypesResponseBody</p>
 */
public class DescribeInstanceTypesResponseBody extends TeaModel {
    @NameInMap("InstanceTypes")
    private java.util.List < InstanceTypes> instanceTypes;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceTypesResponseBody(Builder builder) {
        this.instanceTypes = builder.instanceTypes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceTypes
     */
    public java.util.List < InstanceTypes> getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InstanceTypes> instanceTypes; 
        private String requestId; 

        /**
         * Array of InstanceType
         */
        public Builder instanceTypes(java.util.List < InstanceTypes> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceTypesResponseBody build() {
            return new DescribeInstanceTypesResponseBody(this);
        } 

    } 

    public static class InstanceTypes extends TeaModel {
        @NameInMap("CpuCoreCount")
        private Float cpuCoreCount;

        @NameInMap("InstanceTypeDescription")
        private String instanceTypeDescription;

        @NameInMap("InstanceTypeId")
        private String instanceTypeId;

        @NameInMap("MemorySize")
        private Float memorySize;

        private InstanceTypes(Builder builder) {
            this.cpuCoreCount = builder.cpuCoreCount;
            this.instanceTypeDescription = builder.instanceTypeDescription;
            this.instanceTypeId = builder.instanceTypeId;
            this.memorySize = builder.memorySize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypes create() {
            return builder().build();
        }

        /**
         * @return cpuCoreCount
         */
        public Float getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        /**
         * @return instanceTypeDescription
         */
        public String getInstanceTypeDescription() {
            return this.instanceTypeDescription;
        }

        /**
         * @return instanceTypeId
         */
        public String getInstanceTypeId() {
            return this.instanceTypeId;
        }

        /**
         * @return memorySize
         */
        public Float getMemorySize() {
            return this.memorySize;
        }

        public static final class Builder {
            private Float cpuCoreCount; 
            private String instanceTypeDescription; 
            private String instanceTypeId; 
            private Float memorySize; 

            /**
             * CpuCoreCount.
             */
            public Builder cpuCoreCount(Float cpuCoreCount) {
                this.cpuCoreCount = cpuCoreCount;
                return this;
            }

            /**
             * InstanceTypeDescription.
             */
            public Builder instanceTypeDescription(String instanceTypeDescription) {
                this.instanceTypeDescription = instanceTypeDescription;
                return this;
            }

            /**
             * InstanceTypeId.
             */
            public Builder instanceTypeId(String instanceTypeId) {
                this.instanceTypeId = instanceTypeId;
                return this;
            }

            /**
             * MemorySize.
             */
            public Builder memorySize(Float memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            public InstanceTypes build() {
                return new InstanceTypes(this);
            } 

        } 

    }
}

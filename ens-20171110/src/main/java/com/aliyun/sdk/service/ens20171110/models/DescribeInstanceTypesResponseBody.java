// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
    @NameInMap("Code")
    private Integer code;

    @NameInMap("InstanceTypes")
    private InstanceTypes instanceTypes;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceTypesResponseBody(Builder builder) {
        this.code = builder.code;
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
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return instanceTypes
     */
    public InstanceTypes getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private InstanceTypes instanceTypes; 
        private String requestId; 

        /**
         * The status code. If the request is successful, 0 is returned. If the request fails, a non-zero error code is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Details about the instance types.
         */
        public Builder instanceTypes(InstanceTypes instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceTypesResponseBody build() {
            return new DescribeInstanceTypesResponseBody(this);
        } 

    } 

    public static class InstanceType extends TeaModel {
        @NameInMap("CpuCoreCount")
        private Integer cpuCoreCount;

        @NameInMap("InstanceTypeId")
        private String instanceTypeId;

        @NameInMap("InstanceTypeName")
        private String instanceTypeName;

        @NameInMap("MemorySize")
        private Integer memorySize;

        private InstanceType(Builder builder) {
            this.cpuCoreCount = builder.cpuCoreCount;
            this.instanceTypeId = builder.instanceTypeId;
            this.instanceTypeName = builder.instanceTypeName;
            this.memorySize = builder.memorySize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceType create() {
            return builder().build();
        }

        /**
         * @return cpuCoreCount
         */
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        /**
         * @return instanceTypeId
         */
        public String getInstanceTypeId() {
            return this.instanceTypeId;
        }

        /**
         * @return instanceTypeName
         */
        public String getInstanceTypeName() {
            return this.instanceTypeName;
        }

        /**
         * @return memorySize
         */
        public Integer getMemorySize() {
            return this.memorySize;
        }

        public static final class Builder {
            private Integer cpuCoreCount; 
            private String instanceTypeId; 
            private String instanceTypeName; 
            private Integer memorySize; 

            /**
             * The number of vCPUs.
             */
            public Builder cpuCoreCount(Integer cpuCoreCount) {
                this.cpuCoreCount = cpuCoreCount;
                return this;
            }

            /**
             * This parameter is unavailable.
             */
            public Builder instanceTypeId(String instanceTypeId) {
                this.instanceTypeId = instanceTypeId;
                return this;
            }

            /**
             * The name of the instance type.
             */
            public Builder instanceTypeName(String instanceTypeName) {
                this.instanceTypeName = instanceTypeName;
                return this;
            }

            /**
             * The memory size. Unit: MB.
             */
            public Builder memorySize(Integer memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            public InstanceType build() {
                return new InstanceType(this);
            } 

        } 

    }
    public static class InstanceTypes extends TeaModel {
        @NameInMap("InstanceType")
        private java.util.List < InstanceType> instanceType;

        private InstanceTypes(Builder builder) {
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypes create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public java.util.List < InstanceType> getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private java.util.List < InstanceType> instanceType; 

            /**
             * InstanceType.
             */
            public Builder instanceType(java.util.List < InstanceType> instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public InstanceTypes build() {
                return new InstanceTypes(this);
            } 

        } 

    }
}

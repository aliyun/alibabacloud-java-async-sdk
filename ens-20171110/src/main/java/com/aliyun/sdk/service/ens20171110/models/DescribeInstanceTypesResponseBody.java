// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeInstanceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceTypesResponseBody</p>
 */
public class DescribeInstanceTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    private InstanceTypes instanceTypes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The status code. If the request is successful, 0 is returned. If the request fails, a non-zero error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Details about the instance types.</p>
         */
        public Builder instanceTypes(InstanceTypes instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D452D190-BADF-5D09-910D-599B96D42AAA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceTypesResponseBody build() {
            return new DescribeInstanceTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTypesResponseBody</p>
     */
    public static class InstanceType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuCoreCount")
        private Integer cpuCoreCount;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeId")
        private String instanceTypeId;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeName")
        private String instanceTypeName;

        @com.aliyun.core.annotation.NameInMap("MemorySize")
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
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpuCoreCount(Integer cpuCoreCount) {
                this.cpuCoreCount = cpuCoreCount;
                return this;
            }

            /**
             * <p>This parameter is unavailable.</p>
             * 
             * <strong>example:</strong>
             * <p>This parameter is not needed temporarily.</p>
             */
            public Builder instanceTypeId(String instanceTypeId) {
                this.instanceTypeId = instanceTypeId;
                return this;
            }

            /**
             * <p>The name of the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ens.xxx.small</p>
             */
            public Builder instanceTypeName(String instanceTypeName) {
                this.instanceTypeName = instanceTypeName;
                return this;
            }

            /**
             * <p>The memory size. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
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
    /**
     * 
     * {@link DescribeInstanceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTypesResponseBody</p>
     */
    public static class InstanceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private java.util.List<InstanceType> instanceType;

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
        public java.util.List<InstanceType> getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private java.util.List<InstanceType> instanceType; 

            /**
             * InstanceType.
             */
            public Builder instanceType(java.util.List<InstanceType> instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public InstanceTypes build() {
                return new InstanceTypes(this);
            } 

        } 

    }
}

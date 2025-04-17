// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCInstanceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCInstanceTypesResponseBody</p>
 */
public class DescribeRCInstanceTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    private InstanceTypes instanceTypes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRCInstanceTypesResponseBody(Builder builder) {
        this.instanceTypes = builder.instanceTypes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCInstanceTypesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private InstanceTypes instanceTypes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRCInstanceTypesResponseBody model) {
            this.instanceTypes = model.instanceTypes;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the instance types.</p>
         */
        public Builder instanceTypes(InstanceTypes instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F2911788-25E8-42E5-A3A3-1B38D263F01E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRCInstanceTypesResponseBody build() {
            return new DescribeRCInstanceTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRCInstanceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceTypesResponseBody</p>
     */
    public static class InstanceType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuCoreCount")
        private Integer cpuCoreCount;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeId")
        private String instanceTypeId;

        @com.aliyun.core.annotation.NameInMap("MemorySize")
        private Integer memorySize;

        private InstanceType(Builder builder) {
            this.cpuCoreCount = builder.cpuCoreCount;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.instanceTypeId = builder.instanceTypeId;
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
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
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
        public Integer getMemorySize() {
            return this.memorySize;
        }

        public static final class Builder {
            private Integer cpuCoreCount; 
            private String instanceTypeFamily; 
            private String instanceTypeId; 
            private Integer memorySize; 

            private Builder() {
            } 

            private Builder(InstanceType model) {
                this.cpuCoreCount = model.cpuCoreCount;
                this.instanceTypeFamily = model.instanceTypeFamily;
                this.instanceTypeId = model.instanceTypeId;
                this.memorySize = model.memorySize;
            } 

            /**
             * <p>The maximum number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder cpuCoreCount(Integer cpuCoreCount) {
                this.cpuCoreCount = cpuCoreCount;
                return this;
            }

            /**
             * <p>The ID of the instance family.</p>
             * 
             * <strong>example:</strong>
             * <p>gn8.cm</p>
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * <p>The instance type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rds.gna8.2xlarge.8cm</p>
             */
            public Builder instanceTypeId(String instanceTypeId) {
                this.instanceTypeId = instanceTypeId;
                return this;
            }

            /**
             * <p>The memory size of the instance type. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>256</p>
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
     * {@link DescribeRCInstanceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceTypesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(InstanceTypes model) {
                this.instanceType = model.instanceType;
            } 

            /**
             * <p>The instance types.</p>
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

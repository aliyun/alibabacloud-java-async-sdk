// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link DescribeInstanceTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceTypeResponseBody</p>
 */
public class DescribeInstanceTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceTypeSpecList")
    private InstanceTypeSpecList instanceTypeSpecList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceTypeResponseBody(Builder builder) {
        this.instanceTypeSpecList = builder.instanceTypeSpecList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceTypeSpecList
     */
    public InstanceTypeSpecList getInstanceTypeSpecList() {
        return this.instanceTypeSpecList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceTypeSpecList instanceTypeSpecList; 
        private String requestId; 

        /**
         * InstanceTypeSpecList.
         */
        public Builder instanceTypeSpecList(InstanceTypeSpecList instanceTypeSpecList) {
            this.instanceTypeSpecList = instanceTypeSpecList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceTypeResponseBody build() {
            return new DescribeInstanceTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTypeResponseBody</p>
     */
    public static class InstanceTypeSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuSize")
        private Long cpuSize;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("MemSize")
        private Long memSize;

        private InstanceTypeSpec(Builder builder) {
            this.cpuSize = builder.cpuSize;
            this.instanceType = builder.instanceType;
            this.memSize = builder.memSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeSpec create() {
            return builder().build();
        }

        /**
         * @return cpuSize
         */
        public Long getCpuSize() {
            return this.cpuSize;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return memSize
         */
        public Long getMemSize() {
            return this.memSize;
        }

        public static final class Builder {
            private Long cpuSize; 
            private String instanceType; 
            private Long memSize; 

            /**
             * CpuSize.
             */
            public Builder cpuSize(Long cpuSize) {
                this.cpuSize = cpuSize;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * MemSize.
             */
            public Builder memSize(Long memSize) {
                this.memSize = memSize;
                return this;
            }

            public InstanceTypeSpec build() {
                return new InstanceTypeSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTypeResponseBody</p>
     */
    public static class InstanceTypeSpecList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceTypeSpec")
        private java.util.List<InstanceTypeSpec> instanceTypeSpec;

        private InstanceTypeSpecList(Builder builder) {
            this.instanceTypeSpec = builder.instanceTypeSpec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeSpecList create() {
            return builder().build();
        }

        /**
         * @return instanceTypeSpec
         */
        public java.util.List<InstanceTypeSpec> getInstanceTypeSpec() {
            return this.instanceTypeSpec;
        }

        public static final class Builder {
            private java.util.List<InstanceTypeSpec> instanceTypeSpec; 

            /**
             * InstanceTypeSpec.
             */
            public Builder instanceTypeSpec(java.util.List<InstanceTypeSpec> instanceTypeSpec) {
                this.instanceTypeSpec = instanceTypeSpec;
                return this;
            }

            public InstanceTypeSpecList build() {
                return new InstanceTypeSpecList(this);
            } 

        } 

    }
}

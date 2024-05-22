// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceSpecResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSpecResponseBody</p>
 */
public class DescribeInstanceSpecResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BandwidthLimit")
    private Integer bandwidthLimit;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("DataDiskMaxSize")
    private Integer dataDiskMaxSize;

    @com.aliyun.core.annotation.NameInMap("DataDiskMinSize")
    private Integer dataDiskMinSize;

    @com.aliyun.core.annotation.NameInMap("InstanceSpecs")
    private InstanceSpecs instanceSpecs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SystemDiskMaxSize")
    private Integer systemDiskMaxSize;

    private DescribeInstanceSpecResponseBody(Builder builder) {
        this.bandwidthLimit = builder.bandwidthLimit;
        this.code = builder.code;
        this.dataDiskMaxSize = builder.dataDiskMaxSize;
        this.dataDiskMinSize = builder.dataDiskMinSize;
        this.instanceSpecs = builder.instanceSpecs;
        this.requestId = builder.requestId;
        this.systemDiskMaxSize = builder.systemDiskMaxSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceSpecResponseBody create() {
        return builder().build();
    }

    /**
     * @return bandwidthLimit
     */
    public Integer getBandwidthLimit() {
        return this.bandwidthLimit;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return dataDiskMaxSize
     */
    public Integer getDataDiskMaxSize() {
        return this.dataDiskMaxSize;
    }

    /**
     * @return dataDiskMinSize
     */
    public Integer getDataDiskMinSize() {
        return this.dataDiskMinSize;
    }

    /**
     * @return instanceSpecs
     */
    public InstanceSpecs getInstanceSpecs() {
        return this.instanceSpecs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return systemDiskMaxSize
     */
    public Integer getSystemDiskMaxSize() {
        return this.systemDiskMaxSize;
    }

    public static final class Builder {
        private Integer bandwidthLimit; 
        private Integer code; 
        private Integer dataDiskMaxSize; 
        private Integer dataDiskMinSize; 
        private InstanceSpecs instanceSpecs; 
        private String requestId; 
        private Integer systemDiskMaxSize; 

        /**
         * The bandwidth limit for a single instance. Unit: Mbit/s.
         */
        public Builder bandwidthLimit(Integer bandwidthLimit) {
            this.bandwidthLimit = bandwidthLimit;
            return this;
        }

        /**
         * The returned service code. A value of 0 indicates that the operation was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The maximum capacity of a data disk. Unit: GB.
         */
        public Builder dataDiskMaxSize(Integer dataDiskMaxSize) {
            this.dataDiskMaxSize = dataDiskMaxSize;
            return this;
        }

        /**
         * The minimum capacity of a data disk. Unit: GB.
         */
        public Builder dataDiskMinSize(Integer dataDiskMinSize) {
            this.dataDiskMinSize = dataDiskMinSize;
            return this;
        }

        /**
         * The information about instance specifications.
         */
        public Builder instanceSpecs(InstanceSpecs instanceSpecs) {
            this.instanceSpecs = instanceSpecs;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The maximum capacity of the system disk. Unit: GiB.
         */
        public Builder systemDiskMaxSize(Integer systemDiskMaxSize) {
            this.systemDiskMaxSize = systemDiskMaxSize;
            return this;
        }

        public DescribeInstanceSpecResponseBody build() {
            return new DescribeInstanceSpecResponseBody(this);
        } 

    } 

    public static class InstanceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Core")
        private String core;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private String memory;

        private InstanceSpec(Builder builder) {
            this.core = builder.core;
            this.displayName = builder.displayName;
            this.instanceType = builder.instanceType;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSpec create() {
            return builder().build();
        }

        /**
         * @return core
         */
        public String getCore() {
            return this.core;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private String core; 
            private String displayName; 
            private String instanceType; 
            private String memory; 

            /**
             * The number of CPU cores.
             */
            public Builder core(String core) {
                this.core = core;
                return this;
            }

            /**
             * The display name of the instance type.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The type of the instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The memory size. Unit: MB.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            public InstanceSpec build() {
                return new InstanceSpec(this);
            } 

        } 

    }
    public static class InstanceSpecs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceSpec")
        private java.util.List < InstanceSpec> instanceSpec;

        private InstanceSpecs(Builder builder) {
            this.instanceSpec = builder.instanceSpec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSpecs create() {
            return builder().build();
        }

        /**
         * @return instanceSpec
         */
        public java.util.List < InstanceSpec> getInstanceSpec() {
            return this.instanceSpec;
        }

        public static final class Builder {
            private java.util.List < InstanceSpec> instanceSpec; 

            /**
             * InstanceSpec.
             */
            public Builder instanceSpec(java.util.List < InstanceSpec> instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            public InstanceSpecs build() {
                return new InstanceSpecs(this);
            } 

        } 

    }
}

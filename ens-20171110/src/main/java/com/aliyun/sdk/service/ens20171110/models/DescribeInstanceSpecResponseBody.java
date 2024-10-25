// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The bandwidth limit for a single instance. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder bandwidthLimit(Integer bandwidthLimit) {
            this.bandwidthLimit = bandwidthLimit;
            return this;
        }

        /**
         * <p>The returned service code. A value of 0 indicates that the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The maximum capacity of a data disk. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20015</p>
         */
        public Builder dataDiskMaxSize(Integer dataDiskMaxSize) {
            this.dataDiskMaxSize = dataDiskMaxSize;
            return this;
        }

        /**
         * <p>The minimum capacity of a data disk. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder dataDiskMinSize(Integer dataDiskMinSize) {
            this.dataDiskMinSize = dataDiskMinSize;
            return this;
        }

        /**
         * <p>The information about instance specifications.</p>
         */
        public Builder instanceSpecs(InstanceSpecs instanceSpecs) {
            this.instanceSpecs = instanceSpecs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1ECC937A-AE0E-4626-BE51-DED1D6D1C888</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The maximum capacity of the system disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder systemDiskMaxSize(Integer systemDiskMaxSize) {
            this.systemDiskMaxSize = systemDiskMaxSize;
            return this;
        }

        public DescribeInstanceSpecResponseBody build() {
            return new DescribeInstanceSpecResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceSpecResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceSpecResponseBody</p>
     */
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
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder core(String core) {
                this.core = core;
                return this;
            }

            /**
             * <p>The display name of the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>Computational 1C2G</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ens.sn1.stiny</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The memory size. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>2048</p>
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
    /**
     * 
     * {@link DescribeInstanceSpecResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceSpecResponseBody</p>
     */
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

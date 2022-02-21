// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceSpecResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSpecResponseBody</p>
 */
public class DescribeInstanceSpecResponseBody extends TeaModel {
    @NameInMap("BandwidthLimit")
    private Integer bandwidthLimit;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("DataDiskMaxSize")
    private Integer dataDiskMaxSize;

    @NameInMap("DataDiskMinSize")
    private Integer dataDiskMinSize;

    @NameInMap("InstanceSpecs")
    private InstanceSpecs instanceSpecs;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SystemDiskMaxSize")
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
         * BandwidthLimit.
         */
        public Builder bandwidthLimit(Integer bandwidthLimit) {
            this.bandwidthLimit = bandwidthLimit;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * DataDiskMaxSize.
         */
        public Builder dataDiskMaxSize(Integer dataDiskMaxSize) {
            this.dataDiskMaxSize = dataDiskMaxSize;
            return this;
        }

        /**
         * DataDiskMinSize.
         */
        public Builder dataDiskMinSize(Integer dataDiskMinSize) {
            this.dataDiskMinSize = dataDiskMinSize;
            return this;
        }

        /**
         * InstanceSpecs.
         */
        public Builder instanceSpecs(InstanceSpecs instanceSpecs) {
            this.instanceSpecs = instanceSpecs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SystemDiskMaxSize.
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
        @NameInMap("Core")
        private String core;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Memory")
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
             * Core.
             */
            public Builder core(String core) {
                this.core = core;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
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
             * Memory.
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
        @NameInMap("InstanceSpec")
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

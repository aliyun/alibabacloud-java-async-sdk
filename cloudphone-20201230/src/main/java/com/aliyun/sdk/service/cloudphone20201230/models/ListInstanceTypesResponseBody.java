// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceTypesResponseBody</p>
 */
public class ListInstanceTypesResponseBody extends TeaModel {
    @NameInMap("InstanceTypes")
    private InstanceTypes instanceTypes;

    @NameInMap("RequestId")
    private String requestId;

    private ListInstanceTypesResponseBody(Builder builder) {
        this.instanceTypes = builder.instanceTypes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceTypesResponseBody create() {
        return builder().build();
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

        /**
         * The instance types.
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

        public ListInstanceTypesResponseBody build() {
            return new ListInstanceTypesResponseBody(this);
        } 

    } 

    public static class Resolutions extends TeaModel {
        @NameInMap("Resolution")
        private java.util.List < String > resolution;

        private Resolutions(Builder builder) {
            this.resolution = builder.resolution;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resolutions create() {
            return builder().build();
        }

        /**
         * @return resolution
         */
        public java.util.List < String > getResolution() {
            return this.resolution;
        }

        public static final class Builder {
            private java.util.List < String > resolution; 

            /**
             * Resolution.
             */
            public Builder resolution(java.util.List < String > resolution) {
                this.resolution = resolution;
                return this;
            }

            public Resolutions build() {
                return new Resolutions(this);
            } 

        } 

    }
    public static class InstanceType extends TeaModel {
        @NameInMap("CpuCoreCount")
        private Integer cpuCoreCount;

        @NameInMap("DefaultResolution")
        private String defaultResolution;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @NameInMap("MemorySize")
        private String memorySize;

        @NameInMap("Name")
        private String name;

        @NameInMap("NameEn")
        private String nameEn;

        @NameInMap("Resolutions")
        private Resolutions resolutions;

        private InstanceType(Builder builder) {
            this.cpuCoreCount = builder.cpuCoreCount;
            this.defaultResolution = builder.defaultResolution;
            this.instanceType = builder.instanceType;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.memorySize = builder.memorySize;
            this.name = builder.name;
            this.nameEn = builder.nameEn;
            this.resolutions = builder.resolutions;
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
         * @return defaultResolution
         */
        public String getDefaultResolution() {
            return this.defaultResolution;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        /**
         * @return memorySize
         */
        public String getMemorySize() {
            return this.memorySize;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameEn
         */
        public String getNameEn() {
            return this.nameEn;
        }

        /**
         * @return resolutions
         */
        public Resolutions getResolutions() {
            return this.resolutions;
        }

        public static final class Builder {
            private Integer cpuCoreCount; 
            private String defaultResolution; 
            private String instanceType; 
            private String instanceTypeFamily; 
            private String memorySize; 
            private String name; 
            private String nameEn; 
            private Resolutions resolutions; 

            /**
             * The number of vCPUs supported by the instance type.
             */
            public Builder cpuCoreCount(Integer cpuCoreCount) {
                this.cpuCoreCount = cpuCoreCount;
                return this;
            }

            /**
             * The default resolution supported by the instance type.
             */
            public Builder defaultResolution(String defaultResolution) {
                this.defaultResolution = defaultResolution;
                return this;
            }

            /**
             * The instance type.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The instance type family.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * The memory size supported by the instance type. Unit: GiB.
             */
            public Builder memorySize(String memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * The name of the instance type in Chinese.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The name of the instance type in English.
             */
            public Builder nameEn(String nameEn) {
                this.nameEn = nameEn;
                return this;
            }

            /**
             * The resolutions supported by the instance type.
             */
            public Builder resolutions(Resolutions resolutions) {
                this.resolutions = resolutions;
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
             * The instance type.
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

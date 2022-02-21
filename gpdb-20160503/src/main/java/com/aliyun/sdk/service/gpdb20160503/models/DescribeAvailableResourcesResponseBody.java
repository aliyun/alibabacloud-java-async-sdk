// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableResourcesResponseBody</p>
 */
public class DescribeAvailableResourcesResponseBody extends TeaModel {
    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Resources")
    private java.util.List < Resources> resources;

    private DescribeAvailableResourcesResponseBody(Builder builder) {
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public java.util.List < Resources> getResources() {
        return this.resources;
    }

    public static final class Builder {
        private String regionId; 
        private String requestId; 
        private java.util.List < Resources> resources; 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * Resources.
         */
        public Builder resources(java.util.List < Resources> resources) {
            this.resources = resources;
            return this;
        }

        public DescribeAvailableResourcesResponseBody build() {
            return new DescribeAvailableResourcesResponseBody(this);
        } 

    } 

    public static class NodeCount extends TeaModel {
        @NameInMap("MaxCount")
        private String maxCount;

        @NameInMap("MinCount")
        private String minCount;

        @NameInMap("Step")
        private String step;

        private NodeCount(Builder builder) {
            this.maxCount = builder.maxCount;
            this.minCount = builder.minCount;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeCount create() {
            return builder().build();
        }

        /**
         * @return maxCount
         */
        public String getMaxCount() {
            return this.maxCount;
        }

        /**
         * @return minCount
         */
        public String getMinCount() {
            return this.minCount;
        }

        /**
         * @return step
         */
        public String getStep() {
            return this.step;
        }

        public static final class Builder {
            private String maxCount; 
            private String minCount; 
            private String step; 

            /**
             * MaxCount.
             */
            public Builder maxCount(String maxCount) {
                this.maxCount = maxCount;
                return this;
            }

            /**
             * MinCount.
             */
            public Builder minCount(String minCount) {
                this.minCount = minCount;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(String step) {
                this.step = step;
                return this;
            }

            public NodeCount build() {
                return new NodeCount(this);
            } 

        } 

    }
    public static class StorageSize extends TeaModel {
        @NameInMap("MaxCount")
        private String maxCount;

        @NameInMap("MinCount")
        private String minCount;

        @NameInMap("Step")
        private String step;

        private StorageSize(Builder builder) {
            this.maxCount = builder.maxCount;
            this.minCount = builder.minCount;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageSize create() {
            return builder().build();
        }

        /**
         * @return maxCount
         */
        public String getMaxCount() {
            return this.maxCount;
        }

        /**
         * @return minCount
         */
        public String getMinCount() {
            return this.minCount;
        }

        /**
         * @return step
         */
        public String getStep() {
            return this.step;
        }

        public static final class Builder {
            private String maxCount; 
            private String minCount; 
            private String step; 

            /**
             * MaxCount.
             */
            public Builder maxCount(String maxCount) {
                this.maxCount = maxCount;
                return this;
            }

            /**
             * MinCount.
             */
            public Builder minCount(String minCount) {
                this.minCount = minCount;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(String step) {
                this.step = step;
                return this;
            }

            public StorageSize build() {
                return new StorageSize(this);
            } 

        } 

    }
    public static class SupportedInstanceClasses extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DisplayClass")
        private String displayClass;

        @NameInMap("InstanceClass")
        private String instanceClass;

        @NameInMap("NodeCount")
        private NodeCount nodeCount;

        @NameInMap("StorageSize")
        private StorageSize storageSize;

        @NameInMap("StorageType")
        private String storageType;

        private SupportedInstanceClasses(Builder builder) {
            this.description = builder.description;
            this.displayClass = builder.displayClass;
            this.instanceClass = builder.instanceClass;
            this.nodeCount = builder.nodeCount;
            this.storageSize = builder.storageSize;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedInstanceClasses create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayClass
         */
        public String getDisplayClass() {
            return this.displayClass;
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return nodeCount
         */
        public NodeCount getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return storageSize
         */
        public StorageSize getStorageSize() {
            return this.storageSize;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private String description; 
            private String displayClass; 
            private String instanceClass; 
            private NodeCount nodeCount; 
            private StorageSize storageSize; 
            private String storageType; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisplayClass.
             */
            public Builder displayClass(String displayClass) {
                this.displayClass = displayClass;
                return this;
            }

            /**
             * InstanceClass.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * NodeCount.
             */
            public Builder nodeCount(NodeCount nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * StorageSize.
             */
            public Builder storageSize(StorageSize storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public SupportedInstanceClasses build() {
                return new SupportedInstanceClasses(this);
            } 

        } 

    }
    public static class SupportedEngines extends TeaModel {
        @NameInMap("Mode")
        private String mode;

        @NameInMap("SupportedEngineVersion")
        private String supportedEngineVersion;

        @NameInMap("SupportedInstanceClasses")
        private java.util.List < SupportedInstanceClasses> supportedInstanceClasses;

        private SupportedEngines(Builder builder) {
            this.mode = builder.mode;
            this.supportedEngineVersion = builder.supportedEngineVersion;
            this.supportedInstanceClasses = builder.supportedInstanceClasses;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedEngines create() {
            return builder().build();
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return supportedEngineVersion
         */
        public String getSupportedEngineVersion() {
            return this.supportedEngineVersion;
        }

        /**
         * @return supportedInstanceClasses
         */
        public java.util.List < SupportedInstanceClasses> getSupportedInstanceClasses() {
            return this.supportedInstanceClasses;
        }

        public static final class Builder {
            private String mode; 
            private String supportedEngineVersion; 
            private java.util.List < SupportedInstanceClasses> supportedInstanceClasses; 

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * SupportedEngineVersion.
             */
            public Builder supportedEngineVersion(String supportedEngineVersion) {
                this.supportedEngineVersion = supportedEngineVersion;
                return this;
            }

            /**
             * SupportedInstanceClasses.
             */
            public Builder supportedInstanceClasses(java.util.List < SupportedInstanceClasses> supportedInstanceClasses) {
                this.supportedInstanceClasses = supportedInstanceClasses;
                return this;
            }

            public SupportedEngines build() {
                return new SupportedEngines(this);
            } 

        } 

    }
    public static class Resources extends TeaModel {
        @NameInMap("SupportedEngines")
        private java.util.List < SupportedEngines> supportedEngines;

        @NameInMap("ZoneId")
        private String zoneId;

        private Resources(Builder builder) {
            this.supportedEngines = builder.supportedEngines;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return supportedEngines
         */
        public java.util.List < SupportedEngines> getSupportedEngines() {
            return this.supportedEngines;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List < SupportedEngines> supportedEngines; 
            private String zoneId; 

            /**
             * SupportedEngines.
             */
            public Builder supportedEngines(java.util.List < SupportedEngines> supportedEngines) {
                this.supportedEngines = supportedEngines;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}

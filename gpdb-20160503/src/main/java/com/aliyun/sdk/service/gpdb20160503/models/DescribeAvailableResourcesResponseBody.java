// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAvailableResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableResourcesResponseBody</p>
 */
public class DescribeAvailableResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
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
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>61DC563C-F8E4-593A-8D27-CE**********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         */
        public Builder resources(java.util.List < Resources> resources) {
            this.resources = resources;
            return this;
        }

        public DescribeAvailableResourcesResponseBody build() {
            return new DescribeAvailableResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAvailableResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourcesResponseBody</p>
     */
    public static class NodeCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxCount")
        private String maxCount;

        @com.aliyun.core.annotation.NameInMap("MinCount")
        private String minCount;

        @com.aliyun.core.annotation.NameInMap("Step")
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
             * <p>The maximum number of compute nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>256</p>
             */
            public Builder maxCount(String maxCount) {
                this.maxCount = maxCount;
                return this;
            }

            /**
             * <p>The minimum number of compute nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder minCount(String minCount) {
                this.minCount = minCount;
                return this;
            }

            /**
             * <p>The step size for adding compute nodes.</p>
             * <p>For example, if the value of this parameter is 4, compute nodes must be added by multiples of 4.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
    /**
     * 
     * {@link DescribeAvailableResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourcesResponseBody</p>
     */
    public static class StorageSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxCount")
        private String maxCount;

        @com.aliyun.core.annotation.NameInMap("MinCount")
        private String minCount;

        @com.aliyun.core.annotation.NameInMap("Step")
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
             * <p>The maximum storage capacity of each compute node.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maxCount(String maxCount) {
                this.maxCount = maxCount;
                return this;
            }

            /**
             * <p>The minimum storage capacity of each compute node.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder minCount(String minCount) {
                this.minCount = minCount;
                return this;
            }

            /**
             * <p>The step size for adding storage capacity for compute nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
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
    /**
     * 
     * {@link DescribeAvailableResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourcesResponseBody</p>
     */
    public static class SupportedInstanceClasses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayClass")
        private String displayClass;

        @com.aliyun.core.annotation.NameInMap("InstanceClass")
        private String instanceClass;

        @com.aliyun.core.annotation.NameInMap("NodeCount")
        private NodeCount nodeCount;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private StorageSize storageSize;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        private SupportedInstanceClasses(Builder builder) {
            this.category = builder.category;
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
         * @return category
         */
        public String getCategory() {
            return this.category;
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
            private String category; 
            private String description; 
            private String displayClass; 
            private String instanceClass; 
            private NodeCount nodeCount; 
            private StorageSize storageSize; 
            private String storageType; 

            /**
             * <p>The instance edition. Valid values:</p>
             * <ul>
             * <li><strong>HighAvailability</strong>: High-availability Edition</li>
             * <li><strong>Basic</strong>: Basic Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HighAvailability</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The description of compute node specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>2C16G</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The specifications of each compute node.</p>
             * 
             * <strong>example:</strong>
             * <p>2C16G</p>
             */
            public Builder displayClass(String displayClass) {
                this.displayClass = displayClass;
                return this;
            }

            /**
             * <p>The specifications of each compute node.</p>
             * 
             * <strong>example:</strong>
             * <p>2C16G</p>
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * <p>Details about the compute nodes.</p>
             */
            public Builder nodeCount(NodeCount nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * <p>Details about the storage capacity of compute nodes.</p>
             */
            public Builder storageSize(StorageSize storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * <p>The storage type. Valid values:</p>
             * <ul>
             * <li><strong>cloud_essd</strong>: enhanced SSD (ESSD)</li>
             * <li><strong>cloud_efficiency</strong>: ultra disk</li>
             * <li><strong>oss</strong>: Object Storage Service (OSS)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
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
    /**
     * 
     * {@link DescribeAvailableResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourcesResponseBody</p>
     */
    public static class SupportedEngines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("SupportedEngineVersion")
        private String supportedEngineVersion;

        @com.aliyun.core.annotation.NameInMap("SupportedInstanceClasses")
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
             * <p>The instance resource type. Valid values:</p>
             * <ul>
             * <li><strong>ecs</strong>: elastic storage mode</li>
             * <li><strong>serverless</strong>: Serverless mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The available engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>6.0</p>
             */
            public Builder supportedEngineVersion(String supportedEngineVersion) {
                this.supportedEngineVersion = supportedEngineVersion;
                return this;
            }

            /**
             * <p>The available specifications.</p>
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
    /**
     * 
     * {@link DescribeAvailableResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourcesResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedEngines")
        private java.util.List < SupportedEngines> supportedEngines;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
             * <p>The available engine version and specifications.</p>
             */
            public Builder supportedEngines(java.util.List < SupportedEngines> supportedEngines) {
                this.supportedEngines = supportedEngines;
                return this;
            }

            /**
             * <p>The ID of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
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

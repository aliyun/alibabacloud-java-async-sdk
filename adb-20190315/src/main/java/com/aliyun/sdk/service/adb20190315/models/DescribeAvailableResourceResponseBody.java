// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableResourceResponseBody</p>
 */
public class DescribeAvailableResourceResponseBody extends TeaModel {
    @NameInMap("AvailableZoneList")
    private java.util.List < AvailableZoneList> availableZoneList;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAvailableResourceResponseBody(Builder builder) {
        this.availableZoneList = builder.availableZoneList;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableZoneList
     */
    public java.util.List < AvailableZoneList> getAvailableZoneList() {
        return this.availableZoneList;
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

    public static final class Builder {
        private java.util.List < AvailableZoneList> availableZoneList; 
        private String regionId; 
        private String requestId; 

        /**
         * The resources available in elastic mode.
         */
        public Builder availableZoneList(java.util.List < AvailableZoneList> availableZoneList) {
            this.availableZoneList = availableZoneList;
            return this;
        }

        /**
         * The resources available in the supported editions.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The supported edition. Valid values:
         * <p>
         * 
         * *   **basic**: Basic Edition
         * *   **cluster**: Cluster Edition
         * *   **mixed_storage**: elastic mode for Cluster Edition
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAvailableResourceResponseBody build() {
            return new DescribeAvailableResourceResponseBody(this);
        } 

    } 

    public static class SupportedElasticIOResource extends TeaModel {
        @NameInMap("MaxCount")
        private String maxCount;

        @NameInMap("MinCount")
        private String minCount;

        @NameInMap("Step")
        private String step;

        private SupportedElasticIOResource(Builder builder) {
            this.maxCount = builder.maxCount;
            this.minCount = builder.minCount;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedElasticIOResource create() {
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

            public SupportedElasticIOResource build() {
                return new SupportedElasticIOResource(this);
            } 

        } 

    }
    public static class SupportedFlexibleResource extends TeaModel {
        @NameInMap("StorageType")
        private String storageType;

        @NameInMap("SupportedComputeResource")
        private java.util.List < String > supportedComputeResource;

        @NameInMap("SupportedElasticIOResource")
        private SupportedElasticIOResource supportedElasticIOResource;

        @NameInMap("SupportedStorageResource")
        private java.util.List < String > supportedStorageResource;

        private SupportedFlexibleResource(Builder builder) {
            this.storageType = builder.storageType;
            this.supportedComputeResource = builder.supportedComputeResource;
            this.supportedElasticIOResource = builder.supportedElasticIOResource;
            this.supportedStorageResource = builder.supportedStorageResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedFlexibleResource create() {
            return builder().build();
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return supportedComputeResource
         */
        public java.util.List < String > getSupportedComputeResource() {
            return this.supportedComputeResource;
        }

        /**
         * @return supportedElasticIOResource
         */
        public SupportedElasticIOResource getSupportedElasticIOResource() {
            return this.supportedElasticIOResource;
        }

        /**
         * @return supportedStorageResource
         */
        public java.util.List < String > getSupportedStorageResource() {
            return this.supportedStorageResource;
        }

        public static final class Builder {
            private String storageType; 
            private java.util.List < String > supportedComputeResource; 
            private SupportedElasticIOResource supportedElasticIOResource; 
            private java.util.List < String > supportedStorageResource; 

            /**
             * The maximum number of EIUs.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * SupportedComputeResource.
             */
            public Builder supportedComputeResource(java.util.List < String > supportedComputeResource) {
                this.supportedComputeResource = supportedComputeResource;
                return this;
            }

            /**
             * SupportedElasticIOResource.
             */
            public Builder supportedElasticIOResource(SupportedElasticIOResource supportedElasticIOResource) {
                this.supportedElasticIOResource = supportedElasticIOResource;
                return this;
            }

            /**
             * SupportedStorageResource.
             */
            public Builder supportedStorageResource(java.util.List < String > supportedStorageResource) {
                this.supportedStorageResource = supportedStorageResource;
                return this;
            }

            public SupportedFlexibleResource build() {
                return new SupportedFlexibleResource(this);
            } 

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
    public static class SupportedExecutorList extends TeaModel {
        @NameInMap("NodeCount")
        private NodeCount nodeCount;

        private SupportedExecutorList(Builder builder) {
            this.nodeCount = builder.nodeCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedExecutorList create() {
            return builder().build();
        }

        /**
         * @return nodeCount
         */
        public NodeCount getNodeCount() {
            return this.nodeCount;
        }

        public static final class Builder {
            private NodeCount nodeCount; 

            /**
             * NodeCount.
             */
            public Builder nodeCount(NodeCount nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            public SupportedExecutorList build() {
                return new SupportedExecutorList(this);
            } 

        } 

    }
    public static class SupportedNodeCountListNodeCount extends TeaModel {
        @NameInMap("MaxCount")
        private String maxCount;

        @NameInMap("MinCount")
        private String minCount;

        @NameInMap("Step")
        private String step;

        private SupportedNodeCountListNodeCount(Builder builder) {
            this.maxCount = builder.maxCount;
            this.minCount = builder.minCount;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedNodeCountListNodeCount create() {
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

            public SupportedNodeCountListNodeCount build() {
                return new SupportedNodeCountListNodeCount(this);
            } 

        } 

    }
    public static class SupportedNodeCountList extends TeaModel {
        @NameInMap("NodeCount")
        private SupportedNodeCountListNodeCount nodeCount;

        @NameInMap("StorageSize")
        private java.util.List < String > storageSize;

        private SupportedNodeCountList(Builder builder) {
            this.nodeCount = builder.nodeCount;
            this.storageSize = builder.storageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedNodeCountList create() {
            return builder().build();
        }

        /**
         * @return nodeCount
         */
        public SupportedNodeCountListNodeCount getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return storageSize
         */
        public java.util.List < String > getStorageSize() {
            return this.storageSize;
        }

        public static final class Builder {
            private SupportedNodeCountListNodeCount nodeCount; 
            private java.util.List < String > storageSize; 

            /**
             * NodeCount.
             */
            public Builder nodeCount(SupportedNodeCountListNodeCount nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * StorageSize.
             */
            public Builder storageSize(java.util.List < String > storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            public SupportedNodeCountList build() {
                return new SupportedNodeCountList(this);
            } 

        } 

    }
    public static class SupportedInstanceClassList extends TeaModel {
        @NameInMap("InstanceClass")
        private String instanceClass;

        @NameInMap("SupportedExecutorList")
        private java.util.List < SupportedExecutorList> supportedExecutorList;

        @NameInMap("SupportedNodeCountList")
        private java.util.List < SupportedNodeCountList> supportedNodeCountList;

        @NameInMap("Tips")
        private String tips;

        private SupportedInstanceClassList(Builder builder) {
            this.instanceClass = builder.instanceClass;
            this.supportedExecutorList = builder.supportedExecutorList;
            this.supportedNodeCountList = builder.supportedNodeCountList;
            this.tips = builder.tips;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedInstanceClassList create() {
            return builder().build();
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return supportedExecutorList
         */
        public java.util.List < SupportedExecutorList> getSupportedExecutorList() {
            return this.supportedExecutorList;
        }

        /**
         * @return supportedNodeCountList
         */
        public java.util.List < SupportedNodeCountList> getSupportedNodeCountList() {
            return this.supportedNodeCountList;
        }

        /**
         * @return tips
         */
        public String getTips() {
            return this.tips;
        }

        public static final class Builder {
            private String instanceClass; 
            private java.util.List < SupportedExecutorList> supportedExecutorList; 
            private java.util.List < SupportedNodeCountList> supportedNodeCountList; 
            private String tips; 

            /**
             * InstanceClass.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * SupportedExecutorList.
             */
            public Builder supportedExecutorList(java.util.List < SupportedExecutorList> supportedExecutorList) {
                this.supportedExecutorList = supportedExecutorList;
                return this;
            }

            /**
             * SupportedNodeCountList.
             */
            public Builder supportedNodeCountList(java.util.List < SupportedNodeCountList> supportedNodeCountList) {
                this.supportedNodeCountList = supportedNodeCountList;
                return this;
            }

            /**
             * Tips.
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            public SupportedInstanceClassList build() {
                return new SupportedInstanceClassList(this);
            } 

        } 

    }
    public static class SupportedSerialList extends TeaModel {
        @NameInMap("Serial")
        private String serial;

        @NameInMap("SupportedFlexibleResource")
        private java.util.List < SupportedFlexibleResource> supportedFlexibleResource;

        @NameInMap("SupportedInstanceClassList")
        private java.util.List < SupportedInstanceClassList> supportedInstanceClassList;

        private SupportedSerialList(Builder builder) {
            this.serial = builder.serial;
            this.supportedFlexibleResource = builder.supportedFlexibleResource;
            this.supportedInstanceClassList = builder.supportedInstanceClassList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedSerialList create() {
            return builder().build();
        }

        /**
         * @return serial
         */
        public String getSerial() {
            return this.serial;
        }

        /**
         * @return supportedFlexibleResource
         */
        public java.util.List < SupportedFlexibleResource> getSupportedFlexibleResource() {
            return this.supportedFlexibleResource;
        }

        /**
         * @return supportedInstanceClassList
         */
        public java.util.List < SupportedInstanceClassList> getSupportedInstanceClassList() {
            return this.supportedInstanceClassList;
        }

        public static final class Builder {
            private String serial; 
            private java.util.List < SupportedFlexibleResource> supportedFlexibleResource; 
            private java.util.List < SupportedInstanceClassList> supportedInstanceClassList; 

            /**
             * The step size.
             */
            public Builder serial(String serial) {
                this.serial = serial;
                return this;
            }

            /**
             * The minimum number of EIUs.
             */
            public Builder supportedFlexibleResource(java.util.List < SupportedFlexibleResource> supportedFlexibleResource) {
                this.supportedFlexibleResource = supportedFlexibleResource;
                return this;
            }

            /**
             * SupportedInstanceClassList.
             */
            public Builder supportedInstanceClassList(java.util.List < SupportedInstanceClassList> supportedInstanceClassList) {
                this.supportedInstanceClassList = supportedInstanceClassList;
                return this;
            }

            public SupportedSerialList build() {
                return new SupportedSerialList(this);
            } 

        } 

    }
    public static class SupportedMode extends TeaModel {
        @NameInMap("Mode")
        private String mode;

        @NameInMap("SupportedSerialList")
        private java.util.List < SupportedSerialList> supportedSerialList;

        private SupportedMode(Builder builder) {
            this.mode = builder.mode;
            this.supportedSerialList = builder.supportedSerialList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedMode create() {
            return builder().build();
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return supportedSerialList
         */
        public java.util.List < SupportedSerialList> getSupportedSerialList() {
            return this.supportedSerialList;
        }

        public static final class Builder {
            private String mode; 
            private java.util.List < SupportedSerialList> supportedSerialList; 

            /**
             * N/A
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The available elastic I/O units (EIUs).
             */
            public Builder supportedSerialList(java.util.List < SupportedSerialList> supportedSerialList) {
                this.supportedSerialList = supportedSerialList;
                return this;
            }

            public SupportedMode build() {
                return new SupportedMode(this);
            } 

        } 

    }
    public static class AvailableZoneList extends TeaModel {
        @NameInMap("SupportedComputeResource")
        private java.util.List < String > supportedComputeResource;

        @NameInMap("SupportedMode")
        private java.util.List < SupportedMode> supportedMode;

        @NameInMap("SupportedStorageResource")
        private java.util.List < String > supportedStorageResource;

        @NameInMap("ZoneId")
        private String zoneId;

        private AvailableZoneList(Builder builder) {
            this.supportedComputeResource = builder.supportedComputeResource;
            this.supportedMode = builder.supportedMode;
            this.supportedStorageResource = builder.supportedStorageResource;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableZoneList create() {
            return builder().build();
        }

        /**
         * @return supportedComputeResource
         */
        public java.util.List < String > getSupportedComputeResource() {
            return this.supportedComputeResource;
        }

        /**
         * @return supportedMode
         */
        public java.util.List < SupportedMode> getSupportedMode() {
            return this.supportedMode;
        }

        /**
         * @return supportedStorageResource
         */
        public java.util.List < String > getSupportedStorageResource() {
            return this.supportedStorageResource;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List < String > supportedComputeResource; 
            private java.util.List < SupportedMode> supportedMode; 
            private java.util.List < String > supportedStorageResource; 
            private String zoneId; 

            /**
             * SupportedComputeResource.
             */
            public Builder supportedComputeResource(java.util.List < String > supportedComputeResource) {
                this.supportedComputeResource = supportedComputeResource;
                return this;
            }

            /**
             * The available computing resources.
             */
            public Builder supportedMode(java.util.List < SupportedMode> supportedMode) {
                this.supportedMode = supportedMode;
                return this;
            }

            /**
             * SupportedStorageResource.
             */
            public Builder supportedStorageResource(java.util.List < String > supportedStorageResource) {
                this.supportedStorageResource = supportedStorageResource;
                return this;
            }

            /**
             * The storage type. Valid values:
             * <p>
             * 
             * *   **hdd**
             * *   **ssd**
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public AvailableZoneList build() {
                return new AvailableZoneList(this);
            } 

        } 

    }
}

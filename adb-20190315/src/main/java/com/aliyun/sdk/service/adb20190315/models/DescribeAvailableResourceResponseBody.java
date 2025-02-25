// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableResourceResponseBody</p>
 */
public class DescribeAvailableResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableZoneList")
    private java.util.List < AvailableZoneList> availableZoneList;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The supported zones.</p>
         */
        public Builder availableZoneList(java.util.List < AvailableZoneList> availableZoneList) {
            this.availableZoneList = availableZoneList;
            return this;
        }

        /**
         * <p>The resources available in the supported editions.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAvailableResourceResponseBody build() {
            return new DescribeAvailableResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class SupportedElasticIOResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxCount")
        private String maxCount;

        @com.aliyun.core.annotation.NameInMap("MinCount")
        private String minCount;

        @com.aliyun.core.annotation.NameInMap("Step")
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
             * <p>The maximum amount of elastic I/O resources.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder maxCount(String maxCount) {
                this.maxCount = maxCount;
                return this;
            }

            /**
             * <p>The minimum amount of elastic I/O resources.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder minCount(String minCount) {
                this.minCount = minCount;
                return this;
            }

            /**
             * <p>The step size.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class SupportedFlexibleResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("SupportedComputeResource")
        private java.util.List < String > supportedComputeResource;

        @com.aliyun.core.annotation.NameInMap("SupportedElasticIOResource")
        private SupportedElasticIOResource supportedElasticIOResource;

        @com.aliyun.core.annotation.NameInMap("SupportedStorageResource")
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
             * <p>The disk storage type. Valid values:</p>
             * <ul>
             * <li><strong>hdd</strong></li>
             * <li><strong>ssd</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>hdd</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The supported computing resources.</p>
             */
            public Builder supportedComputeResource(java.util.List < String > supportedComputeResource) {
                this.supportedComputeResource = supportedComputeResource;
                return this;
            }

            /**
             * <p>The supported elastic I/O resources.</p>
             */
            public Builder supportedElasticIOResource(SupportedElasticIOResource supportedElasticIOResource) {
                this.supportedElasticIOResource = supportedElasticIOResource;
                return this;
            }

            /**
             * <p>The supported storage resources.</p>
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
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
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
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder maxCount(String maxCount) {
                this.maxCount = maxCount;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder minCount(String minCount) {
                this.minCount = minCount;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
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
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class SupportedExecutorList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeCount")
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
             * <p>The information about the supported compute nodes.</p>
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
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class SupportedNodeCountListNodeCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxCount")
        private String maxCount;

        @com.aliyun.core.annotation.NameInMap("MinCount")
        private String minCount;

        @com.aliyun.core.annotation.NameInMap("Step")
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
             * <p>The maximum number of compute nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder maxCount(String maxCount) {
                this.maxCount = maxCount;
                return this;
            }

            /**
             * <p>The minimum number of compute nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minCount(String minCount) {
                this.minCount = minCount;
                return this;
            }

            /**
             * <p>The step size.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class SupportedNodeCountList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeCount")
        private SupportedNodeCountListNodeCount nodeCount;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
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
             * <p>The number of the supported compute nodes.</p>
             */
            public Builder nodeCount(SupportedNodeCountListNodeCount nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * <p>The support storage capacity. Unit: GB.</p>
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
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class SupportedInstanceClassList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceClass")
        private String instanceClass;

        @com.aliyun.core.annotation.NameInMap("SupportedExecutorList")
        private java.util.List < SupportedExecutorList> supportedExecutorList;

        @com.aliyun.core.annotation.NameInMap("SupportedNodeCountList")
        private java.util.List < SupportedNodeCountList> supportedNodeCountList;

        @com.aliyun.core.annotation.NameInMap("Tips")
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
             * <p>The supported instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>C32</p>
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             */
            public Builder supportedExecutorList(java.util.List < SupportedExecutorList> supportedExecutorList) {
                this.supportedExecutorList = supportedExecutorList;
                return this;
            }

            /**
             * <p>The supported compute nodes.</p>
             */
            public Builder supportedNodeCountList(java.util.List < SupportedNodeCountList> supportedNodeCountList) {
                this.supportedNodeCountList = supportedNodeCountList;
                return this;
            }

            /**
             * <p>The description of the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>C32</p>
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
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class SupportedSerialList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Serial")
        private String serial;

        @com.aliyun.core.annotation.NameInMap("SupportedFlexibleResource")
        private java.util.List < SupportedFlexibleResource> supportedFlexibleResource;

        @com.aliyun.core.annotation.NameInMap("SupportedInstanceClassList")
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
             * <p>The supported edition. Valid values:</p>
             * <ul>
             * <li><strong>basic</strong>: Basic Edition.</li>
             * <li><strong>cluster</strong>: Cluster Edition.</li>
             * <li><strong>mixed_storage</strong>: elastic mode for Cluster Edition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>mixed_storage</p>
             */
            public Builder serial(String serial) {
                this.serial = serial;
                return this;
            }

            /**
             * <p>The supported resources in elastic mode.</p>
             */
            public Builder supportedFlexibleResource(java.util.List < SupportedFlexibleResource> supportedFlexibleResource) {
                this.supportedFlexibleResource = supportedFlexibleResource;
                return this;
            }

            /**
             * <p>The supported resources in reserved mode.</p>
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
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class SupportedMode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("SupportedSerialList")
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
             * <p>The supported mode. Valid values:</p>
             * <ul>
             * <li><strong>flexible</strong>: elastic mode.</li>
             * <li><strong>reserver</strong>: reserved mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>flexible</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The supported editions.</p>
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
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class AvailableZoneList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedComputeResource")
        private java.util.List < String > supportedComputeResource;

        @com.aliyun.core.annotation.NameInMap("SupportedMode")
        private java.util.List < SupportedMode> supportedMode;

        @com.aliyun.core.annotation.NameInMap("SupportedStorageResource")
        private java.util.List < String > supportedStorageResource;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
             * <p>A reserved parameter.</p>
             */
            public Builder supportedComputeResource(java.util.List < String > supportedComputeResource) {
                this.supportedComputeResource = supportedComputeResource;
                return this;
            }

            /**
             * <p>The supported modes.</p>
             */
            public Builder supportedMode(java.util.List < SupportedMode> supportedMode) {
                this.supportedMode = supportedMode;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             */
            public Builder supportedStorageResource(java.util.List < String > supportedStorageResource) {
                this.supportedStorageResource = supportedStorageResource;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

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
    private AvailableZoneList availableZoneList;

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
    public AvailableZoneList getAvailableZoneList() {
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
        private AvailableZoneList availableZoneList; 
        private String regionId; 
        private String requestId; 

        /**
         * AvailableZoneList.
         */
        public Builder availableZoneList(AvailableZoneList availableZoneList) {
            this.availableZoneList = availableZoneList;
            return this;
        }

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

        public DescribeAvailableResourceResponseBody build() {
            return new DescribeAvailableResourceResponseBody(this);
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
    public static class SupportedExecutor extends TeaModel {
        @NameInMap("NodeCount")
        private NodeCount nodeCount;

        private SupportedExecutor(Builder builder) {
            this.nodeCount = builder.nodeCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedExecutor create() {
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

            public SupportedExecutor build() {
                return new SupportedExecutor(this);
            } 

        } 

    }
    public static class SupportedExecutorList extends TeaModel {
        @NameInMap("SupportedExecutor")
        private java.util.List < SupportedExecutor> supportedExecutor;

        private SupportedExecutorList(Builder builder) {
            this.supportedExecutor = builder.supportedExecutor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedExecutorList create() {
            return builder().build();
        }

        /**
         * @return supportedExecutor
         */
        public java.util.List < SupportedExecutor> getSupportedExecutor() {
            return this.supportedExecutor;
        }

        public static final class Builder {
            private java.util.List < SupportedExecutor> supportedExecutor; 

            /**
             * SupportedExecutor.
             */
            public Builder supportedExecutor(java.util.List < SupportedExecutor> supportedExecutor) {
                this.supportedExecutor = supportedExecutor;
                return this;
            }

            public SupportedExecutorList build() {
                return new SupportedExecutorList(this);
            } 

        } 

    }
    public static class SupportedNodeCountNodeCount extends TeaModel {
        @NameInMap("MaxCount")
        private String maxCount;

        @NameInMap("MinCount")
        private String minCount;

        @NameInMap("Step")
        private String step;

        private SupportedNodeCountNodeCount(Builder builder) {
            this.maxCount = builder.maxCount;
            this.minCount = builder.minCount;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedNodeCountNodeCount create() {
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

            public SupportedNodeCountNodeCount build() {
                return new SupportedNodeCountNodeCount(this);
            } 

        } 

    }
    public static class StorageSize extends TeaModel {
        @NameInMap("StorageSize")
        private java.util.List < String > storageSize;

        private StorageSize(Builder builder) {
            this.storageSize = builder.storageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageSize create() {
            return builder().build();
        }

        /**
         * @return storageSize
         */
        public java.util.List < String > getStorageSize() {
            return this.storageSize;
        }

        public static final class Builder {
            private java.util.List < String > storageSize; 

            /**
             * StorageSize.
             */
            public Builder storageSize(java.util.List < String > storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            public StorageSize build() {
                return new StorageSize(this);
            } 

        } 

    }
    public static class SupportedNodeCount extends TeaModel {
        @NameInMap("NodeCount")
        private SupportedNodeCountNodeCount nodeCount;

        @NameInMap("StorageSize")
        private StorageSize storageSize;

        private SupportedNodeCount(Builder builder) {
            this.nodeCount = builder.nodeCount;
            this.storageSize = builder.storageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedNodeCount create() {
            return builder().build();
        }

        /**
         * @return nodeCount
         */
        public SupportedNodeCountNodeCount getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return storageSize
         */
        public StorageSize getStorageSize() {
            return this.storageSize;
        }

        public static final class Builder {
            private SupportedNodeCountNodeCount nodeCount; 
            private StorageSize storageSize; 

            /**
             * NodeCount.
             */
            public Builder nodeCount(SupportedNodeCountNodeCount nodeCount) {
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

            public SupportedNodeCount build() {
                return new SupportedNodeCount(this);
            } 

        } 

    }
    public static class SupportedNodeCountList extends TeaModel {
        @NameInMap("SupportedNodeCount")
        private java.util.List < SupportedNodeCount> supportedNodeCount;

        private SupportedNodeCountList(Builder builder) {
            this.supportedNodeCount = builder.supportedNodeCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedNodeCountList create() {
            return builder().build();
        }

        /**
         * @return supportedNodeCount
         */
        public java.util.List < SupportedNodeCount> getSupportedNodeCount() {
            return this.supportedNodeCount;
        }

        public static final class Builder {
            private java.util.List < SupportedNodeCount> supportedNodeCount; 

            /**
             * SupportedNodeCount.
             */
            public Builder supportedNodeCount(java.util.List < SupportedNodeCount> supportedNodeCount) {
                this.supportedNodeCount = supportedNodeCount;
                return this;
            }

            public SupportedNodeCountList build() {
                return new SupportedNodeCountList(this);
            } 

        } 

    }
    public static class SupportedInstanceClass extends TeaModel {
        @NameInMap("InstanceClass")
        private String instanceClass;

        @NameInMap("SupportedExecutorList")
        private SupportedExecutorList supportedExecutorList;

        @NameInMap("SupportedNodeCountList")
        private SupportedNodeCountList supportedNodeCountList;

        @NameInMap("Tips")
        private String tips;

        private SupportedInstanceClass(Builder builder) {
            this.instanceClass = builder.instanceClass;
            this.supportedExecutorList = builder.supportedExecutorList;
            this.supportedNodeCountList = builder.supportedNodeCountList;
            this.tips = builder.tips;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedInstanceClass create() {
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
        public SupportedExecutorList getSupportedExecutorList() {
            return this.supportedExecutorList;
        }

        /**
         * @return supportedNodeCountList
         */
        public SupportedNodeCountList getSupportedNodeCountList() {
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
            private SupportedExecutorList supportedExecutorList; 
            private SupportedNodeCountList supportedNodeCountList; 
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
            public Builder supportedExecutorList(SupportedExecutorList supportedExecutorList) {
                this.supportedExecutorList = supportedExecutorList;
                return this;
            }

            /**
             * SupportedNodeCountList.
             */
            public Builder supportedNodeCountList(SupportedNodeCountList supportedNodeCountList) {
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

            public SupportedInstanceClass build() {
                return new SupportedInstanceClass(this);
            } 

        } 

    }
    public static class SupportedInstanceClassList extends TeaModel {
        @NameInMap("SupportedInstanceClass")
        private java.util.List < SupportedInstanceClass> supportedInstanceClass;

        private SupportedInstanceClassList(Builder builder) {
            this.supportedInstanceClass = builder.supportedInstanceClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedInstanceClassList create() {
            return builder().build();
        }

        /**
         * @return supportedInstanceClass
         */
        public java.util.List < SupportedInstanceClass> getSupportedInstanceClass() {
            return this.supportedInstanceClass;
        }

        public static final class Builder {
            private java.util.List < SupportedInstanceClass> supportedInstanceClass; 

            /**
             * SupportedInstanceClass.
             */
            public Builder supportedInstanceClass(java.util.List < SupportedInstanceClass> supportedInstanceClass) {
                this.supportedInstanceClass = supportedInstanceClass;
                return this;
            }

            public SupportedInstanceClassList build() {
                return new SupportedInstanceClassList(this);
            } 

        } 

    }
    public static class SupportedSerial extends TeaModel {
        @NameInMap("Serial")
        private String serial;

        @NameInMap("SupportedInstanceClassList")
        private SupportedInstanceClassList supportedInstanceClassList;

        private SupportedSerial(Builder builder) {
            this.serial = builder.serial;
            this.supportedInstanceClassList = builder.supportedInstanceClassList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedSerial create() {
            return builder().build();
        }

        /**
         * @return serial
         */
        public String getSerial() {
            return this.serial;
        }

        /**
         * @return supportedInstanceClassList
         */
        public SupportedInstanceClassList getSupportedInstanceClassList() {
            return this.supportedInstanceClassList;
        }

        public static final class Builder {
            private String serial; 
            private SupportedInstanceClassList supportedInstanceClassList; 

            /**
             * Serial.
             */
            public Builder serial(String serial) {
                this.serial = serial;
                return this;
            }

            /**
             * SupportedInstanceClassList.
             */
            public Builder supportedInstanceClassList(SupportedInstanceClassList supportedInstanceClassList) {
                this.supportedInstanceClassList = supportedInstanceClassList;
                return this;
            }

            public SupportedSerial build() {
                return new SupportedSerial(this);
            } 

        } 

    }
    public static class SupportedSerialList extends TeaModel {
        @NameInMap("SupportedSerial")
        private java.util.List < SupportedSerial> supportedSerial;

        private SupportedSerialList(Builder builder) {
            this.supportedSerial = builder.supportedSerial;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedSerialList create() {
            return builder().build();
        }

        /**
         * @return supportedSerial
         */
        public java.util.List < SupportedSerial> getSupportedSerial() {
            return this.supportedSerial;
        }

        public static final class Builder {
            private java.util.List < SupportedSerial> supportedSerial; 

            /**
             * SupportedSerial.
             */
            public Builder supportedSerial(java.util.List < SupportedSerial> supportedSerial) {
                this.supportedSerial = supportedSerial;
                return this;
            }

            public SupportedSerialList build() {
                return new SupportedSerialList(this);
            } 

        } 

    }
    public static class AvailableZone extends TeaModel {
        @NameInMap("SupportedSerialList")
        private SupportedSerialList supportedSerialList;

        @NameInMap("ZoneId")
        private String zoneId;

        private AvailableZone(Builder builder) {
            this.supportedSerialList = builder.supportedSerialList;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableZone create() {
            return builder().build();
        }

        /**
         * @return supportedSerialList
         */
        public SupportedSerialList getSupportedSerialList() {
            return this.supportedSerialList;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private SupportedSerialList supportedSerialList; 
            private String zoneId; 

            /**
             * SupportedSerialList.
             */
            public Builder supportedSerialList(SupportedSerialList supportedSerialList) {
                this.supportedSerialList = supportedSerialList;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public AvailableZone build() {
                return new AvailableZone(this);
            } 

        } 

    }
    public static class AvailableZoneList extends TeaModel {
        @NameInMap("AvailableZone")
        private java.util.List < AvailableZone> availableZone;

        private AvailableZoneList(Builder builder) {
            this.availableZone = builder.availableZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableZoneList create() {
            return builder().build();
        }

        /**
         * @return availableZone
         */
        public java.util.List < AvailableZone> getAvailableZone() {
            return this.availableZone;
        }

        public static final class Builder {
            private java.util.List < AvailableZone> availableZone; 

            /**
             * AvailableZone.
             */
            public Builder availableZone(java.util.List < AvailableZone> availableZone) {
                this.availableZone = availableZone;
                return this;
            }

            public AvailableZoneList build() {
                return new AvailableZoneList(this);
            } 

        } 

    }
}

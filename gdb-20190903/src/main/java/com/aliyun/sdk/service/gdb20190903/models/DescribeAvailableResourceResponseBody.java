// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gdb20190903.models;

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

    public static class StorageSize extends TeaModel {
        @NameInMap("Max")
        private Integer max;

        @NameInMap("Min")
        private Integer min;

        @NameInMap("Step")
        private Integer step;

        private StorageSize(Builder builder) {
            this.max = builder.max;
            this.min = builder.min;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageSize create() {
            return builder().build();
        }

        /**
         * @return max
         */
        public Integer getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Integer getMin() {
            return this.min;
        }

        /**
         * @return step
         */
        public Integer getStep() {
            return this.step;
        }

        public static final class Builder {
            private Integer max; 
            private Integer min; 
            private Integer step; 

            /**
             * Max.
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            public StorageSize build() {
                return new StorageSize(this);
            } 

        } 

    }
    public static class SupportedStorageSize extends TeaModel {
        @NameInMap("StorageSize")
        private StorageSize storageSize;

        @NameInMap("StorageType")
        private String storageType;

        private SupportedStorageSize(Builder builder) {
            this.storageSize = builder.storageSize;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedStorageSize create() {
            return builder().build();
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
            private StorageSize storageSize; 
            private String storageType; 

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

            public SupportedStorageSize build() {
                return new SupportedStorageSize(this);
            } 

        } 

    }
    public static class SupportedStorageSizeList extends TeaModel {
        @NameInMap("SupportedStorageSize")
        private java.util.List < SupportedStorageSize> supportedStorageSize;

        private SupportedStorageSizeList(Builder builder) {
            this.supportedStorageSize = builder.supportedStorageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedStorageSizeList create() {
            return builder().build();
        }

        /**
         * @return supportedStorageSize
         */
        public java.util.List < SupportedStorageSize> getSupportedStorageSize() {
            return this.supportedStorageSize;
        }

        public static final class Builder {
            private java.util.List < SupportedStorageSize> supportedStorageSize; 

            /**
             * SupportedStorageSize.
             */
            public Builder supportedStorageSize(java.util.List < SupportedStorageSize> supportedStorageSize) {
                this.supportedStorageSize = supportedStorageSize;
                return this;
            }

            public SupportedStorageSizeList build() {
                return new SupportedStorageSizeList(this);
            } 

        } 

    }
    public static class SupportedInstanceClass extends TeaModel {
        @NameInMap("InstanceClass")
        private String instanceClass;

        @NameInMap("SupportedStorageSizeList")
        private SupportedStorageSizeList supportedStorageSizeList;

        @NameInMap("Tips")
        private String tips;

        private SupportedInstanceClass(Builder builder) {
            this.instanceClass = builder.instanceClass;
            this.supportedStorageSizeList = builder.supportedStorageSizeList;
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
         * @return supportedStorageSizeList
         */
        public SupportedStorageSizeList getSupportedStorageSizeList() {
            return this.supportedStorageSizeList;
        }

        /**
         * @return tips
         */
        public String getTips() {
            return this.tips;
        }

        public static final class Builder {
            private String instanceClass; 
            private SupportedStorageSizeList supportedStorageSizeList; 
            private String tips; 

            /**
             * InstanceClass.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * SupportedStorageSizeList.
             */
            public Builder supportedStorageSizeList(SupportedStorageSizeList supportedStorageSizeList) {
                this.supportedStorageSizeList = supportedStorageSizeList;
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

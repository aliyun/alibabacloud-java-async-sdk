// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeZonesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeZonesResponseBody</p>
 */
public class DescribeZonesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Zones")
    private Zones zones;

    private DescribeZonesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.zones = builder.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeZonesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return zones
     */
    public Zones getZones() {
        return this.zones;
    }

    public static final class Builder {
        private String requestId; 
        private Zones zones; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The queried zones.
         */
        public Builder zones(Zones zones) {
            this.zones = zones;
            return this;
        }

        public DescribeZonesResponseBody build() {
            return new DescribeZonesResponseBody(this);
        } 

    } 

    public static class Capacity extends TeaModel {
        @NameInMap("Protocol")
        private java.util.List < String > protocol;

        private Capacity(Builder builder) {
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Capacity create() {
            return builder().build();
        }

        /**
         * @return protocol
         */
        public java.util.List < String > getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private java.util.List < String > protocol; 

            /**
             * Protocol.
             */
            public Builder protocol(java.util.List < String > protocol) {
                this.protocol = protocol;
                return this;
            }

            public Capacity build() {
                return new Capacity(this);
            } 

        } 

    }
    public static class InstanceType extends TeaModel {
        @NameInMap("ProtocolType")
        private String protocolType;

        @NameInMap("StorageType")
        private String storageType;

        private InstanceType(Builder builder) {
            this.protocolType = builder.protocolType;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceType create() {
            return builder().build();
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private String protocolType; 
            private String storageType; 

            /**
             * The protocol type.
             * <p>
             * 
             * *   If the FileSystemType parameter is set to standard, the protocol type is nfs or smb.
             * *   If the FileSystemType parameter is set to extreme, the protocol type is nfs.
             * *   If the FileSystemType parameter is set to cpfs, the protocol type is cpfs.
             * 
             * > CPFS file systems are available only on the China site (aliyun.com).
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * The storage type.
             * <p>
             * 
             * *   If the FileSystemType parameter is set to standard, the storage type is Performance or Capacity.
             * *   If the FileSystemType parameter is set to extreme, the storage type is standard or advance.
             * *   If the FileSystemType parameter is set to cpfs, the storage type is advance\_100 (100 MB/s/TiB baseline) or advance\_200 (200 MB/s/TiB baseline).
             * 
             * > CPFS file systems are available only on the China site (aliyun.com).
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
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
             * InstanceType.
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
    public static class Performance extends TeaModel {
        @NameInMap("Protocol")
        private java.util.List < String > protocol;

        private Performance(Builder builder) {
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Performance create() {
            return builder().build();
        }

        /**
         * @return protocol
         */
        public java.util.List < String > getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private java.util.List < String > protocol; 

            /**
             * Protocol.
             */
            public Builder protocol(java.util.List < String > protocol) {
                this.protocol = protocol;
                return this;
            }

            public Performance build() {
                return new Performance(this);
            } 

        } 

    }
    public static class Zone extends TeaModel {
        @NameInMap("Capacity")
        private Capacity capacity;

        @NameInMap("InstanceTypes")
        private InstanceTypes instanceTypes;

        @NameInMap("Performance")
        private Performance performance;

        @NameInMap("ZoneId")
        private String zoneId;

        private Zone(Builder builder) {
            this.capacity = builder.capacity;
            this.instanceTypes = builder.instanceTypes;
            this.performance = builder.performance;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zone create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public Capacity getCapacity() {
            return this.capacity;
        }

        /**
         * @return instanceTypes
         */
        public InstanceTypes getInstanceTypes() {
            return this.instanceTypes;
        }

        /**
         * @return performance
         */
        public Performance getPerformance() {
            return this.performance;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Capacity capacity; 
            private InstanceTypes instanceTypes; 
            private Performance performance; 
            private String zoneId; 

            /**
             * This parameter is reserved. You can ignore this parameter.
             */
            public Builder capacity(Capacity capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * The details about file system types.
             */
            public Builder instanceTypes(InstanceTypes instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * This parameter is reserved. You can ignore this parameter.
             */
            public Builder performance(Performance performance) {
                this.performance = performance;
                return this;
            }

            /**
             * The zone ID.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Zone build() {
                return new Zone(this);
            } 

        } 

    }
    public static class Zones extends TeaModel {
        @NameInMap("Zone")
        private java.util.List < Zone> zone;

        private Zones(Builder builder) {
            this.zone = builder.zone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zones create() {
            return builder().build();
        }

        /**
         * @return zone
         */
        public java.util.List < Zone> getZone() {
            return this.zone;
        }

        public static final class Builder {
            private java.util.List < Zone> zone; 

            /**
             * Zone.
             */
            public Builder zone(java.util.List < Zone> zone) {
                this.zone = zone;
                return this;
            }

            public Zones build() {
                return new Zones(this);
            } 

        } 

    }
}

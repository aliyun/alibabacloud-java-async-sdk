// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeZonesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeZonesResponseBody</p>
 */
public class DescribeZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Zones")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A70BEE5D-76D3-49FB-B58F-1F398211****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried zones.</p>
         */
        public Builder zones(Zones zones) {
            this.zones = zones;
            return this;
        }

        public DescribeZonesResponseBody build() {
            return new DescribeZonesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class Capacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Protocol")
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
    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class InstanceType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("StorageType")
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
             * <p>The protocol type.</p>
             * <ul>
             * <li>If the FileSystemType parameter is set to standard, the protocol type is nfs or smb.</li>
             * <li>If the FileSystemType parameter is set to extreme, the protocol type is nfs.</li>
             * <li>If the FileSystemType parameter is set to cpfs, the protocol type is cpfs.</li>
             * </ul>
             * <blockquote>
             * <p>CPFS file systems are available only on the China site (aliyun.com).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>nfs</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The storage type.</p>
             * <ul>
             * <li>If the FileSystemType parameter is set to standard, the storage type is Performance or Capacity.</li>
             * <li>If the FileSystemType parameter is set to extreme, the storage type is standard or advance.</li>
             * <li>If the FileSystemType parameter is set to cpfs, the storage type is advance_100 (100 MB/s/TiB baseline) or advance_200 (200 MB/s/TiB baseline).</li>
             * </ul>
             * <blockquote>
             * <p>CPFS file systems are available only on the China site (aliyun.com).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Capacity</p>
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
    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class InstanceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
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
    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class Performance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Protocol")
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
    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class Zone extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Capacity capacity;

        @com.aliyun.core.annotation.NameInMap("InstanceTypes")
        private InstanceTypes instanceTypes;

        @com.aliyun.core.annotation.NameInMap("Performance")
        private Performance performance;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
             * <p>This parameter is reserved. You can ignore this parameter.</p>
             */
            public Builder capacity(Capacity capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The details about file system types.</p>
             */
            public Builder instanceTypes(InstanceTypes instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * <p>This parameter is reserved. You can ignore this parameter.</p>
             */
            public Builder performance(Performance performance) {
                this.performance = performance;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
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
    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class Zones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Zone")
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

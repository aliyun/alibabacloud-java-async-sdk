// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Zones.
         */
        public Builder zones(Zones zones) {
            this.zones = zones;
            return this;
        }

        public DescribeZonesResponseBody build() {
            return new DescribeZonesResponseBody(this);
        } 

    } 

    public static class SlaveZone extends TeaModel {
        @NameInMap("LocalName")
        private String localName;

        @NameInMap("ZoneId")
        private String zoneId;

        private SlaveZone(Builder builder) {
            this.localName = builder.localName;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlaveZone create() {
            return builder().build();
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String localName; 
            private String zoneId; 

            /**
             * LocalName.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public SlaveZone build() {
                return new SlaveZone(this);
            } 

        } 

    }
    public static class SlaveZones extends TeaModel {
        @NameInMap("SlaveZone")
        private java.util.List < SlaveZone> slaveZone;

        private SlaveZones(Builder builder) {
            this.slaveZone = builder.slaveZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlaveZones create() {
            return builder().build();
        }

        /**
         * @return slaveZone
         */
        public java.util.List < SlaveZone> getSlaveZone() {
            return this.slaveZone;
        }

        public static final class Builder {
            private java.util.List < SlaveZone> slaveZone; 

            /**
             * SlaveZone.
             */
            public Builder slaveZone(java.util.List < SlaveZone> slaveZone) {
                this.slaveZone = slaveZone;
                return this;
            }

            public SlaveZones build() {
                return new SlaveZones(this);
            } 

        } 

    }
    public static class Zone extends TeaModel {
        @NameInMap("LocalName")
        private String localName;

        @NameInMap("SlaveZones")
        private SlaveZones slaveZones;

        @NameInMap("ZoneId")
        private String zoneId;

        private Zone(Builder builder) {
            this.localName = builder.localName;
            this.slaveZones = builder.slaveZones;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zone create() {
            return builder().build();
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return slaveZones
         */
        public SlaveZones getSlaveZones() {
            return this.slaveZones;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String localName; 
            private SlaveZones slaveZones; 
            private String zoneId; 

            /**
             * LocalName.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * SlaveZones.
             */
            public Builder slaveZones(SlaveZones slaveZones) {
                this.slaveZones = slaveZones;
                return this;
            }

            /**
             * ZoneId.
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

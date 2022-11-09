// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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

    public static class KVStoreZone extends TeaModel {
        @NameInMap("Disabled")
        private Boolean disabled;

        @NameInMap("IsRds")
        private Boolean isRds;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SwitchNetwork")
        private Boolean switchNetwork;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("ZoneName")
        private String zoneName;

        private KVStoreZone(Builder builder) {
            this.disabled = builder.disabled;
            this.isRds = builder.isRds;
            this.regionId = builder.regionId;
            this.switchNetwork = builder.switchNetwork;
            this.zoneId = builder.zoneId;
            this.zoneName = builder.zoneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KVStoreZone create() {
            return builder().build();
        }

        /**
         * @return disabled
         */
        public Boolean getDisabled() {
            return this.disabled;
        }

        /**
         * @return isRds
         */
        public Boolean getIsRds() {
            return this.isRds;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return switchNetwork
         */
        public Boolean getSwitchNetwork() {
            return this.switchNetwork;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return zoneName
         */
        public String getZoneName() {
            return this.zoneName;
        }

        public static final class Builder {
            private Boolean disabled; 
            private Boolean isRds; 
            private String regionId; 
            private Boolean switchNetwork; 
            private String zoneId; 
            private String zoneName; 

            /**
             * Disabled.
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * IsRds.
             */
            public Builder isRds(Boolean isRds) {
                this.isRds = isRds;
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
             * SwitchNetwork.
             */
            public Builder switchNetwork(Boolean switchNetwork) {
                this.switchNetwork = switchNetwork;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * ZoneName.
             */
            public Builder zoneName(String zoneName) {
                this.zoneName = zoneName;
                return this;
            }

            public KVStoreZone build() {
                return new KVStoreZone(this);
            } 

        } 

    }
    public static class Zones extends TeaModel {
        @NameInMap("KVStoreZone")
        private java.util.List < KVStoreZone> KVStoreZone;

        private Zones(Builder builder) {
            this.KVStoreZone = builder.KVStoreZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zones create() {
            return builder().build();
        }

        /**
         * @return KVStoreZone
         */
        public java.util.List < KVStoreZone> getKVStoreZone() {
            return this.KVStoreZone;
        }

        public static final class Builder {
            private java.util.List < KVStoreZone> KVStoreZone; 

            /**
             * KVStoreZone.
             */
            public Builder KVStoreZone(java.util.List < KVStoreZone> KVStoreZone) {
                this.KVStoreZone = KVStoreZone;
                return this;
            }

            public Zones build() {
                return new Zones(this);
            } 

        } 

    }
}

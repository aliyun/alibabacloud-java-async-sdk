// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeZonesResponseBody model) {
            this.requestId = model.requestId;
            this.zones = model.zones;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1D42F072-72FE-4DC4-BB8E-64B1D298****</p>
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

    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class KVStoreZone extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Disabled")
        private Boolean disabled;

        @com.aliyun.core.annotation.NameInMap("IsRds")
        private Boolean isRds;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SwitchNetwork")
        private Boolean switchNetwork;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneName")
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

            private Builder() {
            } 

            private Builder(KVStoreZone model) {
                this.disabled = model.disabled;
                this.isRds = model.isRds;
                this.regionId = model.regionId;
                this.switchNetwork = model.switchNetwork;
                this.zoneId = model.zoneId;
                this.zoneName = model.zoneName;
            } 

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
    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class Zones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KVStoreZone")
        private java.util.List<KVStoreZone> KVStoreZone;

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
        public java.util.List<KVStoreZone> getKVStoreZone() {
            return this.KVStoreZone;
        }

        public static final class Builder {
            private java.util.List<KVStoreZone> KVStoreZone; 

            private Builder() {
            } 

            private Builder(Zones model) {
                this.KVStoreZone = model.KVStoreZone;
            } 

            /**
             * KVStoreZone.
             */
            public Builder KVStoreZone(java.util.List<KVStoreZone> KVStoreZone) {
                this.KVStoreZone = KVStoreZone;
                return this;
            }

            public Zones build() {
                return new Zones(this);
            } 

        } 

    }
}

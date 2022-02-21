// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableDedicatedHostZonesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableDedicatedHostZonesResponseBody</p>
 */
public class DescribeAvailableDedicatedHostZonesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Zones")
    private Zones zones;

    private DescribeAvailableDedicatedHostZonesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.zones = builder.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableDedicatedHostZonesResponseBody create() {
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

        public DescribeAvailableDedicatedHostZonesResponseBody build() {
            return new DescribeAvailableDedicatedHostZonesResponseBody(this);
        } 

    } 

    public static class DedicatedHostZones extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("ZoneId")
        private String zoneId;

        private DedicatedHostZones(Builder builder) {
            this.description = builder.description;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHostZones create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String description; 
            private String zoneId; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DedicatedHostZones build() {
                return new DedicatedHostZones(this);
            } 

        } 

    }
    public static class Zones extends TeaModel {
        @NameInMap("DedicatedHostZones")
        private java.util.List < DedicatedHostZones> dedicatedHostZones;

        private Zones(Builder builder) {
            this.dedicatedHostZones = builder.dedicatedHostZones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zones create() {
            return builder().build();
        }

        /**
         * @return dedicatedHostZones
         */
        public java.util.List < DedicatedHostZones> getDedicatedHostZones() {
            return this.dedicatedHostZones;
        }

        public static final class Builder {
            private java.util.List < DedicatedHostZones> dedicatedHostZones; 

            /**
             * DedicatedHostZones.
             */
            public Builder dedicatedHostZones(java.util.List < DedicatedHostZones> dedicatedHostZones) {
                this.dedicatedHostZones = dedicatedHostZones;
                return this;
            }

            public Zones build() {
                return new Zones(this);
            } 

        } 

    }
}

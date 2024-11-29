// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListEnhanhcedNatGatewayAvailableZonesResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnhanhcedNatGatewayAvailableZonesResponseBody</p>
 */
public class ListEnhanhcedNatGatewayAvailableZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Zones")
    private java.util.List < Zones> zones;

    private ListEnhanhcedNatGatewayAvailableZonesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.zones = builder.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnhanhcedNatGatewayAvailableZonesResponseBody create() {
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
    public java.util.List < Zones> getZones() {
        return this.zones;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Zones> zones; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8AE6F367-52EA-535D-9A3D-EF23D70527C8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of zones.</p>
         */
        public Builder zones(java.util.List < Zones> zones) {
            this.zones = zones;
            return this;
        }

        public ListEnhanhcedNatGatewayAvailableZonesResponseBody build() {
            return new ListEnhanhcedNatGatewayAvailableZonesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEnhanhcedNatGatewayAvailableZonesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnhanhcedNatGatewayAvailableZonesResponseBody</p>
     */
    public static class Zones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Zones(Builder builder) {
            this.localName = builder.localName;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zones create() {
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
             * <p>The name of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>Dubai Zone A</p>
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * <p>The ID of the zone where the instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>me-east-1a</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Zones build() {
                return new Zones(this);
            } 

        } 

    }
}

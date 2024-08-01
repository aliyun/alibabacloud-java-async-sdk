// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailabilityZonesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailabilityZonesResponseBody</p>
 */
public class DescribeAvailabilityZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableZones")
    private java.util.List < AvailableZones> availableZones;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAvailabilityZonesResponseBody(Builder builder) {
        this.availableZones = builder.availableZones;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailabilityZonesResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableZones
     */
    public java.util.List < AvailableZones> getAvailableZones() {
        return this.availableZones;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AvailableZones> availableZones; 
        private String requestId; 

        /**
         * The details of the zones in which you can create ApsaraDB for MongoDB instances.
         */
        public Builder availableZones(java.util.List < AvailableZones> availableZones) {
            this.availableZones = availableZones;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAvailabilityZonesResponseBody build() {
            return new DescribeAvailabilityZonesResponseBody(this);
        } 

    } 

    public static class AvailableZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneName")
        private String zoneName;

        private AvailableZones(Builder builder) {
            this.regionId = builder.regionId;
            this.zoneId = builder.zoneId;
            this.zoneName = builder.zoneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableZones create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
            private String regionId; 
            private String zoneId; 
            private String zoneName; 

            /**
             * The ID of the region. You can call the [DescribeRegions](~~61933~~) operation to query the latest available regions.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the zone.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The name of the zone.
             * <p>
             * 
             * The return value of the ZoneName parameter is in the language that is specified by the **AcceptLanguage** parameter. For example, if the value of the ZoneId parameter in the response is **cn-hangzhou-h**, the following values are returned for the ZoneName parameter:
             * 
             * *   If the value of the **AcceptLanguage** parameter is **zh**, **H** is returned for the ZoneName parameter.
             * *   If the value of the **AcceptLanguage** parameter is **en**, **Hangzhou Zone H** is returned for the ZoneName parameter.
             */
            public Builder zoneName(String zoneName) {
                this.zoneName = zoneName;
                return this;
            }

            public AvailableZones build() {
                return new AvailableZones(this);
            } 

        } 

    }
}

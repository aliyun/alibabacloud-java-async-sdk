// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeZonesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeZonesResponseBody</p>
 */
public class DescribeZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Zones")
    private java.util.List < Zones> zones;

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
    public java.util.List < Zones> getZones() {
        return this.zones;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Zones> zones; 

        /**
         * ```
         * <p>
         * http(s)://[Endpoint]/?Action=DescribeZones
         * &Series=normal
         * &DeployType=single
         * &Common request parameters
         * ```
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * You can call this operation to learn of zones where a cluster can be created in an Alibaba Cloud region.
         */
        public Builder zones(java.util.List < Zones> zones) {
            this.zones = zones;
            return this;
        }

        public DescribeZonesResponseBody build() {
            return new DescribeZonesResponseBody(this);
        } 

    } 

    public static class Zones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeployType")
        private String deployType;

        @com.aliyun.core.annotation.NameInMap("Series")
        private String series;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneName")
        private String zoneName;

        private Zones(Builder builder) {
            this.deployType = builder.deployType;
            this.series = builder.series;
            this.zoneId = builder.zoneId;
            this.zoneName = builder.zoneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zones create() {
            return builder().build();
        }

        /**
         * @return deployType
         */
        public String getDeployType() {
            return this.deployType;
        }

        /**
         * @return series
         */
        public String getSeries() {
            return this.series;
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
            private String deployType; 
            private String series; 
            private String zoneId; 
            private String zoneName; 

            /**
             * DeployType.
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * Series.
             */
            public Builder series(String series) {
                this.series = series;
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

            public Zones build() {
                return new Zones(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpnGatewayAvailableZonesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpnGatewayAvailableZonesResponseBody</p>
 */
public class DescribeVpnGatewayAvailableZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableZoneIdList")
    private java.util.List < AvailableZoneIdList> availableZoneIdList;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVpnGatewayAvailableZonesResponseBody(Builder builder) {
        this.availableZoneIdList = builder.availableZoneIdList;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpnGatewayAvailableZonesResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableZoneIdList
     */
    public java.util.List < AvailableZoneIdList> getAvailableZoneIdList() {
        return this.availableZoneIdList;
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
        private java.util.List < AvailableZoneIdList> availableZoneIdList; 
        private String regionId; 
        private String requestId; 

        /**
         * AvailableZoneIdList.
         */
        public Builder availableZoneIdList(java.util.List < AvailableZoneIdList> availableZoneIdList) {
            this.availableZoneIdList = availableZoneIdList;
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

        public DescribeVpnGatewayAvailableZonesResponseBody build() {
            return new DescribeVpnGatewayAvailableZonesResponseBody(this);
        } 

    } 

    public static class AvailableZoneIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneName")
        private String zoneName;

        private AvailableZoneIdList(Builder builder) {
            this.zoneId = builder.zoneId;
            this.zoneName = builder.zoneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableZoneIdList create() {
            return builder().build();
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
            private String zoneId; 
            private String zoneName; 

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

            public AvailableZoneIdList build() {
                return new AvailableZoneIdList(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeAvailabilityZonesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailabilityZonesResponseBody</p>
 */
public class DescribeAvailabilityZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableZones")
    private java.util.List<AvailableZones> availableZones;

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
    public java.util.List<AvailableZones> getAvailableZones() {
        return this.availableZones;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AvailableZones> availableZones; 
        private String requestId; 

        /**
         * <p>The details of the zones in which you can create ApsaraDB for MongoDB instances.</p>
         */
        public Builder availableZones(java.util.List<AvailableZones> availableZones) {
            this.availableZones = availableZones;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>19A13A33-0FAD-5120-8AE1-B1636F74DD80</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAvailabilityZonesResponseBody build() {
            return new DescribeAvailabilityZonesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAvailabilityZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailabilityZonesResponseBody</p>
     */
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
             * <p>The ID of the region. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the latest available regions.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-f</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * <p>The name of the zone.</p>
             * <p>The return value of the ZoneName parameter is in the language that is specified by the <strong>AcceptLanguage</strong> parameter. For example, if the value of the ZoneId parameter in the response is <strong>cn-hangzhou-h</strong>, the following values are returned for the ZoneName parameter:</p>
             * <ul>
             * <li>If the value of the <strong>AcceptLanguage</strong> parameter is <strong>zh</strong>, <strong>H</strong> is returned for the ZoneName parameter.</li>
             * <li>If the value of the <strong>AcceptLanguage</strong> parameter is <strong>en</strong>, <strong>Hangzhou Zone H</strong> is returned for the ZoneName parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou Zone H</p>
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

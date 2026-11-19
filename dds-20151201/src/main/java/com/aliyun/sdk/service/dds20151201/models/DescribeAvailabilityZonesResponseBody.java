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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAvailabilityZonesResponseBody model) {
            this.availableZones = model.availableZones;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the zones where resources are available for purchase.</p>
         */
        public Builder availableZones(java.util.List<AvailableZones> availableZones) {
            this.availableZones = availableZones;
            return this;
        }

        /**
         * <p>The request ID.</p>
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

            private Builder() {
            } 

            private Builder(AvailableZones model) {
                this.regionId = model.regionId;
                this.zoneId = model.zoneId;
                this.zoneName = model.zoneName;
            } 

            /**
             * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-f</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * <p>The zone name.</p>
             * <p>The returned language is determined by the <strong>AcceptLanguage</strong> parameter. Take the <strong>cn-hangzhou-h</strong> zone as an example:</p>
             * <ul>
             * <li>If <strong>AcceptLanguage</strong> is set to <strong>zh</strong>: 杭州 可用区H</li>
             * <li>If <strong>AcceptLanguage</strong> is set to <strong>en</strong>: Hangzhou Zone H</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>杭州 可用区H</p>
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

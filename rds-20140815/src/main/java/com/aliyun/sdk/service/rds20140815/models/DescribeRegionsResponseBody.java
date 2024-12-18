// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRegionsResponseBody</p>
 */
public class DescribeRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Regions")
    private Regions regions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRegionsResponseBody(Builder builder) {
        this.regions = builder.regions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return regions
     */
    public Regions getRegions() {
        return this.regions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Regions regions; 
        private String requestId; 

        /**
         * <p>The available regions and zones.</p>
         */
        public Builder regions(Regions regions) {
            this.regions = regions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRegionsResponseBody build() {
            return new DescribeRegionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionsResponseBody</p>
     */
    public static class RDSRegion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("RegionEndpoint")
        private String regionEndpoint;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneName")
        private String zoneName;

        private RDSRegion(Builder builder) {
            this.localName = builder.localName;
            this.regionEndpoint = builder.regionEndpoint;
            this.regionId = builder.regionId;
            this.zoneId = builder.zoneId;
            this.zoneName = builder.zoneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RDSRegion create() {
            return builder().build();
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return regionEndpoint
         */
        public String getRegionEndpoint() {
            return this.regionEndpoint;
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
            private String localName; 
            private String regionEndpoint; 
            private String regionId; 
            private String zoneId; 
            private String zoneName; 

            /**
             * <p>The region name. The return value of this parameter is in the language that is specified by the <strong>AcceptLanguage</strong> parameter. For example, if the value of the RegionId parameter in the response is cn-hangzhou, the following values are returned for the LocalName parameter:</p>
             * <ul>
             * <li>If the value of the <strong>AcceptLanguage</strong> parameter is <strong>zh-CN</strong>, the value  1()is returned for the LocalName parameter.</li>
             * <li>If the value of the <strong>AcceptLanguage</strong> parameter is <strong>en-US</strong>, the value China (Hangzhou) is returned for the LocalName parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>China (Hangzhou)</p>
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * <p>The endpoint that is used to connect to Alibaba Cloud services in the region. For more information, see <a href="https://help.aliyun.com/document_detail/610370.html">Endpoints</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>rds.aliyuncs.com</p>
             */
            public Builder regionEndpoint(String regionEndpoint) {
                this.regionEndpoint = regionEndpoint;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * <p>The zone name. The return value of this parameter is in the language that is specified by the <strong>AcceptLanguage</strong> parameter. For example, if the value of the ZoneId parameter in the response is cn-hangzhou-j, the following values are returned for the ZoneName parameter:</p>
             * <ul>
             * <li>If the value of the <strong>AcceptLanguage</strong> parameter is <strong>zh-CN</strong>, the value   J is returned for the ZoneName parameter.</li>
             * <li>If the value of the <strong>AcceptLanguage</strong> parameter is <strong>en-US</strong>, the value Hangzhou Zone J is returned for the ZoneName parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou Zone H</p>
             */
            public Builder zoneName(String zoneName) {
                this.zoneName = zoneName;
                return this;
            }

            public RDSRegion build() {
                return new RDSRegion(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionsResponseBody</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RDSRegion")
        private java.util.List<RDSRegion> RDSRegion;

        private Regions(Builder builder) {
            this.RDSRegion = builder.RDSRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return RDSRegion
         */
        public java.util.List<RDSRegion> getRDSRegion() {
            return this.RDSRegion;
        }

        public static final class Builder {
            private java.util.List<RDSRegion> RDSRegion; 

            /**
             * RDSRegion.
             */
            public Builder RDSRegion(java.util.List<RDSRegion> RDSRegion) {
                this.RDSRegion = RDSRegion;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}

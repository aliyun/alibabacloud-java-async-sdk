// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Regions")
    private Regions regions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRegionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.regions = builder.regions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Integer code; 
        private String message; 
        private Regions regions; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRegionsResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.regions = model.regions;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: The call was successful.</li>
         * <li><strong>3xx</strong>: The call was redirected.</li>
         * <li><strong>4xx</strong>: The call failed.</li>
         * <li><strong>5xx</strong>: A server error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The regions.</p>
         */
        public Builder regions(Regions regions) {
            this.regions = regions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DDE85827-B0B3-4E56-86E8-17C42009****</p>
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
    public static class RecommendZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecommendZone")
        private java.util.List<String> recommendZone;

        private RecommendZones(Builder builder) {
            this.recommendZone = builder.recommendZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendZones create() {
            return builder().build();
        }

        /**
         * @return recommendZone
         */
        public java.util.List<String> getRecommendZone() {
            return this.recommendZone;
        }

        public static final class Builder {
            private java.util.List<String> recommendZone; 

            private Builder() {
            } 

            private Builder(RecommendZones model) {
                this.recommendZone = model.recommendZone;
            } 

            /**
             * RecommendZone.
             */
            public Builder recommendZone(java.util.List<String> recommendZone) {
                this.recommendZone = recommendZone;
                return this;
            }

            public RecommendZones build() {
                return new RecommendZones(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionsResponseBody</p>
     */
    public static class Region extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("RecommendZones")
        private RecommendZones recommendZones;

        @com.aliyun.core.annotation.NameInMap("RegionEndpoint")
        private String regionEndpoint;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private Region(Builder builder) {
            this.localName = builder.localName;
            this.recommendZones = builder.recommendZones;
            this.regionEndpoint = builder.regionEndpoint;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Region create() {
            return builder().build();
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return recommendZones
         */
        public RecommendZones getRecommendZones() {
            return this.recommendZones;
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

        public static final class Builder {
            private String localName; 
            private RecommendZones recommendZones; 
            private String regionEndpoint; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(Region model) {
                this.localName = model.localName;
                this.recommendZones = model.recommendZones;
                this.regionEndpoint = model.regionEndpoint;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The region name. Valid values:</p>
             * <ul>
             * <li><strong>China (Hangzhou)</strong></li>
             * <li><strong>China (Shanghai)</strong></li>
             * <li><strong>China (Beijing)</strong></li>
             * <li><strong>China (Zhangjiakou)</strong></li>
             * <li><strong>China (Shenzhen)</strong></li>
             * <li><strong>China (Guangzhou)</strong></li>
             * <li><strong>China (Hong Kong)</strong></li>
             * <li><strong>Singapore</strong></li>
             * <li><strong>US (Silicon Valley)</strong></li>
             * </ul>
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * <p>The recommended zones.</p>
             */
            public Builder recommendZones(RecommendZones recommendZones) {
                this.recommendZones = recommendZones;
                return this;
            }

            /**
             * <p>The endpoint for the region. Valid values:</p>
             * <ul>
             * <li><strong>sae.cn-hangzhou.aliyuncs.com</strong></li>
             * <li><strong>sae.cn-shanghai.aliyuncs.com</strong></li>
             * <li><strong>sae.cn-beijing.aliyuncs.com</strong></li>
             * <li><strong>sae.cn-zhangjiakou.aliyuncs.com</strong></li>
             * <li><strong>sae.cn-shenzhen.aliyuncs.com</strong></li>
             * <li><strong>sae.cn-guangzhou.aliyuncs.com</strong></li>
             * <li><strong>sae.cn-hongkong.aliyuncs.com</strong></li>
             * <li><strong>sae.ap-southeast-1.aliyuncs.com</strong></li>
             * <li><strong>sae.us-west-1.aliyuncs.com</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sae.cn-shanghai.aliyuncs.com</p>
             */
            public Builder regionEndpoint(String regionEndpoint) {
                this.regionEndpoint = regionEndpoint;
                return this;
            }

            /**
             * <p>The region ID. Valid values:</p>
             * <ul>
             * <li><strong>cn-hangzhou</strong>: the ID of the China (Hangzhou) region</li>
             * <li><strong>cn-shanghai</strong>: the ID of the China (Shanghai) region</li>
             * <li><strong>cn-beijing</strong>: the ID of the China (Beijing) region</li>
             * <li><strong>cn-zhangjiakou</strong>: the ID of the China (Zhangjiakou) region</li>
             * <li><strong>cn-shenzhen</strong>: the ID of the China (Shenzhen) region</li>
             * <li><strong>cn-guangzhou</strong>: the ID of the China (Guangzhou) region</li>
             * <li><strong>cn-hongkong</strong>: the ID of the China (Hong Kong) region</li>
             * <li><strong>ap-southeast-1</strong>: the ID of the Singapore region</li>
             * <li><strong>us-west-1</strong>: the ID of the US (Silicon Valley) region</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Region build() {
                return new Region(this);
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
        @com.aliyun.core.annotation.NameInMap("Region")
        private java.util.List<Region> region;

        private Regions(Builder builder) {
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return region
         */
        public java.util.List<Region> getRegion() {
            return this.region;
        }

        public static final class Builder {
            private java.util.List<Region> region; 

            private Builder() {
            } 

            private Builder(Regions model) {
                this.region = model.region;
            } 

            /**
             * Region.
             */
            public Builder region(java.util.List<Region> region) {
                this.region = region;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * - **2xx**: The call was successful.
         * - **3xx**: The call was redirected.
         * - **4xx**: The call failed.
         * - **5xx**: A server error occurred.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * No request parameters are required.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder regions(Regions regions) {
            this.regions = regions;
            return this;
        }

        /**
         * The returned information.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRegionsResponseBody build() {
            return new DescribeRegionsResponseBody(this);
        } 

    } 

    public static class RecommendZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecommendZone")
        private java.util.List < String > recommendZone;

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
        public java.util.List < String > getRecommendZone() {
            return this.recommendZone;
        }

        public static final class Builder {
            private java.util.List < String > recommendZone; 

            /**
             * RecommendZone.
             */
            public Builder recommendZone(java.util.List < String > recommendZone) {
                this.recommendZone = recommendZone;
                return this;
            }

            public RecommendZones build() {
                return new RecommendZones(this);
            } 

        } 

    }
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

            /**
             * The list of regions.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * The ID of the region. Valid values:
             * <p>
             * 
             * *   **cn-hangzhou**: the ID of the China (Hangzhou) region
             * *   **cn-shanghai**: the ID of the China (Shanghai) region
             * *   **cn-beijing**: the ID of the China (Beijing) region
             * *   **cn-zhangjiakou**: the ID of the China (Zhangjiakou) region
             * *   **cn-shenzhen**: the ID of the China (Shenzhen) region
             * *   **cn-guangzhou**: the ID of the China (Guangzhou) region
             * *   **cn-hongkong**: the ID of the China (Hong Kong) region
             * *   **ap-southeast-1**: the ID of the Singapore region
             * *   **us-west-1**: the ID of the US (Silicon Valley) region
             */
            public Builder recommendZones(RecommendZones recommendZones) {
                this.recommendZones = recommendZones;
                return this;
            }

            /**
             * The name of the region. Valid values:
             * <p>
             * 
             * *   **China (Hangzhou)**
             * *   **China (Shanghai)**
             * *   **China (Beijing)**
             * *   **China (Zhangjiakou)**
             * *   **China (Shenzhen)**
             * *   **China (Guangzhou)**
             * *   **China (Hong Kong)**
             * *   **Singapore (Singapore)**
             * *   **US (Silicon Valley)**
             */
            public Builder regionEndpoint(String regionEndpoint) {
                this.regionEndpoint = regionEndpoint;
                return this;
            }

            /**
             * The endpoint of the region. Valid values:
             * <p>
             * 
             * *   **sae.cn-hangzhou.aliyuncs.com**
             * *   **sae.cn-shanghai.aliyuncs.com**
             * *   **sae.cn-beijing.aliyuncs.com**
             * *   **sae.cn-zhangjiakou.aliyuncs.com**
             * *   **sae.cn-shenzhen.aliyuncs.com**
             * *   **sae.cn-guangzhou.aliyuncs.com**
             * *   **sae.cn-hongkong.aliyuncs.com**
             * *   **sae.ap-southeast-1.aliyuncs.com**
             * *   **sae.us-west-1.aliyuncs.com**
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
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Region")
        private java.util.List < Region> region;

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
        public java.util.List < Region> getRegion() {
            return this.region;
        }

        public static final class Builder {
            private java.util.List < Region> region; 

            /**
             * Region.
             */
            public Builder region(java.util.List < Region> region) {
                this.region = region;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}

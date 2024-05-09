// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebAreaBlockConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebAreaBlockConfigsResponseBody</p>
 */
public class DescribeWebAreaBlockConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AreaBlockConfigs")
    private java.util.List < AreaBlockConfigs> areaBlockConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeWebAreaBlockConfigsResponseBody(Builder builder) {
        this.areaBlockConfigs = builder.areaBlockConfigs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebAreaBlockConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return areaBlockConfigs
     */
    public java.util.List < AreaBlockConfigs> getAreaBlockConfigs() {
        return this.areaBlockConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AreaBlockConfigs> areaBlockConfigs; 
        private String requestId; 

        /**
         * An array that consists of the configurations of the Location Blacklist (Domain Names) policy.
         */
        public Builder areaBlockConfigs(java.util.List < AreaBlockConfigs> areaBlockConfigs) {
            this.areaBlockConfigs = areaBlockConfigs;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWebAreaBlockConfigsResponseBody build() {
            return new DescribeWebAreaBlockConfigsResponseBody(this);
        } 

    } 

    public static class RegionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Block")
        private Integer block;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private RegionList(Builder builder) {
            this.block = builder.block;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionList create() {
            return builder().build();
        }

        /**
         * @return block
         */
        public Integer getBlock() {
            return this.block;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private Integer block; 
            private String region; 

            /**
             * Indicates whether the location is blocked. Valid values:
             * <p>
             * 
             * *   **0**: yes
             * *   **1**: no
             */
            public Builder block(Integer block) {
                this.block = block;
                return this;
            }

            /**
             * The name of the location.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public RegionList build() {
                return new RegionList(this);
            } 

        } 

    }
    public static class AreaBlockConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("RegionList")
        private java.util.List < RegionList> regionList;

        private AreaBlockConfigs(Builder builder) {
            this.domain = builder.domain;
            this.regionList = builder.regionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AreaBlockConfigs create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return regionList
         */
        public java.util.List < RegionList> getRegionList() {
            return this.regionList;
        }

        public static final class Builder {
            private String domain; 
            private java.util.List < RegionList> regionList; 

            /**
             * The domain name of the website.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The configuration of the blocked locations.
             */
            public Builder regionList(java.util.List < RegionList> regionList) {
                this.regionList = regionList;
                return this;
            }

            public AreaBlockConfigs build() {
                return new AreaBlockConfigs(this);
            } 

        } 

    }
}

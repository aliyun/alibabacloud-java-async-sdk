// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeWebAreaBlockConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebAreaBlockConfigsResponseBody</p>
 */
public class DescribeWebAreaBlockConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AreaBlockConfigs")
    private java.util.List<AreaBlockConfigs> areaBlockConfigs;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return areaBlockConfigs
     */
    public java.util.List<AreaBlockConfigs> getAreaBlockConfigs() {
        return this.areaBlockConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AreaBlockConfigs> areaBlockConfigs; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeWebAreaBlockConfigsResponseBody model) {
            this.areaBlockConfigs = model.areaBlockConfigs;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array that consists of the configurations of the Location Blacklist (Domain Names) policy.</p>
         */
        public Builder areaBlockConfigs(java.util.List<AreaBlockConfigs> areaBlockConfigs) {
            this.areaBlockConfigs = areaBlockConfigs;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0bcf28g5-d57c-11e7-9bs0-d89d6717dxbc</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWebAreaBlockConfigsResponseBody build() {
            return new DescribeWebAreaBlockConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWebAreaBlockConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebAreaBlockConfigsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(RegionList model) {
                this.block = model.block;
                this.region = model.region;
            } 

            /**
             * <p>Indicates whether the location is blocked. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: yes</li>
             * <li><strong>1</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder block(Integer block) {
                this.block = block;
                return this;
            }

            /**
             * <p>The name of the location.</p>
             * 
             * <strong>example:</strong>
             * <p>CN-SHANGHAI</p>
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
    /**
     * 
     * {@link DescribeWebAreaBlockConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebAreaBlockConfigsResponseBody</p>
     */
    public static class AreaBlockConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("RegionList")
        private java.util.List<RegionList> regionList;

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
        public java.util.List<RegionList> getRegionList() {
            return this.regionList;
        }

        public static final class Builder {
            private String domain; 
            private java.util.List<RegionList> regionList; 

            private Builder() {
            } 

            private Builder(AreaBlockConfigs model) {
                this.domain = model.domain;
                this.regionList = model.regionList;
            } 

            /**
             * <p>The domain name of the website.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The configuration of the blocked locations.</p>
             */
            public Builder regionList(java.util.List<RegionList> regionList) {
                this.regionList = regionList;
                return this;
            }

            public AreaBlockConfigs build() {
                return new AreaBlockConfigs(this);
            } 

        } 

    }
}

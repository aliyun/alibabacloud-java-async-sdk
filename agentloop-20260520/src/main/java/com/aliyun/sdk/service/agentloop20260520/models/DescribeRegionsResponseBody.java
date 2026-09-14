// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("regions")
    private java.util.List<Regions> regions;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private DescribeRegionsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regions
     */
    public java.util.List<Regions> getRegions() {
        return this.regions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<Regions> regions; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRegionsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.regions = model.regions;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The maximum number of entries returned per request.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. If no more pages are available, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>ydx438PDAW1lYRJZbBn9</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region information.</p>
         */
        public Builder regions(java.util.List<Regions> regions) {
            this.regions = regions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4FDD8668-516C-5183-9BCF-4CAD8E3CF327</p>
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
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("internetEndpoint")
        private String internetEndpoint;

        @com.aliyun.core.annotation.NameInMap("localName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("vpcEndpoint")
        private String vpcEndpoint;

        private Regions(Builder builder) {
            this.internetEndpoint = builder.internetEndpoint;
            this.localName = builder.localName;
            this.regionId = builder.regionId;
            this.vpcEndpoint = builder.vpcEndpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return internetEndpoint
         */
        public String getInternetEndpoint() {
            return this.internetEndpoint;
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vpcEndpoint
         */
        public String getVpcEndpoint() {
            return this.vpcEndpoint;
        }

        public static final class Builder {
            private String internetEndpoint; 
            private String localName; 
            private String regionId; 
            private String vpcEndpoint; 

            private Builder() {
            } 

            private Builder(Regions model) {
                this.internetEndpoint = model.internetEndpoint;
                this.localName = model.localName;
                this.regionId = model.regionId;
                this.vpcEndpoint = model.vpcEndpoint;
            } 

            /**
             * <p>The public endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>agentloop.cn-hangzhou.aliyuncs.com</p>
             */
            public Builder internetEndpoint(String internetEndpoint) {
                this.internetEndpoint = internetEndpoint;
                return this;
            }

            /**
             * <p>The region name.</p>
             * 
             * <strong>example:</strong>
             * <p>华东1（杭州）</p>
             */
            public Builder localName(String localName) {
                this.localName = localName;
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
             * <p>The internal endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>agentloop.cn-hangzhou.aliyuncs.com</p>
             */
            public Builder vpcEndpoint(String vpcEndpoint) {
                this.vpcEndpoint = vpcEndpoint;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}

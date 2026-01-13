// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeCloudResourceListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudResourceListResponseBody</p>
 */
public class DescribeCloudResourceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudResourceList")
    private java.util.List<CloudResourceList> cloudResourceList;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCloudResourceListResponseBody(Builder builder) {
        this.cloudResourceList = builder.cloudResourceList;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudResourceListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudResourceList
     */
    public java.util.List<CloudResourceList> getCloudResourceList() {
        return this.cloudResourceList;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<CloudResourceList> cloudResourceList; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeCloudResourceListResponseBody model) {
            this.cloudResourceList = model.cloudResourceList;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * CloudResourceList.
         */
        public Builder cloudResourceList(java.util.List<CloudResourceList> cloudResourceList) {
            this.cloudResourceList = cloudResourceList;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCloudResourceListResponseBody build() {
            return new DescribeCloudResourceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudResourceListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudResourceListResponseBody</p>
     */
    public static class CloudResourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CloudResourceId")
        private String cloudResourceId;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceId")
        private String resourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
        private String resourceManagerResourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceProduct")
        private String resourceProduct;

        @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
        private String resourceRegionId;

        private CloudResourceList(Builder builder) {
            this.cloudResourceId = builder.cloudResourceId;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.resourceInstanceId = builder.resourceInstanceId;
            this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
            this.resourceProduct = builder.resourceProduct;
            this.resourceRegionId = builder.resourceRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudResourceList create() {
            return builder().build();
        }

        /**
         * @return cloudResourceId
         */
        public String getCloudResourceId() {
            return this.cloudResourceId;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return resourceInstanceId
         */
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        /**
         * @return resourceManagerResourceGroupId
         */
        public String getResourceManagerResourceGroupId() {
            return this.resourceManagerResourceGroupId;
        }

        /**
         * @return resourceProduct
         */
        public String getResourceProduct() {
            return this.resourceProduct;
        }

        /**
         * @return resourceRegionId
         */
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        public static final class Builder {
            private String cloudResourceId; 
            private Integer port; 
            private String protocol; 
            private String resourceInstanceId; 
            private String resourceManagerResourceGroupId; 
            private String resourceProduct; 
            private String resourceRegionId; 

            private Builder() {
            } 

            private Builder(CloudResourceList model) {
                this.cloudResourceId = model.cloudResourceId;
                this.port = model.port;
                this.protocol = model.protocol;
                this.resourceInstanceId = model.resourceInstanceId;
                this.resourceManagerResourceGroupId = model.resourceManagerResourceGroupId;
                this.resourceProduct = model.resourceProduct;
                this.resourceRegionId = model.resourceRegionId;
            } 

            /**
             * CloudResourceId.
             */
            public Builder cloudResourceId(String cloudResourceId) {
                this.cloudResourceId = cloudResourceId;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * ResourceInstanceId.
             */
            public Builder resourceInstanceId(String resourceInstanceId) {
                this.resourceInstanceId = resourceInstanceId;
                return this;
            }

            /**
             * ResourceManagerResourceGroupId.
             */
            public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
                this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
                return this;
            }

            /**
             * ResourceProduct.
             */
            public Builder resourceProduct(String resourceProduct) {
                this.resourceProduct = resourceProduct;
                return this;
            }

            /**
             * ResourceRegionId.
             */
            public Builder resourceRegionId(String resourceRegionId) {
                this.resourceRegionId = resourceRegionId;
                return this;
            }

            public CloudResourceList build() {
                return new CloudResourceList(this);
            } 

        } 

    }
}

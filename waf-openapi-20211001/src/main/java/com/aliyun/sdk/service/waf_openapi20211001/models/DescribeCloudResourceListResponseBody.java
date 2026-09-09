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
         * <p>The list of resources connected to WAF in cloud native mode.</p>
         */
        public Builder cloudResourceList(java.util.List<CloudResourceList> cloudResourceList) {
            this.cloudResourceList = cloudResourceList;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page. If a value is returned for this parameter, the next page exists.</p>
         * <blockquote>
         * <p>If this parameter has a return value, the next page exists. You can use the returned <strong>NextToken</strong> value as a request parameter to obtain the next page of data. Repeat this process until no value is returned, which indicates that all data has been retrieved.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F35F45B0-5D6B-4238-BE02-A62D****E840</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>118</p>
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

        @com.aliyun.core.annotation.NameInMap("ResourceDomain")
        private String resourceDomain;

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
            this.resourceDomain = builder.resourceDomain;
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
         * @return resourceDomain
         */
        public String getResourceDomain() {
            return this.resourceDomain;
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
            private String resourceDomain; 
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
                this.resourceDomain = model.resourceDomain;
                this.resourceInstanceId = model.resourceInstanceId;
                this.resourceManagerResourceGroupId = model.resourceManagerResourceGroupId;
                this.resourceProduct = model.resourceProduct;
                this.resourceRegionId = model.resourceRegionId;
            } 

            /**
             * <p>The ID of the connected resource, which is automatically generated by WAF.</p>
             * 
             * <strong>example:</strong>
             * <p>i-8vbdlsd********81e22-80-ecs</p>
             */
            public Builder cloudResourceId(String cloudResourceId) {
                this.cloudResourceId = cloudResourceId;
                return this;
            }

            /**
             * <p>The port of the cloud service connected to WAF.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol type. Valid values:</p>
             * <ul>
             * <li><strong>http</strong>: HTTP.</li>
             * <li><strong>https</strong>: HTTPS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>http</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The domain name connected to WAF.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.c**sw.net">www.c**sw.net</a></p>
             */
            public Builder resourceDomain(String resourceDomain) {
                this.resourceDomain = resourceDomain;
                return this;
            }

            /**
             * <p>The instance ID of the resource connected to WAF.</p>
             * 
             * <strong>example:</strong>
             * <p>i-8vbdlsd********81e22</p>
             */
            public Builder resourceInstanceId(String resourceInstanceId) {
                this.resourceInstanceId = resourceInstanceId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2uo2****lbka</p>
             */
            public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
                this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
                return this;
            }

            /**
             * <p>The cloud service to which the resource belongs. Valid values:</p>
             * <ul>
             * <li><p><strong>alb</strong>: Application Load Balancer (ALB).</p>
             * </li>
             * <li><p><strong>mse</strong>: Microservices Engine (MSE).</p>
             * </li>
             * <li><p><strong>fc</strong>: Function Compute (FC).</p>
             * </li>
             * <li><p><strong>sae</strong>: Serverless App Engine (SAE).</p>
             * </li>
             * <li><p><strong>ecs</strong>: Elastic Compute Service (ECS).</p>
             * </li>
             * <li><p><strong>clb4</strong>: Classic Load Balancer (CLB) (TCP).</p>
             * </li>
             * <li><p><strong>clb7</strong>: Classic Load Balancer (CLB) (HTTP/HTTPS).</p>
             * </li>
             * <li><p><strong>nlb</strong>: Network Load Balancer (NLB).</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder resourceProduct(String resourceProduct) {
                this.resourceProduct = resourceProduct;
                return this;
            }

            /**
             * <p>The resource ownership region ID. For valid values, see the supplementary description of response parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListClustersRequest} extends {@link RequestModel}
 *
 * <p>ListClustersRequest</p>
 */
public class ListClustersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterIds")
    private java.util.List < String > clusterIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterStates")
    private java.util.List < String > clusterStates;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterTypes")
    private java.util.List < String > clusterTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaymentTypes")
    private java.util.List < String > paymentTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tag > tags;

    private ListClustersRequest(Builder builder) {
        super(builder);
        this.clusterIds = builder.clusterIds;
        this.clusterName = builder.clusterName;
        this.clusterStates = builder.clusterStates;
        this.clusterTypes = builder.clusterTypes;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.paymentTypes = builder.paymentTypes;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClustersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterIds
     */
    public java.util.List < String > getClusterIds() {
        return this.clusterIds;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return clusterStates
     */
    public java.util.List < String > getClusterStates() {
        return this.clusterStates;
    }

    /**
     * @return clusterTypes
     */
    public java.util.List < String > getClusterTypes() {
        return this.clusterTypes;
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
     * @return paymentTypes
     */
    public java.util.List < String > getPaymentTypes() {
        return this.paymentTypes;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tag > getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListClustersRequest, Builder> {
        private java.util.List < String > clusterIds; 
        private String clusterName; 
        private java.util.List < String > clusterStates; 
        private java.util.List < String > clusterTypes; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < String > paymentTypes; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List < Tag > tags; 

        private Builder() {
            super();
        } 

        private Builder(ListClustersRequest request) {
            super(request);
            this.clusterIds = request.clusterIds;
            this.clusterName = request.clusterName;
            this.clusterStates = request.clusterStates;
            this.clusterTypes = request.clusterTypes;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.paymentTypes = request.paymentTypes;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
        } 

        /**
         * <p>The IDs of the clusters. You can specify a maximum of 100 items.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzabjyop****</p>
         */
        public Builder clusterIds(java.util.List < String > clusterIds) {
            this.putQueryParameter("ClusterIds", clusterIds);
            this.clusterIds = clusterIds;
            return this;
        }

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>emrtest</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The states of clusters. You can specify a maximum of 100 items.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;HADOOP&quot;]</p>
         */
        public Builder clusterStates(java.util.List < String > clusterStates) {
            this.putQueryParameter("ClusterStates", clusterStates);
            this.clusterStates = clusterStates;
            return this;
        }

        /**
         * <p>The types of the clusters. You can specify a maximum of 100 items.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;c-b933c5aac8fe****&quot;]</p>
         */
        public Builder clusterTypes(java.util.List < String > clusterTypes) {
            this.putQueryParameter("ClusterTypes", clusterTypes);
            this.clusterTypes = clusterTypes;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The starting point of the current query. If you do not configure this parameter, the query starts from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJlY21OZXh0VG9rZW4iOiIxIiwidGFpaGFvTmV4dFRva2VuIjoiNTYiLCJ0YWloYW9OZXh0VG9rZW5JbnQiOjU2LCJlY21OZXh0VG9rZW5JbnQiOjF9</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The billing methods. You can specify a maximum of 2 items.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ECS&quot;]</p>
         */
        public Builder paymentTypes(java.util.List < String > paymentTypes) {
            this.putQueryParameter("PaymentTypes", paymentTypes);
            this.paymentTypes = paymentTypes;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>cn-qingdao</li>
         * <li>cn-beijing</li>
         * <li>cn-zhangjiakou</li>
         * <li>cn-huhehaote</li>
         * <li>cn-hangzhou</li>
         * <li>cn-shanghai</li>
         * <li>cn-shenzhen</li>
         * <li>cn-chengdu</li>
         * <li>cn-hongkong</li>
         * <li>cn-wulanchabu</li>
         * <li>cn-heyuan-acdr-1</li>
         * <li>cn-qingdao-acdr-ut-1</li>
         * <li>ap-northeast-1</li>
         * <li>ap-southeast-1</li>
         * <li>ap-southeast-2</li>
         * <li>ap-southeast-3</li>
         * <li>ap-southeast-5</li>
         * <li>ap-south-1</li>
         * <li>us-east-1</li>
         * <li>us-west-1</li>
         * <li>me-east-1</li>
         * <li>me-central-1</li>
         * <li>eu-central-1</li>
         * <li>eu-west-1</li>
         * <li>cn-north-2-gov-1</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzabjyop****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags. Number of elements in the array: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;PayAsYouGo&quot;]</p>
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public ListClustersRequest build() {
            return new ListClustersRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClustersRequest} extends {@link RequestModel}
 *
 * <p>ListClustersRequest</p>
 */
public class ListClustersRequest extends Request {
    @Query
    @NameInMap("ClusterIds")
    private java.util.List < String > clusterIds;

    @Query
    @NameInMap("ClusterName")
    private String clusterName;

    @Query
    @NameInMap("ClusterStates")
    private java.util.List < String > clusterStates;

    @Query
    @NameInMap("ClusterTypes")
    private java.util.List < String > clusterTypes;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PaymentTypes")
    private java.util.List < String > paymentTypes;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Tags")
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
         * The IDs of the clusters. You can specify a maximum of 100 items.
         */
        public Builder clusterIds(java.util.List < String > clusterIds) {
            this.putQueryParameter("ClusterIds", clusterIds);
            this.clusterIds = clusterIds;
            return this;
        }

        /**
         * The name of the cluster.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * The states of clusters. You can specify a maximum of 100 items.
         */
        public Builder clusterStates(java.util.List < String > clusterStates) {
            this.putQueryParameter("ClusterStates", clusterStates);
            this.clusterStates = clusterStates;
            return this;
        }

        /**
         * The types of the clusters. You can specify a maximum of 100 items.
         */
        public Builder clusterTypes(java.util.List < String > clusterTypes) {
            this.putQueryParameter("ClusterTypes", clusterTypes);
            this.clusterTypes = clusterTypes;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: 1 to 100.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The starting point of the current query. If you do not configure this parameter, the query starts from the beginning.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The billing methods. You can specify a maximum of 2 items.
         */
        public Builder paymentTypes(java.util.List < String > paymentTypes) {
            this.putQueryParameter("PaymentTypes", paymentTypes);
            this.paymentTypes = paymentTypes;
            return this;
        }

        /**
         * The region ID.
         * <p>
         * 
         * Valid values:
         * 
         * *   center
         * *   cn-hangzhou
         * *   cn-shanghai
         * *   cn-qingdao
         * *   cn-beijing
         * *   cn-zhangjiakou
         * *   cn-huhehaote
         * *   cn-wulanchabu
         * *   cn-shenzhen
         * *   cn-chengdu
         * *   cn-hongkong
         * *   ap-southeast-1
         * *   ap-southeast-2
         * *   ap-southeast-3
         * *   ap-southeast-5
         * *   ap-northeast-1
         * *   eu-central-1
         * *   eu-west-1
         * *   us-west-1
         * *   us-east-1
         * *   ap-south-1
         * *   me-east-1
         * *   me-central-1
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The tags. You can specify a maximum of 20 items.
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

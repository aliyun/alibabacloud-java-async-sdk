// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetK8sClusterRequest} extends {@link RequestModel}
 *
 * <p>GetK8sClusterRequest</p>
 */
public class GetK8sClusterRequest extends Request {
    @Query
    @NameInMap("ClusterType")
    @Validation(maximum = 99)
    private Integer clusterType;

    @Query
    @NameInMap("CurrentPage")
    @Validation(maximum = 9999)
    private Integer currentPage;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 9999, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("RegionTag")
    @Validation(required = true)
    private String regionTag;

    @Query
    @NameInMap("SubClusterType")
    private String subClusterType;

    private GetK8sClusterRequest(Builder builder) {
        super(builder);
        this.clusterType = builder.clusterType;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.regionTag = builder.regionTag;
        this.subClusterType = builder.subClusterType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetK8sClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterType
     */
    public Integer getClusterType() {
        return this.clusterType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionTag
     */
    public String getRegionTag() {
        return this.regionTag;
    }

    /**
     * @return subClusterType
     */
    public String getSubClusterType() {
        return this.subClusterType;
    }

    public static final class Builder extends Request.Builder<GetK8sClusterRequest, Builder> {
        private Integer clusterType; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String regionTag; 
        private String subClusterType; 

        private Builder() {
            super();
        } 

        private Builder(GetK8sClusterRequest request) {
            super(request);
            this.clusterType = request.clusterType;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.regionTag = request.regionTag;
            this.subClusterType = request.subClusterType;
        } 

        /**
         * The type of the Kubernetes cluster. Valid values:
         * <p>
         * 
         * *   5: ACK cluster
         * *   7: self-managed Kubernetes cluster
         */
        public Builder clusterType(Integer clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * The number of the page to return. Default value: 1.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 1000.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionTag(String regionTag) {
            this.putQueryParameter("RegionTag", regionTag);
            this.regionTag = regionTag;
            return this;
        }

        /**
         * The subtype of the cluster. Valid values:
         * <p>
         * 
         * *   Ask: Serverless Kubernetes cluster
         * *   ManagedKubernetes: ACK cluster
         */
        public Builder subClusterType(String subClusterType) {
            this.putQueryParameter("SubClusterType", subClusterType);
            this.subClusterType = subClusterType;
            return this;
        }

        @Override
        public GetK8sClusterRequest build() {
            return new GetK8sClusterRequest(this);
        } 

    } 

}

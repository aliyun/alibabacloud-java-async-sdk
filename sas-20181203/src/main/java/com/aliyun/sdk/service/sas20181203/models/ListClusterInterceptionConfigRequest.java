// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterInterceptionConfigRequest} extends {@link RequestModel}
 *
 * <p>ListClusterInterceptionConfigRequest</p>
 */
public class ListClusterInterceptionConfigRequest extends Request {
    @Query
    @NameInMap("ClusterCNNFStatus")
    private Integer clusterCNNFStatus;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ClusterName")
    private String clusterName;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private ListClusterInterceptionConfigRequest(Builder builder) {
        super(builder);
        this.clusterCNNFStatus = builder.clusterCNNFStatus;
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterInterceptionConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterCNNFStatus
     */
    public Integer getClusterCNNFStatus() {
        return this.clusterCNNFStatus;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
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

    public static final class Builder extends Request.Builder<ListClusterInterceptionConfigRequest, Builder> {
        private Integer clusterCNNFStatus; 
        private String clusterId; 
        private String clusterName; 
        private Integer currentPage; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterInterceptionConfigRequest request) {
            super(request);
            this.clusterCNNFStatus = request.clusterCNNFStatus;
            this.clusterId = request.clusterId;
            this.clusterName = request.clusterName;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
        } 

        /**
         * ClusterCNNFStatus.
         */
        public Builder clusterCNNFStatus(Integer clusterCNNFStatus) {
            this.putQueryParameter("ClusterCNNFStatus", clusterCNNFStatus);
            this.clusterCNNFStatus = clusterCNNFStatus;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListClusterInterceptionConfigRequest build() {
            return new ListClusterInterceptionConfigRequest(this);
        } 

    } 

}

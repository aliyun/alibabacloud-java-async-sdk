// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterInterceptionConfigRequest} extends {@link RequestModel}
 *
 * <p>ListClusterInterceptionConfigRequest</p>
 */
public class ListClusterInterceptionConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterCNNFStatus")
    private Integer clusterCNNFStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
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
         * The status of the container firewall feature. Valid values:
         * <p>
         * 
         * *   **-1**: unknown
         * *   **0**: abnormal
         * *   **1**: normal
         * *   **2**: normal to be confirmed
         */
        public Builder clusterCNNFStatus(Integer clusterCNNFStatus) {
            this.putQueryParameter("ClusterCNNFStatus", clusterCNNFStatus);
            this.clusterCNNFStatus = clusterCNNFStatus;
            return this;
        }

        /**
         * The ID of the cluster.
         * <p>
         * 
         * > You can call the [DescribeContainerInstances](~~DescribeContainerInstances~~) operation to query the IDs of clusters.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
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
         * The number of the page to return. Default value: 1.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 20.
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

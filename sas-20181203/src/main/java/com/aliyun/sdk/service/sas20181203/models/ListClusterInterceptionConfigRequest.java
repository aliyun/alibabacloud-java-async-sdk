// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The status of the container firewall feature. Valid values:</p>
         * <ul>
         * <li><strong>-1</strong>: unknown</li>
         * <li><strong>0</strong>: abnormal</li>
         * <li><strong>1</strong>: normal</li>
         * <li><strong>2</strong>: normal to be confirmed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder clusterCNNFStatus(Integer clusterCNNFStatus) {
            this.putQueryParameter("ClusterCNNFStatus", clusterCNNFStatus);
            this.clusterCNNFStatus = clusterCNNFStatus;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeContainerInstances~~">DescribeContainerInstances</a> operation to query the IDs of clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c22143730ab6e40b09ec7c1c51d4d****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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

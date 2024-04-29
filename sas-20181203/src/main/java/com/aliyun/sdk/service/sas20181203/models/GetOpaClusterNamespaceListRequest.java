// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpaClusterNamespaceListRequest} extends {@link RequestModel}
 *
 * <p>GetOpaClusterNamespaceListRequest</p>
 */
public class GetOpaClusterNamespaceListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NameSpaceName")
    private String nameSpaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private GetOpaClusterNamespaceListRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.currentPage = builder.currentPage;
        this.nameSpaceName = builder.nameSpaceName;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpaClusterNamespaceListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return nameSpaceName
     */
    public String getNameSpaceName() {
        return this.nameSpaceName;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<GetOpaClusterNamespaceListRequest, Builder> {
        private String clusterId; 
        private Integer currentPage; 
        private String nameSpaceName; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GetOpaClusterNamespaceListRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.currentPage = request.currentPage;
            this.nameSpaceName = request.nameSpaceName;
            this.pageSize = request.pageSize;
        } 

        /**
         * The ID of the cluster that you want to query.
         * <p>
         * 
         * >  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of clusters.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The page number.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The name of the namespace.
         */
        public Builder nameSpaceName(String nameSpaceName) {
            this.putQueryParameter("NameSpaceName", nameSpaceName);
            this.nameSpaceName = nameSpaceName;
            return this;
        }

        /**
         * The number of entries per page. Default value: **20**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public GetOpaClusterNamespaceListRequest build() {
            return new GetOpaClusterNamespaceListRequest(this);
        } 

    } 

}

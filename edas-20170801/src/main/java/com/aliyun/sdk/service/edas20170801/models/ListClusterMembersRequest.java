// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterMembersRequest} extends {@link RequestModel}
 *
 * <p>ListClusterMembersRequest</p>
 */
public class ListClusterMembersRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("EcsList")
    private String ecsList;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private ListClusterMembersRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.currentPage = builder.currentPage;
        this.ecsList = builder.ecsList;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterMembersRequest create() {
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
     * @return ecsList
     */
    public String getEcsList() {
        return this.ecsList;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListClusterMembersRequest, Builder> {
        private String clusterId; 
        private Integer currentPage; 
        private String ecsList; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterMembersRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.currentPage = request.currentPage;
            this.ecsList = request.ecsList;
            this.pageSize = request.pageSize;
        } 

        /**
         * The ID of the cluster. You can call the ListCluster operation to query the cluster ID. For more information, see [ListCluster](~~154995~~).
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The number of the page to return. If you do not specify this parameter, the first page is returned.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of ECS instances.
         */
        public Builder ecsList(String ecsList) {
            this.putQueryParameter("EcsList", ecsList);
            this.ecsList = ecsList;
            return this;
        }

        /**
         * The number of ECS instances to return on each page. If you do not specify this parameter, all ECS instances in the specified cluster are returned on one page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListClusterMembersRequest build() {
            return new ListClusterMembersRequest(this);
        } 

    } 

}

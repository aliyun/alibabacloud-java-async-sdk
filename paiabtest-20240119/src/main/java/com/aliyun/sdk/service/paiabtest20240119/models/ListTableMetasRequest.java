// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTableMetasRequest} extends {@link RequestModel}
 *
 * <p>ListTableMetasRequest</p>
 */
public class ListTableMetasRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("All")
    private Boolean all;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasourceType")
    private String datasourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableMetaId")
    private String tableMetaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableMetaName")
    private String tableMetaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListTableMetasRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.all = builder.all;
        this.datasourceType = builder.datasourceType;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.tableMetaId = builder.tableMetaId;
        this.tableMetaName = builder.tableMetaName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTableMetasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return all
     */
    public Boolean getAll() {
        return this.all;
    }

    /**
     * @return datasourceType
     */
    public String getDatasourceType() {
        return this.datasourceType;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return tableMetaId
     */
    public String getTableMetaId() {
        return this.tableMetaId;
    }

    /**
     * @return tableMetaName
     */
    public String getTableMetaName() {
        return this.tableMetaName;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListTableMetasRequest, Builder> {
        private String regionId; 
        private Boolean all; 
        private String datasourceType; 
        private String order; 
        private String pageNumber; 
        private String pageSize; 
        private String sortBy; 
        private String tableMetaId; 
        private String tableMetaName; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListTableMetasRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.all = request.all;
            this.datasourceType = request.datasourceType;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.tableMetaId = request.tableMetaId;
            this.tableMetaName = request.tableMetaName;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * All.
         */
        public Builder all(Boolean all) {
            this.putQueryParameter("All", all);
            this.all = all;
            return this;
        }

        /**
         * DatasourceType.
         */
        public Builder datasourceType(String datasourceType) {
            this.putQueryParameter("DatasourceType", datasourceType);
            this.datasourceType = datasourceType;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * TableMetaId.
         */
        public Builder tableMetaId(String tableMetaId) {
            this.putQueryParameter("TableMetaId", tableMetaId);
            this.tableMetaId = tableMetaId;
            return this;
        }

        /**
         * TableMetaName.
         */
        public Builder tableMetaName(String tableMetaName) {
            this.putQueryParameter("TableMetaName", tableMetaName);
            this.tableMetaName = tableMetaName;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListTableMetasRequest build() {
            return new ListTableMetasRequest(this);
        } 

    } 

}

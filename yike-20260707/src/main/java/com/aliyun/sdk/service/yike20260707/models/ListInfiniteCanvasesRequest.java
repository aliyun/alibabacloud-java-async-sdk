// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link ListInfiniteCanvasesRequest} extends {@link RequestModel}
 *
 * <p>ListInfiniteCanvasesRequest</p>
 */
public class ListInfiniteCanvasesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductionId")
    private String productionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListInfiniteCanvasesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.keyword = builder.keyword;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.productionId = builder.productionId;
        this.sortBy = builder.sortBy;
        this.sortOrder = builder.sortOrder;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInfiniteCanvasesRequest create() {
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
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productionId
     */
    public String getProductionId() {
        return this.productionId;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListInfiniteCanvasesRequest, Builder> {
        private String regionId; 
        private String keyword; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String productionId; 
        private String sortBy; 
        private String sortOrder; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListInfiniteCanvasesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.keyword = request.keyword;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.productionId = request.productionId;
            this.sortBy = request.sortBy;
            this.sortOrder = request.sortOrder;
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
         * <p>The keyword for querying site monitoring tasks. Supports fuzzy match based on task name or task address.</p>
         * 
         * <strong>example:</strong>
         * <p>v2_</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The current page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProductionId.
         */
        public Builder productionId(String productionId) {
            this.putQueryParameter("ProductionId", productionId);
            this.productionId = productionId;
            return this;
        }

        /**
         * <p>The sort field and sort order. Separate multiple values with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>utcCreate:Desc</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The sort direction.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Asc: Ascending order.</li>
         * <li>Desc: Descending order.</li>
         * </ul>
         * <p>Default value: Desc.</p>
         * 
         * <strong>example:</strong>
         * <p>Ascending</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
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
        public ListInfiniteCanvasesRequest build() {
            return new ListInfiniteCanvasesRequest(this);
        } 

    } 

}

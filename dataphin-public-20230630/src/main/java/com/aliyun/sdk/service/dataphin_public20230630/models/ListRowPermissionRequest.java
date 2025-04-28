// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListRowPermissionRequest} extends {@link RequestModel}
 *
 * <p>ListRowPermissionRequest</p>
 */
public class ListRowPermissionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageRowPermissionQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private PageRowPermissionQuery pageRowPermissionQuery;

    private ListRowPermissionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.pageRowPermissionQuery = builder.pageRowPermissionQuery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRowPermissionRequest create() {
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
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return pageRowPermissionQuery
     */
    public PageRowPermissionQuery getPageRowPermissionQuery() {
        return this.pageRowPermissionQuery;
    }

    public static final class Builder extends Request.Builder<ListRowPermissionRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private PageRowPermissionQuery pageRowPermissionQuery; 

        private Builder() {
            super();
        } 

        private Builder(ListRowPermissionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.pageRowPermissionQuery = request.pageRowPermissionQuery;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pageRowPermissionQuery(PageRowPermissionQuery pageRowPermissionQuery) {
            String pageRowPermissionQueryShrink = shrink(pageRowPermissionQuery, "PageRowPermissionQuery", "json");
            this.putBodyParameter("PageRowPermissionQuery", pageRowPermissionQueryShrink);
            this.pageRowPermissionQuery = pageRowPermissionQuery;
            return this;
        }

        @Override
        public ListRowPermissionRequest build() {
            return new ListRowPermissionRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListRowPermissionRequest} extends {@link TeaModel}
     *
     * <p>ListRowPermissionRequest</p>
     */
    public static class PageRowPermissionQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer pageSize;

        private PageRowPermissionQuery(Builder builder) {
            this.keyword = builder.keyword;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageRowPermissionQuery create() {
            return builder().build();
        }

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        public static final class Builder {
            private String keyword; 
            private Integer pageNum; 
            private Integer pageSize; 

            private Builder() {
            } 

            private Builder(PageRowPermissionQuery model) {
                this.keyword = model.keyword;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
            } 

            /**
             * Keyword.
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            public PageRowPermissionQuery build() {
                return new PageRowPermissionQuery(this);
            } 

        } 

    }
}

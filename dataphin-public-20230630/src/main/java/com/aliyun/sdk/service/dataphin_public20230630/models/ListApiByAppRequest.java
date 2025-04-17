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
 * {@link ListApiByAppRequest} extends {@link RequestModel}
 *
 * <p>ListApiByAppRequest</p>
 */
public class ListApiByAppRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private PageQuery pageQuery;

    private ListApiByAppRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.pageQuery = builder.pageQuery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApiByAppRequest create() {
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
     * @return pageQuery
     */
    public PageQuery getPageQuery() {
        return this.pageQuery;
    }

    public static final class Builder extends Request.Builder<ListApiByAppRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private PageQuery pageQuery; 

        private Builder() {
            super();
        } 

        private Builder(ListApiByAppRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.pageQuery = request.pageQuery;
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
        public Builder pageQuery(PageQuery pageQuery) {
            String pageQueryShrink = shrink(pageQuery, "PageQuery", "json");
            this.putBodyParameter("PageQuery", pageQueryShrink);
            this.pageQuery = pageQuery;
            return this;
        }

        @Override
        public ListApiByAppRequest build() {
            return new ListApiByAppRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListApiByAppRequest} extends {@link TeaModel}
     *
     * <p>ListApiByAppRequest</p>
     */
    public static class PageQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long appKey;

        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer pageSize;

        private PageQuery(Builder builder) {
            this.appKey = builder.appKey;
            this.keyword = builder.keyword;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageQuery create() {
            return builder().build();
        }

        /**
         * @return appKey
         */
        public Long getAppKey() {
            return this.appKey;
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
            private Long appKey; 
            private String keyword; 
            private Integer pageNum; 
            private Integer pageSize; 

            private Builder() {
            } 

            private Builder(PageQuery model) {
                this.appKey = model.appKey;
                this.keyword = model.keyword;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
            } 

            /**
             * <p>appKey</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10121101</p>
             */
            public Builder appKey(Long appKey) {
                this.appKey = appKey;
                return this;
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
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            public PageQuery build() {
                return new PageQuery(this);
            } 

        } 

    }
}

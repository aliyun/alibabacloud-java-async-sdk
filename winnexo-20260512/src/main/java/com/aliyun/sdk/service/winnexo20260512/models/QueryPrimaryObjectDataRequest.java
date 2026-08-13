// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link QueryPrimaryObjectDataRequest} extends {@link RequestModel}
 *
 * <p>QueryPrimaryObjectDataRequest</p>
 */
public class QueryPrimaryObjectDataRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("onlyFavorites")
    private Boolean onlyFavorites;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operatingObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private QueryPrimaryObjectDataRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.onlyFavorites = builder.onlyFavorites;
        this.operatingObjectName = builder.operatingObjectName;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPrimaryObjectDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return onlyFavorites
     */
    public Boolean getOnlyFavorites() {
        return this.onlyFavorites;
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<QueryPrimaryObjectDataRequest, Builder> {
        private String keyword; 
        private Boolean onlyFavorites; 
        private String operatingObjectName; 
        private Long page; 
        private Long pageSize; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QueryPrimaryObjectDataRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.onlyFavorites = request.onlyFavorites;
            this.operatingObjectName = request.operatingObjectName;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>关键字搜索（固定匹配 name；若 schema 定义 description，则同时匹配 description）</p>
         * 
         * <strong>example:</strong>
         * <p>示例关键词</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>仅返回关注的主对象；false 或不传则返回全部对象（包含 isFavorited 标识）</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder onlyFavorites(Boolean onlyFavorites) {
            this.putBodyParameter("onlyFavorites", onlyFavorites);
            this.onlyFavorites = onlyFavorites;
            return this;
        }

        /**
         * <p>运营对象名称（如 customer_1）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>页码（从 1 开始）</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.putBodyParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>每页数量，范围 1-100</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public QueryPrimaryObjectDataRequest build() {
            return new QueryPrimaryObjectDataRequest(this);
        } 

    } 

}

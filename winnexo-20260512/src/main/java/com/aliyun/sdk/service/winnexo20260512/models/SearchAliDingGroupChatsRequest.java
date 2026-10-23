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
 * {@link SearchAliDingGroupChatsRequest} extends {@link RequestModel}
 *
 * <p>SearchAliDingGroupChatsRequest</p>
 */
public class SearchAliDingGroupChatsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cursor")
    private String cursor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("excludeMuted")
    private Boolean excludeMuted;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keyword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private SearchAliDingGroupChatsRequest(Builder builder) {
        super(builder);
        this.cursor = builder.cursor;
        this.excludeMuted = builder.excludeMuted;
        this.keyword = builder.keyword;
        this.pageSize = builder.pageSize;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchAliDingGroupChatsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cursor
     */
    public String getCursor() {
        return this.cursor;
    }

    /**
     * @return excludeMuted
     */
    public Boolean getExcludeMuted() {
        return this.excludeMuted;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<SearchAliDingGroupChatsRequest, Builder> {
        private String cursor; 
        private Boolean excludeMuted; 
        private String keyword; 
        private Integer pageSize; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(SearchAliDingGroupChatsRequest request) {
            super(request);
            this.cursor = request.cursor;
            this.excludeMuted = request.excludeMuted;
            this.keyword = request.keyword;
            this.pageSize = request.pageSize;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The cursor for the paged query. Set this parameter to 0 for the first request. For subsequent paging requests, set this parameter to the value of <strong>nextCursor</strong> returned in the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder cursor(String cursor) {
            this.putBodyParameter("cursor", cursor);
            this.cursor = cursor;
            return this;
        }

        /**
         * <p>Specifies whether to exclude muted group chats.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder excludeMuted(Boolean excludeMuted) {
            this.putBodyParameter("excludeMuted", excludeMuted);
            this.excludeMuted = excludeMuted;
            return this;
        }

        /**
         * <p>The keyword for search. The keyword always matches the name field. If the description field is defined in the schema, the keyword also matches the description field.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Customer project</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
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
        public SearchAliDingGroupChatsRequest build() {
            return new SearchAliDingGroupChatsRequest(this);
        } 

    } 

}

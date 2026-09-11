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
 * {@link ListGraphSchemasRequest} extends {@link RequestModel}
 *
 * <p>ListGraphSchemasRequest</p>
 */
public class ListGraphSchemasRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("semanticTags")
    private java.util.List<String> semanticTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListGraphSchemasRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.semanticTags = builder.semanticTags;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGraphSchemasRequest create() {
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
     * @return semanticTags
     */
    public java.util.List<String> getSemanticTags() {
        return this.semanticTags;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListGraphSchemasRequest, Builder> {
        private String keyword; 
        private java.util.List<String> semanticTags; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListGraphSchemasRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.semanticTags = request.semanticTags;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>关键词，匹配 graphName / displayName（可选，忽略大小写）</p>
         * 
         * <strong>example:</strong>
         * <p>crm</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>语义标签过滤（可选，命中任一标签即保留）</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;销售&quot;]</p>
         */
        public Builder semanticTags(java.util.List<String> semanticTags) {
            String semanticTagsShrink = shrink(semanticTags, "semanticTags", "json");
            this.putBodyParameter("semanticTags", semanticTagsShrink);
            this.semanticTags = semanticTags;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
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
        public ListGraphSchemasRequest build() {
            return new ListGraphSchemasRequest(this);
        } 

    } 

}

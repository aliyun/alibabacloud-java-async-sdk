// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link ListLumaNamespacesRequest} extends {@link RequestModel}
 *
 * <p>ListLumaNamespacesRequest</p>
 */
public class ListLumaNamespacesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 2)
    private String agentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Catalog")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String catalog;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private ListLumaNamespacesRequest(Builder builder) {
        super(builder);
        this.agentName = builder.agentName;
        this.catalog = builder.catalog;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLumaNamespacesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return catalog
     */
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListLumaNamespacesRequest, Builder> {
        private String agentName; 
        private String catalog; 
        private Integer limit; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListLumaNamespacesRequest request) {
            super(request);
            this.agentName = request.agentName;
            this.catalog = request.catalog;
            this.limit = request.limit;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>The name of the Agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_agent</p>
         */
        public Builder agentName(String agentName) {
            this.putBodyParameter("AgentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * <p>The name of the data catalog bound to the Agent. You can call ListLumaCatalogs to obtain the catalog name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_catalog</p>
         */
        public Builder catalog(String catalog) {
            this.putBodyParameter("Catalog", catalog);
            this.catalog = catalog;
            return this;
        }

        /**
         * <p>每页返回的最大数据条数。取值范围 1~100，不传时默认 100。每条记录都需回源查询一次元数据，因此该值同时限制单次调用的回源次数</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>分页查询的起始Token。首次查询不传或传 &quot;0&quot;；后续翻页使用上一次响应中返回的 NextToken 值</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListLumaNamespacesRequest build() {
            return new ListLumaNamespacesRequest(this);
        } 

    } 

}

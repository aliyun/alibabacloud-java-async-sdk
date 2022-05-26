// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCategoriesRequest} extends {@link RequestModel}
 *
 * <p>QueryCategoriesRequest</p>
 */
public class QueryCategoriesRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("KnowledgeType")
    private Long knowledgeType;

    @Query
    @NameInMap("ParentCategoryId")
    private Long parentCategoryId;

    @Query
    @NameInMap("ShowChildrens")
    private Boolean showChildrens;

    private QueryCategoriesRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.knowledgeType = builder.knowledgeType;
        this.parentCategoryId = builder.parentCategoryId;
        this.showChildrens = builder.showChildrens;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCategoriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return knowledgeType
     */
    public Long getKnowledgeType() {
        return this.knowledgeType;
    }

    /**
     * @return parentCategoryId
     */
    public Long getParentCategoryId() {
        return this.parentCategoryId;
    }

    /**
     * @return showChildrens
     */
    public Boolean getShowChildrens() {
        return this.showChildrens;
    }

    public static final class Builder extends Request.Builder<QueryCategoriesRequest, Builder> {
        private String agentKey; 
        private Long knowledgeType; 
        private Long parentCategoryId; 
        private Boolean showChildrens; 

        private Builder() {
            super();
        } 

        private Builder(QueryCategoriesRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.knowledgeType = request.knowledgeType;
            this.parentCategoryId = request.parentCategoryId;
            this.showChildrens = request.showChildrens;
        } 

        /**
         * 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * KnowledgeType.
         */
        public Builder knowledgeType(Long knowledgeType) {
            this.putQueryParameter("KnowledgeType", knowledgeType);
            this.knowledgeType = knowledgeType;
            return this;
        }

        /**
         * ParentCategoryId.
         */
        public Builder parentCategoryId(Long parentCategoryId) {
            this.putQueryParameter("ParentCategoryId", parentCategoryId);
            this.parentCategoryId = parentCategoryId;
            return this;
        }

        /**
         * ShowChildrens.
         */
        public Builder showChildrens(Boolean showChildrens) {
            this.putQueryParameter("ShowChildrens", showChildrens);
            this.showChildrens = showChildrens;
            return this;
        }

        @Override
        public QueryCategoriesRequest build() {
            return new QueryCategoriesRequest(this);
        } 

    } 

}

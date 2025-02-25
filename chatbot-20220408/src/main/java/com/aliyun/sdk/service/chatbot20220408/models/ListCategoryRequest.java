// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListCategoryRequest} extends {@link RequestModel}
 *
 * <p>ListCategoryRequest</p>
 */
public class ListCategoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeType")
    private Integer knowledgeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParentCategoryId")
    @com.aliyun.core.annotation.Validation()
    private Long parentCategoryId;

    private ListCategoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.knowledgeType = builder.knowledgeType;
        this.parentCategoryId = builder.parentCategoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCategoryRequest create() {
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
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return knowledgeType
     */
    public Integer getKnowledgeType() {
        return this.knowledgeType;
    }

    /**
     * @return parentCategoryId
     */
    public Long getParentCategoryId() {
        return this.parentCategoryId;
    }

    public static final class Builder extends Request.Builder<ListCategoryRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private Integer knowledgeType; 
        private Long parentCategoryId; 

        private Builder() {
            super();
        } 

        private Builder(ListCategoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.knowledgeType = request.knowledgeType;
            this.parentCategoryId = request.parentCategoryId;
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
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * KnowledgeType.
         */
        public Builder knowledgeType(Integer knowledgeType) {
            this.putBodyParameter("KnowledgeType", knowledgeType);
            this.knowledgeType = knowledgeType;
            return this;
        }

        /**
         * ParentCategoryId.
         */
        public Builder parentCategoryId(Long parentCategoryId) {
            this.putBodyParameter("ParentCategoryId", parentCategoryId);
            this.parentCategoryId = parentCategoryId;
            return this;
        }

        @Override
        public ListCategoryRequest build() {
            return new ListCategoryRequest(this);
        } 

    } 

}

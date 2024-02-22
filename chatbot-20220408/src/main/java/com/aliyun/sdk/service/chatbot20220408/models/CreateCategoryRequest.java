// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCategoryRequest} extends {@link RequestModel}
 *
 * <p>CreateCategoryRequest</p>
 */
public class CreateCategoryRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Body
    @NameInMap("BizCode")
    private String bizCode;

    @Body
    @NameInMap("KnowledgeType")
    private Integer knowledgeType;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("ParentCategoryId")
    @Validation()
    private Long parentCategoryId;

    private CreateCategoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.bizCode = builder.bizCode;
        this.knowledgeType = builder.knowledgeType;
        this.name = builder.name;
        this.parentCategoryId = builder.parentCategoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCategoryRequest create() {
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
     * @return bizCode
     */
    public String getBizCode() {
        return this.bizCode;
    }

    /**
     * @return knowledgeType
     */
    public Integer getKnowledgeType() {
        return this.knowledgeType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentCategoryId
     */
    public Long getParentCategoryId() {
        return this.parentCategoryId;
    }

    public static final class Builder extends Request.Builder<CreateCategoryRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String bizCode; 
        private Integer knowledgeType; 
        private String name; 
        private Long parentCategoryId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCategoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.bizCode = request.bizCode;
            this.knowledgeType = request.knowledgeType;
            this.name = request.name;
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
         * BizCode.
         */
        public Builder bizCode(String bizCode) {
            this.putBodyParameter("BizCode", bizCode);
            this.bizCode = bizCode;
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
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
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
        public CreateCategoryRequest build() {
            return new CreateCategoryRequest(this);
        } 

    } 

}

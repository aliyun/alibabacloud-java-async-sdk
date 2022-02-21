// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

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
    @Query
    @NameInMap("BizCode")
    private String bizCode;

    @Query
    @NameInMap("KnowledgeType")
    private Integer knowledgeType;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ParentCategoryId")
    private Long parentCategoryId;

    private CreateCategoryRequest(Builder builder) {
        super(builder);
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
        private String bizCode; 
        private Integer knowledgeType; 
        private String name; 
        private Long parentCategoryId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCategoryRequest response) {
            super(response);
            this.bizCode = response.bizCode;
            this.knowledgeType = response.knowledgeType;
            this.name = response.name;
            this.parentCategoryId = response.parentCategoryId;
        } 

        /**
         * BizCode.
         */
        public Builder bizCode(String bizCode) {
            this.putQueryParameter("BizCode", bizCode);
            this.bizCode = bizCode;
            return this;
        }

        /**
         * KnowledgeType.
         */
        public Builder knowledgeType(Integer knowledgeType) {
            this.putQueryParameter("KnowledgeType", knowledgeType);
            this.knowledgeType = knowledgeType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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

        @Override
        public CreateCategoryRequest build() {
            return new CreateCategoryRequest(this);
        } 

    } 

}

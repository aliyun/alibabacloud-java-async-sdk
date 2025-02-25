// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link KnowledgeCategory} extends {@link TeaModel}
 *
 * <p>KnowledgeCategory</p>
 */
public class KnowledgeCategory extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("created_at")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("keywords")
    private java.util.List<String> keywords;

    @com.aliyun.core.annotation.NameInMap("knowledge_base_id")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.NameInMap("knowledge_base_name")
    private String knowledgeBaseName;

    @com.aliyun.core.annotation.NameInMap("knowledge_category_id")
    private String knowledgeCategoryId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("owner_type")
    private String ownerType;

    @com.aliyun.core.annotation.NameInMap("parent_knowledge_category_id")
    private String parentKnowledgeCategoryId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private Long updatedAt;

    private KnowledgeCategory(Builder builder) {
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.keywords = builder.keywords;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.knowledgeBaseName = builder.knowledgeBaseName;
        this.knowledgeCategoryId = builder.knowledgeCategoryId;
        this.name = builder.name;
        this.owner = builder.owner;
        this.ownerType = builder.ownerType;
        this.parentKnowledgeCategoryId = builder.parentKnowledgeCategoryId;
        this.status = builder.status;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KnowledgeCategory create() {
        return builder().build();
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return keywords
     */
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return knowledgeBaseName
     */
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    /**
     * @return knowledgeCategoryId
     */
    public String getKnowledgeCategoryId() {
        return this.knowledgeCategoryId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return ownerType
     */
    public String getOwnerType() {
        return this.ownerType;
    }

    /**
     * @return parentKnowledgeCategoryId
     */
    public String getParentKnowledgeCategoryId() {
        return this.parentKnowledgeCategoryId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private Long createdAt; 
        private String description; 
        private java.util.List<String> keywords; 
        private String knowledgeBaseId; 
        private String knowledgeBaseName; 
        private String knowledgeCategoryId; 
        private String name; 
        private String owner; 
        private String ownerType; 
        private String parentKnowledgeCategoryId; 
        private String status; 
        private Long updatedAt; 

        /**
         * created_at.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * keywords.
         */
        public Builder keywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            return this;
        }

        /**
         * knowledge_base_id.
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * knowledge_base_name.
         */
        public Builder knowledgeBaseName(String knowledgeBaseName) {
            this.knowledgeBaseName = knowledgeBaseName;
            return this;
        }

        /**
         * knowledge_category_id.
         */
        public Builder knowledgeCategoryId(String knowledgeCategoryId) {
            this.knowledgeCategoryId = knowledgeCategoryId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * owner_type.
         */
        public Builder ownerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }

        /**
         * parent_knowledge_category_id.
         */
        public Builder parentKnowledgeCategoryId(String parentKnowledgeCategoryId) {
            this.parentKnowledgeCategoryId = parentKnowledgeCategoryId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * updated_at.
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public KnowledgeCategory build() {
            return new KnowledgeCategory(this);
        } 

    } 

}

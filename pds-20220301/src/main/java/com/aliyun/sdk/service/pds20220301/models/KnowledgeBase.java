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
 * {@link KnowledgeBase} extends {@link TeaModel}
 *
 * <p>KnowledgeBase</p>
 */
public class KnowledgeBase extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cover_uri")
    private String coverUri;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("file_filter")
    private String fileFilter;

    @com.aliyun.core.annotation.NameInMap("knowledge_base_id")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.NameInMap("link_rule_list")
    private java.util.List<LinkRule> linkRuleList;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("owner_id")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("owner_name")
    private String ownerName;

    @com.aliyun.core.annotation.NameInMap("owner_type")
    private String ownerType;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private Long updatedAt;

    private KnowledgeBase(Builder builder) {
        this.coverUri = builder.coverUri;
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.fileFilter = builder.fileFilter;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.linkRuleList = builder.linkRuleList;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.ownerName = builder.ownerName;
        this.ownerType = builder.ownerType;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KnowledgeBase create() {
        return builder().build();
    }

    /**
     * @return coverUri
     */
    public String getCoverUri() {
        return this.coverUri;
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
     * @return fileFilter
     */
    public String getFileFilter() {
        return this.fileFilter;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return linkRuleList
     */
    public java.util.List<LinkRule> getLinkRuleList() {
        return this.linkRuleList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return ownerName
     */
    public String getOwnerName() {
        return this.ownerName;
    }

    /**
     * @return ownerType
     */
    public String getOwnerType() {
        return this.ownerType;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String coverUri; 
        private Long createdAt; 
        private String description; 
        private String fileFilter; 
        private String knowledgeBaseId; 
        private java.util.List<LinkRule> linkRuleList; 
        private String name; 
        private String ownerId; 
        private String ownerName; 
        private String ownerType; 
        private Long updatedAt; 

        /**
         * cover_uri.
         */
        public Builder coverUri(String coverUri) {
            this.coverUri = coverUri;
            return this;
        }

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
         * file_filter.
         */
        public Builder fileFilter(String fileFilter) {
            this.fileFilter = fileFilter;
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
         * link_rule_list.
         */
        public Builder linkRuleList(java.util.List<LinkRule> linkRuleList) {
            this.linkRuleList = linkRuleList;
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
         * owner_id.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * owner_name.
         */
        public Builder ownerName(String ownerName) {
            this.ownerName = ownerName;
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
         * updated_at.
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public KnowledgeBase build() {
            return new KnowledgeBase(this);
        } 

    } 

}

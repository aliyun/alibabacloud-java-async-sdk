// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link BrandKnowledgeBase} extends {@link TeaModel}
 *
 * <p>BrandKnowledgeBase</p>
 */
public class BrandKnowledgeBase extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OfficialSiteUrl")
    private String officialSiteUrl;

    @com.aliyun.core.annotation.NameInMap("Profile")
    private BrandKnowledgeProfile profile;

    @com.aliyun.core.annotation.NameInMap("Questions")
    private java.util.List<BrandKnowledgeQuestion> questions;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UpdatedAt")
    private Long updatedAt;

    @com.aliyun.core.annotation.NameInMap("Version")
    private Long version;

    private BrandKnowledgeBase(Builder builder) {
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.name = builder.name;
        this.officialSiteUrl = builder.officialSiteUrl;
        this.profile = builder.profile;
        this.questions = builder.questions;
        this.status = builder.status;
        this.updatedAt = builder.updatedAt;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrandKnowledgeBase create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return officialSiteUrl
     */
    public String getOfficialSiteUrl() {
        return this.officialSiteUrl;
    }

    /**
     * @return profile
     */
    public BrandKnowledgeProfile getProfile() {
        return this.profile;
    }

    /**
     * @return questions
     */
    public java.util.List<BrandKnowledgeQuestion> getQuestions() {
        return this.questions;
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

    /**
     * @return version
     */
    public Long getVersion() {
        return this.version;
    }

    public static final class Builder {
        private Long createdAt; 
        private String description; 
        private String knowledgeBaseId; 
        private String name; 
        private String officialSiteUrl; 
        private BrandKnowledgeProfile profile; 
        private java.util.List<BrandKnowledgeQuestion> questions; 
        private String status; 
        private Long updatedAt; 
        private Long version; 

        private Builder() {
        } 

        private Builder(BrandKnowledgeBase model) {
            this.createdAt = model.createdAt;
            this.description = model.description;
            this.knowledgeBaseId = model.knowledgeBaseId;
            this.name = model.name;
            this.officialSiteUrl = model.officialSiteUrl;
            this.profile = model.profile;
            this.questions = model.questions;
            this.status = model.status;
            this.updatedAt = model.updatedAt;
            this.version = model.version;
        } 

        /**
         * CreatedAt.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * KnowledgeBaseId.
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * OfficialSiteUrl.
         */
        public Builder officialSiteUrl(String officialSiteUrl) {
            this.officialSiteUrl = officialSiteUrl;
            return this;
        }

        /**
         * Profile.
         */
        public Builder profile(BrandKnowledgeProfile profile) {
            this.profile = profile;
            return this;
        }

        /**
         * Questions.
         */
        public Builder questions(java.util.List<BrandKnowledgeQuestion> questions) {
            this.questions = questions;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * UpdatedAt.
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(Long version) {
            this.version = version;
            return this;
        }

        public BrandKnowledgeBase build() {
            return new BrandKnowledgeBase(this);
        } 

    } 

}

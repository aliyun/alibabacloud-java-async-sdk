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
         * <p>The creation time, represented as a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1795658400000</p>
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The profile of the brand or collection object.</p>
         * 
         * <strong>example:</strong>
         * <p>Provides software services to enterprises</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the brand knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>bkb_example001</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>The brand name.</p>
         * 
         * <strong>example:</strong>
         * <p>Example Technology</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The URL of the official brand website.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/">https://example.com/</a></p>
         */
        public Builder officialSiteUrl(String officialSiteUrl) {
            this.officialSiteUrl = officialSiteUrl;
            return this;
        }

        /**
         * <p>The structured brand profile.</p>
         */
        public Builder profile(BrandKnowledgeProfile profile) {
            this.profile = profile;
            return this;
        }

        /**
         * <p>The list of suggested questions for GEO monitoring.</p>
         */
        public Builder questions(java.util.List<BrandKnowledgeQuestion> questions) {
            this.questions = questions;
            return this;
        }

        /**
         * <p>The status of the brand knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The last update time, represented as a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1795658460000</p>
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>The record version number used to detect concurrent modifications.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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

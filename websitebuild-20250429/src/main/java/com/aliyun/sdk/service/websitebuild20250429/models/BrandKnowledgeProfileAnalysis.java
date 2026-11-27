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
 * {@link BrandKnowledgeProfileAnalysis} extends {@link TeaModel}
 *
 * <p>BrandKnowledgeProfileAnalysis</p>
 */
public class BrandKnowledgeProfileAnalysis extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Advantages")
    private String advantages;

    @com.aliyun.core.annotation.NameInMap("BaseVersion")
    private Long baseVersion;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Evidence")
    private java.util.List<BrandKnowledgeProfileEvidence> evidence;

    @com.aliyun.core.annotation.NameInMap("ExcludedMaterials")
    private java.util.List<String> excludedMaterials;

    @com.aliyun.core.annotation.NameInMap("Faqs")
    private java.util.List<BrandKnowledgeProfileFaq> faqs;

    @com.aliyun.core.annotation.NameInMap("Keywords")
    private java.util.List<String> keywords;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Positioning")
    private String positioning;

    @com.aliyun.core.annotation.NameInMap("Products")
    private String products;

    @com.aliyun.core.annotation.NameInMap("Questions")
    private java.util.List<BrandKnowledgeQuestion> questions;

    @com.aliyun.core.annotation.NameInMap("ReadPageIds")
    private java.util.List<String> readPageIds;

    @com.aliyun.core.annotation.NameInMap("SourceDocumentIds")
    private java.util.List<String> sourceDocumentIds;

    @com.aliyun.core.annotation.NameInMap("TargetAudience")
    private String targetAudience;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("UnreadPageIds")
    private java.util.List<String> unreadPageIds;

    @com.aliyun.core.annotation.NameInMap("WritingTone")
    private String writingTone;

    private BrandKnowledgeProfileAnalysis(Builder builder) {
        this.advantages = builder.advantages;
        this.baseVersion = builder.baseVersion;
        this.description = builder.description;
        this.evidence = builder.evidence;
        this.excludedMaterials = builder.excludedMaterials;
        this.faqs = builder.faqs;
        this.keywords = builder.keywords;
        this.name = builder.name;
        this.positioning = builder.positioning;
        this.products = builder.products;
        this.questions = builder.questions;
        this.readPageIds = builder.readPageIds;
        this.sourceDocumentIds = builder.sourceDocumentIds;
        this.targetAudience = builder.targetAudience;
        this.taskId = builder.taskId;
        this.unreadPageIds = builder.unreadPageIds;
        this.writingTone = builder.writingTone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrandKnowledgeProfileAnalysis create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advantages
     */
    public String getAdvantages() {
        return this.advantages;
    }

    /**
     * @return baseVersion
     */
    public Long getBaseVersion() {
        return this.baseVersion;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return evidence
     */
    public java.util.List<BrandKnowledgeProfileEvidence> getEvidence() {
        return this.evidence;
    }

    /**
     * @return excludedMaterials
     */
    public java.util.List<String> getExcludedMaterials() {
        return this.excludedMaterials;
    }

    /**
     * @return faqs
     */
    public java.util.List<BrandKnowledgeProfileFaq> getFaqs() {
        return this.faqs;
    }

    /**
     * @return keywords
     */
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return positioning
     */
    public String getPositioning() {
        return this.positioning;
    }

    /**
     * @return products
     */
    public String getProducts() {
        return this.products;
    }

    /**
     * @return questions
     */
    public java.util.List<BrandKnowledgeQuestion> getQuestions() {
        return this.questions;
    }

    /**
     * @return readPageIds
     */
    public java.util.List<String> getReadPageIds() {
        return this.readPageIds;
    }

    /**
     * @return sourceDocumentIds
     */
    public java.util.List<String> getSourceDocumentIds() {
        return this.sourceDocumentIds;
    }

    /**
     * @return targetAudience
     */
    public String getTargetAudience() {
        return this.targetAudience;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return unreadPageIds
     */
    public java.util.List<String> getUnreadPageIds() {
        return this.unreadPageIds;
    }

    /**
     * @return writingTone
     */
    public String getWritingTone() {
        return this.writingTone;
    }

    public static final class Builder {
        private String advantages; 
        private Long baseVersion; 
        private String description; 
        private java.util.List<BrandKnowledgeProfileEvidence> evidence; 
        private java.util.List<String> excludedMaterials; 
        private java.util.List<BrandKnowledgeProfileFaq> faqs; 
        private java.util.List<String> keywords; 
        private String name; 
        private String positioning; 
        private String products; 
        private java.util.List<BrandKnowledgeQuestion> questions; 
        private java.util.List<String> readPageIds; 
        private java.util.List<String> sourceDocumentIds; 
        private String targetAudience; 
        private String taskId; 
        private java.util.List<String> unreadPageIds; 
        private String writingTone; 

        private Builder() {
        } 

        private Builder(BrandKnowledgeProfileAnalysis model) {
            this.advantages = model.advantages;
            this.baseVersion = model.baseVersion;
            this.description = model.description;
            this.evidence = model.evidence;
            this.excludedMaterials = model.excludedMaterials;
            this.faqs = model.faqs;
            this.keywords = model.keywords;
            this.name = model.name;
            this.positioning = model.positioning;
            this.products = model.products;
            this.questions = model.questions;
            this.readPageIds = model.readPageIds;
            this.sourceDocumentIds = model.sourceDocumentIds;
            this.targetAudience = model.targetAudience;
            this.taskId = model.taskId;
            this.unreadPageIds = model.unreadPageIds;
            this.writingTone = model.writingTone;
        } 

        /**
         * <p>The differentiation advantages of the brand.</p>
         * 
         * <strong>example:</strong>
         * <p>Providing implementation support based on business processes</p>
         */
        public Builder advantages(String advantages) {
            this.advantages = advantages;
            return this;
        }

        /**
         * <p>The knowledge base version at the start of the analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder baseVersion(Long baseVersion) {
            this.baseVersion = baseVersion;
            return this;
        }

        /**
         * <p>The profile of the brand or collection object.</p>
         * 
         * <strong>example:</strong>
         * <p>Providing software services for enterprises</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The list of source evidence supporting the analysis results.</p>
         */
        public Builder evidence(java.util.List<BrandKnowledgeProfileEvidence> evidence) {
            this.evidence = evidence;
            return this;
        }

        /**
         * <p>The unread materials and reasons for this analysis.</p>
         */
        public Builder excludedMaterials(java.util.List<String> excludedMaterials) {
            this.excludedMaterials = excludedMaterials;
            return this;
        }

        /**
         * <p>The list of brand FAQs with answers.</p>
         */
        public Builder faqs(java.util.List<BrandKnowledgeProfileFaq> faqs) {
            this.faqs = faqs;
            return this;
        }

        /**
         * <p>The list of core brand keywords.</p>
         */
        public Builder keywords(java.util.List<String> keywords) {
            this.keywords = keywords;
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
         * <p>The one-sentence positioning of the brand.</p>
         * 
         * <strong>example:</strong>
         * <p>Software service provider for small and medium-sized enterprises</p>
         */
        public Builder positioning(String positioning) {
            this.positioning = positioning;
            return this;
        }

        /**
         * <p>The main products and services of the brand.</p>
         * 
         * <strong>example:</strong>
         * <p>Enterprise collaboration software and implementation services</p>
         */
        public Builder products(String products) {
            this.products = products;
            return this;
        }

        /**
         * <p>The list of recommended questions for GEO monitoring.</p>
         */
        public Builder questions(java.util.List<BrandKnowledgeQuestion> questions) {
            this.questions = questions;
            return this;
        }

        /**
         * <p>The list of web page IDs successfully read during the analysis.</p>
         */
        public Builder readPageIds(java.util.List<String> readPageIds) {
            this.readPageIds = readPageIds;
            return this;
        }

        /**
         * <p>The list of source document IDs used for the analysis.</p>
         */
        public Builder sourceDocumentIds(java.util.List<String> sourceDocumentIds) {
            this.sourceDocumentIds = sourceDocumentIds;
            return this;
        }

        /**
         * <p>The target audience of the brand.</p>
         * 
         * <strong>example:</strong>
         * <p>Operations teams of small and medium-sized enterprises</p>
         */
        public Builder targetAudience(String targetAudience) {
            this.targetAudience = targetAudience;
            return this;
        }

        /**
         * <p>The brand analysis batch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bwb_example001</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The list of web page IDs where body text was not read during the analysis.</p>
         */
        public Builder unreadPageIds(java.util.List<String> unreadPageIds) {
            this.unreadPageIds = unreadPageIds;
            return this;
        }

        /**
         * <p>The tone used in content creation.</p>
         * 
         * <strong>example:</strong>
         * <p>Pragmatic and clear</p>
         */
        public Builder writingTone(String writingTone) {
            this.writingTone = writingTone;
            return this;
        }

        public BrandKnowledgeProfileAnalysis build() {
            return new BrandKnowledgeProfileAnalysis(this);
        } 

    } 

}

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
 * {@link BrandKnowledgeProfile} extends {@link TeaModel}
 *
 * <p>BrandKnowledgeProfile</p>
 */
public class BrandKnowledgeProfile extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Advantages")
    private String advantages;

    @com.aliyun.core.annotation.NameInMap("Faqs")
    private java.util.List<BrandKnowledgeFaq> faqs;

    @com.aliyun.core.annotation.NameInMap("Keywords")
    private java.util.List<String> keywords;

    @com.aliyun.core.annotation.NameInMap("Positioning")
    private String positioning;

    @com.aliyun.core.annotation.NameInMap("Products")
    private String products;

    @com.aliyun.core.annotation.NameInMap("TargetAudience")
    private String targetAudience;

    @com.aliyun.core.annotation.NameInMap("WritingTone")
    private String writingTone;

    private BrandKnowledgeProfile(Builder builder) {
        this.advantages = builder.advantages;
        this.faqs = builder.faqs;
        this.keywords = builder.keywords;
        this.positioning = builder.positioning;
        this.products = builder.products;
        this.targetAudience = builder.targetAudience;
        this.writingTone = builder.writingTone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrandKnowledgeProfile create() {
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
     * @return faqs
     */
    public java.util.List<BrandKnowledgeFaq> getFaqs() {
        return this.faqs;
    }

    /**
     * @return keywords
     */
    public java.util.List<String> getKeywords() {
        return this.keywords;
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
     * @return targetAudience
     */
    public String getTargetAudience() {
        return this.targetAudience;
    }

    /**
     * @return writingTone
     */
    public String getWritingTone() {
        return this.writingTone;
    }

    public static final class Builder {
        private String advantages; 
        private java.util.List<BrandKnowledgeFaq> faqs; 
        private java.util.List<String> keywords; 
        private String positioning; 
        private String products; 
        private String targetAudience; 
        private String writingTone; 

        private Builder() {
        } 

        private Builder(BrandKnowledgeProfile model) {
            this.advantages = model.advantages;
            this.faqs = model.faqs;
            this.keywords = model.keywords;
            this.positioning = model.positioning;
            this.products = model.products;
            this.targetAudience = model.targetAudience;
            this.writingTone = model.writingTone;
        } 

        /**
         * Advantages.
         */
        public Builder advantages(String advantages) {
            this.advantages = advantages;
            return this;
        }

        /**
         * Faqs.
         */
        public Builder faqs(java.util.List<BrandKnowledgeFaq> faqs) {
            this.faqs = faqs;
            return this;
        }

        /**
         * Keywords.
         */
        public Builder keywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            return this;
        }

        /**
         * Positioning.
         */
        public Builder positioning(String positioning) {
            this.positioning = positioning;
            return this;
        }

        /**
         * Products.
         */
        public Builder products(String products) {
            this.products = products;
            return this;
        }

        /**
         * TargetAudience.
         */
        public Builder targetAudience(String targetAudience) {
            this.targetAudience = targetAudience;
            return this;
        }

        /**
         * WritingTone.
         */
        public Builder writingTone(String writingTone) {
            this.writingTone = writingTone;
            return this;
        }

        public BrandKnowledgeProfile build() {
            return new BrandKnowledgeProfile(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TextTaskCreateCmd} extends {@link TeaModel}
 *
 * <p>TextTaskCreateCmd</p>
 */
public class TextTaskCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("contentRequirement")
    private String contentRequirement;

    @com.aliyun.core.annotation.NameInMap("idempotentId")
    private String idempotentId;

    @com.aliyun.core.annotation.NameInMap("industry")
    private String industry;

    @com.aliyun.core.annotation.NameInMap("introduction")
    private String introduction;

    @com.aliyun.core.annotation.NameInMap("number")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer number;

    @com.aliyun.core.annotation.NameInMap("point")
    private String point;

    @com.aliyun.core.annotation.NameInMap("referenceTag")
    private ReferenceTag referenceTag;

    @com.aliyun.core.annotation.NameInMap("relatedRagIds")
    private java.util.List < Long > relatedRagIds;

    @com.aliyun.core.annotation.NameInMap("style")
    @com.aliyun.core.annotation.Validation(required = true)
    private String style;

    @com.aliyun.core.annotation.NameInMap("target")
    private String target;

    @com.aliyun.core.annotation.NameInMap("textModeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String textModeType;

    @com.aliyun.core.annotation.NameInMap("theme")
    private String theme;

    @com.aliyun.core.annotation.NameInMap("themes")
    private java.util.List < String > themes;

    private TextTaskCreateCmd(Builder builder) {
        this.agentId = builder.agentId;
        this.contentRequirement = builder.contentRequirement;
        this.idempotentId = builder.idempotentId;
        this.industry = builder.industry;
        this.introduction = builder.introduction;
        this.number = builder.number;
        this.point = builder.point;
        this.referenceTag = builder.referenceTag;
        this.relatedRagIds = builder.relatedRagIds;
        this.style = builder.style;
        this.target = builder.target;
        this.textModeType = builder.textModeType;
        this.theme = builder.theme;
        this.themes = builder.themes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TextTaskCreateCmd create() {
        return builder().build();
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return contentRequirement
     */
    public String getContentRequirement() {
        return this.contentRequirement;
    }

    /**
     * @return idempotentId
     */
    public String getIdempotentId() {
        return this.idempotentId;
    }

    /**
     * @return industry
     */
    public String getIndustry() {
        return this.industry;
    }

    /**
     * @return introduction
     */
    public String getIntroduction() {
        return this.introduction;
    }

    /**
     * @return number
     */
    public Integer getNumber() {
        return this.number;
    }

    /**
     * @return point
     */
    public String getPoint() {
        return this.point;
    }

    /**
     * @return referenceTag
     */
    public ReferenceTag getReferenceTag() {
        return this.referenceTag;
    }

    /**
     * @return relatedRagIds
     */
    public java.util.List < Long > getRelatedRagIds() {
        return this.relatedRagIds;
    }

    /**
     * @return style
     */
    public String getStyle() {
        return this.style;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return textModeType
     */
    public String getTextModeType() {
        return this.textModeType;
    }

    /**
     * @return theme
     */
    public String getTheme() {
        return this.theme;
    }

    /**
     * @return themes
     */
    public java.util.List < String > getThemes() {
        return this.themes;
    }

    public static final class Builder {
        private String agentId; 
        private String contentRequirement; 
        private String idempotentId; 
        private String industry; 
        private String introduction; 
        private Integer number; 
        private String point; 
        private ReferenceTag referenceTag; 
        private java.util.List < Long > relatedRagIds; 
        private String style; 
        private String target; 
        private String textModeType; 
        private String theme; 
        private java.util.List < String > themes; 

        /**
         * agentId.
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * contentRequirement.
         */
        public Builder contentRequirement(String contentRequirement) {
            this.contentRequirement = contentRequirement;
            return this;
        }

        /**
         * idempotentId.
         */
        public Builder idempotentId(String idempotentId) {
            this.idempotentId = idempotentId;
            return this;
        }

        /**
         * industry.
         */
        public Builder industry(String industry) {
            this.industry = industry;
            return this;
        }

        /**
         * introduction.
         */
        public Builder introduction(String introduction) {
            this.introduction = introduction;
            return this;
        }

        /**
         * number.
         */
        public Builder number(Integer number) {
            this.number = number;
            return this;
        }

        /**
         * point.
         */
        public Builder point(String point) {
            this.point = point;
            return this;
        }

        /**
         * referenceTag.
         */
        public Builder referenceTag(ReferenceTag referenceTag) {
            this.referenceTag = referenceTag;
            return this;
        }

        /**
         * relatedRagIds.
         */
        public Builder relatedRagIds(java.util.List < Long > relatedRagIds) {
            this.relatedRagIds = relatedRagIds;
            return this;
        }

        /**
         * style.
         */
        public Builder style(String style) {
            this.style = style;
            return this;
        }

        /**
         * target.
         */
        public Builder target(String target) {
            this.target = target;
            return this;
        }

        /**
         * textModeType.
         */
        public Builder textModeType(String textModeType) {
            this.textModeType = textModeType;
            return this;
        }

        /**
         * theme.
         */
        public Builder theme(String theme) {
            this.theme = theme;
            return this;
        }

        /**
         * themes.
         */
        public Builder themes(java.util.List < String > themes) {
            this.themes = themes;
            return this;
        }

        public TextTaskCreateCmd build() {
            return new TextTaskCreateCmd(this);
        } 

    } 

}

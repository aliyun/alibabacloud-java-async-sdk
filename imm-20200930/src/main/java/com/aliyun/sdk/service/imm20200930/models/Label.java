// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Label} extends {@link TeaModel}
 *
 * <p>Label</p>
 */
public class Label extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CentricScore")
    private Float centricScore;

    @com.aliyun.core.annotation.NameInMap("LabelConfidence")
    private Float labelConfidence;

    @com.aliyun.core.annotation.NameInMap("LabelLevel")
    private Long labelLevel;

    @com.aliyun.core.annotation.NameInMap("LabelName")
    private String labelName;

    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.NameInMap("ParentLabelName")
    private String parentLabelName;

    private Label(Builder builder) {
        this.centricScore = builder.centricScore;
        this.labelConfidence = builder.labelConfidence;
        this.labelLevel = builder.labelLevel;
        this.labelName = builder.labelName;
        this.language = builder.language;
        this.parentLabelName = builder.parentLabelName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Label create() {
        return builder().build();
    }

    /**
     * @return centricScore
     */
    public Float getCentricScore() {
        return this.centricScore;
    }

    /**
     * @return labelConfidence
     */
    public Float getLabelConfidence() {
        return this.labelConfidence;
    }

    /**
     * @return labelLevel
     */
    public Long getLabelLevel() {
        return this.labelLevel;
    }

    /**
     * @return labelName
     */
    public String getLabelName() {
        return this.labelName;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return parentLabelName
     */
    public String getParentLabelName() {
        return this.parentLabelName;
    }

    public static final class Builder {
        private Float centricScore; 
        private Float labelConfidence; 
        private Long labelLevel; 
        private String labelName; 
        private String language; 
        private String parentLabelName; 

        /**
         * CentricScore.
         */
        public Builder centricScore(Float centricScore) {
            this.centricScore = centricScore;
            return this;
        }

        /**
         * LabelConfidence.
         */
        public Builder labelConfidence(Float labelConfidence) {
            this.labelConfidence = labelConfidence;
            return this;
        }

        /**
         * LabelLevel.
         */
        public Builder labelLevel(Long labelLevel) {
            this.labelLevel = labelLevel;
            return this;
        }

        /**
         * LabelName.
         */
        public Builder labelName(String labelName) {
            this.labelName = labelName;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * ParentLabelName.
         */
        public Builder parentLabelName(String parentLabelName) {
            this.parentLabelName = parentLabelName;
            return this;
        }

        public Label build() {
            return new Label(this);
        } 

    } 

}

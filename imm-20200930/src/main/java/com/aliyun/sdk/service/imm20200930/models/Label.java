// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link Label} extends {@link TeaModel}
 *
 * <p>Label</p>
 */
public class Label extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CentricScore")
    private Float centricScore;

    @com.aliyun.core.annotation.NameInMap("Clips")
    private java.util.List<Clip> clips;

    @com.aliyun.core.annotation.NameInMap("LabelAlias")
    private String labelAlias;

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
        this.clips = builder.clips;
        this.labelAlias = builder.labelAlias;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return centricScore
     */
    public Float getCentricScore() {
        return this.centricScore;
    }

    /**
     * @return clips
     */
    public java.util.List<Clip> getClips() {
        return this.clips;
    }

    /**
     * @return labelAlias
     */
    public String getLabelAlias() {
        return this.labelAlias;
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
        private java.util.List<Clip> clips; 
        private String labelAlias; 
        private Float labelConfidence; 
        private Long labelLevel; 
        private String labelName; 
        private String language; 
        private String parentLabelName; 

        private Builder() {
        } 

        private Builder(Label model) {
            this.centricScore = model.centricScore;
            this.clips = model.clips;
            this.labelAlias = model.labelAlias;
            this.labelConfidence = model.labelConfidence;
            this.labelLevel = model.labelLevel;
            this.labelName = model.labelName;
            this.language = model.language;
            this.parentLabelName = model.parentLabelName;
        } 

        /**
         * <p>The centric score of the tag. This indicates whether the tag is the main subject in the image. The value ranges from 0 to 1. A higher value indicates higher confidence that the tag is the main subject of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7319999933242798</p>
         */
        public Builder centricScore(Float centricScore) {
            this.centricScore = centricScore;
            return this;
        }

        /**
         * <p>Event clips.</p>
         */
        public Builder clips(java.util.List<Clip> clips) {
            this.clips = clips;
            return this;
        }

        /**
         * <p>The tag alias.</p>
         * 
         * <strong>example:</strong>
         * <p>座椅</p>
         */
        public Builder labelAlias(String labelAlias) {
            this.labelAlias = labelAlias;
            return this;
        }

        /**
         * <p>The tag confidence level. The value ranges from 0 (lowest confidence) to 1 (highest confidence).</p>
         * 
         * <strong>example:</strong>
         * <p>0.9891784601980591</p>
         */
        public Builder labelConfidence(Float labelConfidence) {
            this.labelConfidence = labelConfidence;
            return this;
        }

        /**
         * <p>The tag level. Valid values are 1, 2, and 3, representing first-level, second-level, and third-level tags, respectively.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder labelLevel(Long labelLevel) {
            this.labelLevel = labelLevel;
            return this;
        }

        /**
         * <p>The tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>椅子</p>
         */
        public Builder labelName(String labelName) {
            this.labelName = labelName;
            return this;
        }

        /**
         * <p>The tag language, in BCP 47 format.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-Hans</p>
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * <p>The parent tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>家具</p>
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

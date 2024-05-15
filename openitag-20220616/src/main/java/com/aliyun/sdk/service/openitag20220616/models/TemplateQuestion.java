// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TemplateQuestion} extends {@link TeaModel}
 *
 * <p>TemplateQuestion</p>
 */
public class TemplateQuestion extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Children")
    private java.util.List < TemplateQuestion > children;

    @com.aliyun.core.annotation.NameInMap("Exif")
    private java.util.Map < String, ? > exif;

    @com.aliyun.core.annotation.NameInMap("MarkTitle")
    private String markTitle;

    @com.aliyun.core.annotation.NameInMap("Options")
    private java.util.List < QuestionOption > options;

    @com.aliyun.core.annotation.NameInMap("PreOptions")
    private java.util.List < String > preOptions;

    @com.aliyun.core.annotation.NameInMap("QuestionId")
    private Long questionId;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private TemplateQuestion(Builder builder) {
        this.children = builder.children;
        this.exif = builder.exif;
        this.markTitle = builder.markTitle;
        this.options = builder.options;
        this.preOptions = builder.preOptions;
        this.questionId = builder.questionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TemplateQuestion create() {
        return builder().build();
    }

    /**
     * @return children
     */
    public java.util.List < TemplateQuestion > getChildren() {
        return this.children;
    }

    /**
     * @return exif
     */
    public java.util.Map < String, ? > getExif() {
        return this.exif;
    }

    /**
     * @return markTitle
     */
    public String getMarkTitle() {
        return this.markTitle;
    }

    /**
     * @return options
     */
    public java.util.List < QuestionOption > getOptions() {
        return this.options;
    }

    /**
     * @return preOptions
     */
    public java.util.List < String > getPreOptions() {
        return this.preOptions;
    }

    /**
     * @return questionId
     */
    public Long getQuestionId() {
        return this.questionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List < TemplateQuestion > children; 
        private java.util.Map < String, ? > exif; 
        private String markTitle; 
        private java.util.List < QuestionOption > options; 
        private java.util.List < String > preOptions; 
        private Long questionId; 
        private String type; 

        /**
         * Children.
         */
        public Builder children(java.util.List < TemplateQuestion > children) {
            this.children = children;
            return this;
        }

        /**
         * Exif.
         */
        public Builder exif(java.util.Map < String, ? > exif) {
            this.exif = exif;
            return this;
        }

        /**
         * MarkTitle.
         */
        public Builder markTitle(String markTitle) {
            this.markTitle = markTitle;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(java.util.List < QuestionOption > options) {
            this.options = options;
            return this;
        }

        /**
         * PreOptions.
         */
        public Builder preOptions(java.util.List < String > preOptions) {
            this.preOptions = preOptions;
            return this;
        }

        /**
         * QuestionId.
         */
        public Builder questionId(Long questionId) {
            this.questionId = questionId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public TemplateQuestion build() {
            return new TemplateQuestion(this);
        } 

    } 

}

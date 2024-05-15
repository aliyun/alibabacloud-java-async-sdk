// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuestionPlugin} extends {@link TeaModel}
 *
 * <p>QuestionPlugin</p>
 */
public class QuestionPlugin extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanSelect")
    private Boolean canSelect;

    @com.aliyun.core.annotation.NameInMap("Children")
    private java.util.List < QuestionPlugin > children;

    @com.aliyun.core.annotation.NameInMap("DefaultResult")
    private String defaultResult;

    @com.aliyun.core.annotation.NameInMap("Display")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean display;

    @com.aliyun.core.annotation.NameInMap("Exif")
    private java.util.Map < String, ? > exif;

    @com.aliyun.core.annotation.NameInMap("HotKeyMap")
    private String hotKeyMap;

    @com.aliyun.core.annotation.NameInMap("MarkTitle")
    @com.aliyun.core.annotation.Validation(required = true)
    private String markTitle;

    @com.aliyun.core.annotation.NameInMap("MarkTitleAlias")
    private String markTitleAlias;

    @com.aliyun.core.annotation.NameInMap("MustFill")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean mustFill;

    @com.aliyun.core.annotation.NameInMap("Options")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < QuestionOption > options;

    @com.aliyun.core.annotation.NameInMap("PreOptions")
    private java.util.List < String > preOptions;

    @com.aliyun.core.annotation.NameInMap("QuestionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String questionId;

    @com.aliyun.core.annotation.NameInMap("Rule")
    private String rule;

    @com.aliyun.core.annotation.NameInMap("SelectGroup")
    private String selectGroup;

    @com.aliyun.core.annotation.NameInMap("Selected")
    private Boolean selected;

    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private QuestionPlugin(Builder builder) {
        this.canSelect = builder.canSelect;
        this.children = builder.children;
        this.defaultResult = builder.defaultResult;
        this.display = builder.display;
        this.exif = builder.exif;
        this.hotKeyMap = builder.hotKeyMap;
        this.markTitle = builder.markTitle;
        this.markTitleAlias = builder.markTitleAlias;
        this.mustFill = builder.mustFill;
        this.options = builder.options;
        this.preOptions = builder.preOptions;
        this.questionId = builder.questionId;
        this.rule = builder.rule;
        this.selectGroup = builder.selectGroup;
        this.selected = builder.selected;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuestionPlugin create() {
        return builder().build();
    }

    /**
     * @return canSelect
     */
    public Boolean getCanSelect() {
        return this.canSelect;
    }

    /**
     * @return children
     */
    public java.util.List < QuestionPlugin > getChildren() {
        return this.children;
    }

    /**
     * @return defaultResult
     */
    public String getDefaultResult() {
        return this.defaultResult;
    }

    /**
     * @return display
     */
    public Boolean getDisplay() {
        return this.display;
    }

    /**
     * @return exif
     */
    public java.util.Map < String, ? > getExif() {
        return this.exif;
    }

    /**
     * @return hotKeyMap
     */
    public String getHotKeyMap() {
        return this.hotKeyMap;
    }

    /**
     * @return markTitle
     */
    public String getMarkTitle() {
        return this.markTitle;
    }

    /**
     * @return markTitleAlias
     */
    public String getMarkTitleAlias() {
        return this.markTitleAlias;
    }

    /**
     * @return mustFill
     */
    public Boolean getMustFill() {
        return this.mustFill;
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
    public String getQuestionId() {
        return this.questionId;
    }

    /**
     * @return rule
     */
    public String getRule() {
        return this.rule;
    }

    /**
     * @return selectGroup
     */
    public String getSelectGroup() {
        return this.selectGroup;
    }

    /**
     * @return selected
     */
    public Boolean getSelected() {
        return this.selected;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Boolean canSelect; 
        private java.util.List < QuestionPlugin > children; 
        private String defaultResult; 
        private Boolean display; 
        private java.util.Map < String, ? > exif; 
        private String hotKeyMap; 
        private String markTitle; 
        private String markTitleAlias; 
        private Boolean mustFill; 
        private java.util.List < QuestionOption > options; 
        private java.util.List < String > preOptions; 
        private String questionId; 
        private String rule; 
        private String selectGroup; 
        private Boolean selected; 
        private String type; 

        /**
         * CanSelect.
         */
        public Builder canSelect(Boolean canSelect) {
            this.canSelect = canSelect;
            return this;
        }

        /**
         * Children.
         */
        public Builder children(java.util.List < QuestionPlugin > children) {
            this.children = children;
            return this;
        }

        /**
         * DefaultResult.
         */
        public Builder defaultResult(String defaultResult) {
            this.defaultResult = defaultResult;
            return this;
        }

        /**
         * Display.
         */
        public Builder display(Boolean display) {
            this.display = display;
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
         * HotKeyMap.
         */
        public Builder hotKeyMap(String hotKeyMap) {
            this.hotKeyMap = hotKeyMap;
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
         * MarkTitleAlias.
         */
        public Builder markTitleAlias(String markTitleAlias) {
            this.markTitleAlias = markTitleAlias;
            return this;
        }

        /**
         * MustFill.
         */
        public Builder mustFill(Boolean mustFill) {
            this.mustFill = mustFill;
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
        public Builder questionId(String questionId) {
            this.questionId = questionId;
            return this;
        }

        /**
         * Rule.
         */
        public Builder rule(String rule) {
            this.rule = rule;
            return this;
        }

        /**
         * SelectGroup.
         */
        public Builder selectGroup(String selectGroup) {
            this.selectGroup = selectGroup;
            return this;
        }

        /**
         * Selected.
         */
        public Builder selected(Boolean selected) {
            this.selected = selected;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public QuestionPlugin build() {
            return new QuestionPlugin(this);
        } 

    } 

}

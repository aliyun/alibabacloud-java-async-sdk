// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuestionOption} extends {@link TeaModel}
 *
 * <p>QuestionOption</p>
 */
public class QuestionOption extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Children")
    private java.util.List < QuestionOption > children;

    @com.aliyun.core.annotation.NameInMap("Color")
    private String color;

    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.NameInMap("Label")
    @com.aliyun.core.annotation.Validation(required = true)
    private String label;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("Shortcut")
    private String shortcut;

    private QuestionOption(Builder builder) {
        this.children = builder.children;
        this.color = builder.color;
        this.key = builder.key;
        this.label = builder.label;
        this.remark = builder.remark;
        this.shortcut = builder.shortcut;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuestionOption create() {
        return builder().build();
    }

    /**
     * @return children
     */
    public java.util.List < QuestionOption > getChildren() {
        return this.children;
    }

    /**
     * @return color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return shortcut
     */
    public String getShortcut() {
        return this.shortcut;
    }

    public static final class Builder {
        private java.util.List < QuestionOption > children; 
        private String color; 
        private String key; 
        private String label; 
        private String remark; 
        private String shortcut; 

        /**
         * Children.
         */
        public Builder children(java.util.List < QuestionOption > children) {
            this.children = children;
            return this;
        }

        /**
         * Color.
         */
        public Builder color(String color) {
            this.color = color;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * Shortcut.
         */
        public Builder shortcut(String shortcut) {
            this.shortcut = shortcut;
            return this;
        }

        public QuestionOption build() {
            return new QuestionOption(this);
        } 

    } 

}

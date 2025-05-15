// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link Prompt} extends {@link TeaModel}
 *
 * <p>Prompt</p>
 */
public class Prompt extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("FrameworkContent")
    private String frameworkContent;

    @com.aliyun.core.annotation.NameInMap("FrameworkType")
    private String frameworkType;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private String modifyTime;

    @com.aliyun.core.annotation.NameInMap("PromptId")
    private String promptId;

    @com.aliyun.core.annotation.NameInMap("PromptName")
    private String promptName;

    private Prompt(Builder builder) {
        this.accessibility = builder.accessibility;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.frameworkContent = builder.frameworkContent;
        this.frameworkType = builder.frameworkType;
        this.modifyTime = builder.modifyTime;
        this.promptId = builder.promptId;
        this.promptName = builder.promptName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Prompt create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return frameworkContent
     */
    public String getFrameworkContent() {
        return this.frameworkContent;
    }

    /**
     * @return frameworkType
     */
    public String getFrameworkType() {
        return this.frameworkType;
    }

    /**
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return promptId
     */
    public String getPromptId() {
        return this.promptId;
    }

    /**
     * @return promptName
     */
    public String getPromptName() {
        return this.promptName;
    }

    public static final class Builder {
        private String accessibility; 
        private String createTime; 
        private String description; 
        private String frameworkContent; 
        private String frameworkType; 
        private String modifyTime; 
        private String promptId; 
        private String promptName; 

        private Builder() {
        } 

        private Builder(Prompt model) {
            this.accessibility = model.accessibility;
            this.createTime = model.createTime;
            this.description = model.description;
            this.frameworkContent = model.frameworkContent;
            this.frameworkType = model.frameworkType;
            this.modifyTime = model.modifyTime;
            this.promptId = model.promptId;
            this.promptName = model.promptName;
        } 

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
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
         * FrameworkContent.
         */
        public Builder frameworkContent(String frameworkContent) {
            this.frameworkContent = frameworkContent;
            return this;
        }

        /**
         * FrameworkType.
         */
        public Builder frameworkType(String frameworkType) {
            this.frameworkType = frameworkType;
            return this;
        }

        /**
         * ModifyTime.
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * PromptId.
         */
        public Builder promptId(String promptId) {
            this.promptId = promptId;
            return this;
        }

        /**
         * PromptName.
         */
        public Builder promptName(String promptName) {
            this.promptName = promptName;
            return this;
        }

        public Prompt build() {
            return new Prompt(this);
        } 

    } 

}

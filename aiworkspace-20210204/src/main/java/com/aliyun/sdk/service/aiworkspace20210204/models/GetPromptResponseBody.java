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
 * {@link GetPromptResponseBody} extends {@link TeaModel}
 *
 * <p>GetPromptResponseBody</p>
 */
public class GetPromptResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("PromptName")
    private String promptName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPromptResponseBody(Builder builder) {
        this.accessibility = builder.accessibility;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.frameworkContent = builder.frameworkContent;
        this.frameworkType = builder.frameworkType;
        this.modifyTime = builder.modifyTime;
        this.promptName = builder.promptName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPromptResponseBody create() {
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
     * @return promptName
     */
    public String getPromptName() {
        return this.promptName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessibility; 
        private String createTime; 
        private String description; 
        private String frameworkContent; 
        private String frameworkType; 
        private String modifyTime; 
        private String promptName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPromptResponseBody model) {
            this.accessibility = model.accessibility;
            this.createTime = model.createTime;
            this.description = model.description;
            this.frameworkContent = model.frameworkContent;
            this.frameworkType = model.frameworkType;
            this.modifyTime = model.modifyTime;
            this.promptName = model.promptName;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The accessibility. Valid values:</p>
         * <ul>
         * <li>PUBLIC: All members in the workspace can access the prompt.</li>
         * <li>PRIVATE: Only the creator can access the prompt.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-16T01:44:10Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the prompt.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The content of the prompt.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>ICIO</li>
         * <li>CRISPE</li>
         * <li>RASCEF</li>
         * <li>RAW</li>
         * </ul>
         */
        public Builder frameworkContent(String frameworkContent) {
            this.frameworkContent = frameworkContent;
            return this;
        }

        /**
         * <p>The prompt template type.</p>
         * 
         * <strong>example:</strong>
         * <p>ICIO</p>
         */
        public Builder frameworkType(String frameworkType) {
            this.frameworkType = frameworkType;
            return this;
        }

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-27T02:01:10Z</p>
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>The name of the prompt.</p>
         */
        public Builder promptName(String promptName) {
            this.promptName = promptName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5A14FA81-DD4E-******-6343FE44B941</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPromptResponseBody build() {
            return new GetPromptResponseBody(this);
        } 

    } 

}

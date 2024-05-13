// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGeneratedContentRequest} extends {@link RequestModel}
 *
 * <p>CreateGeneratedContentRequest</p>
 */
public class CreateGeneratedContentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentDomain")
    private String contentDomain;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentText")
    private String contentText;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keywords")
    private java.util.List < String > keywords;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 6)
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 200, minLength = 2)
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private CreateGeneratedContentRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.content = builder.content;
        this.contentDomain = builder.contentDomain;
        this.contentText = builder.contentText;
        this.keywords = builder.keywords;
        this.prompt = builder.prompt;
        this.taskId = builder.taskId;
        this.title = builder.title;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGeneratedContentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return contentDomain
     */
    public String getContentDomain() {
        return this.contentDomain;
    }

    /**
     * @return contentText
     */
    public String getContentText() {
        return this.contentText;
    }

    /**
     * @return keywords
     */
    public java.util.List < String > getKeywords() {
        return this.keywords;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<CreateGeneratedContentRequest, Builder> {
        private String agentKey; 
        private String content; 
        private String contentDomain; 
        private String contentText; 
        private java.util.List < String > keywords; 
        private String prompt; 
        private String taskId; 
        private String title; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(CreateGeneratedContentRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.content = request.content;
            this.contentDomain = request.contentDomain;
            this.contentText = request.contentText;
            this.keywords = request.keywords;
            this.prompt = request.prompt;
            this.taskId = request.taskId;
            this.title = request.title;
            this.uuid = request.uuid;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * ContentDomain.
         */
        public Builder contentDomain(String contentDomain) {
            this.putBodyParameter("ContentDomain", contentDomain);
            this.contentDomain = contentDomain;
            return this;
        }

        /**
         * ContentText.
         */
        public Builder contentText(String contentText) {
            this.putBodyParameter("ContentText", contentText);
            this.contentText = contentText;
            return this;
        }

        /**
         * Keywords.
         */
        public Builder keywords(java.util.List < String > keywords) {
            String keywordsShrink = shrink(keywords, "Keywords", "json");
            this.putBodyParameter("Keywords", keywordsShrink);
            this.keywords = keywords;
            return this;
        }

        /**
         * Prompt.
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public CreateGeneratedContentRequest build() {
            return new CreateGeneratedContentRequest(this);
        } 

    } 

}

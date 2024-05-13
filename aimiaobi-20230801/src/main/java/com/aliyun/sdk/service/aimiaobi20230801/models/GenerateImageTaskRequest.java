// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateImageTaskRequest} extends {@link RequestModel}
 *
 * <p>GenerateImageTaskRequest</p>
 */
public class GenerateImageTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ArticleTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String articleTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParagraphList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < ParagraphList> paragraphList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Size")
    @com.aliyun.core.annotation.Validation(required = true)
    private String size;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Style")
    @com.aliyun.core.annotation.Validation(required = true)
    private String style;

    private GenerateImageTaskRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.articleTaskId = builder.articleTaskId;
        this.paragraphList = builder.paragraphList;
        this.size = builder.size;
        this.style = builder.style;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateImageTaskRequest create() {
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
     * @return articleTaskId
     */
    public String getArticleTaskId() {
        return this.articleTaskId;
    }

    /**
     * @return paragraphList
     */
    public java.util.List < ParagraphList> getParagraphList() {
        return this.paragraphList;
    }

    /**
     * @return size
     */
    public String getSize() {
        return this.size;
    }

    /**
     * @return style
     */
    public String getStyle() {
        return this.style;
    }

    public static final class Builder extends Request.Builder<GenerateImageTaskRequest, Builder> {
        private String agentKey; 
        private String articleTaskId; 
        private java.util.List < ParagraphList> paragraphList; 
        private String size; 
        private String style; 

        private Builder() {
            super();
        } 

        private Builder(GenerateImageTaskRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.articleTaskId = request.articleTaskId;
            this.paragraphList = request.paragraphList;
            this.size = request.size;
            this.style = request.style;
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
         * ArticleTaskId.
         */
        public Builder articleTaskId(String articleTaskId) {
            this.putBodyParameter("ArticleTaskId", articleTaskId);
            this.articleTaskId = articleTaskId;
            return this;
        }

        /**
         * ParagraphList.
         */
        public Builder paragraphList(java.util.List < ParagraphList> paragraphList) {
            String paragraphListShrink = shrink(paragraphList, "ParagraphList", "json");
            this.putBodyParameter("ParagraphList", paragraphListShrink);
            this.paragraphList = paragraphList;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(String size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * Style.
         */
        public Builder style(String style) {
            this.putBodyParameter("Style", style);
            this.style = style;
            return this;
        }

        @Override
        public GenerateImageTaskRequest build() {
            return new GenerateImageTaskRequest(this);
        } 

    } 

    public static class ParagraphList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long id;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        private ParagraphList(Builder builder) {
            this.content = builder.content;
            this.id = builder.id;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParagraphList create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private String content; 
            private Long id; 
            private String taskId; 
            private String taskStatus; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public ParagraphList build() {
                return new ParagraphList(this);
            } 

        } 

    }
}

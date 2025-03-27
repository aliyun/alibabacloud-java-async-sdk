// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link BatchQueryIndividuationTextResponseBody} extends {@link TeaModel}
 *
 * <p>BatchQueryIndividuationTextResponseBody</p>
 */
public class BatchQueryIndividuationTextResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("textList")
    private java.util.List<TextList> textList;

    private BatchQueryIndividuationTextResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.textList = builder.textList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchQueryIndividuationTextResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return textList
     */
    public java.util.List<TextList> getTextList() {
        return this.textList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TextList> textList; 

        private Builder() {
        } 

        private Builder(BatchQueryIndividuationTextResponseBody model) {
            this.requestId = model.requestId;
            this.textList = model.textList;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>14878724-A835-578D-9DD5-4779ADCE9221</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * textList.
         */
        public Builder textList(java.util.List<TextList> textList) {
            this.textList = textList;
            return this;
        }

        public BatchQueryIndividuationTextResponseBody build() {
            return new BatchQueryIndividuationTextResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchQueryIndividuationTextResponseBody} extends {@link TeaModel}
     *
     * <p>BatchQueryIndividuationTextResponseBody</p>
     */
    public static class TextList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("errorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("itemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("projectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("textId")
        private String textId;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private TextList(Builder builder) {
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.errorMsg = builder.errorMsg;
            this.itemId = builder.itemId;
            this.projectId = builder.projectId;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.textId = builder.textId;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextList create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return textId
         */
        public String getTextId() {
            return this.textId;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String content; 
            private String createTime; 
            private String errorMsg; 
            private String itemId; 
            private String projectId; 
            private String status; 
            private String taskId; 
            private String textId; 
            private String updateTime; 
            private String userId; 

            private Builder() {
            } 

            private Builder(TextList model) {
                this.content = model.content;
                this.createTime = model.createTime;
                this.errorMsg = model.errorMsg;
                this.itemId = model.itemId;
                this.projectId = model.projectId;
                this.status = model.status;
                this.taskId = model.taskId;
                this.textId = model.textId;
                this.updateTime = model.updateTime;
                this.userId = model.userId;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * errorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * itemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * projectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * textId.
             */
            public Builder textId(String textId) {
                this.textId = textId;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public TextList build() {
                return new TextList(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link GetGeneratedContentResponseBody} extends {@link TeaModel}
 *
 * <p>GetGeneratedContentResponseBody</p>
 */
public class GetGeneratedContentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetGeneratedContentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGeneratedContentResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetGeneratedContentResponseBody build() {
            return new GetGeneratedContentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGeneratedContentResponseBody} extends {@link TeaModel}
     *
     * <p>GetGeneratedContentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentDomain")
        private String contentDomain;

        @com.aliyun.core.annotation.NameInMap("ContentText")
        private String contentText;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("KeywordList")
        private java.util.List<String> keywordList;

        @com.aliyun.core.annotation.NameInMap("Keywords")
        private String keywords;

        @com.aliyun.core.annotation.NameInMap("Prompt")
        private String prompt;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateUser")
        private String updateUser;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Data(Builder builder) {
            this.content = builder.content;
            this.contentDomain = builder.contentDomain;
            this.contentText = builder.contentText;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.deviceId = builder.deviceId;
            this.id = builder.id;
            this.keywordList = builder.keywordList;
            this.keywords = builder.keywords;
            this.prompt = builder.prompt;
            this.taskId = builder.taskId;
            this.title = builder.title;
            this.updateTime = builder.updateTime;
            this.updateUser = builder.updateUser;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return keywordList
         */
        public java.util.List<String> getKeywordList() {
            return this.keywordList;
        }

        /**
         * @return keywords
         */
        public String getKeywords() {
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
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updateUser
         */
        public String getUpdateUser() {
            return this.updateUser;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String content; 
            private String contentDomain; 
            private String contentText; 
            private String createTime; 
            private String createUser; 
            private String deviceId; 
            private Long id; 
            private java.util.List<String> keywordList; 
            private String keywords; 
            private String prompt; 
            private String taskId; 
            private String title; 
            private String updateTime; 
            private String updateUser; 
            private String uuid; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ContentDomain.
             */
            public Builder contentDomain(String contentDomain) {
                this.contentDomain = contentDomain;
                return this;
            }

            /**
             * ContentText.
             */
            public Builder contentText(String contentText) {
                this.contentText = contentText;
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
             * CreateUser.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
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
             * KeywordList.
             */
            public Builder keywordList(java.util.List<String> keywordList) {
                this.keywordList = keywordList;
                return this;
            }

            /**
             * Keywords.
             */
            public Builder keywords(String keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * Prompt.
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
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
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UpdateUser.
             */
            public Builder updateUser(String updateUser) {
                this.updateUser = updateUser;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aipodcast20250228.models;

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
 * {@link PodcastTaskResultQueryResponseBody} extends {@link TeaModel}
 *
 * <p>PodcastTaskResultQueryResponseBody</p>
 */
public class PodcastTaskResultQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private PodcastTaskResultQueryResponseBody(Builder builder) {
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

    public static PodcastTaskResultQueryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public String getHttpStatusCode() {
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
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(PodcastTaskResultQueryResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PodcastTaskResultQueryResponseBody build() {
            return new PodcastTaskResultQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PodcastTaskResultQueryResponseBody} extends {@link TeaModel}
     *
     * <p>PodcastTaskResultQueryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("extraResult")
        private Object extraResult;

        @com.aliyun.core.annotation.NameInMap("resultUrl")
        private Object resultUrl;

        @com.aliyun.core.annotation.NameInMap("script")
        private String script;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("taskStatus")
        private String taskStatus;

        private Data(Builder builder) {
            this.extraResult = builder.extraResult;
            this.resultUrl = builder.resultUrl;
            this.script = builder.script;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return extraResult
         */
        public Object getExtraResult() {
            return this.extraResult;
        }

        /**
         * @return resultUrl
         */
        public Object getResultUrl() {
            return this.resultUrl;
        }

        /**
         * @return script
         */
        public String getScript() {
            return this.script;
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
            private Object extraResult; 
            private Object resultUrl; 
            private String script; 
            private String taskId; 
            private String taskStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.extraResult = model.extraResult;
                this.resultUrl = model.resultUrl;
                this.script = model.script;
                this.taskId = model.taskId;
                this.taskStatus = model.taskStatus;
            } 

            /**
             * extraResult.
             */
            public Builder extraResult(Object extraResult) {
                this.extraResult = extraResult;
                return this;
            }

            /**
             * resultUrl.
             */
            public Builder resultUrl(Object resultUrl) {
                this.resultUrl = resultUrl;
                return this;
            }

            /**
             * script.
             */
            public Builder script(String script) {
                this.script = script;
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
             * taskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

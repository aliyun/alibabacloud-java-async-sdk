// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.anytrans20250707.models;

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
 * {@link GetDocTranslateTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetDocTranslateTaskResponseBody</p>
 */
public class GetDocTranslateTaskResponseBody extends TeaModel {
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

    private GetDocTranslateTaskResponseBody(Builder builder) {
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

    public static GetDocTranslateTaskResponseBody create() {
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

        private Builder(GetDocTranslateTaskResponseBody model) {
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

        public GetDocTranslateTaskResponseBody build() {
            return new GetDocTranslateTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDocTranslateTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetDocTranslateTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("charactersCount")
        private Integer charactersCount;

        @com.aliyun.core.annotation.NameInMap("pageCount")
        private Integer pageCount;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("translateFileUrl")
        private String translateFileUrl;

        private Data(Builder builder) {
            this.charactersCount = builder.charactersCount;
            this.pageCount = builder.pageCount;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.translateFileUrl = builder.translateFileUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return charactersCount
         */
        public Integer getCharactersCount() {
            return this.charactersCount;
        }

        /**
         * @return pageCount
         */
        public Integer getPageCount() {
            return this.pageCount;
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
         * @return translateFileUrl
         */
        public String getTranslateFileUrl() {
            return this.translateFileUrl;
        }

        public static final class Builder {
            private Integer charactersCount; 
            private Integer pageCount; 
            private String status; 
            private String taskId; 
            private String translateFileUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.charactersCount = model.charactersCount;
                this.pageCount = model.pageCount;
                this.status = model.status;
                this.taskId = model.taskId;
                this.translateFileUrl = model.translateFileUrl;
            } 

            /**
             * charactersCount.
             */
            public Builder charactersCount(Integer charactersCount) {
                this.charactersCount = charactersCount;
                return this;
            }

            /**
             * pageCount.
             */
            public Builder pageCount(Integer pageCount) {
                this.pageCount = pageCount;
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
             * translateFileUrl.
             */
            public Builder translateFileUrl(String translateFileUrl) {
                this.translateFileUrl = translateFileUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

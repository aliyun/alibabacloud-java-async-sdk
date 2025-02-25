// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link LogPipelineJobRunResponseBody} extends {@link TeaModel}
 *
 * <p>LogPipelineJobRunResponseBody</p>
 */
public class LogPipelineJobRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("log")
    private Log log;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private LogPipelineJobRunResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.log = builder.log;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogPipelineJobRunResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return log
     */
    public Log getLog() {
        return this.log;
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
        private String errorCode; 
        private String errorMessage; 
        private Log log; 
        private String requestId; 
        private Boolean success; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * log.
         */
        public Builder log(Log log) {
            this.log = log;
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

        public LogPipelineJobRunResponseBody build() {
            return new LogPipelineJobRunResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link LogPipelineJobRunResponseBody} extends {@link TeaModel}
     *
     * <p>LogPipelineJobRunResponseBody</p>
     */
    public static class Log extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("more")
        private Boolean more;

        private Log(Builder builder) {
            this.content = builder.content;
            this.more = builder.more;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Log create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return more
         */
        public Boolean getMore() {
            return this.more;
        }

        public static final class Builder {
            private String content; 
            private Boolean more; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * more.
             */
            public Builder more(Boolean more) {
                this.more = more;
                return this;
            }

            public Log build() {
                return new Log(this);
            } 

        } 

    }
}

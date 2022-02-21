// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineRunJobLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetPipelineRunJobLogResponseBody</p>
 */
public class GetPipelineRunJobLogResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("Log")
    private Log log;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetPipelineRunJobLogResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.log = builder.log;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineRunJobLogResponseBody create() {
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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Log.
         */
        public Builder log(Log log) {
            this.log = log;
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

        public GetPipelineRunJobLogResponseBody build() {
            return new GetPipelineRunJobLogResponseBody(this);
        } 

    } 

    public static class Log extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("Last")
        private Long last;

        @NameInMap("More")
        private Boolean more;

        private Log(Builder builder) {
            this.content = builder.content;
            this.last = builder.last;
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
         * @return last
         */
        public Long getLast() {
            return this.last;
        }

        /**
         * @return more
         */
        public Boolean getMore() {
            return this.more;
        }

        public static final class Builder {
            private String content; 
            private Long last; 
            private Boolean more; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Last.
             */
            public Builder last(Long last) {
                this.last = last;
                return this;
            }

            /**
             * More.
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

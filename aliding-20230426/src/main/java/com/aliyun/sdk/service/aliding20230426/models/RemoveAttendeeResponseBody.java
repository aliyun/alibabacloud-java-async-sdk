// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveAttendeeResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveAttendeeResponseBody</p>
 */
public class RemoveAttendeeResponseBody extends TeaModel {
    @NameInMap("Content")
    private Content content;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorCtx")
    private java.util.Map < String, ? > errorCtx;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private RemoveAttendeeResponseBody(Builder builder) {
        this.content = builder.content;
        this.errorCode = builder.errorCode;
        this.errorCtx = builder.errorCtx;
        this.errorMsg = builder.errorMsg;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveAttendeeResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorCtx
     */
    public java.util.Map < String, ? > getErrorCtx() {
        return this.errorCtx;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Content content; 
        private String errorCode; 
        private java.util.Map < String, ? > errorCtx; 
        private String errorMsg; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * Content.
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorCtx.
         */
        public Builder errorCtx(java.util.Map < String, ? > errorCtx) {
            this.errorCtx = errorCtx;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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
         * RequestId
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

        public RemoveAttendeeResponseBody build() {
            return new RemoveAttendeeResponseBody(this);
        } 

    } 

    public static class Content extends TeaModel {
        @NameInMap("Data")
        private Object data;

        private Content(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Object getData() {
            return this.data;
        }

        public static final class Builder {
            private Object data; 

            /**
             * Data.
             */
            public Builder data(Object data) {
                this.data = data;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}

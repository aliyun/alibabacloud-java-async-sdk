// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link DeleteEventResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteEventResponseBody</p>
 */
public class DeleteEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorCtx")
    private java.util.Map<String, ?> errorCtx;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private DeleteEventResponseBody(Builder builder) {
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

    public static DeleteEventResponseBody create() {
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
    public java.util.Map<String, ?> getErrorCtx() {
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
        private java.util.Map<String, ?> errorCtx; 
        private String errorMsg; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * content.
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorCtx.
         */
        public Builder errorCtx(java.util.Map<String, ?> errorCtx) {
            this.errorCtx = errorCtx;
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
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>4248DCC9-785F-5A14-8BE0-830FD52E1261</p>
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

        public DeleteEventResponseBody build() {
            return new DeleteEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteEventResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteEventResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
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
             * data.
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

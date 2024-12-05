// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ErrorResponse} extends {@link TeaModel}
 *
 * <p>ErrorResponse</p>
 */
public class ErrorResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ErrorResponse(BuilderImpl builder) {
        super(builder);
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static ErrorResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    public interface Builder extends Response.Builder<ErrorResponse, Builder> {

        Builder code(String code);

        Builder message(String message);

        Builder requestId(String requestId);

        @Override
        ErrorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ErrorResponse, Builder>
            implements Builder {
        private String code; 
        private String message; 
        private String requestId; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ErrorResponse response) {
            super(response);
            this.code = response.code;
            this.message = response.message;
            this.requestId = response.requestId;
        } 

        /**
         * code.
         */
        @Override
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        @Override
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        @Override
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        @Override
        public ErrorResponse build() {
            return new ErrorResponse(this);
        } 

    } 

}

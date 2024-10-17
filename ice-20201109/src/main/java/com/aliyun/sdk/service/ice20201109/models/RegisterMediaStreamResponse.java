// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RegisterMediaStreamResponse} extends {@link TeaModel}
 *
 * <p>RegisterMediaStreamResponse</p>
 */
public class RegisterMediaStreamResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RegisterMediaStreamResponseBody body;

    private RegisterMediaStreamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RegisterMediaStreamResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public RegisterMediaStreamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RegisterMediaStreamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RegisterMediaStreamResponseBody body);

        @Override
        RegisterMediaStreamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RegisterMediaStreamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RegisterMediaStreamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RegisterMediaStreamResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(RegisterMediaStreamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RegisterMediaStreamResponse build() {
            return new RegisterMediaStreamResponse(this);
        } 

    } 

}

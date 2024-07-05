// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterCustomFaceResponse} extends {@link TeaModel}
 *
 * <p>RegisterCustomFaceResponse</p>
 */
public class RegisterCustomFaceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RegisterCustomFaceResponseBody body;

    private RegisterCustomFaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RegisterCustomFaceResponse create() {
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
    public RegisterCustomFaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RegisterCustomFaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RegisterCustomFaceResponseBody body);

        @Override
        RegisterCustomFaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RegisterCustomFaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RegisterCustomFaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RegisterCustomFaceResponse response) {
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
        public Builder body(RegisterCustomFaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RegisterCustomFaceResponse build() {
            return new RegisterCustomFaceResponse(this);
        } 

    } 

}

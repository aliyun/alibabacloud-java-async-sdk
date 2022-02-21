// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterCustomFaceResponse} extends {@link TeaModel}
 *
 * <p>RegisterCustomFaceResponse</p>
 */
public class RegisterCustomFaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RegisterCustomFaceResponseBody body;

    private RegisterCustomFaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
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
     * @return body
     */
    public RegisterCustomFaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RegisterCustomFaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RegisterCustomFaceResponseBody body);

        @Override
        RegisterCustomFaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RegisterCustomFaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RegisterCustomFaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RegisterCustomFaceResponse response) {
            super(response);
            this.headers = response.headers;
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

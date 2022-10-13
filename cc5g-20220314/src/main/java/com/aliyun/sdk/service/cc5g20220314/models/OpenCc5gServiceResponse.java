// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenCc5gServiceResponse} extends {@link TeaModel}
 *
 * <p>OpenCc5gServiceResponse</p>
 */
public class OpenCc5gServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenCc5gServiceResponseBody body;

    private OpenCc5gServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenCc5gServiceResponse create() {
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
    public OpenCc5gServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenCc5gServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenCc5gServiceResponseBody body);

        @Override
        OpenCc5gServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenCc5gServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenCc5gServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenCc5gServiceResponse response) {
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
        public Builder body(OpenCc5gServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenCc5gServiceResponse build() {
            return new OpenCc5gServiceResponse(this);
        } 

    } 

}

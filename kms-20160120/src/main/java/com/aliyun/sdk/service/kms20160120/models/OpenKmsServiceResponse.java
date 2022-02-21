// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenKmsServiceResponse} extends {@link TeaModel}
 *
 * <p>OpenKmsServiceResponse</p>
 */
public class OpenKmsServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenKmsServiceResponseBody body;

    private OpenKmsServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenKmsServiceResponse create() {
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
    public OpenKmsServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenKmsServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenKmsServiceResponseBody body);

        @Override
        OpenKmsServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenKmsServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenKmsServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenKmsServiceResponse response) {
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
        public Builder body(OpenKmsServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenKmsServiceResponse build() {
            return new OpenKmsServiceResponse(this);
        } 

    } 

}

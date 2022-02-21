// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenImmServiceResponse} extends {@link TeaModel}
 *
 * <p>OpenImmServiceResponse</p>
 */
public class OpenImmServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenImmServiceResponseBody body;

    private OpenImmServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenImmServiceResponse create() {
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
    public OpenImmServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenImmServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenImmServiceResponseBody body);

        @Override
        OpenImmServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenImmServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenImmServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenImmServiceResponse response) {
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
        public Builder body(OpenImmServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenImmServiceResponse build() {
            return new OpenImmServiceResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenAckServiceResponse} extends {@link TeaModel}
 *
 * <p>OpenAckServiceResponse</p>
 */
public class OpenAckServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenAckServiceResponseBody body;

    private OpenAckServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenAckServiceResponse create() {
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
    public OpenAckServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenAckServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenAckServiceResponseBody body);

        @Override
        OpenAckServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenAckServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenAckServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenAckServiceResponse response) {
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
        public Builder body(OpenAckServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenAckServiceResponse build() {
            return new OpenAckServiceResponse(this);
        } 

    } 

}

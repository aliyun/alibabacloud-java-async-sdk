// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenAlinlpServiceResponse} extends {@link TeaModel}
 *
 * <p>OpenAlinlpServiceResponse</p>
 */
public class OpenAlinlpServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenAlinlpServiceResponseBody body;

    private OpenAlinlpServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenAlinlpServiceResponse create() {
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
    public OpenAlinlpServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenAlinlpServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenAlinlpServiceResponseBody body);

        @Override
        OpenAlinlpServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenAlinlpServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenAlinlpServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenAlinlpServiceResponse response) {
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
        public Builder body(OpenAlinlpServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenAlinlpServiceResponse build() {
            return new OpenAlinlpServiceResponse(this);
        } 

    } 

}

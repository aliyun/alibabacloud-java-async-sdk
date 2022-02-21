// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenSaeServiceResponse} extends {@link TeaModel}
 *
 * <p>OpenSaeServiceResponse</p>
 */
public class OpenSaeServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenSaeServiceResponseBody body;

    private OpenSaeServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenSaeServiceResponse create() {
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
    public OpenSaeServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenSaeServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenSaeServiceResponseBody body);

        @Override
        OpenSaeServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenSaeServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenSaeServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenSaeServiceResponse response) {
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
        public Builder body(OpenSaeServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenSaeServiceResponse build() {
            return new OpenSaeServiceResponse(this);
        } 

    } 

}

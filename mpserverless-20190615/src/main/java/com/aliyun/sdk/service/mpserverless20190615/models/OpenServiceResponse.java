// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenServiceResponse} extends {@link TeaModel}
 *
 * <p>OpenServiceResponse</p>
 */
public class OpenServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenServiceResponseBody body;

    private OpenServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenServiceResponse create() {
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
    public OpenServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenServiceResponseBody body);

        @Override
        OpenServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenServiceResponse response) {
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
        public Builder body(OpenServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenServiceResponse build() {
            return new OpenServiceResponse(this);
        } 

    } 

}

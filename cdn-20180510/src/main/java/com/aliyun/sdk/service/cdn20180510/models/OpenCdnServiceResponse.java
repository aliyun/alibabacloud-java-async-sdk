// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenCdnServiceResponse} extends {@link TeaModel}
 *
 * <p>OpenCdnServiceResponse</p>
 */
public class OpenCdnServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenCdnServiceResponseBody body;

    private OpenCdnServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenCdnServiceResponse create() {
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
    public OpenCdnServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenCdnServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenCdnServiceResponseBody body);

        @Override
        OpenCdnServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenCdnServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenCdnServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenCdnServiceResponse response) {
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
        public Builder body(OpenCdnServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenCdnServiceResponse build() {
            return new OpenCdnServiceResponse(this);
        } 

    } 

}

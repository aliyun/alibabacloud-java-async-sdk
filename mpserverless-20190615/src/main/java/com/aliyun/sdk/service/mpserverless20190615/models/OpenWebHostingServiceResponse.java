// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenWebHostingServiceResponse} extends {@link TeaModel}
 *
 * <p>OpenWebHostingServiceResponse</p>
 */
public class OpenWebHostingServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenWebHostingServiceResponseBody body;

    private OpenWebHostingServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenWebHostingServiceResponse create() {
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
    public OpenWebHostingServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenWebHostingServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenWebHostingServiceResponseBody body);

        @Override
        OpenWebHostingServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenWebHostingServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenWebHostingServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenWebHostingServiceResponse response) {
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
        public Builder body(OpenWebHostingServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenWebHostingServiceResponse build() {
            return new OpenWebHostingServiceResponse(this);
        } 

    } 

}

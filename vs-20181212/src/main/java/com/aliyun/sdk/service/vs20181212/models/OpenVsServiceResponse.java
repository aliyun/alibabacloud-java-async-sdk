// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenVsServiceResponse} extends {@link TeaModel}
 *
 * <p>OpenVsServiceResponse</p>
 */
public class OpenVsServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenVsServiceResponseBody body;

    private OpenVsServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenVsServiceResponse create() {
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
    public OpenVsServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenVsServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenVsServiceResponseBody body);

        @Override
        OpenVsServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenVsServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenVsServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenVsServiceResponse response) {
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
        public Builder body(OpenVsServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenVsServiceResponse build() {
            return new OpenVsServiceResponse(this);
        } 

    } 

}

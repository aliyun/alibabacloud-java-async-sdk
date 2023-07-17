// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenArmsServiceResponse} extends {@link TeaModel}
 *
 * <p>OpenArmsServiceResponse</p>
 */
public class OpenArmsServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenArmsServiceResponseBody body;

    private OpenArmsServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenArmsServiceResponse create() {
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
    public OpenArmsServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenArmsServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenArmsServiceResponseBody body);

        @Override
        OpenArmsServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenArmsServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenArmsServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenArmsServiceResponse response) {
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
        public Builder body(OpenArmsServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenArmsServiceResponse build() {
            return new OpenArmsServiceResponse(this);
        } 

    } 

}

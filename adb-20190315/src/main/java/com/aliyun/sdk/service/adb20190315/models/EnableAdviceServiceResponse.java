// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableAdviceServiceResponse} extends {@link TeaModel}
 *
 * <p>EnableAdviceServiceResponse</p>
 */
public class EnableAdviceServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableAdviceServiceResponseBody body;

    private EnableAdviceServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableAdviceServiceResponse create() {
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
    public EnableAdviceServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableAdviceServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableAdviceServiceResponseBody body);

        @Override
        EnableAdviceServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableAdviceServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableAdviceServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableAdviceServiceResponse response) {
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
        public Builder body(EnableAdviceServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableAdviceServiceResponse build() {
            return new EnableAdviceServiceResponse(this);
        } 

    } 

}

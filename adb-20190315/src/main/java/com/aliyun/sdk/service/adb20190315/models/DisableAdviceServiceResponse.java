// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableAdviceServiceResponse} extends {@link TeaModel}
 *
 * <p>DisableAdviceServiceResponse</p>
 */
public class DisableAdviceServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableAdviceServiceResponseBody body;

    private DisableAdviceServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableAdviceServiceResponse create() {
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
    public DisableAdviceServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableAdviceServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableAdviceServiceResponseBody body);

        @Override
        DisableAdviceServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableAdviceServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableAdviceServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableAdviceServiceResponse response) {
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
        public Builder body(DisableAdviceServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableAdviceServiceResponse build() {
            return new DisableAdviceServiceResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableApplicationApiInvokeResponse} extends {@link TeaModel}
 *
 * <p>DisableApplicationApiInvokeResponse</p>
 */
public class DisableApplicationApiInvokeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableApplicationApiInvokeResponseBody body;

    private DisableApplicationApiInvokeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableApplicationApiInvokeResponse create() {
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
    public DisableApplicationApiInvokeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableApplicationApiInvokeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableApplicationApiInvokeResponseBody body);

        @Override
        DisableApplicationApiInvokeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableApplicationApiInvokeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableApplicationApiInvokeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableApplicationApiInvokeResponse response) {
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
        public Builder body(DisableApplicationApiInvokeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableApplicationApiInvokeResponse build() {
            return new DisableApplicationApiInvokeResponse(this);
        } 

    } 

}

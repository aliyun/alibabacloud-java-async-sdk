// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisablePolicyTypeResponse} extends {@link TeaModel}
 *
 * <p>DisablePolicyTypeResponse</p>
 */
public class DisablePolicyTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisablePolicyTypeResponseBody body;

    private DisablePolicyTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisablePolicyTypeResponse create() {
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
    public DisablePolicyTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisablePolicyTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisablePolicyTypeResponseBody body);

        @Override
        DisablePolicyTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisablePolicyTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisablePolicyTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisablePolicyTypeResponse response) {
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
        public Builder body(DisablePolicyTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisablePolicyTypeResponse build() {
            return new DisablePolicyTypeResponse(this);
        } 

    } 

}

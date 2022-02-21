// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableTrunkProvidersResponse} extends {@link TeaModel}
 *
 * <p>DisableTrunkProvidersResponse</p>
 */
public class DisableTrunkProvidersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableTrunkProvidersResponseBody body;

    private DisableTrunkProvidersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableTrunkProvidersResponse create() {
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
    public DisableTrunkProvidersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableTrunkProvidersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableTrunkProvidersResponseBody body);

        @Override
        DisableTrunkProvidersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableTrunkProvidersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableTrunkProvidersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableTrunkProvidersResponse response) {
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
        public Builder body(DisableTrunkProvidersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableTrunkProvidersResponse build() {
            return new DisableTrunkProvidersResponse(this);
        } 

    } 

}

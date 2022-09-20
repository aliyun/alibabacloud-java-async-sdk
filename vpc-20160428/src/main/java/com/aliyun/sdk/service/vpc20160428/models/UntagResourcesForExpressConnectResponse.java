// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UntagResourcesForExpressConnectResponse} extends {@link TeaModel}
 *
 * <p>UntagResourcesForExpressConnectResponse</p>
 */
public class UntagResourcesForExpressConnectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UntagResourcesForExpressConnectResponseBody body;

    private UntagResourcesForExpressConnectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UntagResourcesForExpressConnectResponse create() {
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
    public UntagResourcesForExpressConnectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UntagResourcesForExpressConnectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UntagResourcesForExpressConnectResponseBody body);

        @Override
        UntagResourcesForExpressConnectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UntagResourcesForExpressConnectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UntagResourcesForExpressConnectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UntagResourcesForExpressConnectResponse response) {
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
        public Builder body(UntagResourcesForExpressConnectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UntagResourcesForExpressConnectResponse build() {
            return new UntagResourcesForExpressConnectResponse(this);
        } 

    } 

}

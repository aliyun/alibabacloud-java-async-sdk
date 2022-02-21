// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveGlobalAccelerationInstanceIpResponse} extends {@link TeaModel}
 *
 * <p>RemoveGlobalAccelerationInstanceIpResponse</p>
 */
public class RemoveGlobalAccelerationInstanceIpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveGlobalAccelerationInstanceIpResponseBody body;

    private RemoveGlobalAccelerationInstanceIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveGlobalAccelerationInstanceIpResponse create() {
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
    public RemoveGlobalAccelerationInstanceIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveGlobalAccelerationInstanceIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveGlobalAccelerationInstanceIpResponseBody body);

        @Override
        RemoveGlobalAccelerationInstanceIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveGlobalAccelerationInstanceIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveGlobalAccelerationInstanceIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveGlobalAccelerationInstanceIpResponse response) {
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
        public Builder body(RemoveGlobalAccelerationInstanceIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveGlobalAccelerationInstanceIpResponse build() {
            return new RemoveGlobalAccelerationInstanceIpResponse(this);
        } 

    } 

}

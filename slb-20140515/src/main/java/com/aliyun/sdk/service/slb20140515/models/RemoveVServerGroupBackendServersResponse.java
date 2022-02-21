// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveVServerGroupBackendServersResponse} extends {@link TeaModel}
 *
 * <p>RemoveVServerGroupBackendServersResponse</p>
 */
public class RemoveVServerGroupBackendServersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveVServerGroupBackendServersResponseBody body;

    private RemoveVServerGroupBackendServersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveVServerGroupBackendServersResponse create() {
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
    public RemoveVServerGroupBackendServersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveVServerGroupBackendServersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveVServerGroupBackendServersResponseBody body);

        @Override
        RemoveVServerGroupBackendServersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveVServerGroupBackendServersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveVServerGroupBackendServersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveVServerGroupBackendServersResponse response) {
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
        public Builder body(RemoveVServerGroupBackendServersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveVServerGroupBackendServersResponse build() {
            return new RemoveVServerGroupBackendServersResponse(this);
        } 

    } 

}

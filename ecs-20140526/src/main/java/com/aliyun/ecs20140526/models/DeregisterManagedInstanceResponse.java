// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeregisterManagedInstanceResponse} extends {@link TeaModel}
 *
 * <p>DeregisterManagedInstanceResponse</p>
 */
public class DeregisterManagedInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeregisterManagedInstanceResponseBody body;

    private DeregisterManagedInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeregisterManagedInstanceResponse create() {
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
    public DeregisterManagedInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeregisterManagedInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeregisterManagedInstanceResponseBody body);

        @Override
        DeregisterManagedInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeregisterManagedInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeregisterManagedInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeregisterManagedInstanceResponse response) {
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
        public Builder body(DeregisterManagedInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeregisterManagedInstanceResponse build() {
            return new DeregisterManagedInstanceResponse(this);
        } 

    } 

}

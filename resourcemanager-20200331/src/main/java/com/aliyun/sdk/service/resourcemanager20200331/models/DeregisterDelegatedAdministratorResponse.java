// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeregisterDelegatedAdministratorResponse} extends {@link TeaModel}
 *
 * <p>DeregisterDelegatedAdministratorResponse</p>
 */
public class DeregisterDelegatedAdministratorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeregisterDelegatedAdministratorResponseBody body;

    private DeregisterDelegatedAdministratorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeregisterDelegatedAdministratorResponse create() {
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
    public DeregisterDelegatedAdministratorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeregisterDelegatedAdministratorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeregisterDelegatedAdministratorResponseBody body);

        @Override
        DeregisterDelegatedAdministratorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeregisterDelegatedAdministratorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeregisterDelegatedAdministratorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeregisterDelegatedAdministratorResponse response) {
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
        public Builder body(DeregisterDelegatedAdministratorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeregisterDelegatedAdministratorResponse build() {
            return new DeregisterDelegatedAdministratorResponse(this);
        } 

    } 

}

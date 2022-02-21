// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetServiceRegistrySourceResponse} extends {@link TeaModel}
 *
 * <p>SetServiceRegistrySourceResponse</p>
 */
public class SetServiceRegistrySourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetServiceRegistrySourceResponseBody body;

    private SetServiceRegistrySourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetServiceRegistrySourceResponse create() {
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
    public SetServiceRegistrySourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetServiceRegistrySourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetServiceRegistrySourceResponseBody body);

        @Override
        SetServiceRegistrySourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetServiceRegistrySourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetServiceRegistrySourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetServiceRegistrySourceResponse response) {
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
        public Builder body(SetServiceRegistrySourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetServiceRegistrySourceResponse build() {
            return new SetServiceRegistrySourceResponse(this);
        } 

    } 

}

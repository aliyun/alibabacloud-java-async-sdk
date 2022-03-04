// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDedicatedHostClusterResponse} extends {@link TeaModel}
 *
 * <p>CreateDedicatedHostClusterResponse</p>
 */
public class CreateDedicatedHostClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDedicatedHostClusterResponseBody body;

    private CreateDedicatedHostClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDedicatedHostClusterResponse create() {
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
    public CreateDedicatedHostClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDedicatedHostClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDedicatedHostClusterResponseBody body);

        @Override
        CreateDedicatedHostClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDedicatedHostClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDedicatedHostClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDedicatedHostClusterResponse response) {
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
        public Builder body(CreateDedicatedHostClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDedicatedHostClusterResponse build() {
            return new CreateDedicatedHostClusterResponse(this);
        } 

    } 

}

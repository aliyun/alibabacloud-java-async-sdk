// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHubClusterResponse} extends {@link TeaModel}
 *
 * <p>CreateHubClusterResponse</p>
 */
public class CreateHubClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateHubClusterResponseBody body;

    private CreateHubClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateHubClusterResponse create() {
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
    public CreateHubClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateHubClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateHubClusterResponseBody body);

        @Override
        CreateHubClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateHubClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateHubClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateHubClusterResponse response) {
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
        public Builder body(CreateHubClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateHubClusterResponse build() {
            return new CreateHubClusterResponse(this);
        } 

    } 

}

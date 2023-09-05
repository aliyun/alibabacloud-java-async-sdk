// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBasicEndpointResponse} extends {@link TeaModel}
 *
 * <p>UpdateBasicEndpointResponse</p>
 */
public class UpdateBasicEndpointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateBasicEndpointResponseBody body;

    private UpdateBasicEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateBasicEndpointResponse create() {
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
    public UpdateBasicEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateBasicEndpointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateBasicEndpointResponseBody body);

        @Override
        UpdateBasicEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateBasicEndpointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateBasicEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateBasicEndpointResponse response) {
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
        public Builder body(UpdateBasicEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateBasicEndpointResponse build() {
            return new UpdateBasicEndpointResponse(this);
        } 

    } 

}

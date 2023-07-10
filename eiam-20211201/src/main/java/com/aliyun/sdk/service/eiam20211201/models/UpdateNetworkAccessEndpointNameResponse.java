// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNetworkAccessEndpointNameResponse} extends {@link TeaModel}
 *
 * <p>UpdateNetworkAccessEndpointNameResponse</p>
 */
public class UpdateNetworkAccessEndpointNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateNetworkAccessEndpointNameResponseBody body;

    private UpdateNetworkAccessEndpointNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateNetworkAccessEndpointNameResponse create() {
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
    public UpdateNetworkAccessEndpointNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateNetworkAccessEndpointNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateNetworkAccessEndpointNameResponseBody body);

        @Override
        UpdateNetworkAccessEndpointNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateNetworkAccessEndpointNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateNetworkAccessEndpointNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateNetworkAccessEndpointNameResponse response) {
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
        public Builder body(UpdateNetworkAccessEndpointNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateNetworkAccessEndpointNameResponse build() {
            return new UpdateNetworkAccessEndpointNameResponse(this);
        } 

    } 

}

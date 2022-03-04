// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkInterfaceResponse} extends {@link TeaModel}
 *
 * <p>CreateNetworkInterfaceResponse</p>
 */
public class CreateNetworkInterfaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateNetworkInterfaceResponseBody body;

    private CreateNetworkInterfaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateNetworkInterfaceResponse create() {
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
    public CreateNetworkInterfaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateNetworkInterfaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateNetworkInterfaceResponseBody body);

        @Override
        CreateNetworkInterfaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateNetworkInterfaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateNetworkInterfaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateNetworkInterfaceResponse response) {
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
        public Builder body(CreateNetworkInterfaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateNetworkInterfaceResponse build() {
            return new CreateNetworkInterfaceResponse(this);
        } 

    } 

}

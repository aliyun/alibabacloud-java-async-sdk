// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachNetworkInterfaceResponse} extends {@link TeaModel}
 *
 * <p>DetachNetworkInterfaceResponse</p>
 */
public class DetachNetworkInterfaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachNetworkInterfaceResponseBody body;

    private DetachNetworkInterfaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachNetworkInterfaceResponse create() {
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
    public DetachNetworkInterfaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachNetworkInterfaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachNetworkInterfaceResponseBody body);

        @Override
        DetachNetworkInterfaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachNetworkInterfaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachNetworkInterfaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachNetworkInterfaceResponse response) {
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
        public Builder body(DetachNetworkInterfaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachNetworkInterfaceResponse build() {
            return new DetachNetworkInterfaceResponse(this);
        } 

    } 

}

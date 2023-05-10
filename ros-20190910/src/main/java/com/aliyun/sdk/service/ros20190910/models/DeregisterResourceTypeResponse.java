// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeregisterResourceTypeResponse} extends {@link TeaModel}
 *
 * <p>DeregisterResourceTypeResponse</p>
 */
public class DeregisterResourceTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeregisterResourceTypeResponseBody body;

    private DeregisterResourceTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeregisterResourceTypeResponse create() {
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
    public DeregisterResourceTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeregisterResourceTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeregisterResourceTypeResponseBody body);

        @Override
        DeregisterResourceTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeregisterResourceTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeregisterResourceTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeregisterResourceTypeResponse response) {
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
        public Builder body(DeregisterResourceTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeregisterResourceTypeResponse build() {
            return new DeregisterResourceTypeResponse(this);
        } 

    } 

}

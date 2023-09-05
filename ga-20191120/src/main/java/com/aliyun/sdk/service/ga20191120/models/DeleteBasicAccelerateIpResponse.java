// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBasicAccelerateIpResponse} extends {@link TeaModel}
 *
 * <p>DeleteBasicAccelerateIpResponse</p>
 */
public class DeleteBasicAccelerateIpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteBasicAccelerateIpResponseBody body;

    private DeleteBasicAccelerateIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteBasicAccelerateIpResponse create() {
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
    public DeleteBasicAccelerateIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteBasicAccelerateIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteBasicAccelerateIpResponseBody body);

        @Override
        DeleteBasicAccelerateIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteBasicAccelerateIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteBasicAccelerateIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteBasicAccelerateIpResponse response) {
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
        public Builder body(DeleteBasicAccelerateIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteBasicAccelerateIpResponse build() {
            return new DeleteBasicAccelerateIpResponse(this);
        } 

    } 

}

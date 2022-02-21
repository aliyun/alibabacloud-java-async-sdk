// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAcceleratorResponse} extends {@link TeaModel}
 *
 * <p>DeleteAcceleratorResponse</p>
 */
public class DeleteAcceleratorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAcceleratorResponseBody body;

    private DeleteAcceleratorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAcceleratorResponse create() {
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
    public DeleteAcceleratorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAcceleratorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAcceleratorResponseBody body);

        @Override
        DeleteAcceleratorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAcceleratorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAcceleratorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAcceleratorResponse response) {
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
        public Builder body(DeleteAcceleratorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAcceleratorResponse build() {
            return new DeleteAcceleratorResponse(this);
        } 

    } 

}

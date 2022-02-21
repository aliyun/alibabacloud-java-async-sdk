// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDHGInstanceVpcNetResponse} extends {@link TeaModel}
 *
 * <p>DeleteDHGInstanceVpcNetResponse</p>
 */
public class DeleteDHGInstanceVpcNetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDHGInstanceVpcNetResponseBody body;

    private DeleteDHGInstanceVpcNetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDHGInstanceVpcNetResponse create() {
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
    public DeleteDHGInstanceVpcNetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDHGInstanceVpcNetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDHGInstanceVpcNetResponseBody body);

        @Override
        DeleteDHGInstanceVpcNetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDHGInstanceVpcNetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDHGInstanceVpcNetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDHGInstanceVpcNetResponse response) {
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
        public Builder body(DeleteDHGInstanceVpcNetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDHGInstanceVpcNetResponse build() {
            return new DeleteDHGInstanceVpcNetResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSubnetResponse} extends {@link TeaModel}
 *
 * <p>DeleteSubnetResponse</p>
 */
public class DeleteSubnetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSubnetResponseBody body;

    private DeleteSubnetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSubnetResponse create() {
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
    public DeleteSubnetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSubnetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSubnetResponseBody body);

        @Override
        DeleteSubnetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSubnetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSubnetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSubnetResponse response) {
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
        public Builder body(DeleteSubnetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSubnetResponse build() {
            return new DeleteSubnetResponse(this);
        } 

    } 

}

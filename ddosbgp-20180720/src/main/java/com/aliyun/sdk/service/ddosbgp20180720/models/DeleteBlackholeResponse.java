// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBlackholeResponse} extends {@link TeaModel}
 *
 * <p>DeleteBlackholeResponse</p>
 */
public class DeleteBlackholeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteBlackholeResponseBody body;

    private DeleteBlackholeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteBlackholeResponse create() {
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
    public DeleteBlackholeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteBlackholeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteBlackholeResponseBody body);

        @Override
        DeleteBlackholeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteBlackholeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteBlackholeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteBlackholeResponse response) {
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
        public Builder body(DeleteBlackholeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteBlackholeResponse build() {
            return new DeleteBlackholeResponse(this);
        } 

    } 

}

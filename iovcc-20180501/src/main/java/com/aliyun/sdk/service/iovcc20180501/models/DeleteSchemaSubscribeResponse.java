// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSchemaSubscribeResponse} extends {@link TeaModel}
 *
 * <p>DeleteSchemaSubscribeResponse</p>
 */
public class DeleteSchemaSubscribeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSchemaSubscribeResponseBody body;

    private DeleteSchemaSubscribeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSchemaSubscribeResponse create() {
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
    public DeleteSchemaSubscribeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSchemaSubscribeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSchemaSubscribeResponseBody body);

        @Override
        DeleteSchemaSubscribeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSchemaSubscribeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSchemaSubscribeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSchemaSubscribeResponse response) {
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
        public Builder body(DeleteSchemaSubscribeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSchemaSubscribeResponse build() {
            return new DeleteSchemaSubscribeResponse(this);
        } 

    } 

}

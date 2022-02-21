// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWaitingOrdersResponse} extends {@link TeaModel}
 *
 * <p>DeleteWaitingOrdersResponse</p>
 */
public class DeleteWaitingOrdersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteWaitingOrdersResponseBody body;

    private DeleteWaitingOrdersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteWaitingOrdersResponse create() {
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
    public DeleteWaitingOrdersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteWaitingOrdersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteWaitingOrdersResponseBody body);

        @Override
        DeleteWaitingOrdersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteWaitingOrdersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteWaitingOrdersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteWaitingOrdersResponse response) {
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
        public Builder body(DeleteWaitingOrdersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteWaitingOrdersResponse build() {
            return new DeleteWaitingOrdersResponse(this);
        } 

    } 

}

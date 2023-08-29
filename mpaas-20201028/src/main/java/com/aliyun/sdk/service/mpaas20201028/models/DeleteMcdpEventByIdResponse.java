// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMcdpEventByIdResponse} extends {@link TeaModel}
 *
 * <p>DeleteMcdpEventByIdResponse</p>
 */
public class DeleteMcdpEventByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMcdpEventByIdResponseBody body;

    private DeleteMcdpEventByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMcdpEventByIdResponse create() {
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
    public DeleteMcdpEventByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMcdpEventByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMcdpEventByIdResponseBody body);

        @Override
        DeleteMcdpEventByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMcdpEventByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMcdpEventByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMcdpEventByIdResponse response) {
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
        public Builder body(DeleteMcdpEventByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMcdpEventByIdResponse build() {
            return new DeleteMcdpEventByIdResponse(this);
        } 

    } 

}

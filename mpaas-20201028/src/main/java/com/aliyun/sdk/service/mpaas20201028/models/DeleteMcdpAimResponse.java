// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMcdpAimResponse} extends {@link TeaModel}
 *
 * <p>DeleteMcdpAimResponse</p>
 */
public class DeleteMcdpAimResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMcdpAimResponseBody body;

    private DeleteMcdpAimResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMcdpAimResponse create() {
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
    public DeleteMcdpAimResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMcdpAimResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMcdpAimResponseBody body);

        @Override
        DeleteMcdpAimResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMcdpAimResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMcdpAimResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMcdpAimResponse response) {
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
        public Builder body(DeleteMcdpAimResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMcdpAimResponse build() {
            return new DeleteMcdpAimResponse(this);
        } 

    } 

}

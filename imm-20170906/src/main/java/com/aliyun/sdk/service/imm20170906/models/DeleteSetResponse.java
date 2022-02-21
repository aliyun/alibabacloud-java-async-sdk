// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSetResponse} extends {@link TeaModel}
 *
 * <p>DeleteSetResponse</p>
 */
public class DeleteSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSetResponseBody body;

    private DeleteSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSetResponse create() {
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
    public DeleteSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSetResponseBody body);

        @Override
        DeleteSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSetResponse response) {
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
        public Builder body(DeleteSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSetResponse build() {
            return new DeleteSetResponse(this);
        } 

    } 

}

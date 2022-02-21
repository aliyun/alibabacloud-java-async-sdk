// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteForwardEntryResponse} extends {@link TeaModel}
 *
 * <p>DeleteForwardEntryResponse</p>
 */
public class DeleteForwardEntryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteForwardEntryResponseBody body;

    private DeleteForwardEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteForwardEntryResponse create() {
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
    public DeleteForwardEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteForwardEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteForwardEntryResponseBody body);

        @Override
        DeleteForwardEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteForwardEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteForwardEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteForwardEntryResponse response) {
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
        public Builder body(DeleteForwardEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteForwardEntryResponse build() {
            return new DeleteForwardEntryResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDialogResponse} extends {@link TeaModel}
 *
 * <p>DeleteDialogResponse</p>
 */
public class DeleteDialogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDialogResponseBody body;

    private DeleteDialogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDialogResponse create() {
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
    public DeleteDialogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDialogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDialogResponseBody body);

        @Override
        DeleteDialogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDialogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDialogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDialogResponse response) {
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
        public Builder body(DeleteDialogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDialogResponse build() {
            return new DeleteDialogResponse(this);
        } 

    } 

}

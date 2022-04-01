// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteImageComponentResponse} extends {@link TeaModel}
 *
 * <p>DeleteImageComponentResponse</p>
 */
public class DeleteImageComponentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteImageComponentResponseBody body;

    private DeleteImageComponentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteImageComponentResponse create() {
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
    public DeleteImageComponentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteImageComponentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteImageComponentResponseBody body);

        @Override
        DeleteImageComponentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteImageComponentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteImageComponentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteImageComponentResponse response) {
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
        public Builder body(DeleteImageComponentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteImageComponentResponse build() {
            return new DeleteImageComponentResponse(this);
        } 

    } 

}

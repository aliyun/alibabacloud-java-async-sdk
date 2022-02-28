// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteStackResponse} extends {@link TeaModel}
 *
 * <p>DeleteStackResponse</p>
 */
public class DeleteStackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteStackResponseBody body;

    private DeleteStackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteStackResponse create() {
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
    public DeleteStackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteStackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteStackResponseBody body);

        @Override
        DeleteStackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteStackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteStackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteStackResponse response) {
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
        public Builder body(DeleteStackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteStackResponse build() {
            return new DeleteStackResponse(this);
        } 

    } 

}

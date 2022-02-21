// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInstanceResponse} extends {@link TeaModel}
 *
 * <p>DeleteInstanceResponse</p>
 */
public class DeleteInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteInstanceResponseBody body;

    private DeleteInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteInstanceResponse create() {
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
    public DeleteInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteInstanceResponseBody body);

        @Override
        DeleteInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteInstanceResponse response) {
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
        public Builder body(DeleteInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteInstanceResponse build() {
            return new DeleteInstanceResponse(this);
        } 

    } 

}

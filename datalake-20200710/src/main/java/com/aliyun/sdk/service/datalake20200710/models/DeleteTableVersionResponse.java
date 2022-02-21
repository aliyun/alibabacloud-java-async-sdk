// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTableVersionResponse} extends {@link TeaModel}
 *
 * <p>DeleteTableVersionResponse</p>
 */
public class DeleteTableVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTableVersionResponseBody body;

    private DeleteTableVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTableVersionResponse create() {
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
    public DeleteTableVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTableVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTableVersionResponseBody body);

        @Override
        DeleteTableVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTableVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTableVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTableVersionResponse response) {
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
        public Builder body(DeleteTableVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTableVersionResponse build() {
            return new DeleteTableVersionResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSavedQueryResponse} extends {@link TeaModel}
 *
 * <p>DeleteSavedQueryResponse</p>
 */
public class DeleteSavedQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSavedQueryResponseBody body;

    private DeleteSavedQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSavedQueryResponse create() {
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
    public DeleteSavedQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSavedQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSavedQueryResponseBody body);

        @Override
        DeleteSavedQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSavedQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSavedQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSavedQueryResponse response) {
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
        public Builder body(DeleteSavedQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSavedQueryResponse build() {
            return new DeleteSavedQueryResponse(this);
        } 

    } 

}

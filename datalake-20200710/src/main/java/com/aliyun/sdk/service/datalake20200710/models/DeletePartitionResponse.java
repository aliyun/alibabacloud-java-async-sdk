// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePartitionResponse} extends {@link TeaModel}
 *
 * <p>DeletePartitionResponse</p>
 */
public class DeletePartitionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePartitionResponseBody body;

    private DeletePartitionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePartitionResponse create() {
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
    public DeletePartitionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePartitionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePartitionResponseBody body);

        @Override
        DeletePartitionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePartitionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePartitionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePartitionResponse response) {
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
        public Builder body(DeletePartitionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePartitionResponse build() {
            return new DeletePartitionResponse(this);
        } 

    } 

}

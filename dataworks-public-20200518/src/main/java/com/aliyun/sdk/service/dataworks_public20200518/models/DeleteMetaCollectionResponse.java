// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMetaCollectionResponse} extends {@link TeaModel}
 *
 * <p>DeleteMetaCollectionResponse</p>
 */
public class DeleteMetaCollectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMetaCollectionResponseBody body;

    private DeleteMetaCollectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMetaCollectionResponse create() {
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
    public DeleteMetaCollectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMetaCollectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMetaCollectionResponseBody body);

        @Override
        DeleteMetaCollectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMetaCollectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMetaCollectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMetaCollectionResponse response) {
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
        public Builder body(DeleteMetaCollectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMetaCollectionResponse build() {
            return new DeleteMetaCollectionResponse(this);
        } 

    } 

}

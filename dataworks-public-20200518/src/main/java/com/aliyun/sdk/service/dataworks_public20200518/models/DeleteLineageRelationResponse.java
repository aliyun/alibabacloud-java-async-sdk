// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLineageRelationResponse} extends {@link TeaModel}
 *
 * <p>DeleteLineageRelationResponse</p>
 */
public class DeleteLineageRelationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLineageRelationResponseBody body;

    private DeleteLineageRelationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLineageRelationResponse create() {
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
    public DeleteLineageRelationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLineageRelationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLineageRelationResponseBody body);

        @Override
        DeleteLineageRelationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLineageRelationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLineageRelationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLineageRelationResponse response) {
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
        public Builder body(DeleteLineageRelationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLineageRelationResponse build() {
            return new DeleteLineageRelationResponse(this);
        } 

    } 

}

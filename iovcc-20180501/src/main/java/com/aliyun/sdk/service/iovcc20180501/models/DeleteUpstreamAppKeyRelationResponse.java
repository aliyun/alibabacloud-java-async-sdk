// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUpstreamAppKeyRelationResponse} extends {@link TeaModel}
 *
 * <p>DeleteUpstreamAppKeyRelationResponse</p>
 */
public class DeleteUpstreamAppKeyRelationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteUpstreamAppKeyRelationResponseBody body;

    private DeleteUpstreamAppKeyRelationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteUpstreamAppKeyRelationResponse create() {
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
    public DeleteUpstreamAppKeyRelationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteUpstreamAppKeyRelationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteUpstreamAppKeyRelationResponseBody body);

        @Override
        DeleteUpstreamAppKeyRelationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteUpstreamAppKeyRelationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteUpstreamAppKeyRelationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteUpstreamAppKeyRelationResponse response) {
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
        public Builder body(DeleteUpstreamAppKeyRelationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteUpstreamAppKeyRelationResponse build() {
            return new DeleteUpstreamAppKeyRelationResponse(this);
        } 

    } 

}

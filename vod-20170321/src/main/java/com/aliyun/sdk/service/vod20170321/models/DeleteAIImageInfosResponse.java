// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAIImageInfosResponse} extends {@link TeaModel}
 *
 * <p>DeleteAIImageInfosResponse</p>
 */
public class DeleteAIImageInfosResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAIImageInfosResponseBody body;

    private DeleteAIImageInfosResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAIImageInfosResponse create() {
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
    public DeleteAIImageInfosResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAIImageInfosResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAIImageInfosResponseBody body);

        @Override
        DeleteAIImageInfosResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAIImageInfosResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAIImageInfosResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAIImageInfosResponse response) {
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
        public Builder body(DeleteAIImageInfosResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAIImageInfosResponse build() {
            return new DeleteAIImageInfosResponse(this);
        } 

    } 

}

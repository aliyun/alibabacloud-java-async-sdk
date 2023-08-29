// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCubecardWhitelistContentResponse} extends {@link TeaModel}
 *
 * <p>DeleteCubecardWhitelistContentResponse</p>
 */
public class DeleteCubecardWhitelistContentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCubecardWhitelistContentResponseBody body;

    private DeleteCubecardWhitelistContentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCubecardWhitelistContentResponse create() {
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
    public DeleteCubecardWhitelistContentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCubecardWhitelistContentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCubecardWhitelistContentResponseBody body);

        @Override
        DeleteCubecardWhitelistContentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCubecardWhitelistContentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCubecardWhitelistContentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCubecardWhitelistContentResponse response) {
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
        public Builder body(DeleteCubecardWhitelistContentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCubecardWhitelistContentResponse build() {
            return new DeleteCubecardWhitelistContentResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMdsWhitelistContentResponse} extends {@link TeaModel}
 *
 * <p>DeleteMdsWhitelistContentResponse</p>
 */
public class DeleteMdsWhitelistContentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMdsWhitelistContentResponseBody body;

    private DeleteMdsWhitelistContentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMdsWhitelistContentResponse create() {
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
    public DeleteMdsWhitelistContentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMdsWhitelistContentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMdsWhitelistContentResponseBody body);

        @Override
        DeleteMdsWhitelistContentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMdsWhitelistContentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMdsWhitelistContentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMdsWhitelistContentResponse response) {
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
        public Builder body(DeleteMdsWhitelistContentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMdsWhitelistContentResponse build() {
            return new DeleteMdsWhitelistContentResponse(this);
        } 

    } 

}

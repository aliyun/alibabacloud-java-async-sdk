// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteContactWhiteListResponse} extends {@link TeaModel}
 *
 * <p>DeleteContactWhiteListResponse</p>
 */
public class DeleteContactWhiteListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteContactWhiteListResponseBody body;

    private DeleteContactWhiteListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteContactWhiteListResponse create() {
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
    public DeleteContactWhiteListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteContactWhiteListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteContactWhiteListResponseBody body);

        @Override
        DeleteContactWhiteListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteContactWhiteListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteContactWhiteListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteContactWhiteListResponse response) {
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
        public Builder body(DeleteContactWhiteListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteContactWhiteListResponse build() {
            return new DeleteContactWhiteListResponse(this);
        } 

    } 

}

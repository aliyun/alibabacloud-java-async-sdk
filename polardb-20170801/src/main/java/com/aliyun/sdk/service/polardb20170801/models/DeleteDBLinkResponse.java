// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDBLinkResponse} extends {@link TeaModel}
 *
 * <p>DeleteDBLinkResponse</p>
 */
public class DeleteDBLinkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDBLinkResponseBody body;

    private DeleteDBLinkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDBLinkResponse create() {
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
    public DeleteDBLinkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDBLinkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDBLinkResponseBody body);

        @Override
        DeleteDBLinkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDBLinkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDBLinkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDBLinkResponse response) {
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
        public Builder body(DeleteDBLinkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDBLinkResponse build() {
            return new DeleteDBLinkResponse(this);
        } 

    } 

}

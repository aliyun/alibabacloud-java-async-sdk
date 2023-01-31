// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteContactBlockListResponse} extends {@link TeaModel}
 *
 * <p>DeleteContactBlockListResponse</p>
 */
public class DeleteContactBlockListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteContactBlockListResponseBody body;

    private DeleteContactBlockListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteContactBlockListResponse create() {
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
    public DeleteContactBlockListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteContactBlockListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteContactBlockListResponseBody body);

        @Override
        DeleteContactBlockListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteContactBlockListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteContactBlockListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteContactBlockListResponse response) {
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
        public Builder body(DeleteContactBlockListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteContactBlockListResponse build() {
            return new DeleteContactBlockListResponse(this);
        } 

    } 

}

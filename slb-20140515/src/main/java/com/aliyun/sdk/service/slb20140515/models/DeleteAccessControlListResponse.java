// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAccessControlListResponse} extends {@link TeaModel}
 *
 * <p>DeleteAccessControlListResponse</p>
 */
public class DeleteAccessControlListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAccessControlListResponseBody body;

    private DeleteAccessControlListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAccessControlListResponse create() {
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
    public DeleteAccessControlListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAccessControlListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAccessControlListResponseBody body);

        @Override
        DeleteAccessControlListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAccessControlListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAccessControlListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAccessControlListResponse response) {
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
        public Builder body(DeleteAccessControlListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAccessControlListResponse build() {
            return new DeleteAccessControlListResponse(this);
        } 

    } 

}

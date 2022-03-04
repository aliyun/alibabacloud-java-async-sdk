// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePrefixListResponse} extends {@link TeaModel}
 *
 * <p>DeletePrefixListResponse</p>
 */
public class DeletePrefixListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePrefixListResponseBody body;

    private DeletePrefixListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePrefixListResponse create() {
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
    public DeletePrefixListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePrefixListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePrefixListResponseBody body);

        @Override
        DeletePrefixListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePrefixListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePrefixListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePrefixListResponse response) {
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
        public Builder body(DeletePrefixListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePrefixListResponse build() {
            return new DeletePrefixListResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVpcPrefixListResponse} extends {@link TeaModel}
 *
 * <p>DeleteVpcPrefixListResponse</p>
 */
public class DeleteVpcPrefixListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVpcPrefixListResponseBody body;

    private DeleteVpcPrefixListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVpcPrefixListResponse create() {
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
    public DeleteVpcPrefixListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVpcPrefixListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVpcPrefixListResponseBody body);

        @Override
        DeleteVpcPrefixListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVpcPrefixListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVpcPrefixListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVpcPrefixListResponse response) {
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
        public Builder body(DeleteVpcPrefixListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVpcPrefixListResponse build() {
            return new DeleteVpcPrefixListResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDiskResponse} extends {@link TeaModel}
 *
 * <p>DeleteDiskResponse</p>
 */
public class DeleteDiskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDiskResponseBody body;

    private DeleteDiskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDiskResponse create() {
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
    public DeleteDiskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDiskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDiskResponseBody body);

        @Override
        DeleteDiskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDiskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDiskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDiskResponse response) {
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
        public Builder body(DeleteDiskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDiskResponse build() {
            return new DeleteDiskResponse(this);
        } 

    } 

}

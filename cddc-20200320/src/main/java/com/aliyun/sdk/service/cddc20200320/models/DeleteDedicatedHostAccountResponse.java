// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDedicatedHostAccountResponse} extends {@link TeaModel}
 *
 * <p>DeleteDedicatedHostAccountResponse</p>
 */
public class DeleteDedicatedHostAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDedicatedHostAccountResponseBody body;

    private DeleteDedicatedHostAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDedicatedHostAccountResponse create() {
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
    public DeleteDedicatedHostAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDedicatedHostAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDedicatedHostAccountResponseBody body);

        @Override
        DeleteDedicatedHostAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDedicatedHostAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDedicatedHostAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDedicatedHostAccountResponse response) {
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
        public Builder body(DeleteDedicatedHostAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDedicatedHostAccountResponse build() {
            return new DeleteDedicatedHostAccountResponse(this);
        } 

    } 

}

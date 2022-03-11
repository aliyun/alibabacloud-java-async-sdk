// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHostAccountResponse} extends {@link TeaModel}
 *
 * <p>DeleteHostAccountResponse</p>
 */
public class DeleteHostAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteHostAccountResponseBody body;

    private DeleteHostAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteHostAccountResponse create() {
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
    public DeleteHostAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteHostAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteHostAccountResponseBody body);

        @Override
        DeleteHostAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteHostAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteHostAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteHostAccountResponse response) {
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
        public Builder body(DeleteHostAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteHostAccountResponse build() {
            return new DeleteHostAccountResponse(this);
        } 

    } 

}

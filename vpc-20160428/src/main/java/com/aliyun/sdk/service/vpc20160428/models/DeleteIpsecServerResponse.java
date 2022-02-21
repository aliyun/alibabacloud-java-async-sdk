// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIpsecServerResponse} extends {@link TeaModel}
 *
 * <p>DeleteIpsecServerResponse</p>
 */
public class DeleteIpsecServerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteIpsecServerResponseBody body;

    private DeleteIpsecServerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteIpsecServerResponse create() {
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
    public DeleteIpsecServerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteIpsecServerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteIpsecServerResponseBody body);

        @Override
        DeleteIpsecServerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteIpsecServerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteIpsecServerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteIpsecServerResponse response) {
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
        public Builder body(DeleteIpsecServerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteIpsecServerResponse build() {
            return new DeleteIpsecServerResponse(this);
        } 

    } 

}

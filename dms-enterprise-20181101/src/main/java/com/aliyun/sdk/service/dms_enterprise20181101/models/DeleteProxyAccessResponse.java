// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProxyAccessResponse} extends {@link TeaModel}
 *
 * <p>DeleteProxyAccessResponse</p>
 */
public class DeleteProxyAccessResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteProxyAccessResponseBody body;

    private DeleteProxyAccessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteProxyAccessResponse create() {
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
    public DeleteProxyAccessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteProxyAccessResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteProxyAccessResponseBody body);

        @Override
        DeleteProxyAccessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteProxyAccessResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteProxyAccessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteProxyAccessResponse response) {
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
        public Builder body(DeleteProxyAccessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteProxyAccessResponse build() {
            return new DeleteProxyAccessResponse(this);
        } 

    } 

}

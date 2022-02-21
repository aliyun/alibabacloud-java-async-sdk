// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSpareIpsResponse} extends {@link TeaModel}
 *
 * <p>DeleteSpareIpsResponse</p>
 */
public class DeleteSpareIpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSpareIpsResponseBody body;

    private DeleteSpareIpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSpareIpsResponse create() {
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
    public DeleteSpareIpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSpareIpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSpareIpsResponseBody body);

        @Override
        DeleteSpareIpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSpareIpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSpareIpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSpareIpsResponse response) {
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
        public Builder body(DeleteSpareIpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSpareIpsResponse build() {
            return new DeleteSpareIpsResponse(this);
        } 

    } 

}

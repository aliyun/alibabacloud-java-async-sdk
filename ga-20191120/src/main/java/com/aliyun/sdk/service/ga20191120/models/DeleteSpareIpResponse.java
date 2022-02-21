// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSpareIpResponse} extends {@link TeaModel}
 *
 * <p>DeleteSpareIpResponse</p>
 */
public class DeleteSpareIpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSpareIpResponseBody body;

    private DeleteSpareIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSpareIpResponse create() {
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
    public DeleteSpareIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSpareIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSpareIpResponseBody body);

        @Override
        DeleteSpareIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSpareIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSpareIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSpareIpResponse response) {
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
        public Builder body(DeleteSpareIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSpareIpResponse build() {
            return new DeleteSpareIpResponse(this);
        } 

    } 

}

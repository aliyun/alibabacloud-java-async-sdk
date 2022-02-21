// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWebRuleTfResponse} extends {@link TeaModel}
 *
 * <p>DeleteWebRuleTfResponse</p>
 */
public class DeleteWebRuleTfResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteWebRuleTfResponseBody body;

    private DeleteWebRuleTfResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteWebRuleTfResponse create() {
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
    public DeleteWebRuleTfResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteWebRuleTfResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteWebRuleTfResponseBody body);

        @Override
        DeleteWebRuleTfResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteWebRuleTfResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteWebRuleTfResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteWebRuleTfResponse response) {
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
        public Builder body(DeleteWebRuleTfResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteWebRuleTfResponse build() {
            return new DeleteWebRuleTfResponse(this);
        } 

    } 

}

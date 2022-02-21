// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteForwardingRulesResponse} extends {@link TeaModel}
 *
 * <p>DeleteForwardingRulesResponse</p>
 */
public class DeleteForwardingRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteForwardingRulesResponseBody body;

    private DeleteForwardingRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteForwardingRulesResponse create() {
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
    public DeleteForwardingRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteForwardingRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteForwardingRulesResponseBody body);

        @Override
        DeleteForwardingRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteForwardingRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteForwardingRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteForwardingRulesResponse response) {
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
        public Builder body(DeleteForwardingRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteForwardingRulesResponse build() {
            return new DeleteForwardingRulesResponse(this);
        } 

    } 

}

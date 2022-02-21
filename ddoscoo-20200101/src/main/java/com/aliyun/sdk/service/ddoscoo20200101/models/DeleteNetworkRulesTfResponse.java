// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNetworkRulesTfResponse} extends {@link TeaModel}
 *
 * <p>DeleteNetworkRulesTfResponse</p>
 */
public class DeleteNetworkRulesTfResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteNetworkRulesTfResponseBody body;

    private DeleteNetworkRulesTfResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteNetworkRulesTfResponse create() {
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
    public DeleteNetworkRulesTfResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteNetworkRulesTfResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteNetworkRulesTfResponseBody body);

        @Override
        DeleteNetworkRulesTfResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteNetworkRulesTfResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteNetworkRulesTfResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteNetworkRulesTfResponse response) {
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
        public Builder body(DeleteNetworkRulesTfResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteNetworkRulesTfResponse build() {
            return new DeleteNetworkRulesTfResponse(this);
        } 

    } 

}

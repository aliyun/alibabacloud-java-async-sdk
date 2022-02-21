// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRulesResponse} extends {@link TeaModel}
 *
 * <p>DeleteRulesResponse</p>
 */
public class DeleteRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRulesResponseBody body;

    private DeleteRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRulesResponse create() {
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
    public DeleteRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRulesResponseBody body);

        @Override
        DeleteRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRulesResponse response) {
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
        public Builder body(DeleteRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRulesResponse build() {
            return new DeleteRulesResponse(this);
        } 

    } 

}

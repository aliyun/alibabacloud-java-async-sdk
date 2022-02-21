// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConfigRulesResponse} extends {@link TeaModel}
 *
 * <p>DeleteConfigRulesResponse</p>
 */
public class DeleteConfigRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteConfigRulesResponseBody body;

    private DeleteConfigRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteConfigRulesResponse create() {
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
    public DeleteConfigRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteConfigRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteConfigRulesResponseBody body);

        @Override
        DeleteConfigRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteConfigRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteConfigRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteConfigRulesResponse response) {
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
        public Builder body(DeleteConfigRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteConfigRulesResponse build() {
            return new DeleteConfigRulesResponse(this);
        } 

    } 

}

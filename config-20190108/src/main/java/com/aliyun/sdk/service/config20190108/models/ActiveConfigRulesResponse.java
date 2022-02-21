// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ActiveConfigRulesResponse} extends {@link TeaModel}
 *
 * <p>ActiveConfigRulesResponse</p>
 */
public class ActiveConfigRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ActiveConfigRulesResponseBody body;

    private ActiveConfigRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ActiveConfigRulesResponse create() {
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
    public ActiveConfigRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ActiveConfigRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ActiveConfigRulesResponseBody body);

        @Override
        ActiveConfigRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ActiveConfigRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ActiveConfigRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ActiveConfigRulesResponse response) {
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
        public Builder body(ActiveConfigRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ActiveConfigRulesResponse build() {
            return new ActiveConfigRulesResponse(this);
        } 

    } 

}

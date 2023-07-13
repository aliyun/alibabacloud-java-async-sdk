// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableEventRulesResponse} extends {@link TeaModel}
 *
 * <p>DisableEventRulesResponse</p>
 */
public class DisableEventRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableEventRulesResponseBody body;

    private DisableEventRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableEventRulesResponse create() {
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
    public DisableEventRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableEventRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableEventRulesResponseBody body);

        @Override
        DisableEventRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableEventRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableEventRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableEventRulesResponse response) {
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
        public Builder body(DisableEventRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableEventRulesResponse build() {
            return new DisableEventRulesResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopConfigRulesResponse} extends {@link TeaModel}
 *
 * <p>StopConfigRulesResponse</p>
 */
public class StopConfigRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopConfigRulesResponseBody body;

    private StopConfigRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopConfigRulesResponse create() {
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
    public StopConfigRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopConfigRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopConfigRulesResponseBody body);

        @Override
        StopConfigRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopConfigRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopConfigRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopConfigRulesResponse response) {
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
        public Builder body(StopConfigRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopConfigRulesResponse build() {
            return new StopConfigRulesResponse(this);
        } 

    } 

}

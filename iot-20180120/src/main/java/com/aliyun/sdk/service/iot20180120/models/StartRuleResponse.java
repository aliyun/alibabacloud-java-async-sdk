// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartRuleResponse} extends {@link TeaModel}
 *
 * <p>StartRuleResponse</p>
 */
public class StartRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartRuleResponseBody body;

    private StartRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartRuleResponse create() {
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
    public StartRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartRuleResponseBody body);

        @Override
        StartRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartRuleResponse response) {
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
        public Builder body(StartRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartRuleResponse build() {
            return new StartRuleResponse(this);
        } 

    } 

}

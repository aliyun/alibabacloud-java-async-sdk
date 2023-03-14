// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigLayer7RuleResponse} extends {@link TeaModel}
 *
 * <p>ConfigLayer7RuleResponse</p>
 */
public class ConfigLayer7RuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigLayer7RuleResponseBody body;

    private ConfigLayer7RuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigLayer7RuleResponse create() {
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
    public ConfigLayer7RuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigLayer7RuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigLayer7RuleResponseBody body);

        @Override
        ConfigLayer7RuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigLayer7RuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigLayer7RuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigLayer7RuleResponse response) {
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
        public Builder body(ConfigLayer7RuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigLayer7RuleResponse build() {
            return new ConfigLayer7RuleResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableSceneRuleResponse} extends {@link TeaModel}
 *
 * <p>EnableSceneRuleResponse</p>
 */
public class EnableSceneRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableSceneRuleResponseBody body;

    private EnableSceneRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableSceneRuleResponse create() {
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
    public EnableSceneRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableSceneRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableSceneRuleResponseBody body);

        @Override
        EnableSceneRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableSceneRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableSceneRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableSceneRuleResponse response) {
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
        public Builder body(EnableSceneRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableSceneRuleResponse build() {
            return new EnableSceneRuleResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableSceneRuleResponse} extends {@link TeaModel}
 *
 * <p>DisableSceneRuleResponse</p>
 */
public class DisableSceneRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableSceneRuleResponseBody body;

    private DisableSceneRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableSceneRuleResponse create() {
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
    public DisableSceneRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableSceneRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableSceneRuleResponseBody body);

        @Override
        DisableSceneRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableSceneRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableSceneRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableSceneRuleResponse response) {
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
        public Builder body(DisableSceneRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableSceneRuleResponse build() {
            return new DisableSceneRuleResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSceneRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateSceneRuleResponse</p>
 */
public class CreateSceneRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSceneRuleResponseBody body;

    private CreateSceneRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSceneRuleResponse create() {
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
    public CreateSceneRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSceneRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSceneRuleResponseBody body);

        @Override
        CreateSceneRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSceneRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSceneRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSceneRuleResponse response) {
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
        public Builder body(CreateSceneRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSceneRuleResponse build() {
            return new CreateSceneRuleResponse(this);
        } 

    } 

}

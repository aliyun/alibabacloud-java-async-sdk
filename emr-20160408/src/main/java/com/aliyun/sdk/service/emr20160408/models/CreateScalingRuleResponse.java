// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScalingRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateScalingRuleResponse</p>
 */
public class CreateScalingRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateScalingRuleResponseBody body;

    private CreateScalingRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateScalingRuleResponse create() {
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
    public CreateScalingRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateScalingRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateScalingRuleResponseBody body);

        @Override
        CreateScalingRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateScalingRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateScalingRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateScalingRuleResponse response) {
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
        public Builder body(CreateScalingRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateScalingRuleResponse build() {
            return new CreateScalingRuleResponse(this);
        } 

    } 

}

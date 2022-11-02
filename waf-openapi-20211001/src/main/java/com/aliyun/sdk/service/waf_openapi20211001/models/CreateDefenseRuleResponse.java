// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDefenseRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateDefenseRuleResponse</p>
 */
public class CreateDefenseRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDefenseRuleResponseBody body;

    private CreateDefenseRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDefenseRuleResponse create() {
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
    public CreateDefenseRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDefenseRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDefenseRuleResponseBody body);

        @Override
        CreateDefenseRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDefenseRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDefenseRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDefenseRuleResponse response) {
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
        public Builder body(CreateDefenseRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDefenseRuleResponse build() {
            return new CreateDefenseRuleResponse(this);
        } 

    } 

}

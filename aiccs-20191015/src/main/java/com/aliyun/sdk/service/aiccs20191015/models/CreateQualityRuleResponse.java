// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQualityRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateQualityRuleResponse</p>
 */
public class CreateQualityRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateQualityRuleResponseBody body;

    private CreateQualityRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateQualityRuleResponse create() {
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
    public CreateQualityRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateQualityRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateQualityRuleResponseBody body);

        @Override
        CreateQualityRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateQualityRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateQualityRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateQualityRuleResponse response) {
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
        public Builder body(CreateQualityRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateQualityRuleResponse build() {
            return new CreateQualityRuleResponse(this);
        } 

    } 

}

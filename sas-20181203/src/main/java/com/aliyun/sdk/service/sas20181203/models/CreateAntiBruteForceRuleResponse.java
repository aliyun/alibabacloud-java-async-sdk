// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAntiBruteForceRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateAntiBruteForceRuleResponse</p>
 */
public class CreateAntiBruteForceRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAntiBruteForceRuleResponseBody body;

    private CreateAntiBruteForceRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAntiBruteForceRuleResponse create() {
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
    public CreateAntiBruteForceRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAntiBruteForceRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAntiBruteForceRuleResponseBody body);

        @Override
        CreateAntiBruteForceRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAntiBruteForceRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAntiBruteForceRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAntiBruteForceRuleResponse response) {
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
        public Builder body(CreateAntiBruteForceRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAntiBruteForceRuleResponse build() {
            return new CreateAntiBruteForceRuleResponse(this);
        } 

    } 

}

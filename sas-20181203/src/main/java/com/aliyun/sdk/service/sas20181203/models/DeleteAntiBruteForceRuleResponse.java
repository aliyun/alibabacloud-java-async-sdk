// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAntiBruteForceRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteAntiBruteForceRuleResponse</p>
 */
public class DeleteAntiBruteForceRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAntiBruteForceRuleResponseBody body;

    private DeleteAntiBruteForceRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAntiBruteForceRuleResponse create() {
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
    public DeleteAntiBruteForceRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAntiBruteForceRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAntiBruteForceRuleResponseBody body);

        @Override
        DeleteAntiBruteForceRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAntiBruteForceRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAntiBruteForceRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAntiBruteForceRuleResponse response) {
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
        public Builder body(DeleteAntiBruteForceRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAntiBruteForceRuleResponse build() {
            return new DeleteAntiBruteForceRuleResponse(this);
        } 

    } 

}

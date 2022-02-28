// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceAntiBruteForceRuleResponse} extends {@link TeaModel}
 *
 * <p>ModifyInstanceAntiBruteForceRuleResponse</p>
 */
public class ModifyInstanceAntiBruteForceRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyInstanceAntiBruteForceRuleResponseBody body;

    private ModifyInstanceAntiBruteForceRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyInstanceAntiBruteForceRuleResponse create() {
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
    public ModifyInstanceAntiBruteForceRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyInstanceAntiBruteForceRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyInstanceAntiBruteForceRuleResponseBody body);

        @Override
        ModifyInstanceAntiBruteForceRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyInstanceAntiBruteForceRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyInstanceAntiBruteForceRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyInstanceAntiBruteForceRuleResponse response) {
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
        public Builder body(ModifyInstanceAntiBruteForceRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyInstanceAntiBruteForceRuleResponse build() {
            return new ModifyInstanceAntiBruteForceRuleResponse(this);
        } 

    } 

}

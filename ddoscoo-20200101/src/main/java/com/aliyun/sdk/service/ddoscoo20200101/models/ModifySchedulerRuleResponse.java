// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySchedulerRuleResponse} extends {@link TeaModel}
 *
 * <p>ModifySchedulerRuleResponse</p>
 */
public class ModifySchedulerRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySchedulerRuleResponseBody body;

    private ModifySchedulerRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySchedulerRuleResponse create() {
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
    public ModifySchedulerRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySchedulerRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySchedulerRuleResponseBody body);

        @Override
        ModifySchedulerRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySchedulerRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySchedulerRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySchedulerRuleResponse response) {
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
        public Builder body(ModifySchedulerRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySchedulerRuleResponse build() {
            return new ModifySchedulerRuleResponse(this);
        } 

    } 

}

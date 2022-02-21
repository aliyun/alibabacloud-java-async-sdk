// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSchedulerRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateSchedulerRuleResponse</p>
 */
public class CreateSchedulerRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSchedulerRuleResponseBody body;

    private CreateSchedulerRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSchedulerRuleResponse create() {
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
    public CreateSchedulerRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSchedulerRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSchedulerRuleResponseBody body);

        @Override
        CreateSchedulerRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSchedulerRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSchedulerRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSchedulerRuleResponse response) {
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
        public Builder body(CreateSchedulerRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSchedulerRuleResponse build() {
            return new CreateSchedulerRuleResponse(this);
        } 

    } 

}

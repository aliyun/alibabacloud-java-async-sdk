// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateJobMonitorRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateJobMonitorRuleResponse</p>
 */
public class CreateJobMonitorRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateJobMonitorRuleResponseBody body;

    private CreateJobMonitorRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateJobMonitorRuleResponse create() {
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
    public CreateJobMonitorRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateJobMonitorRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateJobMonitorRuleResponseBody body);

        @Override
        CreateJobMonitorRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateJobMonitorRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateJobMonitorRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateJobMonitorRuleResponse response) {
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
        public Builder body(CreateJobMonitorRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateJobMonitorRuleResponse build() {
            return new CreateJobMonitorRuleResponse(this);
        } 

    } 

}

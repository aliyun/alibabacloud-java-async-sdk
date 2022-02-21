// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTaskAssignRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateTaskAssignRuleResponse</p>
 */
public class CreateTaskAssignRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTaskAssignRuleResponseBody body;

    private CreateTaskAssignRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTaskAssignRuleResponse create() {
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
    public CreateTaskAssignRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTaskAssignRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTaskAssignRuleResponseBody body);

        @Override
        CreateTaskAssignRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTaskAssignRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTaskAssignRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTaskAssignRuleResponse response) {
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
        public Builder body(CreateTaskAssignRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTaskAssignRuleResponse build() {
            return new CreateTaskAssignRuleResponse(this);
        } 

    } 

}

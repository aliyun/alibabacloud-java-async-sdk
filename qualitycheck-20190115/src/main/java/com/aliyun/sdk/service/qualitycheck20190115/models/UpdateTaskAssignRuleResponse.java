// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskAssignRuleResponse} extends {@link TeaModel}
 *
 * <p>UpdateTaskAssignRuleResponse</p>
 */
public class UpdateTaskAssignRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTaskAssignRuleResponseBody body;

    private UpdateTaskAssignRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTaskAssignRuleResponse create() {
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
    public UpdateTaskAssignRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTaskAssignRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTaskAssignRuleResponseBody body);

        @Override
        UpdateTaskAssignRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTaskAssignRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTaskAssignRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTaskAssignRuleResponse response) {
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
        public Builder body(UpdateTaskAssignRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTaskAssignRuleResponse build() {
            return new UpdateTaskAssignRuleResponse(this);
        } 

    } 

}

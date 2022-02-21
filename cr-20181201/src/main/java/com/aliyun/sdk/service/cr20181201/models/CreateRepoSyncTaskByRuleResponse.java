// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRepoSyncTaskByRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateRepoSyncTaskByRuleResponse</p>
 */
public class CreateRepoSyncTaskByRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRepoSyncTaskByRuleResponseBody body;

    private CreateRepoSyncTaskByRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRepoSyncTaskByRuleResponse create() {
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
    public CreateRepoSyncTaskByRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRepoSyncTaskByRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRepoSyncTaskByRuleResponseBody body);

        @Override
        CreateRepoSyncTaskByRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRepoSyncTaskByRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRepoSyncTaskByRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRepoSyncTaskByRuleResponse response) {
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
        public Builder body(CreateRepoSyncTaskByRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRepoSyncTaskByRuleResponse build() {
            return new CreateRepoSyncTaskByRuleResponse(this);
        } 

    } 

}

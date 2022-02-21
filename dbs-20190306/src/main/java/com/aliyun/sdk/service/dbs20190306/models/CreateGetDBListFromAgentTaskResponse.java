// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGetDBListFromAgentTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateGetDBListFromAgentTaskResponse</p>
 */
public class CreateGetDBListFromAgentTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateGetDBListFromAgentTaskResponseBody body;

    private CreateGetDBListFromAgentTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateGetDBListFromAgentTaskResponse create() {
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
    public CreateGetDBListFromAgentTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateGetDBListFromAgentTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateGetDBListFromAgentTaskResponseBody body);

        @Override
        CreateGetDBListFromAgentTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateGetDBListFromAgentTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateGetDBListFromAgentTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateGetDBListFromAgentTaskResponse response) {
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
        public Builder body(CreateGetDBListFromAgentTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateGetDBListFromAgentTaskResponse build() {
            return new CreateGetDBListFromAgentTaskResponse(this);
        } 

    } 

}

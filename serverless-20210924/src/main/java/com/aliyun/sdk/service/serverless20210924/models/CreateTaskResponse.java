// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateTaskResponse</p>
 */
public class CreateTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private Task body;

    private CreateTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTaskResponse create() {
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
    public Task getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(Task body);

        @Override
        CreateTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Task body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTaskResponse response) {
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
        public Builder body(Task body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTaskResponse build() {
            return new CreateTaskResponse(this);
        } 

    } 

}

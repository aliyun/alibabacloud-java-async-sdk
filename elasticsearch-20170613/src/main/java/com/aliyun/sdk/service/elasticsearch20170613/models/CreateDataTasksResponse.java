// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataTasksResponse} extends {@link TeaModel}
 *
 * <p>CreateDataTasksResponse</p>
 */
public class CreateDataTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDataTasksResponseBody body;

    private CreateDataTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDataTasksResponse create() {
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
    public CreateDataTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDataTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDataTasksResponseBody body);

        @Override
        CreateDataTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDataTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDataTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDataTasksResponse response) {
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
        public Builder body(CreateDataTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDataTasksResponse build() {
            return new CreateDataTasksResponse(this);
        } 

    } 

}

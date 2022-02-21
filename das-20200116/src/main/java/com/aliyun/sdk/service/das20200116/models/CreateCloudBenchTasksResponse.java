// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCloudBenchTasksResponse} extends {@link TeaModel}
 *
 * <p>CreateCloudBenchTasksResponse</p>
 */
public class CreateCloudBenchTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCloudBenchTasksResponseBody body;

    private CreateCloudBenchTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCloudBenchTasksResponse create() {
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
    public CreateCloudBenchTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCloudBenchTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCloudBenchTasksResponseBody body);

        @Override
        CreateCloudBenchTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCloudBenchTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCloudBenchTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCloudBenchTasksResponse response) {
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
        public Builder body(CreateCloudBenchTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCloudBenchTasksResponse build() {
            return new CreateCloudBenchTasksResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAdamBenchTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateAdamBenchTaskResponse</p>
 */
public class CreateAdamBenchTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAdamBenchTaskResponseBody body;

    private CreateAdamBenchTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAdamBenchTaskResponse create() {
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
    public CreateAdamBenchTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAdamBenchTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAdamBenchTaskResponseBody body);

        @Override
        CreateAdamBenchTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAdamBenchTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAdamBenchTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAdamBenchTaskResponse response) {
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
        public Builder body(CreateAdamBenchTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAdamBenchTaskResponse build() {
            return new CreateAdamBenchTaskResponse(this);
        } 

    } 

}

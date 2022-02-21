// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateShardTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateShardTaskResponse</p>
 */
public class CreateShardTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateShardTaskResponseBody body;

    private CreateShardTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateShardTaskResponse create() {
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
    public CreateShardTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateShardTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateShardTaskResponseBody body);

        @Override
        CreateShardTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateShardTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateShardTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateShardTaskResponse response) {
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
        public Builder body(CreateShardTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateShardTaskResponse build() {
            return new CreateShardTaskResponse(this);
        } 

    } 

}

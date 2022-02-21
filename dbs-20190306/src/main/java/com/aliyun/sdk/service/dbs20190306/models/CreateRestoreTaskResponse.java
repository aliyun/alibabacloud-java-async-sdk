// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRestoreTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateRestoreTaskResponse</p>
 */
public class CreateRestoreTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRestoreTaskResponseBody body;

    private CreateRestoreTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRestoreTaskResponse create() {
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
    public CreateRestoreTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRestoreTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRestoreTaskResponseBody body);

        @Override
        CreateRestoreTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRestoreTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRestoreTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRestoreTaskResponse response) {
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
        public Builder body(CreateRestoreTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRestoreTaskResponse build() {
            return new CreateRestoreTaskResponse(this);
        } 

    } 

}

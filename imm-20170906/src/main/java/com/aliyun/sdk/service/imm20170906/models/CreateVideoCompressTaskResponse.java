// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVideoCompressTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateVideoCompressTaskResponse</p>
 */
public class CreateVideoCompressTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVideoCompressTaskResponseBody body;

    private CreateVideoCompressTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVideoCompressTaskResponse create() {
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
    public CreateVideoCompressTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVideoCompressTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVideoCompressTaskResponseBody body);

        @Override
        CreateVideoCompressTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVideoCompressTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVideoCompressTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVideoCompressTaskResponse response) {
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
        public Builder body(CreateVideoCompressTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVideoCompressTaskResponse build() {
            return new CreateVideoCompressTaskResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVideoComposeTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateVideoComposeTaskResponse</p>
 */
public class CreateVideoComposeTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVideoComposeTaskResponseBody body;

    private CreateVideoComposeTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVideoComposeTaskResponse create() {
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
    public CreateVideoComposeTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVideoComposeTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVideoComposeTaskResponseBody body);

        @Override
        CreateVideoComposeTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVideoComposeTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVideoComposeTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVideoComposeTaskResponse response) {
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
        public Builder body(CreateVideoComposeTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVideoComposeTaskResponse build() {
            return new CreateVideoComposeTaskResponse(this);
        } 

    } 

}

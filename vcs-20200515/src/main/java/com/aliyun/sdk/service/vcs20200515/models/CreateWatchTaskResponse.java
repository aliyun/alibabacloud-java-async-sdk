// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWatchTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateWatchTaskResponse</p>
 */
public class CreateWatchTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateWatchTaskResponseBody body;

    private CreateWatchTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateWatchTaskResponse create() {
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
    public CreateWatchTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateWatchTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateWatchTaskResponseBody body);

        @Override
        CreateWatchTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateWatchTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateWatchTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateWatchTaskResponse response) {
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
        public Builder body(CreateWatchTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateWatchTaskResponse build() {
            return new CreateWatchTaskResponse(this);
        } 

    } 

}

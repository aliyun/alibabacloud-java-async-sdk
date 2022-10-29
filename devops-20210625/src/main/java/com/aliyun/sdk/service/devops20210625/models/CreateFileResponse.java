// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFileResponse} extends {@link TeaModel}
 *
 * <p>CreateFileResponse</p>
 */
public class CreateFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFileResponseBody body;

    private CreateFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFileResponse create() {
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
    public CreateFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFileResponseBody body);

        @Override
        CreateFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFileResponse response) {
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
        public Builder body(CreateFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFileResponse build() {
            return new CreateFileResponse(this);
        } 

    } 

}

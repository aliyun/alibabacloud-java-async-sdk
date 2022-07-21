// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCodeSourceResponse} extends {@link TeaModel}
 *
 * <p>CreateCodeSourceResponse</p>
 */
public class CreateCodeSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCodeSourceResponseBody body;

    private CreateCodeSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCodeSourceResponse create() {
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
    public CreateCodeSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCodeSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCodeSourceResponseBody body);

        @Override
        CreateCodeSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCodeSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCodeSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCodeSourceResponse response) {
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
        public Builder body(CreateCodeSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCodeSourceResponse build() {
            return new CreateCodeSourceResponse(this);
        } 

    } 

}

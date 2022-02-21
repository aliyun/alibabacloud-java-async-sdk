// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBundleResponse} extends {@link TeaModel}
 *
 * <p>CreateBundleResponse</p>
 */
public class CreateBundleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateBundleResponseBody body;

    private CreateBundleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateBundleResponse create() {
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
    public CreateBundleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateBundleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateBundleResponseBody body);

        @Override
        CreateBundleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateBundleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateBundleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateBundleResponse response) {
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
        public Builder body(CreateBundleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateBundleResponse build() {
            return new CreateBundleResponse(this);
        } 

    } 

}

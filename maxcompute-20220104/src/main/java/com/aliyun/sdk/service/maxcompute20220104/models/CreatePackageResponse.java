// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePackageResponse} extends {@link TeaModel}
 *
 * <p>CreatePackageResponse</p>
 */
public class CreatePackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePackageResponseBody body;

    private CreatePackageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePackageResponse create() {
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
    public CreatePackageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePackageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePackageResponseBody body);

        @Override
        CreatePackageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePackageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePackageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePackageResponse response) {
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
        public Builder body(CreatePackageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePackageResponse build() {
            return new CreatePackageResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkPackageResponse} extends {@link TeaModel}
 *
 * <p>CreateNetworkPackageResponse</p>
 */
public class CreateNetworkPackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateNetworkPackageResponseBody body;

    private CreateNetworkPackageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateNetworkPackageResponse create() {
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
    public CreateNetworkPackageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateNetworkPackageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateNetworkPackageResponseBody body);

        @Override
        CreateNetworkPackageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateNetworkPackageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateNetworkPackageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateNetworkPackageResponse response) {
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
        public Builder body(CreateNetworkPackageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateNetworkPackageResponse build() {
            return new CreateNetworkPackageResponse(this);
        } 

    } 

}

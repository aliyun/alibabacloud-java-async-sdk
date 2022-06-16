// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeployConfigResponse} extends {@link TeaModel}
 *
 * <p>CreateDeployConfigResponse</p>
 */
public class CreateDeployConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDeployConfigResponseBody body;

    private CreateDeployConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDeployConfigResponse create() {
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
    public CreateDeployConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDeployConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDeployConfigResponseBody body);

        @Override
        CreateDeployConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDeployConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDeployConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDeployConfigResponse response) {
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
        public Builder body(CreateDeployConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDeployConfigResponse build() {
            return new CreateDeployConfigResponse(this);
        } 

    } 

}

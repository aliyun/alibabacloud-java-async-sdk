// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterBootstrapActionResponse} extends {@link TeaModel}
 *
 * <p>CreateClusterBootstrapActionResponse</p>
 */
public class CreateClusterBootstrapActionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateClusterBootstrapActionResponseBody body;

    private CreateClusterBootstrapActionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateClusterBootstrapActionResponse create() {
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
    public CreateClusterBootstrapActionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateClusterBootstrapActionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateClusterBootstrapActionResponseBody body);

        @Override
        CreateClusterBootstrapActionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateClusterBootstrapActionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateClusterBootstrapActionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateClusterBootstrapActionResponse response) {
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
        public Builder body(CreateClusterBootstrapActionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateClusterBootstrapActionResponse build() {
            return new CreateClusterBootstrapActionResponse(this);
        } 

    } 

}

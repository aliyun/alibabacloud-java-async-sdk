// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateJenkinsImageRegistryResponse} extends {@link TeaModel}
 *
 * <p>CreateJenkinsImageRegistryResponse</p>
 */
public class CreateJenkinsImageRegistryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateJenkinsImageRegistryResponseBody body;

    private CreateJenkinsImageRegistryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateJenkinsImageRegistryResponse create() {
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
    public CreateJenkinsImageRegistryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateJenkinsImageRegistryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateJenkinsImageRegistryResponseBody body);

        @Override
        CreateJenkinsImageRegistryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateJenkinsImageRegistryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateJenkinsImageRegistryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateJenkinsImageRegistryResponse response) {
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
        public Builder body(CreateJenkinsImageRegistryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateJenkinsImageRegistryResponse build() {
            return new CreateJenkinsImageRegistryResponse(this);
        } 

    } 

}

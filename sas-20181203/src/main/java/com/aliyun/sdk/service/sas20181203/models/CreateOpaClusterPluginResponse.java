// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOpaClusterPluginResponse} extends {@link TeaModel}
 *
 * <p>CreateOpaClusterPluginResponse</p>
 */
public class CreateOpaClusterPluginResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOpaClusterPluginResponseBody body;

    private CreateOpaClusterPluginResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOpaClusterPluginResponse create() {
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
    public CreateOpaClusterPluginResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOpaClusterPluginResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOpaClusterPluginResponseBody body);

        @Override
        CreateOpaClusterPluginResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOpaClusterPluginResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOpaClusterPluginResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOpaClusterPluginResponse response) {
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
        public Builder body(CreateOpaClusterPluginResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOpaClusterPluginResponse build() {
            return new CreateOpaClusterPluginResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDeployConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateDeployConfigResponse</p>
 */
public class UpdateDeployConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDeployConfigResponseBody body;

    private UpdateDeployConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDeployConfigResponse create() {
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
    public UpdateDeployConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDeployConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDeployConfigResponseBody body);

        @Override
        UpdateDeployConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDeployConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDeployConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDeployConfigResponse response) {
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
        public Builder body(UpdateDeployConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDeployConfigResponse build() {
            return new UpdateDeployConfigResponse(this);
        } 

    } 

}

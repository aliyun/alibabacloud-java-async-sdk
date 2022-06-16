// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNormalDeployConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateNormalDeployConfigResponse</p>
 */
public class UpdateNormalDeployConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateNormalDeployConfigResponseBody body;

    private UpdateNormalDeployConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateNormalDeployConfigResponse create() {
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
    public UpdateNormalDeployConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateNormalDeployConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateNormalDeployConfigResponseBody body);

        @Override
        UpdateNormalDeployConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateNormalDeployConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateNormalDeployConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateNormalDeployConfigResponse response) {
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
        public Builder body(UpdateNormalDeployConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateNormalDeployConfigResponse build() {
            return new UpdateNormalDeployConfigResponse(this);
        } 

    } 

}

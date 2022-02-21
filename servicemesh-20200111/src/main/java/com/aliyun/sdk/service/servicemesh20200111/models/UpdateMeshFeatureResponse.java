// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMeshFeatureResponse} extends {@link TeaModel}
 *
 * <p>UpdateMeshFeatureResponse</p>
 */
public class UpdateMeshFeatureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMeshFeatureResponseBody body;

    private UpdateMeshFeatureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMeshFeatureResponse create() {
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
    public UpdateMeshFeatureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMeshFeatureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMeshFeatureResponseBody body);

        @Override
        UpdateMeshFeatureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMeshFeatureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMeshFeatureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMeshFeatureResponse response) {
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
        public Builder body(UpdateMeshFeatureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMeshFeatureResponse build() {
            return new UpdateMeshFeatureResponse(this);
        } 

    } 

}

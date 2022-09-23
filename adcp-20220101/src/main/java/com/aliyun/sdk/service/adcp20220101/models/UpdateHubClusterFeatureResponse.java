// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHubClusterFeatureResponse} extends {@link TeaModel}
 *
 * <p>UpdateHubClusterFeatureResponse</p>
 */
public class UpdateHubClusterFeatureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateHubClusterFeatureResponseBody body;

    private UpdateHubClusterFeatureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateHubClusterFeatureResponse create() {
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
    public UpdateHubClusterFeatureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateHubClusterFeatureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateHubClusterFeatureResponseBody body);

        @Override
        UpdateHubClusterFeatureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateHubClusterFeatureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateHubClusterFeatureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateHubClusterFeatureResponse response) {
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
        public Builder body(UpdateHubClusterFeatureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateHubClusterFeatureResponse build() {
            return new UpdateHubClusterFeatureResponse(this);
        } 

    } 

}

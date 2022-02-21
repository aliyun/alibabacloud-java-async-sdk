// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachAndReleaseClusterEniResponse} extends {@link TeaModel}
 *
 * <p>DetachAndReleaseClusterEniResponse</p>
 */
public class DetachAndReleaseClusterEniResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachAndReleaseClusterEniResponseBody body;

    private DetachAndReleaseClusterEniResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachAndReleaseClusterEniResponse create() {
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
    public DetachAndReleaseClusterEniResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachAndReleaseClusterEniResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachAndReleaseClusterEniResponseBody body);

        @Override
        DetachAndReleaseClusterEniResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachAndReleaseClusterEniResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachAndReleaseClusterEniResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachAndReleaseClusterEniResponse response) {
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
        public Builder body(DetachAndReleaseClusterEniResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachAndReleaseClusterEniResponse build() {
            return new DetachAndReleaseClusterEniResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseArtifactResponse} extends {@link TeaModel}
 *
 * <p>ReleaseArtifactResponse</p>
 */
public class ReleaseArtifactResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleaseArtifactResponseBody body;

    private ReleaseArtifactResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleaseArtifactResponse create() {
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
    public ReleaseArtifactResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseArtifactResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleaseArtifactResponseBody body);

        @Override
        ReleaseArtifactResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseArtifactResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleaseArtifactResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseArtifactResponse response) {
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
        public Builder body(ReleaseArtifactResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleaseArtifactResponse build() {
            return new ReleaseArtifactResponse(this);
        } 

    } 

}

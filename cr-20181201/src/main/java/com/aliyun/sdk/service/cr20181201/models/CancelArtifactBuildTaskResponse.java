// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelArtifactBuildTaskResponse} extends {@link TeaModel}
 *
 * <p>CancelArtifactBuildTaskResponse</p>
 */
public class CancelArtifactBuildTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelArtifactBuildTaskResponseBody body;

    private CancelArtifactBuildTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelArtifactBuildTaskResponse create() {
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
    public CancelArtifactBuildTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelArtifactBuildTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelArtifactBuildTaskResponseBody body);

        @Override
        CancelArtifactBuildTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelArtifactBuildTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelArtifactBuildTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelArtifactBuildTaskResponse response) {
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
        public Builder body(CancelArtifactBuildTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelArtifactBuildTaskResponse build() {
            return new CancelArtifactBuildTaskResponse(this);
        } 

    } 

}

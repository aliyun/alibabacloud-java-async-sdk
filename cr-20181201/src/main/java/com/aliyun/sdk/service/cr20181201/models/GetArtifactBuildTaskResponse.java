// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetArtifactBuildTaskResponse} extends {@link TeaModel}
 *
 * <p>GetArtifactBuildTaskResponse</p>
 */
public class GetArtifactBuildTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetArtifactBuildTaskResponseBody body;

    private GetArtifactBuildTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetArtifactBuildTaskResponse create() {
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
    public GetArtifactBuildTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetArtifactBuildTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetArtifactBuildTaskResponseBody body);

        @Override
        GetArtifactBuildTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetArtifactBuildTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetArtifactBuildTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetArtifactBuildTaskResponse response) {
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
        public Builder body(GetArtifactBuildTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetArtifactBuildTaskResponse build() {
            return new GetArtifactBuildTaskResponse(this);
        } 

    } 

}

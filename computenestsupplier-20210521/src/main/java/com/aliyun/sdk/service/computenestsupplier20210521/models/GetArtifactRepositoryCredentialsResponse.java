// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetArtifactRepositoryCredentialsResponse} extends {@link TeaModel}
 *
 * <p>GetArtifactRepositoryCredentialsResponse</p>
 */
public class GetArtifactRepositoryCredentialsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetArtifactRepositoryCredentialsResponseBody body;

    private GetArtifactRepositoryCredentialsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetArtifactRepositoryCredentialsResponse create() {
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
    public GetArtifactRepositoryCredentialsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetArtifactRepositoryCredentialsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetArtifactRepositoryCredentialsResponseBody body);

        @Override
        GetArtifactRepositoryCredentialsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetArtifactRepositoryCredentialsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetArtifactRepositoryCredentialsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetArtifactRepositoryCredentialsResponse response) {
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
        public Builder body(GetArtifactRepositoryCredentialsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetArtifactRepositoryCredentialsResponse build() {
            return new GetArtifactRepositoryCredentialsResponse(this);
        } 

    } 

}

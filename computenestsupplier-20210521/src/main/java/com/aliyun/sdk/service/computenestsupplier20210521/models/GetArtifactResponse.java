// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetArtifactResponse} extends {@link TeaModel}
 *
 * <p>GetArtifactResponse</p>
 */
public class GetArtifactResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetArtifactResponseBody body;

    private GetArtifactResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetArtifactResponse create() {
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
    public GetArtifactResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetArtifactResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetArtifactResponseBody body);

        @Override
        GetArtifactResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetArtifactResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetArtifactResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetArtifactResponse response) {
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
        public Builder body(GetArtifactResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetArtifactResponse build() {
            return new GetArtifactResponse(this);
        } 

    } 

}

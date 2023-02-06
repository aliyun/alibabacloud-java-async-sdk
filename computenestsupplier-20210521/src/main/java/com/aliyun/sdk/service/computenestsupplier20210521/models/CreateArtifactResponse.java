// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateArtifactResponse} extends {@link TeaModel}
 *
 * <p>CreateArtifactResponse</p>
 */
public class CreateArtifactResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateArtifactResponseBody body;

    private CreateArtifactResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateArtifactResponse create() {
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
    public CreateArtifactResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateArtifactResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateArtifactResponseBody body);

        @Override
        CreateArtifactResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateArtifactResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateArtifactResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateArtifactResponse response) {
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
        public Builder body(CreateArtifactResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateArtifactResponse build() {
            return new CreateArtifactResponse(this);
        } 

    } 

}

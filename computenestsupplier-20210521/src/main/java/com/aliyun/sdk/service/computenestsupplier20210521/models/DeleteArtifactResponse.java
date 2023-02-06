// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteArtifactResponse} extends {@link TeaModel}
 *
 * <p>DeleteArtifactResponse</p>
 */
public class DeleteArtifactResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteArtifactResponseBody body;

    private DeleteArtifactResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteArtifactResponse create() {
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
    public DeleteArtifactResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteArtifactResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteArtifactResponseBody body);

        @Override
        DeleteArtifactResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteArtifactResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteArtifactResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteArtifactResponse response) {
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
        public Builder body(DeleteArtifactResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteArtifactResponse build() {
            return new DeleteArtifactResponse(this);
        } 

    } 

}

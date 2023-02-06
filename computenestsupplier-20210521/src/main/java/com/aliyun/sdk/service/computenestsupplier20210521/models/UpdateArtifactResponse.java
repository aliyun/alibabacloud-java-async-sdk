// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateArtifactResponse} extends {@link TeaModel}
 *
 * <p>UpdateArtifactResponse</p>
 */
public class UpdateArtifactResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateArtifactResponseBody body;

    private UpdateArtifactResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateArtifactResponse create() {
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
    public UpdateArtifactResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateArtifactResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateArtifactResponseBody body);

        @Override
        UpdateArtifactResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateArtifactResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateArtifactResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateArtifactResponse response) {
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
        public Builder body(UpdateArtifactResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateArtifactResponse build() {
            return new UpdateArtifactResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListArtifactBuildTaskLogResponse} extends {@link TeaModel}
 *
 * <p>ListArtifactBuildTaskLogResponse</p>
 */
public class ListArtifactBuildTaskLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListArtifactBuildTaskLogResponseBody body;

    private ListArtifactBuildTaskLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListArtifactBuildTaskLogResponse create() {
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
    public ListArtifactBuildTaskLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListArtifactBuildTaskLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListArtifactBuildTaskLogResponseBody body);

        @Override
        ListArtifactBuildTaskLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListArtifactBuildTaskLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListArtifactBuildTaskLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListArtifactBuildTaskLogResponse response) {
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
        public Builder body(ListArtifactBuildTaskLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListArtifactBuildTaskLogResponse build() {
            return new ListArtifactBuildTaskLogResponse(this);
        } 

    } 

}

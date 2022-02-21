// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExperimentMetaResponse} extends {@link TeaModel}
 *
 * <p>GetExperimentMetaResponse</p>
 */
public class GetExperimentMetaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetExperimentMetaResponseBody body;

    private GetExperimentMetaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetExperimentMetaResponse create() {
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
    public GetExperimentMetaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetExperimentMetaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetExperimentMetaResponseBody body);

        @Override
        GetExperimentMetaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetExperimentMetaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetExperimentMetaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetExperimentMetaResponse response) {
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
        public Builder body(GetExperimentMetaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetExperimentMetaResponse build() {
            return new GetExperimentMetaResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCacheAnalysisJobResponse} extends {@link TeaModel}
 *
 * <p>CreateCacheAnalysisJobResponse</p>
 */
public class CreateCacheAnalysisJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCacheAnalysisJobResponseBody body;

    private CreateCacheAnalysisJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCacheAnalysisJobResponse create() {
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
    public CreateCacheAnalysisJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCacheAnalysisJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCacheAnalysisJobResponseBody body);

        @Override
        CreateCacheAnalysisJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCacheAnalysisJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCacheAnalysisJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCacheAnalysisJobResponse response) {
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
        public Builder body(CreateCacheAnalysisJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCacheAnalysisJobResponse build() {
            return new CreateCacheAnalysisJobResponse(this);
        } 

    } 

}

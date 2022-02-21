// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PageableQueryExperimentTaskByClusterIdResponse} extends {@link TeaModel}
 *
 * <p>PageableQueryExperimentTaskByClusterIdResponse</p>
 */
public class PageableQueryExperimentTaskByClusterIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PageableQueryExperimentTaskByClusterIdResponseBody body;

    private PageableQueryExperimentTaskByClusterIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PageableQueryExperimentTaskByClusterIdResponse create() {
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
    public PageableQueryExperimentTaskByClusterIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PageableQueryExperimentTaskByClusterIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PageableQueryExperimentTaskByClusterIdResponseBody body);

        @Override
        PageableQueryExperimentTaskByClusterIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PageableQueryExperimentTaskByClusterIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PageableQueryExperimentTaskByClusterIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PageableQueryExperimentTaskByClusterIdResponse response) {
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
        public Builder body(PageableQueryExperimentTaskByClusterIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PageableQueryExperimentTaskByClusterIdResponse build() {
            return new PageableQueryExperimentTaskByClusterIdResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PageableQueryUserExperimentResponse} extends {@link TeaModel}
 *
 * <p>PageableQueryUserExperimentResponse</p>
 */
public class PageableQueryUserExperimentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PageableQueryUserExperimentResponseBody body;

    private PageableQueryUserExperimentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PageableQueryUserExperimentResponse create() {
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
    public PageableQueryUserExperimentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PageableQueryUserExperimentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PageableQueryUserExperimentResponseBody body);

        @Override
        PageableQueryUserExperimentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PageableQueryUserExperimentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PageableQueryUserExperimentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PageableQueryUserExperimentResponse response) {
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
        public Builder body(PageableQueryUserExperimentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PageableQueryUserExperimentResponse build() {
            return new PageableQueryUserExperimentResponse(this);
        } 

    } 

}

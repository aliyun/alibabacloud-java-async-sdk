// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeElasticsearchTaskResponse} extends {@link TeaModel}
 *
 * <p>ResumeElasticsearchTaskResponse</p>
 */
public class ResumeElasticsearchTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResumeElasticsearchTaskResponseBody body;

    private ResumeElasticsearchTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResumeElasticsearchTaskResponse create() {
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
    public ResumeElasticsearchTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResumeElasticsearchTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResumeElasticsearchTaskResponseBody body);

        @Override
        ResumeElasticsearchTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResumeElasticsearchTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResumeElasticsearchTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResumeElasticsearchTaskResponse response) {
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
        public Builder body(ResumeElasticsearchTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResumeElasticsearchTaskResponse build() {
            return new ResumeElasticsearchTaskResponse(this);
        } 

    } 

}

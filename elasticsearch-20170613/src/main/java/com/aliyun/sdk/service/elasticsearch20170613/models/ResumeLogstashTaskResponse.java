// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeLogstashTaskResponse} extends {@link TeaModel}
 *
 * <p>ResumeLogstashTaskResponse</p>
 */
public class ResumeLogstashTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResumeLogstashTaskResponseBody body;

    private ResumeLogstashTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResumeLogstashTaskResponse create() {
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
    public ResumeLogstashTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResumeLogstashTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResumeLogstashTaskResponseBody body);

        @Override
        ResumeLogstashTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResumeLogstashTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResumeLogstashTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResumeLogstashTaskResponse response) {
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
        public Builder body(ResumeLogstashTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResumeLogstashTaskResponse build() {
            return new ResumeLogstashTaskResponse(this);
        } 

    } 

}

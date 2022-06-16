// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeDeployResponse} extends {@link TeaModel}
 *
 * <p>ResumeDeployResponse</p>
 */
public class ResumeDeployResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResumeDeployResponseBody body;

    private ResumeDeployResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResumeDeployResponse create() {
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
    public ResumeDeployResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResumeDeployResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResumeDeployResponseBody body);

        @Override
        ResumeDeployResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResumeDeployResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResumeDeployResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResumeDeployResponse response) {
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
        public Builder body(ResumeDeployResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResumeDeployResponse build() {
            return new ResumeDeployResponse(this);
        } 

    } 

}

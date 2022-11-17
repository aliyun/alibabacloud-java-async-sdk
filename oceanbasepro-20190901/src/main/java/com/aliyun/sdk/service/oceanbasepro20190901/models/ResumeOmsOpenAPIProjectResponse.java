// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeOmsOpenAPIProjectResponse} extends {@link TeaModel}
 *
 * <p>ResumeOmsOpenAPIProjectResponse</p>
 */
public class ResumeOmsOpenAPIProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResumeOmsOpenAPIProjectResponseBody body;

    private ResumeOmsOpenAPIProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResumeOmsOpenAPIProjectResponse create() {
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
    public ResumeOmsOpenAPIProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResumeOmsOpenAPIProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResumeOmsOpenAPIProjectResponseBody body);

        @Override
        ResumeOmsOpenAPIProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResumeOmsOpenAPIProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResumeOmsOpenAPIProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResumeOmsOpenAPIProjectResponse response) {
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
        public Builder body(ResumeOmsOpenAPIProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResumeOmsOpenAPIProjectResponse build() {
            return new ResumeOmsOpenAPIProjectResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeProjectResponse} extends {@link TeaModel}
 *
 * <p>ResumeProjectResponse</p>
 */
public class ResumeProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResumeProjectResponseBody body;

    private ResumeProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResumeProjectResponse create() {
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
    public ResumeProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResumeProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResumeProjectResponseBody body);

        @Override
        ResumeProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResumeProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResumeProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResumeProjectResponse response) {
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
        public Builder body(ResumeProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResumeProjectResponse build() {
            return new ResumeProjectResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeFlowResponse} extends {@link TeaModel}
 *
 * <p>ResumeFlowResponse</p>
 */
public class ResumeFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResumeFlowResponseBody body;

    private ResumeFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResumeFlowResponse create() {
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
    public ResumeFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResumeFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResumeFlowResponseBody body);

        @Override
        ResumeFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResumeFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResumeFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResumeFlowResponse response) {
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
        public Builder body(ResumeFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResumeFlowResponse build() {
            return new ResumeFlowResponse(this);
        } 

    } 

}

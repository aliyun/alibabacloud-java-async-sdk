// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RejectSolutionResponse} extends {@link TeaModel}
 *
 * <p>RejectSolutionResponse</p>
 */
public class RejectSolutionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RejectSolutionResponseBody body;

    private RejectSolutionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RejectSolutionResponse create() {
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
    public RejectSolutionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RejectSolutionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RejectSolutionResponseBody body);

        @Override
        RejectSolutionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RejectSolutionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RejectSolutionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RejectSolutionResponse response) {
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
        public Builder body(RejectSolutionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RejectSolutionResponse build() {
            return new RejectSolutionResponse(this);
        } 

    } 

}

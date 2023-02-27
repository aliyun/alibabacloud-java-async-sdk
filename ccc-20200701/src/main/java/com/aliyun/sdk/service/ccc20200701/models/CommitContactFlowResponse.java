// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CommitContactFlowResponse} extends {@link TeaModel}
 *
 * <p>CommitContactFlowResponse</p>
 */
public class CommitContactFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CommitContactFlowResponseBody body;

    private CommitContactFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CommitContactFlowResponse create() {
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
    public CommitContactFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CommitContactFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CommitContactFlowResponseBody body);

        @Override
        CommitContactFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CommitContactFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CommitContactFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CommitContactFlowResponse response) {
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
        public Builder body(CommitContactFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CommitContactFlowResponse build() {
            return new CommitContactFlowResponse(this);
        } 

    } 

}

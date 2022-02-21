// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CommitContactFlowVersionModificationResponse} extends {@link TeaModel}
 *
 * <p>CommitContactFlowVersionModificationResponse</p>
 */
public class CommitContactFlowVersionModificationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CommitContactFlowVersionModificationResponseBody body;

    private CommitContactFlowVersionModificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CommitContactFlowVersionModificationResponse create() {
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
    public CommitContactFlowVersionModificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CommitContactFlowVersionModificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CommitContactFlowVersionModificationResponseBody body);

        @Override
        CommitContactFlowVersionModificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CommitContactFlowVersionModificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CommitContactFlowVersionModificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CommitContactFlowVersionModificationResponse response) {
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
        public Builder body(CommitContactFlowVersionModificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CommitContactFlowVersionModificationResponse build() {
            return new CommitContactFlowVersionModificationResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelBanAllCommentResponse} extends {@link TeaModel}
 *
 * <p>CancelBanAllCommentResponse</p>
 */
public class CancelBanAllCommentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelBanAllCommentResponseBody body;

    private CancelBanAllCommentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelBanAllCommentResponse create() {
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
    public CancelBanAllCommentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelBanAllCommentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelBanAllCommentResponseBody body);

        @Override
        CancelBanAllCommentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelBanAllCommentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelBanAllCommentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelBanAllCommentResponse response) {
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
        public Builder body(CancelBanAllCommentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelBanAllCommentResponse build() {
            return new CancelBanAllCommentResponse(this);
        } 

    } 

}

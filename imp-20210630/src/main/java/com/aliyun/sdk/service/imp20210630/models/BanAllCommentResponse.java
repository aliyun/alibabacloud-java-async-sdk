// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BanAllCommentResponse} extends {@link TeaModel}
 *
 * <p>BanAllCommentResponse</p>
 */
public class BanAllCommentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BanAllCommentResponseBody body;

    private BanAllCommentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BanAllCommentResponse create() {
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
    public BanAllCommentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BanAllCommentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BanAllCommentResponseBody body);

        @Override
        BanAllCommentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BanAllCommentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BanAllCommentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BanAllCommentResponse response) {
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
        public Builder body(BanAllCommentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BanAllCommentResponse build() {
            return new BanAllCommentResponse(this);
        } 

    } 

}

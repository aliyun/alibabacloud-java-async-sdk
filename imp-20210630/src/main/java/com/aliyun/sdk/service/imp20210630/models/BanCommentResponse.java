// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BanCommentResponse} extends {@link TeaModel}
 *
 * <p>BanCommentResponse</p>
 */
public class BanCommentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BanCommentResponseBody body;

    private BanCommentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BanCommentResponse create() {
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
    public BanCommentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BanCommentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BanCommentResponseBody body);

        @Override
        BanCommentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BanCommentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BanCommentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BanCommentResponse response) {
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
        public Builder body(BanCommentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BanCommentResponse build() {
            return new BanCommentResponse(this);
        } 

    } 

}

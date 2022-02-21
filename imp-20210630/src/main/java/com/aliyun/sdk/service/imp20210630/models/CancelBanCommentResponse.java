// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelBanCommentResponse} extends {@link TeaModel}
 *
 * <p>CancelBanCommentResponse</p>
 */
public class CancelBanCommentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelBanCommentResponseBody body;

    private CancelBanCommentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelBanCommentResponse create() {
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
    public CancelBanCommentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelBanCommentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelBanCommentResponseBody body);

        @Override
        CancelBanCommentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelBanCommentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelBanCommentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelBanCommentResponse response) {
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
        public Builder body(CancelBanCommentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelBanCommentResponse build() {
            return new CancelBanCommentResponse(this);
        } 

    } 

}

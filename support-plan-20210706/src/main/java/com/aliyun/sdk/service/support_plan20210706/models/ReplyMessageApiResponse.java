// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplyMessageApiResponse} extends {@link TeaModel}
 *
 * <p>ReplyMessageApiResponse</p>
 */
public class ReplyMessageApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReplyMessageApiResponseBody body;

    private ReplyMessageApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReplyMessageApiResponse create() {
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
    public ReplyMessageApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReplyMessageApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReplyMessageApiResponseBody body);

        @Override
        ReplyMessageApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReplyMessageApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReplyMessageApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReplyMessageApiResponse response) {
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
        public Builder body(ReplyMessageApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReplyMessageApiResponse build() {
            return new ReplyMessageApiResponse(this);
        } 

    } 

}

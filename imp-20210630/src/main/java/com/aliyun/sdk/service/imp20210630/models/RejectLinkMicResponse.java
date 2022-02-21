// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RejectLinkMicResponse} extends {@link TeaModel}
 *
 * <p>RejectLinkMicResponse</p>
 */
public class RejectLinkMicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RejectLinkMicResponseBody body;

    private RejectLinkMicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RejectLinkMicResponse create() {
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
    public RejectLinkMicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RejectLinkMicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RejectLinkMicResponseBody body);

        @Override
        RejectLinkMicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RejectLinkMicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RejectLinkMicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RejectLinkMicResponse response) {
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
        public Builder body(RejectLinkMicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RejectLinkMicResponse build() {
            return new RejectLinkMicResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyLinkMicResponse} extends {@link TeaModel}
 *
 * <p>ApplyLinkMicResponse</p>
 */
public class ApplyLinkMicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApplyLinkMicResponseBody body;

    private ApplyLinkMicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApplyLinkMicResponse create() {
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
    public ApplyLinkMicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplyLinkMicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApplyLinkMicResponseBody body);

        @Override
        ApplyLinkMicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplyLinkMicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApplyLinkMicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplyLinkMicResponse response) {
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
        public Builder body(ApplyLinkMicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplyLinkMicResponse build() {
            return new ApplyLinkMicResponse(this);
        } 

    } 

}

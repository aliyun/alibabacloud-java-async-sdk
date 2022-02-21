// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelApplyLinkMicResponse} extends {@link TeaModel}
 *
 * <p>CancelApplyLinkMicResponse</p>
 */
public class CancelApplyLinkMicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelApplyLinkMicResponseBody body;

    private CancelApplyLinkMicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelApplyLinkMicResponse create() {
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
    public CancelApplyLinkMicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelApplyLinkMicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelApplyLinkMicResponseBody body);

        @Override
        CancelApplyLinkMicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelApplyLinkMicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelApplyLinkMicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelApplyLinkMicResponse response) {
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
        public Builder body(CancelApplyLinkMicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelApplyLinkMicResponse build() {
            return new CancelApplyLinkMicResponse(this);
        } 

    } 

}

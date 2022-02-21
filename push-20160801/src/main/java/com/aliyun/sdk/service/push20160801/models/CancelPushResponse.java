// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelPushResponse} extends {@link TeaModel}
 *
 * <p>CancelPushResponse</p>
 */
public class CancelPushResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelPushResponseBody body;

    private CancelPushResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelPushResponse create() {
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
    public CancelPushResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelPushResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelPushResponseBody body);

        @Override
        CancelPushResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelPushResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelPushResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelPushResponse response) {
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
        public Builder body(CancelPushResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelPushResponse build() {
            return new CancelPushResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseTimedResetOperateResponse} extends {@link TeaModel}
 *
 * <p>CloseTimedResetOperateResponse</p>
 */
public class CloseTimedResetOperateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CloseTimedResetOperateResponseBody body;

    private CloseTimedResetOperateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CloseTimedResetOperateResponse create() {
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
    public CloseTimedResetOperateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CloseTimedResetOperateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CloseTimedResetOperateResponseBody body);

        @Override
        CloseTimedResetOperateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CloseTimedResetOperateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CloseTimedResetOperateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CloseTimedResetOperateResponse response) {
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
        public Builder body(CloseTimedResetOperateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CloseTimedResetOperateResponse build() {
            return new CloseTimedResetOperateResponse(this);
        } 

    } 

}

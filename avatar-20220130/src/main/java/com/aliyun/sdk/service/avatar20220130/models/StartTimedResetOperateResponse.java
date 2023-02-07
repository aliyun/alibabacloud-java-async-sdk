// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartTimedResetOperateResponse} extends {@link TeaModel}
 *
 * <p>StartTimedResetOperateResponse</p>
 */
public class StartTimedResetOperateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartTimedResetOperateResponseBody body;

    private StartTimedResetOperateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartTimedResetOperateResponse create() {
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
    public StartTimedResetOperateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartTimedResetOperateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartTimedResetOperateResponseBody body);

        @Override
        StartTimedResetOperateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartTimedResetOperateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartTimedResetOperateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartTimedResetOperateResponse response) {
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
        public Builder body(StartTimedResetOperateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartTimedResetOperateResponse build() {
            return new StartTimedResetOperateResponse(this);
        } 

    } 

}

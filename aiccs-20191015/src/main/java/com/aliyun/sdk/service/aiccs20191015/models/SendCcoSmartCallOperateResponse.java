// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendCcoSmartCallOperateResponse} extends {@link TeaModel}
 *
 * <p>SendCcoSmartCallOperateResponse</p>
 */
public class SendCcoSmartCallOperateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendCcoSmartCallOperateResponseBody body;

    private SendCcoSmartCallOperateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendCcoSmartCallOperateResponse create() {
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
    public SendCcoSmartCallOperateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendCcoSmartCallOperateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendCcoSmartCallOperateResponseBody body);

        @Override
        SendCcoSmartCallOperateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendCcoSmartCallOperateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendCcoSmartCallOperateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendCcoSmartCallOperateResponse response) {
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
        public Builder body(SendCcoSmartCallOperateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendCcoSmartCallOperateResponse build() {
            return new SendCcoSmartCallOperateResponse(this);
        } 

    } 

}

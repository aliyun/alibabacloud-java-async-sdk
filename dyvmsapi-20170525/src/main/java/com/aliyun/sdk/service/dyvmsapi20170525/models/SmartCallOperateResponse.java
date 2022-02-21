// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SmartCallOperateResponse} extends {@link TeaModel}
 *
 * <p>SmartCallOperateResponse</p>
 */
public class SmartCallOperateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SmartCallOperateResponseBody body;

    private SmartCallOperateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SmartCallOperateResponse create() {
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
    public SmartCallOperateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SmartCallOperateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SmartCallOperateResponseBody body);

        @Override
        SmartCallOperateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SmartCallOperateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SmartCallOperateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SmartCallOperateResponse response) {
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
        public Builder body(SmartCallOperateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SmartCallOperateResponse build() {
            return new SmartCallOperateResponse(this);
        } 

    } 

}

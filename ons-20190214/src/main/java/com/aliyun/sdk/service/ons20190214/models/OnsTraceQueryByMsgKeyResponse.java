// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTraceQueryByMsgKeyResponse} extends {@link TeaModel}
 *
 * <p>OnsTraceQueryByMsgKeyResponse</p>
 */
public class OnsTraceQueryByMsgKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsTraceQueryByMsgKeyResponseBody body;

    private OnsTraceQueryByMsgKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsTraceQueryByMsgKeyResponse create() {
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
    public OnsTraceQueryByMsgKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsTraceQueryByMsgKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsTraceQueryByMsgKeyResponseBody body);

        @Override
        OnsTraceQueryByMsgKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsTraceQueryByMsgKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsTraceQueryByMsgKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsTraceQueryByMsgKeyResponse response) {
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
        public Builder body(OnsTraceQueryByMsgKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsTraceQueryByMsgKeyResponse build() {
            return new OnsTraceQueryByMsgKeyResponse(this);
        } 

    } 

}

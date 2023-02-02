// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTraceQueryByMsgIdResponse} extends {@link TeaModel}
 *
 * <p>OnsTraceQueryByMsgIdResponse</p>
 */
public class OnsTraceQueryByMsgIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsTraceQueryByMsgIdResponseBody body;

    private OnsTraceQueryByMsgIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsTraceQueryByMsgIdResponse create() {
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
    public OnsTraceQueryByMsgIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsTraceQueryByMsgIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsTraceQueryByMsgIdResponseBody body);

        @Override
        OnsTraceQueryByMsgIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsTraceQueryByMsgIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsTraceQueryByMsgIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsTraceQueryByMsgIdResponse response) {
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
        public Builder body(OnsTraceQueryByMsgIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsTraceQueryByMsgIdResponse build() {
            return new OnsTraceQueryByMsgIdResponse(this);
        } 

    } 

}

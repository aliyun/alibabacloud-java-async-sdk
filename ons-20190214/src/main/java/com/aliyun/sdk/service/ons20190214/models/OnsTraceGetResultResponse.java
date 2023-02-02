// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTraceGetResultResponse} extends {@link TeaModel}
 *
 * <p>OnsTraceGetResultResponse</p>
 */
public class OnsTraceGetResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsTraceGetResultResponseBody body;

    private OnsTraceGetResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsTraceGetResultResponse create() {
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
    public OnsTraceGetResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsTraceGetResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsTraceGetResultResponseBody body);

        @Override
        OnsTraceGetResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsTraceGetResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsTraceGetResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsTraceGetResultResponse response) {
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
        public Builder body(OnsTraceGetResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsTraceGetResultResponse build() {
            return new OnsTraceGetResultResponse(this);
        } 

    } 

}

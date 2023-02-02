// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsMessageGetByMsgIdResponse} extends {@link TeaModel}
 *
 * <p>OnsMessageGetByMsgIdResponse</p>
 */
public class OnsMessageGetByMsgIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsMessageGetByMsgIdResponseBody body;

    private OnsMessageGetByMsgIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsMessageGetByMsgIdResponse create() {
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
    public OnsMessageGetByMsgIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsMessageGetByMsgIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsMessageGetByMsgIdResponseBody body);

        @Override
        OnsMessageGetByMsgIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsMessageGetByMsgIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsMessageGetByMsgIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsMessageGetByMsgIdResponse response) {
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
        public Builder body(OnsMessageGetByMsgIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsMessageGetByMsgIdResponse build() {
            return new OnsMessageGetByMsgIdResponse(this);
        } 

    } 

}

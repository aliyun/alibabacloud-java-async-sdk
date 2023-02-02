// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsMessagePushResponse} extends {@link TeaModel}
 *
 * <p>OnsMessagePushResponse</p>
 */
public class OnsMessagePushResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsMessagePushResponseBody body;

    private OnsMessagePushResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsMessagePushResponse create() {
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
    public OnsMessagePushResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsMessagePushResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsMessagePushResponseBody body);

        @Override
        OnsMessagePushResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsMessagePushResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsMessagePushResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsMessagePushResponse response) {
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
        public Builder body(OnsMessagePushResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsMessagePushResponse build() {
            return new OnsMessagePushResponse(this);
        } 

    } 

}

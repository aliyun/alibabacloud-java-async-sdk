// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SmartOutboundResponse} extends {@link TeaModel}
 *
 * <p>SmartOutboundResponse</p>
 */
public class SmartOutboundResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SmartOutboundResponseBody body;

    private SmartOutboundResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SmartOutboundResponse create() {
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
    public SmartOutboundResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SmartOutboundResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SmartOutboundResponseBody body);

        @Override
        SmartOutboundResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SmartOutboundResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SmartOutboundResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SmartOutboundResponse response) {
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
        public Builder body(SmartOutboundResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SmartOutboundResponse build() {
            return new SmartOutboundResponse(this);
        } 

    } 

}

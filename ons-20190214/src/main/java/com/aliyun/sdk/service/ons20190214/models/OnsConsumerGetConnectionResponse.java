// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsConsumerGetConnectionResponse} extends {@link TeaModel}
 *
 * <p>OnsConsumerGetConnectionResponse</p>
 */
public class OnsConsumerGetConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsConsumerGetConnectionResponseBody body;

    private OnsConsumerGetConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsConsumerGetConnectionResponse create() {
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
    public OnsConsumerGetConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsConsumerGetConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsConsumerGetConnectionResponseBody body);

        @Override
        OnsConsumerGetConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsConsumerGetConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsConsumerGetConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsConsumerGetConnectionResponse response) {
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
        public Builder body(OnsConsumerGetConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsConsumerGetConnectionResponse build() {
            return new OnsConsumerGetConnectionResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutDeliveryChannelResponse} extends {@link TeaModel}
 *
 * <p>PutDeliveryChannelResponse</p>
 */
public class PutDeliveryChannelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutDeliveryChannelResponseBody body;

    private PutDeliveryChannelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutDeliveryChannelResponse create() {
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
    public PutDeliveryChannelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutDeliveryChannelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutDeliveryChannelResponseBody body);

        @Override
        PutDeliveryChannelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutDeliveryChannelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutDeliveryChannelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutDeliveryChannelResponse response) {
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
        public Builder body(PutDeliveryChannelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutDeliveryChannelResponse build() {
            return new PutDeliveryChannelResponse(this);
        } 

    } 

}

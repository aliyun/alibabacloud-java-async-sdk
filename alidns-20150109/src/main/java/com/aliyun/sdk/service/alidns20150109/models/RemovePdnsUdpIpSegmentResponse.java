// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemovePdnsUdpIpSegmentResponse} extends {@link TeaModel}
 *
 * <p>RemovePdnsUdpIpSegmentResponse</p>
 */
public class RemovePdnsUdpIpSegmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemovePdnsUdpIpSegmentResponseBody body;

    private RemovePdnsUdpIpSegmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemovePdnsUdpIpSegmentResponse create() {
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
    public RemovePdnsUdpIpSegmentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemovePdnsUdpIpSegmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemovePdnsUdpIpSegmentResponseBody body);

        @Override
        RemovePdnsUdpIpSegmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemovePdnsUdpIpSegmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemovePdnsUdpIpSegmentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemovePdnsUdpIpSegmentResponse response) {
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
        public Builder body(RemovePdnsUdpIpSegmentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemovePdnsUdpIpSegmentResponse build() {
            return new RemovePdnsUdpIpSegmentResponse(this);
        } 

    } 

}

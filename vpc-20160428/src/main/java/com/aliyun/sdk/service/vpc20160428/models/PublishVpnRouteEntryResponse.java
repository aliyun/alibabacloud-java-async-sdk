// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishVpnRouteEntryResponse} extends {@link TeaModel}
 *
 * <p>PublishVpnRouteEntryResponse</p>
 */
public class PublishVpnRouteEntryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishVpnRouteEntryResponseBody body;

    private PublishVpnRouteEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishVpnRouteEntryResponse create() {
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
    public PublishVpnRouteEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishVpnRouteEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishVpnRouteEntryResponseBody body);

        @Override
        PublishVpnRouteEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishVpnRouteEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishVpnRouteEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishVpnRouteEntryResponse response) {
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
        public Builder body(PublishVpnRouteEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishVpnRouteEntryResponse build() {
            return new PublishVpnRouteEntryResponse(this);
        } 

    } 

}

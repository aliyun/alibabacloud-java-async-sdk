// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadVpnConnectionConfigResponse} extends {@link TeaModel}
 *
 * <p>DownloadVpnConnectionConfigResponse</p>
 */
public class DownloadVpnConnectionConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DownloadVpnConnectionConfigResponseBody body;

    private DownloadVpnConnectionConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DownloadVpnConnectionConfigResponse create() {
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
    public DownloadVpnConnectionConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DownloadVpnConnectionConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DownloadVpnConnectionConfigResponseBody body);

        @Override
        DownloadVpnConnectionConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DownloadVpnConnectionConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DownloadVpnConnectionConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DownloadVpnConnectionConfigResponse response) {
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
        public Builder body(DownloadVpnConnectionConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DownloadVpnConnectionConfigResponse build() {
            return new DownloadVpnConnectionConfigResponse(this);
        } 

    } 

}

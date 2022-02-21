// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSslVpnClientCertsResponse} extends {@link TeaModel}
 *
 * <p>DescribeSslVpnClientCertsResponse</p>
 */
public class DescribeSslVpnClientCertsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSslVpnClientCertsResponseBody body;

    private DescribeSslVpnClientCertsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSslVpnClientCertsResponse create() {
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
    public DescribeSslVpnClientCertsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSslVpnClientCertsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSslVpnClientCertsResponseBody body);

        @Override
        DescribeSslVpnClientCertsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSslVpnClientCertsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSslVpnClientCertsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSslVpnClientCertsResponse response) {
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
        public Builder body(DescribeSslVpnClientCertsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSslVpnClientCertsResponse build() {
            return new DescribeSslVpnClientCertsResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSslVpnClientCertResponse} extends {@link TeaModel}
 *
 * <p>DescribeSslVpnClientCertResponse</p>
 */
public class DescribeSslVpnClientCertResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSslVpnClientCertResponseBody body;

    private DescribeSslVpnClientCertResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSslVpnClientCertResponse create() {
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
    public DescribeSslVpnClientCertResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSslVpnClientCertResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSslVpnClientCertResponseBody body);

        @Override
        DescribeSslVpnClientCertResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSslVpnClientCertResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSslVpnClientCertResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSslVpnClientCertResponse response) {
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
        public Builder body(DescribeSslVpnClientCertResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSslVpnClientCertResponse build() {
            return new DescribeSslVpnClientCertResponse(this);
        } 

    } 

}

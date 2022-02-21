// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSslVpnServersResponse} extends {@link TeaModel}
 *
 * <p>DescribeSslVpnServersResponse</p>
 */
public class DescribeSslVpnServersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSslVpnServersResponseBody body;

    private DescribeSslVpnServersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSslVpnServersResponse create() {
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
    public DescribeSslVpnServersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSslVpnServersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSslVpnServersResponseBody body);

        @Override
        DescribeSslVpnServersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSslVpnServersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSslVpnServersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSslVpnServersResponse response) {
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
        public Builder body(DescribeSslVpnServersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSslVpnServersResponse build() {
            return new DescribeSslVpnServersResponse(this);
        } 

    } 

}

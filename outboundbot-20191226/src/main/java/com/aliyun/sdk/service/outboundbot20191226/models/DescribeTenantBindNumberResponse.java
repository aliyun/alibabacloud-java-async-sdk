// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantBindNumberResponse} extends {@link TeaModel}
 *
 * <p>DescribeTenantBindNumberResponse</p>
 */
public class DescribeTenantBindNumberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTenantBindNumberResponseBody body;

    private DescribeTenantBindNumberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTenantBindNumberResponse create() {
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
    public DescribeTenantBindNumberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTenantBindNumberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTenantBindNumberResponseBody body);

        @Override
        DescribeTenantBindNumberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTenantBindNumberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTenantBindNumberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTenantBindNumberResponse response) {
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
        public Builder body(DescribeTenantBindNumberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTenantBindNumberResponse build() {
            return new DescribeTenantBindNumberResponse(this);
        } 

    } 

}

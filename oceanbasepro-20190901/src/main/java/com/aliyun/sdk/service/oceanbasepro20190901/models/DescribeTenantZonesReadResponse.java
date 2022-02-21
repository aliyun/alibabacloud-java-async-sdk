// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantZonesReadResponse} extends {@link TeaModel}
 *
 * <p>DescribeTenantZonesReadResponse</p>
 */
public class DescribeTenantZonesReadResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTenantZonesReadResponseBody body;

    private DescribeTenantZonesReadResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTenantZonesReadResponse create() {
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
    public DescribeTenantZonesReadResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTenantZonesReadResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTenantZonesReadResponseBody body);

        @Override
        DescribeTenantZonesReadResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTenantZonesReadResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTenantZonesReadResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTenantZonesReadResponse response) {
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
        public Builder body(DescribeTenantZonesReadResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTenantZonesReadResponse build() {
            return new DescribeTenantZonesReadResponse(this);
        } 

    } 

}

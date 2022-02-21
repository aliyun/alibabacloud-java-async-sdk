// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantResponse} extends {@link TeaModel}
 *
 * <p>DescribeTenantResponse</p>
 */
public class DescribeTenantResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTenantResponseBody body;

    private DescribeTenantResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTenantResponse create() {
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
    public DescribeTenantResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTenantResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTenantResponseBody body);

        @Override
        DescribeTenantResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTenantResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTenantResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTenantResponse response) {
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
        public Builder body(DescribeTenantResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTenantResponse build() {
            return new DescribeTenantResponse(this);
        } 

    } 

}

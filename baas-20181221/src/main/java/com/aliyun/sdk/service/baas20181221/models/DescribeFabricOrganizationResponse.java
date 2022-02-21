// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricOrganizationResponse} extends {@link TeaModel}
 *
 * <p>DescribeFabricOrganizationResponse</p>
 */
public class DescribeFabricOrganizationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFabricOrganizationResponseBody body;

    private DescribeFabricOrganizationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFabricOrganizationResponse create() {
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
    public DescribeFabricOrganizationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFabricOrganizationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFabricOrganizationResponseBody body);

        @Override
        DescribeFabricOrganizationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFabricOrganizationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFabricOrganizationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFabricOrganizationResponse response) {
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
        public Builder body(DescribeFabricOrganizationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFabricOrganizationResponse build() {
            return new DescribeFabricOrganizationResponse(this);
        } 

    } 

}

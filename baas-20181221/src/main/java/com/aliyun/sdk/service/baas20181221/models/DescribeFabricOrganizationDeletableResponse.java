// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricOrganizationDeletableResponse} extends {@link TeaModel}
 *
 * <p>DescribeFabricOrganizationDeletableResponse</p>
 */
public class DescribeFabricOrganizationDeletableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFabricOrganizationDeletableResponseBody body;

    private DescribeFabricOrganizationDeletableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFabricOrganizationDeletableResponse create() {
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
    public DescribeFabricOrganizationDeletableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFabricOrganizationDeletableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFabricOrganizationDeletableResponseBody body);

        @Override
        DescribeFabricOrganizationDeletableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFabricOrganizationDeletableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFabricOrganizationDeletableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFabricOrganizationDeletableResponse response) {
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
        public Builder body(DescribeFabricOrganizationDeletableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFabricOrganizationDeletableResponse build() {
            return new DescribeFabricOrganizationDeletableResponse(this);
        } 

    } 

}

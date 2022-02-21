// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricOrganizationPeersResponse} extends {@link TeaModel}
 *
 * <p>DescribeFabricOrganizationPeersResponse</p>
 */
public class DescribeFabricOrganizationPeersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFabricOrganizationPeersResponseBody body;

    private DescribeFabricOrganizationPeersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFabricOrganizationPeersResponse create() {
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
    public DescribeFabricOrganizationPeersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFabricOrganizationPeersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFabricOrganizationPeersResponseBody body);

        @Override
        DescribeFabricOrganizationPeersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFabricOrganizationPeersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFabricOrganizationPeersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFabricOrganizationPeersResponse response) {
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
        public Builder body(DescribeFabricOrganizationPeersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFabricOrganizationPeersResponse build() {
            return new DescribeFabricOrganizationPeersResponse(this);
        } 

    } 

}

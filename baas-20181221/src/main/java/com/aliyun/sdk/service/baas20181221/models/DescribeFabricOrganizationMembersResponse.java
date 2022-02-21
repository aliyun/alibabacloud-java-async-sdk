// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricOrganizationMembersResponse} extends {@link TeaModel}
 *
 * <p>DescribeFabricOrganizationMembersResponse</p>
 */
public class DescribeFabricOrganizationMembersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFabricOrganizationMembersResponseBody body;

    private DescribeFabricOrganizationMembersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFabricOrganizationMembersResponse create() {
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
    public DescribeFabricOrganizationMembersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFabricOrganizationMembersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFabricOrganizationMembersResponseBody body);

        @Override
        DescribeFabricOrganizationMembersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFabricOrganizationMembersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFabricOrganizationMembersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFabricOrganizationMembersResponse response) {
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
        public Builder body(DescribeFabricOrganizationMembersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFabricOrganizationMembersResponse build() {
            return new DescribeFabricOrganizationMembersResponse(this);
        } 

    } 

}

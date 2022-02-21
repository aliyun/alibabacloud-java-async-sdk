// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckFabricOrganizationDomainResponse} extends {@link TeaModel}
 *
 * <p>CheckFabricOrganizationDomainResponse</p>
 */
public class CheckFabricOrganizationDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckFabricOrganizationDomainResponseBody body;

    private CheckFabricOrganizationDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckFabricOrganizationDomainResponse create() {
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
    public CheckFabricOrganizationDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckFabricOrganizationDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckFabricOrganizationDomainResponseBody body);

        @Override
        CheckFabricOrganizationDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckFabricOrganizationDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckFabricOrganizationDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckFabricOrganizationDomainResponse response) {
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
        public Builder body(CheckFabricOrganizationDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckFabricOrganizationDomainResponse build() {
            return new CheckFabricOrganizationDomainResponse(this);
        } 

    } 

}

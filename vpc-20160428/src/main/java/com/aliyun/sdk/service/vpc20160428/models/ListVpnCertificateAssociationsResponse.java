// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpnCertificateAssociationsResponse} extends {@link TeaModel}
 *
 * <p>ListVpnCertificateAssociationsResponse</p>
 */
public class ListVpnCertificateAssociationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVpnCertificateAssociationsResponseBody body;

    private ListVpnCertificateAssociationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVpnCertificateAssociationsResponse create() {
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
    public ListVpnCertificateAssociationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVpnCertificateAssociationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVpnCertificateAssociationsResponseBody body);

        @Override
        ListVpnCertificateAssociationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVpnCertificateAssociationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVpnCertificateAssociationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVpnCertificateAssociationsResponse response) {
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
        public Builder body(ListVpnCertificateAssociationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVpnCertificateAssociationsResponse build() {
            return new ListVpnCertificateAssociationsResponse(this);
        } 

    } 

}

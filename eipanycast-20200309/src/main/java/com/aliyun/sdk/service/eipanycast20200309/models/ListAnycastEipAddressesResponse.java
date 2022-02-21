// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAnycastEipAddressesResponse} extends {@link TeaModel}
 *
 * <p>ListAnycastEipAddressesResponse</p>
 */
public class ListAnycastEipAddressesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAnycastEipAddressesResponseBody body;

    private ListAnycastEipAddressesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAnycastEipAddressesResponse create() {
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
    public ListAnycastEipAddressesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAnycastEipAddressesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAnycastEipAddressesResponseBody body);

        @Override
        ListAnycastEipAddressesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAnycastEipAddressesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAnycastEipAddressesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAnycastEipAddressesResponse response) {
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
        public Builder body(ListAnycastEipAddressesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAnycastEipAddressesResponse build() {
            return new ListAnycastEipAddressesResponse(this);
        } 

    } 

}

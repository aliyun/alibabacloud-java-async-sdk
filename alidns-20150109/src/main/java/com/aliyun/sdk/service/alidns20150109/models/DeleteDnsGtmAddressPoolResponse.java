// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDnsGtmAddressPoolResponse} extends {@link TeaModel}
 *
 * <p>DeleteDnsGtmAddressPoolResponse</p>
 */
public class DeleteDnsGtmAddressPoolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDnsGtmAddressPoolResponseBody body;

    private DeleteDnsGtmAddressPoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDnsGtmAddressPoolResponse create() {
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
    public DeleteDnsGtmAddressPoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDnsGtmAddressPoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDnsGtmAddressPoolResponseBody body);

        @Override
        DeleteDnsGtmAddressPoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDnsGtmAddressPoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDnsGtmAddressPoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDnsGtmAddressPoolResponse response) {
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
        public Builder body(DeleteDnsGtmAddressPoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDnsGtmAddressPoolResponse build() {
            return new DeleteDnsGtmAddressPoolResponse(this);
        } 

    } 

}

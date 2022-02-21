// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGtmAddressPoolResponse} extends {@link TeaModel}
 *
 * <p>DeleteGtmAddressPoolResponse</p>
 */
public class DeleteGtmAddressPoolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteGtmAddressPoolResponseBody body;

    private DeleteGtmAddressPoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteGtmAddressPoolResponse create() {
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
    public DeleteGtmAddressPoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteGtmAddressPoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteGtmAddressPoolResponseBody body);

        @Override
        DeleteGtmAddressPoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteGtmAddressPoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteGtmAddressPoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteGtmAddressPoolResponse response) {
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
        public Builder body(DeleteGtmAddressPoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteGtmAddressPoolResponse build() {
            return new DeleteGtmAddressPoolResponse(this);
        } 

    } 

}

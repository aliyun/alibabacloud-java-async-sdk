// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGtmAddressPoolResponse} extends {@link TeaModel}
 *
 * <p>AddGtmAddressPoolResponse</p>
 */
public class AddGtmAddressPoolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddGtmAddressPoolResponseBody body;

    private AddGtmAddressPoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddGtmAddressPoolResponse create() {
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
    public AddGtmAddressPoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddGtmAddressPoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddGtmAddressPoolResponseBody body);

        @Override
        AddGtmAddressPoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddGtmAddressPoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddGtmAddressPoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddGtmAddressPoolResponse response) {
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
        public Builder body(AddGtmAddressPoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddGtmAddressPoolResponse build() {
            return new AddGtmAddressPoolResponse(this);
        } 

    } 

}

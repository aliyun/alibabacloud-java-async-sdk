// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPublicIpAddressPoolCidrBlockResponse} extends {@link TeaModel}
 *
 * <p>AddPublicIpAddressPoolCidrBlockResponse</p>
 */
public class AddPublicIpAddressPoolCidrBlockResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddPublicIpAddressPoolCidrBlockResponseBody body;

    private AddPublicIpAddressPoolCidrBlockResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddPublicIpAddressPoolCidrBlockResponse create() {
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
    public AddPublicIpAddressPoolCidrBlockResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddPublicIpAddressPoolCidrBlockResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddPublicIpAddressPoolCidrBlockResponseBody body);

        @Override
        AddPublicIpAddressPoolCidrBlockResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddPublicIpAddressPoolCidrBlockResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddPublicIpAddressPoolCidrBlockResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddPublicIpAddressPoolCidrBlockResponse response) {
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
        public Builder body(AddPublicIpAddressPoolCidrBlockResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddPublicIpAddressPoolCidrBlockResponse build() {
            return new AddPublicIpAddressPoolCidrBlockResponse(this);
        } 

    } 

}

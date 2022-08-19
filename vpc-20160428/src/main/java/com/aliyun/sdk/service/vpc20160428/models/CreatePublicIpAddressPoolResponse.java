// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePublicIpAddressPoolResponse} extends {@link TeaModel}
 *
 * <p>CreatePublicIpAddressPoolResponse</p>
 */
public class CreatePublicIpAddressPoolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePublicIpAddressPoolResponseBody body;

    private CreatePublicIpAddressPoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePublicIpAddressPoolResponse create() {
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
    public CreatePublicIpAddressPoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePublicIpAddressPoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePublicIpAddressPoolResponseBody body);

        @Override
        CreatePublicIpAddressPoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePublicIpAddressPoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePublicIpAddressPoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePublicIpAddressPoolResponse response) {
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
        public Builder body(CreatePublicIpAddressPoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePublicIpAddressPoolResponse build() {
            return new CreatePublicIpAddressPoolResponse(this);
        } 

    } 

}

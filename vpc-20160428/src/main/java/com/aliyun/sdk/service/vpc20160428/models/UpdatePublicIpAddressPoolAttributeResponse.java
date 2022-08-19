// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePublicIpAddressPoolAttributeResponse} extends {@link TeaModel}
 *
 * <p>UpdatePublicIpAddressPoolAttributeResponse</p>
 */
public class UpdatePublicIpAddressPoolAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdatePublicIpAddressPoolAttributeResponseBody body;

    private UpdatePublicIpAddressPoolAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdatePublicIpAddressPoolAttributeResponse create() {
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
    public UpdatePublicIpAddressPoolAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePublicIpAddressPoolAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdatePublicIpAddressPoolAttributeResponseBody body);

        @Override
        UpdatePublicIpAddressPoolAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePublicIpAddressPoolAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdatePublicIpAddressPoolAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePublicIpAddressPoolAttributeResponse response) {
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
        public Builder body(UpdatePublicIpAddressPoolAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePublicIpAddressPoolAttributeResponse build() {
            return new UpdatePublicIpAddressPoolAttributeResponse(this);
        } 

    } 

}

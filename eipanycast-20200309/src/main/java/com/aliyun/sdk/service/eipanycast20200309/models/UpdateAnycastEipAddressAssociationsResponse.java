// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAnycastEipAddressAssociationsResponse} extends {@link TeaModel}
 *
 * <p>UpdateAnycastEipAddressAssociationsResponse</p>
 */
public class UpdateAnycastEipAddressAssociationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAnycastEipAddressAssociationsResponseBody body;

    private UpdateAnycastEipAddressAssociationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAnycastEipAddressAssociationsResponse create() {
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
    public UpdateAnycastEipAddressAssociationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAnycastEipAddressAssociationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAnycastEipAddressAssociationsResponseBody body);

        @Override
        UpdateAnycastEipAddressAssociationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAnycastEipAddressAssociationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAnycastEipAddressAssociationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAnycastEipAddressAssociationsResponse response) {
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
        public Builder body(UpdateAnycastEipAddressAssociationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAnycastEipAddressAssociationsResponse build() {
            return new UpdateAnycastEipAddressAssociationsResponse(this);
        } 

    } 

}

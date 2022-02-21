// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGtmAddressPoolResponse} extends {@link TeaModel}
 *
 * <p>UpdateGtmAddressPoolResponse</p>
 */
public class UpdateGtmAddressPoolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateGtmAddressPoolResponseBody body;

    private UpdateGtmAddressPoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateGtmAddressPoolResponse create() {
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
    public UpdateGtmAddressPoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateGtmAddressPoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateGtmAddressPoolResponseBody body);

        @Override
        UpdateGtmAddressPoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateGtmAddressPoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateGtmAddressPoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateGtmAddressPoolResponse response) {
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
        public Builder body(UpdateGtmAddressPoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateGtmAddressPoolResponse build() {
            return new UpdateGtmAddressPoolResponse(this);
        } 

    } 

}

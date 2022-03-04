// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateEipAddressResponse} extends {@link TeaModel}
 *
 * <p>AllocateEipAddressResponse</p>
 */
public class AllocateEipAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AllocateEipAddressResponseBody body;

    private AllocateEipAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AllocateEipAddressResponse create() {
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
    public AllocateEipAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AllocateEipAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AllocateEipAddressResponseBody body);

        @Override
        AllocateEipAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AllocateEipAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AllocateEipAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AllocateEipAddressResponse response) {
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
        public Builder body(AllocateEipAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AllocateEipAddressResponse build() {
            return new AllocateEipAddressResponse(this);
        } 

    } 

}

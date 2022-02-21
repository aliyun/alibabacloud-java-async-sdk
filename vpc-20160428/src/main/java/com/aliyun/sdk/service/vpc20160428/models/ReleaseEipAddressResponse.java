// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseEipAddressResponse} extends {@link TeaModel}
 *
 * <p>ReleaseEipAddressResponse</p>
 */
public class ReleaseEipAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleaseEipAddressResponseBody body;

    private ReleaseEipAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleaseEipAddressResponse create() {
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
    public ReleaseEipAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseEipAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleaseEipAddressResponseBody body);

        @Override
        ReleaseEipAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseEipAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleaseEipAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseEipAddressResponse response) {
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
        public Builder body(ReleaseEipAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleaseEipAddressResponse build() {
            return new ReleaseEipAddressResponse(this);
        } 

    } 

}

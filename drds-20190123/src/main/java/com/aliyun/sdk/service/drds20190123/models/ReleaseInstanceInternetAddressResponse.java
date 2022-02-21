// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseInstanceInternetAddressResponse} extends {@link TeaModel}
 *
 * <p>ReleaseInstanceInternetAddressResponse</p>
 */
public class ReleaseInstanceInternetAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleaseInstanceInternetAddressResponseBody body;

    private ReleaseInstanceInternetAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleaseInstanceInternetAddressResponse create() {
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
    public ReleaseInstanceInternetAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseInstanceInternetAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleaseInstanceInternetAddressResponseBody body);

        @Override
        ReleaseInstanceInternetAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseInstanceInternetAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleaseInstanceInternetAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseInstanceInternetAddressResponse response) {
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
        public Builder body(ReleaseInstanceInternetAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleaseInstanceInternetAddressResponse build() {
            return new ReleaseInstanceInternetAddressResponse(this);
        } 

    } 

}

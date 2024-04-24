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
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ReleaseInstanceInternetAddressResponseBody body;

    private ReleaseInstanceInternetAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public ReleaseInstanceInternetAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseInstanceInternetAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ReleaseInstanceInternetAddressResponseBody body);

        @Override
        ReleaseInstanceInternetAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseInstanceInternetAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ReleaseInstanceInternetAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseInstanceInternetAddressResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
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

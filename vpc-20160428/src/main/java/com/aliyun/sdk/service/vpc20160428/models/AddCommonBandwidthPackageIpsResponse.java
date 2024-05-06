// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCommonBandwidthPackageIpsResponse} extends {@link TeaModel}
 *
 * <p>AddCommonBandwidthPackageIpsResponse</p>
 */
public class AddCommonBandwidthPackageIpsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AddCommonBandwidthPackageIpsResponseBody body;

    private AddCommonBandwidthPackageIpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddCommonBandwidthPackageIpsResponse create() {
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
    public AddCommonBandwidthPackageIpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCommonBandwidthPackageIpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddCommonBandwidthPackageIpsResponseBody body);

        @Override
        AddCommonBandwidthPackageIpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCommonBandwidthPackageIpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AddCommonBandwidthPackageIpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCommonBandwidthPackageIpsResponse response) {
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
        public Builder body(AddCommonBandwidthPackageIpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCommonBandwidthPackageIpsResponse build() {
            return new AddCommonBandwidthPackageIpsResponse(this);
        } 

    } 

}

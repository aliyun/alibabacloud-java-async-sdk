// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBandwidthPackagaAutoRenewAttributeResponse} extends {@link TeaModel}
 *
 * <p>UpdateBandwidthPackagaAutoRenewAttributeResponse</p>
 */
public class UpdateBandwidthPackagaAutoRenewAttributeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateBandwidthPackagaAutoRenewAttributeResponseBody body;

    private UpdateBandwidthPackagaAutoRenewAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateBandwidthPackagaAutoRenewAttributeResponse create() {
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
    public UpdateBandwidthPackagaAutoRenewAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateBandwidthPackagaAutoRenewAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateBandwidthPackagaAutoRenewAttributeResponseBody body);

        @Override
        UpdateBandwidthPackagaAutoRenewAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateBandwidthPackagaAutoRenewAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateBandwidthPackagaAutoRenewAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateBandwidthPackagaAutoRenewAttributeResponse response) {
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
        public Builder body(UpdateBandwidthPackagaAutoRenewAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateBandwidthPackagaAutoRenewAttributeResponse build() {
            return new UpdateBandwidthPackagaAutoRenewAttributeResponse(this);
        } 

    } 

}

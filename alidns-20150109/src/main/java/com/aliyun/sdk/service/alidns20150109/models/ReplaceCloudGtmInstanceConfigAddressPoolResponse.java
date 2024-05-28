// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplaceCloudGtmInstanceConfigAddressPoolResponse} extends {@link TeaModel}
 *
 * <p>ReplaceCloudGtmInstanceConfigAddressPoolResponse</p>
 */
public class ReplaceCloudGtmInstanceConfigAddressPoolResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ReplaceCloudGtmInstanceConfigAddressPoolResponseBody body;

    private ReplaceCloudGtmInstanceConfigAddressPoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ReplaceCloudGtmInstanceConfigAddressPoolResponse create() {
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
    public ReplaceCloudGtmInstanceConfigAddressPoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReplaceCloudGtmInstanceConfigAddressPoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ReplaceCloudGtmInstanceConfigAddressPoolResponseBody body);

        @Override
        ReplaceCloudGtmInstanceConfigAddressPoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReplaceCloudGtmInstanceConfigAddressPoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ReplaceCloudGtmInstanceConfigAddressPoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReplaceCloudGtmInstanceConfigAddressPoolResponse response) {
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
        public Builder body(ReplaceCloudGtmInstanceConfigAddressPoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReplaceCloudGtmInstanceConfigAddressPoolResponse build() {
            return new ReplaceCloudGtmInstanceConfigAddressPoolResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VehicleMetaVerifyV2Response} extends {@link TeaModel}
 *
 * <p>VehicleMetaVerifyV2Response</p>
 */
public class VehicleMetaVerifyV2Response extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private VehicleMetaVerifyV2ResponseBody body;

    private VehicleMetaVerifyV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static VehicleMetaVerifyV2Response create() {
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
    public VehicleMetaVerifyV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VehicleMetaVerifyV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(VehicleMetaVerifyV2ResponseBody body);

        @Override
        VehicleMetaVerifyV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VehicleMetaVerifyV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private VehicleMetaVerifyV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VehicleMetaVerifyV2Response response) {
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
        public Builder body(VehicleMetaVerifyV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VehicleMetaVerifyV2Response build() {
            return new VehicleMetaVerifyV2Response(this);
        } 

    } 

}

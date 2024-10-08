// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUserLogDeliveryQuotaResponse} extends {@link TeaModel}
 *
 * <p>GetUserLogDeliveryQuotaResponse</p>
 */
public class GetUserLogDeliveryQuotaResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetUserLogDeliveryQuotaResponseBody body;

    private GetUserLogDeliveryQuotaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetUserLogDeliveryQuotaResponse create() {
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
    public GetUserLogDeliveryQuotaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserLogDeliveryQuotaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetUserLogDeliveryQuotaResponseBody body);

        @Override
        GetUserLogDeliveryQuotaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserLogDeliveryQuotaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetUserLogDeliveryQuotaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserLogDeliveryQuotaResponse response) {
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
        public Builder body(GetUserLogDeliveryQuotaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserLogDeliveryQuotaResponse build() {
            return new GetUserLogDeliveryQuotaResponse(this);
        } 

    } 

}

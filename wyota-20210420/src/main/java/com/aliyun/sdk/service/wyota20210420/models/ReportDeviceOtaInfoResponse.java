// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportDeviceOtaInfoResponse} extends {@link TeaModel}
 *
 * <p>ReportDeviceOtaInfoResponse</p>
 */
public class ReportDeviceOtaInfoResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ReportDeviceOtaInfoResponseBody body;

    private ReportDeviceOtaInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ReportDeviceOtaInfoResponse create() {
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
    public ReportDeviceOtaInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReportDeviceOtaInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ReportDeviceOtaInfoResponseBody body);

        @Override
        ReportDeviceOtaInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReportDeviceOtaInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ReportDeviceOtaInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReportDeviceOtaInfoResponse response) {
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
        public Builder body(ReportDeviceOtaInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReportDeviceOtaInfoResponse build() {
            return new ReportDeviceOtaInfoResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDoctorHBaseRegionServerResponse} extends {@link TeaModel}
 *
 * <p>GetDoctorHBaseRegionServerResponse</p>
 */
public class GetDoctorHBaseRegionServerResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetDoctorHBaseRegionServerResponseBody body;

    private GetDoctorHBaseRegionServerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetDoctorHBaseRegionServerResponse create() {
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
    public GetDoctorHBaseRegionServerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDoctorHBaseRegionServerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetDoctorHBaseRegionServerResponseBody body);

        @Override
        GetDoctorHBaseRegionServerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDoctorHBaseRegionServerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetDoctorHBaseRegionServerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDoctorHBaseRegionServerResponse response) {
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
        public Builder body(GetDoctorHBaseRegionServerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDoctorHBaseRegionServerResponse build() {
            return new GetDoctorHBaseRegionServerResponse(this);
        } 

    } 

}

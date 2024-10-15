// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDoctorHBaseTableResponse} extends {@link TeaModel}
 *
 * <p>GetDoctorHBaseTableResponse</p>
 */
public class GetDoctorHBaseTableResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetDoctorHBaseTableResponseBody body;

    private GetDoctorHBaseTableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetDoctorHBaseTableResponse create() {
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
    public GetDoctorHBaseTableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDoctorHBaseTableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetDoctorHBaseTableResponseBody body);

        @Override
        GetDoctorHBaseTableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDoctorHBaseTableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetDoctorHBaseTableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDoctorHBaseTableResponse response) {
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
        public Builder body(GetDoctorHBaseTableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDoctorHBaseTableResponse build() {
            return new GetDoctorHBaseTableResponse(this);
        } 

    } 

}

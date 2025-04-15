// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetHotlineGroupDetailReportResponse} extends {@link TeaModel}
 *
 * <p>GetHotlineGroupDetailReportResponse</p>
 */
public class GetHotlineGroupDetailReportResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetHotlineGroupDetailReportResponseBody body;

    private GetHotlineGroupDetailReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetHotlineGroupDetailReportResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public GetHotlineGroupDetailReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotlineGroupDetailReportResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetHotlineGroupDetailReportResponseBody body);

        @Override
        GetHotlineGroupDetailReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotlineGroupDetailReportResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetHotlineGroupDetailReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotlineGroupDetailReportResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(GetHotlineGroupDetailReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotlineGroupDetailReportResponse build() {
            return new GetHotlineGroupDetailReportResponse(this);
        } 

    } 

}

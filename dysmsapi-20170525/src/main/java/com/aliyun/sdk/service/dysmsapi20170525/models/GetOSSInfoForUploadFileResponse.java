// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link GetOSSInfoForUploadFileResponse} extends {@link TeaModel}
 *
 * <p>GetOSSInfoForUploadFileResponse</p>
 */
public class GetOSSInfoForUploadFileResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetOSSInfoForUploadFileResponseBody body;

    private GetOSSInfoForUploadFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetOSSInfoForUploadFileResponse create() {
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
    public GetOSSInfoForUploadFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOSSInfoForUploadFileResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetOSSInfoForUploadFileResponseBody body);

        @Override
        GetOSSInfoForUploadFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOSSInfoForUploadFileResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetOSSInfoForUploadFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOSSInfoForUploadFileResponse response) {
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
        public Builder body(GetOSSInfoForUploadFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOSSInfoForUploadFileResponse build() {
            return new GetOSSInfoForUploadFileResponse(this);
        } 

    } 

}

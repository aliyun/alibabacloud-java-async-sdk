// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link ReCreateCloudResourceResponse} extends {@link TeaModel}
 *
 * <p>ReCreateCloudResourceResponse</p>
 */
public class ReCreateCloudResourceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ReCreateCloudResourceResponseBody body;

    private ReCreateCloudResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ReCreateCloudResourceResponse create() {
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
    public ReCreateCloudResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReCreateCloudResourceResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ReCreateCloudResourceResponseBody body);

        @Override
        ReCreateCloudResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReCreateCloudResourceResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ReCreateCloudResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReCreateCloudResourceResponse response) {
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
        public Builder body(ReCreateCloudResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReCreateCloudResourceResponse build() {
            return new ReCreateCloudResourceResponse(this);
        } 

    } 

}

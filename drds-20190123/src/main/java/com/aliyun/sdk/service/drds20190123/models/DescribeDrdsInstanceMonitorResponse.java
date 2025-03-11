// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeDrdsInstanceMonitorResponse} extends {@link TeaModel}
 *
 * <p>DescribeDrdsInstanceMonitorResponse</p>
 */
public class DescribeDrdsInstanceMonitorResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeDrdsInstanceMonitorResponseBody body;

    private DescribeDrdsInstanceMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeDrdsInstanceMonitorResponse create() {
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
    public DescribeDrdsInstanceMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDrdsInstanceMonitorResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeDrdsInstanceMonitorResponseBody body);

        @Override
        DescribeDrdsInstanceMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDrdsInstanceMonitorResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeDrdsInstanceMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDrdsInstanceMonitorResponse response) {
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
        public Builder body(DescribeDrdsInstanceMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDrdsInstanceMonitorResponse build() {
            return new DescribeDrdsInstanceMonitorResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeSoarStrategiesResponse} extends {@link TeaModel}
 *
 * <p>DescribeSoarStrategiesResponse</p>
 */
public class DescribeSoarStrategiesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeSoarStrategiesResponseBody body;

    private DescribeSoarStrategiesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeSoarStrategiesResponse create() {
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
    public DescribeSoarStrategiesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSoarStrategiesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeSoarStrategiesResponseBody body);

        @Override
        DescribeSoarStrategiesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSoarStrategiesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeSoarStrategiesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSoarStrategiesResponse response) {
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
        public Builder body(DescribeSoarStrategiesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSoarStrategiesResponse build() {
            return new DescribeSoarStrategiesResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DescribeCloudbenchTaskResponse} extends {@link TeaModel}
 *
 * <p>DescribeCloudbenchTaskResponse</p>
 */
public class DescribeCloudbenchTaskResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeCloudbenchTaskResponseBody body;

    private DescribeCloudbenchTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeCloudbenchTaskResponse create() {
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
    public DescribeCloudbenchTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCloudbenchTaskResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeCloudbenchTaskResponseBody body);

        @Override
        DescribeCloudbenchTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCloudbenchTaskResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeCloudbenchTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCloudbenchTaskResponse response) {
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
        public Builder body(DescribeCloudbenchTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCloudbenchTaskResponse build() {
            return new DescribeCloudbenchTaskResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeListAntCloudAuthScenesResponse} extends {@link TeaModel}
 *
 * <p>DescribeListAntCloudAuthScenesResponse</p>
 */
public class DescribeListAntCloudAuthScenesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeListAntCloudAuthScenesResponseBody body;

    private DescribeListAntCloudAuthScenesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeListAntCloudAuthScenesResponse create() {
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
    public DescribeListAntCloudAuthScenesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeListAntCloudAuthScenesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeListAntCloudAuthScenesResponseBody body);

        @Override
        DescribeListAntCloudAuthScenesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeListAntCloudAuthScenesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeListAntCloudAuthScenesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeListAntCloudAuthScenesResponse response) {
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
        public Builder body(DescribeListAntCloudAuthScenesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeListAntCloudAuthScenesResponse build() {
            return new DescribeListAntCloudAuthScenesResponse(this);
        } 

    } 

}

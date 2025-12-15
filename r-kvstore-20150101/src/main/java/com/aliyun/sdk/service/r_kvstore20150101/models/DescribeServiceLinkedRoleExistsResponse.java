// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeServiceLinkedRoleExistsResponse} extends {@link TeaModel}
 *
 * <p>DescribeServiceLinkedRoleExistsResponse</p>
 */
public class DescribeServiceLinkedRoleExistsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeServiceLinkedRoleExistsResponseBody body;

    private DescribeServiceLinkedRoleExistsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeServiceLinkedRoleExistsResponse create() {
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
    public DescribeServiceLinkedRoleExistsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeServiceLinkedRoleExistsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeServiceLinkedRoleExistsResponseBody body);

        @Override
        DescribeServiceLinkedRoleExistsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeServiceLinkedRoleExistsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeServiceLinkedRoleExistsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeServiceLinkedRoleExistsResponse response) {
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
        public Builder body(DescribeServiceLinkedRoleExistsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeServiceLinkedRoleExistsResponse build() {
            return new DescribeServiceLinkedRoleExistsResponse(this);
        } 

    } 

}

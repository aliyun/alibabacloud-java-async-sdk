// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesResponse} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponse</p>
 */
public class DescribeInstancesResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeInstancesResponseBody body;

    private DescribeInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeInstancesResponse create() {
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
    public DescribeInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeInstancesResponseBody body);

        @Override
        DescribeInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInstancesResponse response) {
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
        public Builder body(DescribeInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInstancesResponse build() {
            return new DescribeInstancesResponse(this);
        } 

    } 

}

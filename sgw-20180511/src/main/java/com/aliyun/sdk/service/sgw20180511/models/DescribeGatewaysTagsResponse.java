// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewaysTagsResponse} extends {@link TeaModel}
 *
 * <p>DescribeGatewaysTagsResponse</p>
 */
public class DescribeGatewaysTagsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeGatewaysTagsResponseBody body;

    private DescribeGatewaysTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeGatewaysTagsResponse create() {
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
    public DescribeGatewaysTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGatewaysTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeGatewaysTagsResponseBody body);

        @Override
        DescribeGatewaysTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGatewaysTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeGatewaysTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGatewaysTagsResponse response) {
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
        public Builder body(DescribeGatewaysTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGatewaysTagsResponse build() {
            return new DescribeGatewaysTagsResponse(this);
        } 

    } 

}

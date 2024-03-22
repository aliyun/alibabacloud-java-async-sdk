// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeComponentsJsResponse} extends {@link TeaModel}
 *
 * <p>DescribeComponentsJsResponse</p>
 */
public class DescribeComponentsJsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeComponentsJsResponseBody body;

    private DescribeComponentsJsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeComponentsJsResponse create() {
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
    public DescribeComponentsJsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeComponentsJsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeComponentsJsResponseBody body);

        @Override
        DescribeComponentsJsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeComponentsJsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeComponentsJsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeComponentsJsResponse response) {
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
        public Builder body(DescribeComponentsJsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeComponentsJsResponse build() {
            return new DescribeComponentsJsResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCreateDrdsInstanceStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeCreateDrdsInstanceStatusResponse</p>
 */
public class DescribeCreateDrdsInstanceStatusResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeCreateDrdsInstanceStatusResponseBody body;

    private DescribeCreateDrdsInstanceStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeCreateDrdsInstanceStatusResponse create() {
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
    public DescribeCreateDrdsInstanceStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCreateDrdsInstanceStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeCreateDrdsInstanceStatusResponseBody body);

        @Override
        DescribeCreateDrdsInstanceStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCreateDrdsInstanceStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeCreateDrdsInstanceStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCreateDrdsInstanceStatusResponse response) {
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
        public Builder body(DescribeCreateDrdsInstanceStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCreateDrdsInstanceStatusResponse build() {
            return new DescribeCreateDrdsInstanceStatusResponse(this);
        } 

    } 

}

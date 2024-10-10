// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeGroupedVulResponse} extends {@link TeaModel}
 *
 * <p>DescribeGroupedVulResponse</p>
 */
public class DescribeGroupedVulResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeGroupedVulResponseBody body;

    private DescribeGroupedVulResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeGroupedVulResponse create() {
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
    public DescribeGroupedVulResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGroupedVulResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeGroupedVulResponseBody body);

        @Override
        DescribeGroupedVulResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGroupedVulResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeGroupedVulResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGroupedVulResponse response) {
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
        public Builder body(DescribeGroupedVulResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGroupedVulResponse build() {
            return new DescribeGroupedVulResponse(this);
        } 

    } 

}

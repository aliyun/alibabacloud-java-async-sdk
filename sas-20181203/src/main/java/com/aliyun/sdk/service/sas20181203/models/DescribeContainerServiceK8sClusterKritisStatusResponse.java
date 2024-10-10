// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeContainerServiceK8sClusterKritisStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeContainerServiceK8sClusterKritisStatusResponse</p>
 */
public class DescribeContainerServiceK8sClusterKritisStatusResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeContainerServiceK8sClusterKritisStatusResponseBody body;

    private DescribeContainerServiceK8sClusterKritisStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeContainerServiceK8sClusterKritisStatusResponse create() {
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
    public DescribeContainerServiceK8sClusterKritisStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeContainerServiceK8sClusterKritisStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeContainerServiceK8sClusterKritisStatusResponseBody body);

        @Override
        DescribeContainerServiceK8sClusterKritisStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeContainerServiceK8sClusterKritisStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeContainerServiceK8sClusterKritisStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeContainerServiceK8sClusterKritisStatusResponse response) {
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
        public Builder body(DescribeContainerServiceK8sClusterKritisStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeContainerServiceK8sClusterKritisStatusResponse build() {
            return new DescribeContainerServiceK8sClusterKritisStatusResponse(this);
        } 

    } 

}

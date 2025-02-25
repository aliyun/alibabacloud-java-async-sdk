// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeExperimentEnvResponse} extends {@link TeaModel}
 *
 * <p>DescribeExperimentEnvResponse</p>
 */
public class DescribeExperimentEnvResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeExperimentEnvResponseBody body;

    private DescribeExperimentEnvResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeExperimentEnvResponse create() {
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
    public DescribeExperimentEnvResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeExperimentEnvResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeExperimentEnvResponseBody body);

        @Override
        DescribeExperimentEnvResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeExperimentEnvResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeExperimentEnvResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeExperimentEnvResponse response) {
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
        public Builder body(DescribeExperimentEnvResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeExperimentEnvResponse build() {
            return new DescribeExperimentEnvResponse(this);
        } 

    } 

}

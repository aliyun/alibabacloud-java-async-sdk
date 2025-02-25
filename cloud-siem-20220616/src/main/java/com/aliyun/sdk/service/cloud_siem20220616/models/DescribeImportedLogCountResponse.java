// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImportedLogCountResponse} extends {@link TeaModel}
 *
 * <p>DescribeImportedLogCountResponse</p>
 */
public class DescribeImportedLogCountResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeImportedLogCountResponseBody body;

    private DescribeImportedLogCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeImportedLogCountResponse create() {
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
    public DescribeImportedLogCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImportedLogCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeImportedLogCountResponseBody body);

        @Override
        DescribeImportedLogCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImportedLogCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeImportedLogCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImportedLogCountResponse response) {
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
        public Builder body(DescribeImportedLogCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImportedLogCountResponse build() {
            return new DescribeImportedLogCountResponse(this);
        } 

    } 

}

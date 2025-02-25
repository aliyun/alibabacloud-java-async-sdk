// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSandboxRecoveryTimeResponse} extends {@link TeaModel}
 *
 * <p>DescribeSandboxRecoveryTimeResponse</p>
 */
public class DescribeSandboxRecoveryTimeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeSandboxRecoveryTimeResponseBody body;

    private DescribeSandboxRecoveryTimeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeSandboxRecoveryTimeResponse create() {
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
    public DescribeSandboxRecoveryTimeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSandboxRecoveryTimeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeSandboxRecoveryTimeResponseBody body);

        @Override
        DescribeSandboxRecoveryTimeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSandboxRecoveryTimeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeSandboxRecoveryTimeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSandboxRecoveryTimeResponse response) {
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
        public Builder body(DescribeSandboxRecoveryTimeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSandboxRecoveryTimeResponse build() {
            return new DescribeSandboxRecoveryTimeResponse(this);
        } 

    } 

}

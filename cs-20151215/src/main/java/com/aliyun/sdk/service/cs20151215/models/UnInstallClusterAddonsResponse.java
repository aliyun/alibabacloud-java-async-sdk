// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UnInstallClusterAddonsResponse} extends {@link TeaModel}
 *
 * <p>UnInstallClusterAddonsResponse</p>
 */
public class UnInstallClusterAddonsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UnInstallClusterAddonsResponseBody body;

    private UnInstallClusterAddonsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UnInstallClusterAddonsResponse create() {
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
    public UnInstallClusterAddonsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnInstallClusterAddonsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UnInstallClusterAddonsResponseBody body);

        @Override
        UnInstallClusterAddonsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnInstallClusterAddonsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UnInstallClusterAddonsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnInstallClusterAddonsResponse response) {
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
        public Builder body(UnInstallClusterAddonsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnInstallClusterAddonsResponse build() {
            return new UnInstallClusterAddonsResponse(this);
        } 

    } 

}

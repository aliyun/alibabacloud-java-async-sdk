// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UninstallCloudAppResponse} extends {@link TeaModel}
 *
 * <p>UninstallCloudAppResponse</p>
 */
public class UninstallCloudAppResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UninstallCloudAppResponseBody body;

    private UninstallCloudAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UninstallCloudAppResponse create() {
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
    public UninstallCloudAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UninstallCloudAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UninstallCloudAppResponseBody body);

        @Override
        UninstallCloudAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UninstallCloudAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UninstallCloudAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UninstallCloudAppResponse response) {
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
        public Builder body(UninstallCloudAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UninstallCloudAppResponse build() {
            return new UninstallCloudAppResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokePermissionsResponse} extends {@link TeaModel}
 *
 * <p>RevokePermissionsResponse</p>
 */
public class RevokePermissionsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RevokePermissionsResponseBody body;

    private RevokePermissionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RevokePermissionsResponse create() {
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
    public RevokePermissionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokePermissionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RevokePermissionsResponseBody body);

        @Override
        RevokePermissionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokePermissionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RevokePermissionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokePermissionsResponse response) {
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
        public Builder body(RevokePermissionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokePermissionsResponse build() {
            return new RevokePermissionsResponse(this);
        } 

    } 

}

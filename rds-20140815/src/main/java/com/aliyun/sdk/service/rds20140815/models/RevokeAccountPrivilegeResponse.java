// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeAccountPrivilegeResponse} extends {@link TeaModel}
 *
 * <p>RevokeAccountPrivilegeResponse</p>
 */
public class RevokeAccountPrivilegeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RevokeAccountPrivilegeResponseBody body;

    private RevokeAccountPrivilegeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RevokeAccountPrivilegeResponse create() {
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
    public RevokeAccountPrivilegeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokeAccountPrivilegeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RevokeAccountPrivilegeResponseBody body);

        @Override
        RevokeAccountPrivilegeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokeAccountPrivilegeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RevokeAccountPrivilegeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokeAccountPrivilegeResponse response) {
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
        public Builder body(RevokeAccountPrivilegeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokeAccountPrivilegeResponse build() {
            return new RevokeAccountPrivilegeResponse(this);
        } 

    } 

}

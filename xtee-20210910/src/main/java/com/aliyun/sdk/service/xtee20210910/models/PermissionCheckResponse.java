// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PermissionCheckResponse} extends {@link TeaModel}
 *
 * <p>PermissionCheckResponse</p>
 */
public class PermissionCheckResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private PermissionCheckResponseBody body;

    private PermissionCheckResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PermissionCheckResponse create() {
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
    public PermissionCheckResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PermissionCheckResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(PermissionCheckResponseBody body);

        @Override
        PermissionCheckResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PermissionCheckResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private PermissionCheckResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PermissionCheckResponse response) {
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
        public Builder body(PermissionCheckResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PermissionCheckResponse build() {
            return new PermissionCheckResponse(this);
        } 

    } 

}

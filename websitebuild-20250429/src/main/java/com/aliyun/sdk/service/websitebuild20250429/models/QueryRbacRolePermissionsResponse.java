// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryRbacRolePermissionsResponse} extends {@link TeaModel}
 *
 * <p>QueryRbacRolePermissionsResponse</p>
 */
public class QueryRbacRolePermissionsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryRbacRolePermissionsResponseBody body;

    private QueryRbacRolePermissionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryRbacRolePermissionsResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public QueryRbacRolePermissionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRbacRolePermissionsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryRbacRolePermissionsResponseBody body);

        @Override
        QueryRbacRolePermissionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRbacRolePermissionsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private QueryRbacRolePermissionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRbacRolePermissionsResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(QueryRbacRolePermissionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRbacRolePermissionsResponse build() {
            return new QueryRbacRolePermissionsResponse(this);
        } 

    } 

}

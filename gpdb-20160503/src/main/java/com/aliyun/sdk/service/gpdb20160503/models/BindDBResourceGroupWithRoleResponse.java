// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link BindDBResourceGroupWithRoleResponse} extends {@link TeaModel}
 *
 * <p>BindDBResourceGroupWithRoleResponse</p>
 */
public class BindDBResourceGroupWithRoleResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private BindDBResourceGroupWithRoleResponseBody body;

    private BindDBResourceGroupWithRoleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static BindDBResourceGroupWithRoleResponse create() {
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
    public BindDBResourceGroupWithRoleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindDBResourceGroupWithRoleResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(BindDBResourceGroupWithRoleResponseBody body);

        @Override
        BindDBResourceGroupWithRoleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindDBResourceGroupWithRoleResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private BindDBResourceGroupWithRoleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindDBResourceGroupWithRoleResponse response) {
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
        public Builder body(BindDBResourceGroupWithRoleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindDBResourceGroupWithRoleResponse build() {
            return new BindDBResourceGroupWithRoleResponse(this);
        } 

    } 

}

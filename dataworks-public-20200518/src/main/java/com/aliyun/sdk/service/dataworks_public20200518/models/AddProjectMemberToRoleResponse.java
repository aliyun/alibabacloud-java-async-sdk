// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddProjectMemberToRoleResponse} extends {@link TeaModel}
 *
 * <p>AddProjectMemberToRoleResponse</p>
 */
public class AddProjectMemberToRoleResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AddProjectMemberToRoleResponseBody body;

    private AddProjectMemberToRoleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddProjectMemberToRoleResponse create() {
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
    public AddProjectMemberToRoleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddProjectMemberToRoleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddProjectMemberToRoleResponseBody body);

        @Override
        AddProjectMemberToRoleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddProjectMemberToRoleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AddProjectMemberToRoleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddProjectMemberToRoleResponse response) {
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
        public Builder body(AddProjectMemberToRoleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddProjectMemberToRoleResponse build() {
            return new AddProjectMemberToRoleResponse(this);
        } 

    } 

}

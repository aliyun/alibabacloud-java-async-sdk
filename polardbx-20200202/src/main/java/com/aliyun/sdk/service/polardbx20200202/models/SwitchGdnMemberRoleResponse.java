// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link SwitchGdnMemberRoleResponse} extends {@link TeaModel}
 *
 * <p>SwitchGdnMemberRoleResponse</p>
 */
public class SwitchGdnMemberRoleResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SwitchGdnMemberRoleResponseBody body;

    private SwitchGdnMemberRoleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SwitchGdnMemberRoleResponse create() {
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
    public SwitchGdnMemberRoleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SwitchGdnMemberRoleResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(SwitchGdnMemberRoleResponseBody body);

        @Override
        SwitchGdnMemberRoleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SwitchGdnMemberRoleResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private SwitchGdnMemberRoleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SwitchGdnMemberRoleResponse response) {
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
        public Builder body(SwitchGdnMemberRoleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SwitchGdnMemberRoleResponse build() {
            return new SwitchGdnMemberRoleResponse(this);
        } 

    } 

}

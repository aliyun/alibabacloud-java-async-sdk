// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link ModifySkillGroupOfUserResponse} extends {@link TeaModel}
 *
 * <p>ModifySkillGroupOfUserResponse</p>
 */
public class ModifySkillGroupOfUserResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifySkillGroupOfUserResponseBody body;

    private ModifySkillGroupOfUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifySkillGroupOfUserResponse create() {
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
    public ModifySkillGroupOfUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySkillGroupOfUserResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifySkillGroupOfUserResponseBody body);

        @Override
        ModifySkillGroupOfUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySkillGroupOfUserResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ModifySkillGroupOfUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySkillGroupOfUserResponse response) {
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
        public Builder body(ModifySkillGroupOfUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySkillGroupOfUserResponse build() {
            return new ModifySkillGroupOfUserResponse(this);
        } 

    } 

}

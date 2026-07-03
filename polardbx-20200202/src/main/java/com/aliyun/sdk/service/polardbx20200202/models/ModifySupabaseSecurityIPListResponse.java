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
 * {@link ModifySupabaseSecurityIPListResponse} extends {@link TeaModel}
 *
 * <p>ModifySupabaseSecurityIPListResponse</p>
 */
public class ModifySupabaseSecurityIPListResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifySupabaseSecurityIPListResponseBody body;

    private ModifySupabaseSecurityIPListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifySupabaseSecurityIPListResponse create() {
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
    public ModifySupabaseSecurityIPListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySupabaseSecurityIPListResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifySupabaseSecurityIPListResponseBody body);

        @Override
        ModifySupabaseSecurityIPListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySupabaseSecurityIPListResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ModifySupabaseSecurityIPListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySupabaseSecurityIPListResponse response) {
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
        public Builder body(ModifySupabaseSecurityIPListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySupabaseSecurityIPListResponse build() {
            return new ModifySupabaseSecurityIPListResponse(this);
        } 

    } 

}

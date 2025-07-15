// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link ModifyLiveDomainSchdmByPropertyResponse} extends {@link TeaModel}
 *
 * <p>ModifyLiveDomainSchdmByPropertyResponse</p>
 */
public class ModifyLiveDomainSchdmByPropertyResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyLiveDomainSchdmByPropertyResponseBody body;

    private ModifyLiveDomainSchdmByPropertyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyLiveDomainSchdmByPropertyResponse create() {
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
    public ModifyLiveDomainSchdmByPropertyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyLiveDomainSchdmByPropertyResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyLiveDomainSchdmByPropertyResponseBody body);

        @Override
        ModifyLiveDomainSchdmByPropertyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyLiveDomainSchdmByPropertyResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ModifyLiveDomainSchdmByPropertyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyLiveDomainSchdmByPropertyResponse response) {
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
        public Builder body(ModifyLiveDomainSchdmByPropertyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyLiveDomainSchdmByPropertyResponse build() {
            return new ModifyLiveDomainSchdmByPropertyResponse(this);
        } 

    } 

}

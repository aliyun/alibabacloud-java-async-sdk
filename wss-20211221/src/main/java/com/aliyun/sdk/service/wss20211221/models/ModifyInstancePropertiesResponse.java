// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

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
 * {@link ModifyInstancePropertiesResponse} extends {@link TeaModel}
 *
 * <p>ModifyInstancePropertiesResponse</p>
 */
public class ModifyInstancePropertiesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyInstancePropertiesResponseBody body;

    private ModifyInstancePropertiesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyInstancePropertiesResponse create() {
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
    public ModifyInstancePropertiesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyInstancePropertiesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyInstancePropertiesResponseBody body);

        @Override
        ModifyInstancePropertiesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyInstancePropertiesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ModifyInstancePropertiesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyInstancePropertiesResponse response) {
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
        public Builder body(ModifyInstancePropertiesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyInstancePropertiesResponse build() {
            return new ModifyInstancePropertiesResponse(this);
        } 

    } 

}

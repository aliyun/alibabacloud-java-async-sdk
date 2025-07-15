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
 * {@link ModifyCasterVideoResourceResponse} extends {@link TeaModel}
 *
 * <p>ModifyCasterVideoResourceResponse</p>
 */
public class ModifyCasterVideoResourceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyCasterVideoResourceResponseBody body;

    private ModifyCasterVideoResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyCasterVideoResourceResponse create() {
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
    public ModifyCasterVideoResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyCasterVideoResourceResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyCasterVideoResourceResponseBody body);

        @Override
        ModifyCasterVideoResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyCasterVideoResourceResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ModifyCasterVideoResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyCasterVideoResourceResponse response) {
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
        public Builder body(ModifyCasterVideoResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyCasterVideoResourceResponse build() {
            return new ModifyCasterVideoResourceResponse(this);
        } 

    } 

}

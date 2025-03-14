// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyServerlessAuthToMachineResponse} extends {@link TeaModel}
 *
 * <p>ModifyServerlessAuthToMachineResponse</p>
 */
public class ModifyServerlessAuthToMachineResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyServerlessAuthToMachineResponseBody body;

    private ModifyServerlessAuthToMachineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyServerlessAuthToMachineResponse create() {
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
    public ModifyServerlessAuthToMachineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyServerlessAuthToMachineResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyServerlessAuthToMachineResponseBody body);

        @Override
        ModifyServerlessAuthToMachineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyServerlessAuthToMachineResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ModifyServerlessAuthToMachineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyServerlessAuthToMachineResponse response) {
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
        public Builder body(ModifyServerlessAuthToMachineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyServerlessAuthToMachineResponse build() {
            return new ModifyServerlessAuthToMachineResponse(this);
        } 

    } 

}

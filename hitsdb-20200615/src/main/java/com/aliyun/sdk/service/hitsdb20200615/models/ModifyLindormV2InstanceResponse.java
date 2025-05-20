// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link ModifyLindormV2InstanceResponse} extends {@link TeaModel}
 *
 * <p>ModifyLindormV2InstanceResponse</p>
 */
public class ModifyLindormV2InstanceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyLindormV2InstanceResponseBody body;

    private ModifyLindormV2InstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyLindormV2InstanceResponse create() {
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
    public ModifyLindormV2InstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyLindormV2InstanceResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyLindormV2InstanceResponseBody body);

        @Override
        ModifyLindormV2InstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyLindormV2InstanceResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ModifyLindormV2InstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyLindormV2InstanceResponse response) {
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
        public Builder body(ModifyLindormV2InstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyLindormV2InstanceResponse build() {
            return new ModifyLindormV2InstanceResponse(this);
        } 

    } 

}

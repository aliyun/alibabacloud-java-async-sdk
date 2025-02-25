// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link SetVServerGroupAttributeResponse} extends {@link TeaModel}
 *
 * <p>SetVServerGroupAttributeResponse</p>
 */
public class SetVServerGroupAttributeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SetVServerGroupAttributeResponseBody body;

    private SetVServerGroupAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SetVServerGroupAttributeResponse create() {
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
    public SetVServerGroupAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetVServerGroupAttributeResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(SetVServerGroupAttributeResponseBody body);

        @Override
        SetVServerGroupAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetVServerGroupAttributeResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private SetVServerGroupAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetVServerGroupAttributeResponse response) {
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
        public Builder body(SetVServerGroupAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetVServerGroupAttributeResponse build() {
            return new SetVServerGroupAttributeResponse(this);
        } 

    } 

}

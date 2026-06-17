// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkastreaming20260202.models;

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
 * {@link DeleteComputeInstanceResponse} extends {@link TeaModel}
 *
 * <p>DeleteComputeInstanceResponse</p>
 */
public class DeleteComputeInstanceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteComputeInstanceResponseBody body;

    private DeleteComputeInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteComputeInstanceResponse create() {
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
    public DeleteComputeInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteComputeInstanceResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteComputeInstanceResponseBody body);

        @Override
        DeleteComputeInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteComputeInstanceResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DeleteComputeInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteComputeInstanceResponse response) {
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
        public Builder body(DeleteComputeInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteComputeInstanceResponse build() {
            return new DeleteComputeInstanceResponse(this);
        } 

    } 

}

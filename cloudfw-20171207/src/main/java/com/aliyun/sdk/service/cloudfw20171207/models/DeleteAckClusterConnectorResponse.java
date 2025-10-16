// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DeleteAckClusterConnectorResponse} extends {@link TeaModel}
 *
 * <p>DeleteAckClusterConnectorResponse</p>
 */
public class DeleteAckClusterConnectorResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteAckClusterConnectorResponseBody body;

    private DeleteAckClusterConnectorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteAckClusterConnectorResponse create() {
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
    public DeleteAckClusterConnectorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAckClusterConnectorResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteAckClusterConnectorResponseBody body);

        @Override
        DeleteAckClusterConnectorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAckClusterConnectorResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DeleteAckClusterConnectorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAckClusterConnectorResponse response) {
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
        public Builder body(DeleteAckClusterConnectorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAckClusterConnectorResponse build() {
            return new DeleteAckClusterConnectorResponse(this);
        } 

    } 

}

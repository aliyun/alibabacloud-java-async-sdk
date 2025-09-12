// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link EnableCollectionGraphRAGResponse} extends {@link TeaModel}
 *
 * <p>EnableCollectionGraphRAGResponse</p>
 */
public class EnableCollectionGraphRAGResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private EnableCollectionGraphRAGResponseBody body;

    private EnableCollectionGraphRAGResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static EnableCollectionGraphRAGResponse create() {
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
    public EnableCollectionGraphRAGResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableCollectionGraphRAGResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(EnableCollectionGraphRAGResponseBody body);

        @Override
        EnableCollectionGraphRAGResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableCollectionGraphRAGResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private EnableCollectionGraphRAGResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableCollectionGraphRAGResponse response) {
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
        public Builder body(EnableCollectionGraphRAGResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableCollectionGraphRAGResponse build() {
            return new EnableCollectionGraphRAGResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetMongoDBCurrentOpResponse} extends {@link TeaModel}
 *
 * <p>GetMongoDBCurrentOpResponse</p>
 */
public class GetMongoDBCurrentOpResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetMongoDBCurrentOpResponseBody body;

    private GetMongoDBCurrentOpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetMongoDBCurrentOpResponse create() {
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
    public GetMongoDBCurrentOpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMongoDBCurrentOpResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetMongoDBCurrentOpResponseBody body);

        @Override
        GetMongoDBCurrentOpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMongoDBCurrentOpResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetMongoDBCurrentOpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMongoDBCurrentOpResponse response) {
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
        public Builder body(GetMongoDBCurrentOpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMongoDBCurrentOpResponse build() {
            return new GetMongoDBCurrentOpResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GetRetcodeLogstoreResponse} extends {@link TeaModel}
 *
 * <p>GetRetcodeLogstoreResponse</p>
 */
public class GetRetcodeLogstoreResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetRetcodeLogstoreResponseBody body;

    private GetRetcodeLogstoreResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetRetcodeLogstoreResponse create() {
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
    public GetRetcodeLogstoreResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRetcodeLogstoreResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetRetcodeLogstoreResponseBody body);

        @Override
        GetRetcodeLogstoreResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRetcodeLogstoreResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetRetcodeLogstoreResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRetcodeLogstoreResponse response) {
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
        public Builder body(GetRetcodeLogstoreResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRetcodeLogstoreResponse build() {
            return new GetRetcodeLogstoreResponse(this);
        } 

    } 

}

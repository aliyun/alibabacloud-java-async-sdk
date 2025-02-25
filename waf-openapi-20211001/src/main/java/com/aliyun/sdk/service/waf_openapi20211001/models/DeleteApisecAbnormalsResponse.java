// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DeleteApisecAbnormalsResponse} extends {@link TeaModel}
 *
 * <p>DeleteApisecAbnormalsResponse</p>
 */
public class DeleteApisecAbnormalsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteApisecAbnormalsResponseBody body;

    private DeleteApisecAbnormalsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteApisecAbnormalsResponse create() {
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
    public DeleteApisecAbnormalsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteApisecAbnormalsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteApisecAbnormalsResponseBody body);

        @Override
        DeleteApisecAbnormalsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteApisecAbnormalsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DeleteApisecAbnormalsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteApisecAbnormalsResponse response) {
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
        public Builder body(DeleteApisecAbnormalsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteApisecAbnormalsResponse build() {
            return new DeleteApisecAbnormalsResponse(this);
        } 

    } 

}

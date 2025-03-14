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
 * {@link DeleteSearchConditionResponse} extends {@link TeaModel}
 *
 * <p>DeleteSearchConditionResponse</p>
 */
public class DeleteSearchConditionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteSearchConditionResponseBody body;

    private DeleteSearchConditionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteSearchConditionResponse create() {
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
    public DeleteSearchConditionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSearchConditionResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteSearchConditionResponseBody body);

        @Override
        DeleteSearchConditionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSearchConditionResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DeleteSearchConditionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSearchConditionResponse response) {
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
        public Builder body(DeleteSearchConditionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSearchConditionResponse build() {
            return new DeleteSearchConditionResponse(this);
        } 

    } 

}

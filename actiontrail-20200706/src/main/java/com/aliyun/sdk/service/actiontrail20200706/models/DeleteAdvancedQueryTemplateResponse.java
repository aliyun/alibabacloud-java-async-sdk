// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link DeleteAdvancedQueryTemplateResponse} extends {@link TeaModel}
 *
 * <p>DeleteAdvancedQueryTemplateResponse</p>
 */
public class DeleteAdvancedQueryTemplateResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteAdvancedQueryTemplateResponseBody body;

    private DeleteAdvancedQueryTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteAdvancedQueryTemplateResponse create() {
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
    public DeleteAdvancedQueryTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAdvancedQueryTemplateResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteAdvancedQueryTemplateResponseBody body);

        @Override
        DeleteAdvancedQueryTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAdvancedQueryTemplateResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DeleteAdvancedQueryTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAdvancedQueryTemplateResponse response) {
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
        public Builder body(DeleteAdvancedQueryTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAdvancedQueryTemplateResponse build() {
            return new DeleteAdvancedQueryTemplateResponse(this);
        } 

    } 

}

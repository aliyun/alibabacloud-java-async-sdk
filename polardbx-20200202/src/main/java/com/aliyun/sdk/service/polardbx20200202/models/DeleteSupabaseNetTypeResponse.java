// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DeleteSupabaseNetTypeResponse} extends {@link TeaModel}
 *
 * <p>DeleteSupabaseNetTypeResponse</p>
 */
public class DeleteSupabaseNetTypeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteSupabaseNetTypeResponseBody body;

    private DeleteSupabaseNetTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteSupabaseNetTypeResponse create() {
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
    public DeleteSupabaseNetTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSupabaseNetTypeResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteSupabaseNetTypeResponseBody body);

        @Override
        DeleteSupabaseNetTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSupabaseNetTypeResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DeleteSupabaseNetTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSupabaseNetTypeResponse response) {
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
        public Builder body(DeleteSupabaseNetTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSupabaseNetTypeResponse build() {
            return new DeleteSupabaseNetTypeResponse(this);
        } 

    } 

}

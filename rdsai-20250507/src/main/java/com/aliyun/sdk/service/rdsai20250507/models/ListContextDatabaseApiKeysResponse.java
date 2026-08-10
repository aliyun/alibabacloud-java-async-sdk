// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ListContextDatabaseApiKeysResponse} extends {@link TeaModel}
 *
 * <p>ListContextDatabaseApiKeysResponse</p>
 */
public class ListContextDatabaseApiKeysResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListContextDatabaseApiKeysResponseBody body;

    private ListContextDatabaseApiKeysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListContextDatabaseApiKeysResponse create() {
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
    public ListContextDatabaseApiKeysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListContextDatabaseApiKeysResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListContextDatabaseApiKeysResponseBody body);

        @Override
        ListContextDatabaseApiKeysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListContextDatabaseApiKeysResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListContextDatabaseApiKeysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListContextDatabaseApiKeysResponse response) {
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
        public Builder body(ListContextDatabaseApiKeysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListContextDatabaseApiKeysResponse build() {
            return new ListContextDatabaseApiKeysResponse(this);
        } 

    } 

}

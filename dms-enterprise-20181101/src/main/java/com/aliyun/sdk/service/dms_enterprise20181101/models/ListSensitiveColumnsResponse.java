// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListSensitiveColumnsResponse} extends {@link TeaModel}
 *
 * <p>ListSensitiveColumnsResponse</p>
 */
public class ListSensitiveColumnsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListSensitiveColumnsResponseBody body;

    private ListSensitiveColumnsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListSensitiveColumnsResponse create() {
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
    public ListSensitiveColumnsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSensitiveColumnsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListSensitiveColumnsResponseBody body);

        @Override
        ListSensitiveColumnsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSensitiveColumnsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListSensitiveColumnsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSensitiveColumnsResponse response) {
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
        public Builder body(ListSensitiveColumnsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSensitiveColumnsResponse build() {
            return new ListSensitiveColumnsResponse(this);
        } 

    } 

}

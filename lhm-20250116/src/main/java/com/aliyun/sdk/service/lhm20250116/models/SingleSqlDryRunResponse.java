// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link SingleSqlDryRunResponse} extends {@link TeaModel}
 *
 * <p>SingleSqlDryRunResponse</p>
 */
public class SingleSqlDryRunResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SingleSqlDryRunResponseBody body;

    private SingleSqlDryRunResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SingleSqlDryRunResponse create() {
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
    public SingleSqlDryRunResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SingleSqlDryRunResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(SingleSqlDryRunResponseBody body);

        @Override
        SingleSqlDryRunResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SingleSqlDryRunResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private SingleSqlDryRunResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SingleSqlDryRunResponse response) {
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
        public Builder body(SingleSqlDryRunResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SingleSqlDryRunResponse build() {
            return new SingleSqlDryRunResponse(this);
        } 

    } 

}

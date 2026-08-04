// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link IncrByCacheOperateSyncResponse} extends {@link TeaModel}
 *
 * <p>IncrByCacheOperateSyncResponse</p>
 */
public class IncrByCacheOperateSyncResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private IncrByCacheOperateSyncResponseBody body;

    private IncrByCacheOperateSyncResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static IncrByCacheOperateSyncResponse create() {
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
    public IncrByCacheOperateSyncResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<IncrByCacheOperateSyncResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(IncrByCacheOperateSyncResponseBody body);

        @Override
        IncrByCacheOperateSyncResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<IncrByCacheOperateSyncResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private IncrByCacheOperateSyncResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(IncrByCacheOperateSyncResponse response) {
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
        public Builder body(IncrByCacheOperateSyncResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public IncrByCacheOperateSyncResponse build() {
            return new IncrByCacheOperateSyncResponse(this);
        } 

    } 

}

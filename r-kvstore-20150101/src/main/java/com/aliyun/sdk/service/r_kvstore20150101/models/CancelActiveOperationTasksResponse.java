// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link CancelActiveOperationTasksResponse} extends {@link TeaModel}
 *
 * <p>CancelActiveOperationTasksResponse</p>
 */
public class CancelActiveOperationTasksResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CancelActiveOperationTasksResponseBody body;

    private CancelActiveOperationTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CancelActiveOperationTasksResponse create() {
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
    public CancelActiveOperationTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelActiveOperationTasksResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CancelActiveOperationTasksResponseBody body);

        @Override
        CancelActiveOperationTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelActiveOperationTasksResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CancelActiveOperationTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelActiveOperationTasksResponse response) {
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
        public Builder body(CancelActiveOperationTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelActiveOperationTasksResponse build() {
            return new CancelActiveOperationTasksResponse(this);
        } 

    } 

}

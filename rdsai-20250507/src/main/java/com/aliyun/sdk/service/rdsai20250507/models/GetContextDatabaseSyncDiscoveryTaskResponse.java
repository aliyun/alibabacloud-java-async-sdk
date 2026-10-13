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
 * {@link GetContextDatabaseSyncDiscoveryTaskResponse} extends {@link TeaModel}
 *
 * <p>GetContextDatabaseSyncDiscoveryTaskResponse</p>
 */
public class GetContextDatabaseSyncDiscoveryTaskResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetContextDatabaseSyncDiscoveryTaskResponseBody body;

    private GetContextDatabaseSyncDiscoveryTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetContextDatabaseSyncDiscoveryTaskResponse create() {
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
    public GetContextDatabaseSyncDiscoveryTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetContextDatabaseSyncDiscoveryTaskResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetContextDatabaseSyncDiscoveryTaskResponseBody body);

        @Override
        GetContextDatabaseSyncDiscoveryTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetContextDatabaseSyncDiscoveryTaskResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetContextDatabaseSyncDiscoveryTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetContextDatabaseSyncDiscoveryTaskResponse response) {
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
        public Builder body(GetContextDatabaseSyncDiscoveryTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetContextDatabaseSyncDiscoveryTaskResponse build() {
            return new GetContextDatabaseSyncDiscoveryTaskResponse(this);
        } 

    } 

}

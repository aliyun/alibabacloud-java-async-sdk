// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkastreaming20260202.models;

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
 * {@link UpdateComputeJobDraftSqlResponse} extends {@link TeaModel}
 *
 * <p>UpdateComputeJobDraftSqlResponse</p>
 */
public class UpdateComputeJobDraftSqlResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateComputeJobDraftSqlResponseBody body;

    private UpdateComputeJobDraftSqlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateComputeJobDraftSqlResponse create() {
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
    public UpdateComputeJobDraftSqlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateComputeJobDraftSqlResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateComputeJobDraftSqlResponseBody body);

        @Override
        UpdateComputeJobDraftSqlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateComputeJobDraftSqlResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private UpdateComputeJobDraftSqlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateComputeJobDraftSqlResponse response) {
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
        public Builder body(UpdateComputeJobDraftSqlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateComputeJobDraftSqlResponse build() {
            return new UpdateComputeJobDraftSqlResponse(this);
        } 

    } 

}

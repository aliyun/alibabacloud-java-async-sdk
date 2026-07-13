// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link GetTaskStatsSummaryResponse} extends {@link TeaModel}
 *
 * <p>GetTaskStatsSummaryResponse</p>
 */
public class GetTaskStatsSummaryResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetTaskStatsSummaryResponseBody body;

    private GetTaskStatsSummaryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetTaskStatsSummaryResponse create() {
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
    public GetTaskStatsSummaryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTaskStatsSummaryResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetTaskStatsSummaryResponseBody body);

        @Override
        GetTaskStatsSummaryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTaskStatsSummaryResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetTaskStatsSummaryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTaskStatsSummaryResponse response) {
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
        public Builder body(GetTaskStatsSummaryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTaskStatsSummaryResponse build() {
            return new GetTaskStatsSummaryResponse(this);
        } 

    } 

}

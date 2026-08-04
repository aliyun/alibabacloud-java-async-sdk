// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterGetMemberBalanceLogsResponse} extends {@link TeaModel}
 *
 * <p>ModelRouterGetMemberBalanceLogsResponse</p>
 */
public class ModelRouterGetMemberBalanceLogsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModelRouterGetMemberBalanceLogsResponseBody body;

    private ModelRouterGetMemberBalanceLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModelRouterGetMemberBalanceLogsResponse create() {
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
    public ModelRouterGetMemberBalanceLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModelRouterGetMemberBalanceLogsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModelRouterGetMemberBalanceLogsResponseBody body);

        @Override
        ModelRouterGetMemberBalanceLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModelRouterGetMemberBalanceLogsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ModelRouterGetMemberBalanceLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModelRouterGetMemberBalanceLogsResponse response) {
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
        public Builder body(ModelRouterGetMemberBalanceLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModelRouterGetMemberBalanceLogsResponse build() {
            return new ModelRouterGetMemberBalanceLogsResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link GetDisasterRecoveryItemResponse} extends {@link TeaModel}
 *
 * <p>GetDisasterRecoveryItemResponse</p>
 */
public class GetDisasterRecoveryItemResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetDisasterRecoveryItemResponseBody body;

    private GetDisasterRecoveryItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetDisasterRecoveryItemResponse create() {
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
    public GetDisasterRecoveryItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDisasterRecoveryItemResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetDisasterRecoveryItemResponseBody body);

        @Override
        GetDisasterRecoveryItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDisasterRecoveryItemResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetDisasterRecoveryItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDisasterRecoveryItemResponse response) {
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
        public Builder body(GetDisasterRecoveryItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDisasterRecoveryItemResponse build() {
            return new GetDisasterRecoveryItemResponse(this);
        } 

    } 

}

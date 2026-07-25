// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link GetYikeJobCreditResponse} extends {@link TeaModel}
 *
 * <p>GetYikeJobCreditResponse</p>
 */
public class GetYikeJobCreditResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetYikeJobCreditResponseBody body;

    private GetYikeJobCreditResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetYikeJobCreditResponse create() {
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
    public GetYikeJobCreditResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetYikeJobCreditResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetYikeJobCreditResponseBody body);

        @Override
        GetYikeJobCreditResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetYikeJobCreditResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetYikeJobCreditResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetYikeJobCreditResponse response) {
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
        public Builder body(GetYikeJobCreditResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetYikeJobCreditResponse build() {
            return new GetYikeJobCreditResponse(this);
        } 

    } 

}

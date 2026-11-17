// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qweneduaisuite20261102.models;

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
 * {@link GetQwenEduApiActivationStatusResponse} extends {@link TeaModel}
 *
 * <p>GetQwenEduApiActivationStatusResponse</p>
 */
public class GetQwenEduApiActivationStatusResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetQwenEduApiActivationStatusResponseBody body;

    private GetQwenEduApiActivationStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetQwenEduApiActivationStatusResponse create() {
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
    public GetQwenEduApiActivationStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetQwenEduApiActivationStatusResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetQwenEduApiActivationStatusResponseBody body);

        @Override
        GetQwenEduApiActivationStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetQwenEduApiActivationStatusResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetQwenEduApiActivationStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetQwenEduApiActivationStatusResponse response) {
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
        public Builder body(GetQwenEduApiActivationStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetQwenEduApiActivationStatusResponse build() {
            return new GetQwenEduApiActivationStatusResponse(this);
        } 

    } 

}

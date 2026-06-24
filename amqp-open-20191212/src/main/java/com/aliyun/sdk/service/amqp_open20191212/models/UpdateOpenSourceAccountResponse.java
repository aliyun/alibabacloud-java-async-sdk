// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

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
 * {@link UpdateOpenSourceAccountResponse} extends {@link TeaModel}
 *
 * <p>UpdateOpenSourceAccountResponse</p>
 */
public class UpdateOpenSourceAccountResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateOpenSourceAccountResponseBody body;

    private UpdateOpenSourceAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateOpenSourceAccountResponse create() {
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
    public UpdateOpenSourceAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateOpenSourceAccountResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateOpenSourceAccountResponseBody body);

        @Override
        UpdateOpenSourceAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateOpenSourceAccountResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private UpdateOpenSourceAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateOpenSourceAccountResponse response) {
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
        public Builder body(UpdateOpenSourceAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateOpenSourceAccountResponse build() {
            return new UpdateOpenSourceAccountResponse(this);
        } 

    } 

}

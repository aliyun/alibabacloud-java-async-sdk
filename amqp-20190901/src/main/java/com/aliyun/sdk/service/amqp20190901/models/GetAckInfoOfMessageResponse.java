// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

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
 * {@link GetAckInfoOfMessageResponse} extends {@link TeaModel}
 *
 * <p>GetAckInfoOfMessageResponse</p>
 */
public class GetAckInfoOfMessageResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetAckInfoOfMessageResponseBody body;

    private GetAckInfoOfMessageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetAckInfoOfMessageResponse create() {
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
    public GetAckInfoOfMessageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAckInfoOfMessageResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetAckInfoOfMessageResponseBody body);

        @Override
        GetAckInfoOfMessageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAckInfoOfMessageResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetAckInfoOfMessageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAckInfoOfMessageResponse response) {
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
        public Builder body(GetAckInfoOfMessageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAckInfoOfMessageResponse build() {
            return new GetAckInfoOfMessageResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link GetTensorboardSharedUrlResponse} extends {@link TeaModel}
 *
 * <p>GetTensorboardSharedUrlResponse</p>
 */
public class GetTensorboardSharedUrlResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetTensorboardSharedUrlResponseBody body;

    private GetTensorboardSharedUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetTensorboardSharedUrlResponse create() {
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
    public GetTensorboardSharedUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTensorboardSharedUrlResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetTensorboardSharedUrlResponseBody body);

        @Override
        GetTensorboardSharedUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTensorboardSharedUrlResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetTensorboardSharedUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTensorboardSharedUrlResponse response) {
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
        public Builder body(GetTensorboardSharedUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTensorboardSharedUrlResponse build() {
            return new GetTensorboardSharedUrlResponse(this);
        } 

    } 

}

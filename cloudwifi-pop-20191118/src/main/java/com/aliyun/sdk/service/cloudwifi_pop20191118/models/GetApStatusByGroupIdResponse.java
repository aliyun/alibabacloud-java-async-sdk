// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudwifi_pop20191118.models;

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
 * {@link GetApStatusByGroupIdResponse} extends {@link TeaModel}
 *
 * <p>GetApStatusByGroupIdResponse</p>
 */
public class GetApStatusByGroupIdResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetApStatusByGroupIdResponseBody body;

    private GetApStatusByGroupIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetApStatusByGroupIdResponse create() {
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
    public GetApStatusByGroupIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetApStatusByGroupIdResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetApStatusByGroupIdResponseBody body);

        @Override
        GetApStatusByGroupIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetApStatusByGroupIdResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetApStatusByGroupIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetApStatusByGroupIdResponse response) {
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
        public Builder body(GetApStatusByGroupIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetApStatusByGroupIdResponse build() {
            return new GetApStatusByGroupIdResponse(this);
        } 

    } 

}

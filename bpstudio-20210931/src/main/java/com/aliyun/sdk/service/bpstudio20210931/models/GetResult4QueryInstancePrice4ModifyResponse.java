// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

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
 * {@link GetResult4QueryInstancePrice4ModifyResponse} extends {@link TeaModel}
 *
 * <p>GetResult4QueryInstancePrice4ModifyResponse</p>
 */
public class GetResult4QueryInstancePrice4ModifyResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetResult4QueryInstancePrice4ModifyResponseBody body;

    private GetResult4QueryInstancePrice4ModifyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetResult4QueryInstancePrice4ModifyResponse create() {
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
    public GetResult4QueryInstancePrice4ModifyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResult4QueryInstancePrice4ModifyResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetResult4QueryInstancePrice4ModifyResponseBody body);

        @Override
        GetResult4QueryInstancePrice4ModifyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResult4QueryInstancePrice4ModifyResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetResult4QueryInstancePrice4ModifyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResult4QueryInstancePrice4ModifyResponse response) {
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
        public Builder body(GetResult4QueryInstancePrice4ModifyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResult4QueryInstancePrice4ModifyResponse build() {
            return new GetResult4QueryInstancePrice4ModifyResponse(this);
        } 

    } 

}

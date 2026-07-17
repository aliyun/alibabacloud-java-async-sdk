// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link GetComputeEngineJobLogResponse} extends {@link TeaModel}
 *
 * <p>GetComputeEngineJobLogResponse</p>
 */
public class GetComputeEngineJobLogResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetComputeEngineJobLogResponseBody body;

    private GetComputeEngineJobLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetComputeEngineJobLogResponse create() {
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
    public GetComputeEngineJobLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetComputeEngineJobLogResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetComputeEngineJobLogResponseBody body);

        @Override
        GetComputeEngineJobLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetComputeEngineJobLogResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetComputeEngineJobLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetComputeEngineJobLogResponse response) {
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
        public Builder body(GetComputeEngineJobLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetComputeEngineJobLogResponse build() {
            return new GetComputeEngineJobLogResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link BatchDeployHttpApiRoutesResponse} extends {@link TeaModel}
 *
 * <p>BatchDeployHttpApiRoutesResponse</p>
 */
public class BatchDeployHttpApiRoutesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private BatchDeployHttpApiRoutesResponseBody body;

    private BatchDeployHttpApiRoutesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static BatchDeployHttpApiRoutesResponse create() {
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
    public BatchDeployHttpApiRoutesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchDeployHttpApiRoutesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(BatchDeployHttpApiRoutesResponseBody body);

        @Override
        BatchDeployHttpApiRoutesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchDeployHttpApiRoutesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private BatchDeployHttpApiRoutesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchDeployHttpApiRoutesResponse response) {
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
        public Builder body(BatchDeployHttpApiRoutesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchDeployHttpApiRoutesResponse build() {
            return new BatchDeployHttpApiRoutesResponse(this);
        } 

    } 

}

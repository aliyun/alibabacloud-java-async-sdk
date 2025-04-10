// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

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
 * {@link ModelOutputContentAsyncDetectResponse} extends {@link TeaModel}
 *
 * <p>ModelOutputContentAsyncDetectResponse</p>
 */
public class ModelOutputContentAsyncDetectResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModelOutputContentAsyncDetectResponseBody body;

    private ModelOutputContentAsyncDetectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModelOutputContentAsyncDetectResponse create() {
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
    public ModelOutputContentAsyncDetectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModelOutputContentAsyncDetectResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModelOutputContentAsyncDetectResponseBody body);

        @Override
        ModelOutputContentAsyncDetectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModelOutputContentAsyncDetectResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ModelOutputContentAsyncDetectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModelOutputContentAsyncDetectResponse response) {
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
        public Builder body(ModelOutputContentAsyncDetectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModelOutputContentAsyncDetectResponse build() {
            return new ModelOutputContentAsyncDetectResponse(this);
        } 

    } 

}

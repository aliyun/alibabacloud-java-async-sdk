// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aideepsign20260511.models;

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
 * {@link CreateImageIncomeTaxDetectionTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateImageIncomeTaxDetectionTaskResponse</p>
 */
public class CreateImageIncomeTaxDetectionTaskResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateImageIncomeTaxDetectionTaskResponseBody body;

    private CreateImageIncomeTaxDetectionTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateImageIncomeTaxDetectionTaskResponse create() {
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
    public CreateImageIncomeTaxDetectionTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateImageIncomeTaxDetectionTaskResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateImageIncomeTaxDetectionTaskResponseBody body);

        @Override
        CreateImageIncomeTaxDetectionTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateImageIncomeTaxDetectionTaskResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreateImageIncomeTaxDetectionTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateImageIncomeTaxDetectionTaskResponse response) {
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
        public Builder body(CreateImageIncomeTaxDetectionTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateImageIncomeTaxDetectionTaskResponse build() {
            return new CreateImageIncomeTaxDetectionTaskResponse(this);
        } 

    } 

}

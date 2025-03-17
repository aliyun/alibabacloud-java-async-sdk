// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link CreateDataLakeFunctionResponse} extends {@link TeaModel}
 *
 * <p>CreateDataLakeFunctionResponse</p>
 */
public class CreateDataLakeFunctionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateDataLakeFunctionResponseBody body;

    private CreateDataLakeFunctionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateDataLakeFunctionResponse create() {
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
    public CreateDataLakeFunctionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDataLakeFunctionResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateDataLakeFunctionResponseBody body);

        @Override
        CreateDataLakeFunctionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDataLakeFunctionResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreateDataLakeFunctionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDataLakeFunctionResponse response) {
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
        public Builder body(CreateDataLakeFunctionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDataLakeFunctionResponse build() {
            return new CreateDataLakeFunctionResponse(this);
        } 

    } 

}

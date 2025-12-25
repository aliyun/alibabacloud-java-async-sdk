// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreateDigitalEmployeeResponse} extends {@link TeaModel}
 *
 * <p>CreateDigitalEmployeeResponse</p>
 */
public class CreateDigitalEmployeeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateDigitalEmployeeResponseBody body;

    private CreateDigitalEmployeeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateDigitalEmployeeResponse create() {
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
    public CreateDigitalEmployeeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDigitalEmployeeResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateDigitalEmployeeResponseBody body);

        @Override
        CreateDigitalEmployeeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDigitalEmployeeResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreateDigitalEmployeeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDigitalEmployeeResponse response) {
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
        public Builder body(CreateDigitalEmployeeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDigitalEmployeeResponse build() {
            return new CreateDigitalEmployeeResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link CreateCloudPhoneNodeResponse} extends {@link TeaModel}
 *
 * <p>CreateCloudPhoneNodeResponse</p>
 */
public class CreateCloudPhoneNodeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateCloudPhoneNodeResponseBody body;

    private CreateCloudPhoneNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateCloudPhoneNodeResponse create() {
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
    public CreateCloudPhoneNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCloudPhoneNodeResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateCloudPhoneNodeResponseBody body);

        @Override
        CreateCloudPhoneNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCloudPhoneNodeResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreateCloudPhoneNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCloudPhoneNodeResponse response) {
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
        public Builder body(CreateCloudPhoneNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCloudPhoneNodeResponse build() {
            return new CreateCloudPhoneNodeResponse(this);
        } 

    } 

}

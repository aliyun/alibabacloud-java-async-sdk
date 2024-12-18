// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CreateIPv6TranslatorAclListResponse} extends {@link TeaModel}
 *
 * <p>CreateIPv6TranslatorAclListResponse</p>
 */
public class CreateIPv6TranslatorAclListResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateIPv6TranslatorAclListResponseBody body;

    private CreateIPv6TranslatorAclListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateIPv6TranslatorAclListResponse create() {
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
    public CreateIPv6TranslatorAclListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateIPv6TranslatorAclListResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateIPv6TranslatorAclListResponseBody body);

        @Override
        CreateIPv6TranslatorAclListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateIPv6TranslatorAclListResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreateIPv6TranslatorAclListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateIPv6TranslatorAclListResponse response) {
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
        public Builder body(CreateIPv6TranslatorAclListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateIPv6TranslatorAclListResponse build() {
            return new CreateIPv6TranslatorAclListResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

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
 * {@link AddressVerifyV2IntlResponse} extends {@link TeaModel}
 *
 * <p>AddressVerifyV2IntlResponse</p>
 */
public class AddressVerifyV2IntlResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AddressVerifyV2IntlResponseBody body;

    private AddressVerifyV2IntlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddressVerifyV2IntlResponse create() {
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
    public AddressVerifyV2IntlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddressVerifyV2IntlResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddressVerifyV2IntlResponseBody body);

        @Override
        AddressVerifyV2IntlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddressVerifyV2IntlResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private AddressVerifyV2IntlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddressVerifyV2IntlResponse response) {
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
        public Builder body(AddressVerifyV2IntlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddressVerifyV2IntlResponse build() {
            return new AddressVerifyV2IntlResponse(this);
        } 

    } 

}

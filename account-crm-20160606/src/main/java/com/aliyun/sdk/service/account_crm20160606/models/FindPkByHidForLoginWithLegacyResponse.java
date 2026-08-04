// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link FindPkByHidForLoginWithLegacyResponse} extends {@link TeaModel}
 *
 * <p>FindPkByHidForLoginWithLegacyResponse</p>
 */
public class FindPkByHidForLoginWithLegacyResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private FindPkByHidForLoginWithLegacyResponseBody body;

    private FindPkByHidForLoginWithLegacyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static FindPkByHidForLoginWithLegacyResponse create() {
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
    public FindPkByHidForLoginWithLegacyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FindPkByHidForLoginWithLegacyResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(FindPkByHidForLoginWithLegacyResponseBody body);

        @Override
        FindPkByHidForLoginWithLegacyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FindPkByHidForLoginWithLegacyResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private FindPkByHidForLoginWithLegacyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FindPkByHidForLoginWithLegacyResponse response) {
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
        public Builder body(FindPkByHidForLoginWithLegacyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FindPkByHidForLoginWithLegacyResponse build() {
            return new FindPkByHidForLoginWithLegacyResponse(this);
        } 

    } 

}

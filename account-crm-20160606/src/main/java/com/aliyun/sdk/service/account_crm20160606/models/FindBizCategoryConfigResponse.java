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
 * {@link FindBizCategoryConfigResponse} extends {@link TeaModel}
 *
 * <p>FindBizCategoryConfigResponse</p>
 */
public class FindBizCategoryConfigResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private FindBizCategoryConfigResponseBody body;

    private FindBizCategoryConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static FindBizCategoryConfigResponse create() {
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
    public FindBizCategoryConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FindBizCategoryConfigResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(FindBizCategoryConfigResponseBody body);

        @Override
        FindBizCategoryConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FindBizCategoryConfigResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private FindBizCategoryConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FindBizCategoryConfigResponse response) {
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
        public Builder body(FindBizCategoryConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FindBizCategoryConfigResponse build() {
            return new FindBizCategoryConfigResponse(this);
        } 

    } 

}

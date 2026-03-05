// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.unimkt20181212.models;

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
 * {@link ListUnionMediaIndustryResponse} extends {@link TeaModel}
 *
 * <p>ListUnionMediaIndustryResponse</p>
 */
public class ListUnionMediaIndustryResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListUnionMediaIndustryResponseBody body;

    private ListUnionMediaIndustryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListUnionMediaIndustryResponse create() {
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
    public ListUnionMediaIndustryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUnionMediaIndustryResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListUnionMediaIndustryResponseBody body);

        @Override
        ListUnionMediaIndustryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUnionMediaIndustryResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListUnionMediaIndustryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUnionMediaIndustryResponse response) {
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
        public Builder body(ListUnionMediaIndustryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUnionMediaIndustryResponse build() {
            return new ListUnionMediaIndustryResponse(this);
        } 

    } 

}

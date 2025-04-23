// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link ListCloudGtmAddressPoolsResponse} extends {@link TeaModel}
 *
 * <p>ListCloudGtmAddressPoolsResponse</p>
 */
public class ListCloudGtmAddressPoolsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListCloudGtmAddressPoolsResponseBody body;

    private ListCloudGtmAddressPoolsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListCloudGtmAddressPoolsResponse create() {
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
    public ListCloudGtmAddressPoolsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCloudGtmAddressPoolsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListCloudGtmAddressPoolsResponseBody body);

        @Override
        ListCloudGtmAddressPoolsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCloudGtmAddressPoolsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListCloudGtmAddressPoolsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCloudGtmAddressPoolsResponse response) {
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
        public Builder body(ListCloudGtmAddressPoolsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCloudGtmAddressPoolsResponse build() {
            return new ListCloudGtmAddressPoolsResponse(this);
        } 

    } 

}

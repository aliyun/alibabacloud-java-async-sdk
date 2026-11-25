// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListDeviceBelongIdentifiersResponse} extends {@link TeaModel}
 *
 * <p>ListDeviceBelongIdentifiersResponse</p>
 */
public class ListDeviceBelongIdentifiersResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListDeviceBelongIdentifiersResponseBody body;

    private ListDeviceBelongIdentifiersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListDeviceBelongIdentifiersResponse create() {
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
    public ListDeviceBelongIdentifiersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDeviceBelongIdentifiersResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListDeviceBelongIdentifiersResponseBody body);

        @Override
        ListDeviceBelongIdentifiersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDeviceBelongIdentifiersResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListDeviceBelongIdentifiersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDeviceBelongIdentifiersResponse response) {
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
        public Builder body(ListDeviceBelongIdentifiersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDeviceBelongIdentifiersResponse build() {
            return new ListDeviceBelongIdentifiersResponse(this);
        } 

    } 

}

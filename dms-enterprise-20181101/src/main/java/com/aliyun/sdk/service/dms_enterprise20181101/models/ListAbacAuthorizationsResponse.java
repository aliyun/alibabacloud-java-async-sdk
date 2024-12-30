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
 * {@link ListAbacAuthorizationsResponse} extends {@link TeaModel}
 *
 * <p>ListAbacAuthorizationsResponse</p>
 */
public class ListAbacAuthorizationsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListAbacAuthorizationsResponseBody body;

    private ListAbacAuthorizationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListAbacAuthorizationsResponse create() {
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
    public ListAbacAuthorizationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAbacAuthorizationsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListAbacAuthorizationsResponseBody body);

        @Override
        ListAbacAuthorizationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAbacAuthorizationsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListAbacAuthorizationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAbacAuthorizationsResponse response) {
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
        public Builder body(ListAbacAuthorizationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAbacAuthorizationsResponse build() {
            return new ListAbacAuthorizationsResponse(this);
        } 

    } 

}

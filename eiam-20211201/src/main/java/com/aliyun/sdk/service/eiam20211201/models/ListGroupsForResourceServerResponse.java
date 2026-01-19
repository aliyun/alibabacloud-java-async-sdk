// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListGroupsForResourceServerResponse} extends {@link TeaModel}
 *
 * <p>ListGroupsForResourceServerResponse</p>
 */
public class ListGroupsForResourceServerResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListGroupsForResourceServerResponseBody body;

    private ListGroupsForResourceServerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListGroupsForResourceServerResponse create() {
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
    public ListGroupsForResourceServerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListGroupsForResourceServerResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListGroupsForResourceServerResponseBody body);

        @Override
        ListGroupsForResourceServerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListGroupsForResourceServerResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListGroupsForResourceServerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListGroupsForResourceServerResponse response) {
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
        public Builder body(ListGroupsForResourceServerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListGroupsForResourceServerResponse build() {
            return new ListGroupsForResourceServerResponse(this);
        } 

    } 

}

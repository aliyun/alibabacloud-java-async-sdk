// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link ListYikeWorkspacesResponse} extends {@link TeaModel}
 *
 * <p>ListYikeWorkspacesResponse</p>
 */
public class ListYikeWorkspacesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListYikeWorkspacesResponseBody body;

    private ListYikeWorkspacesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListYikeWorkspacesResponse create() {
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
    public ListYikeWorkspacesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListYikeWorkspacesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListYikeWorkspacesResponseBody body);

        @Override
        ListYikeWorkspacesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListYikeWorkspacesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListYikeWorkspacesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListYikeWorkspacesResponse response) {
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
        public Builder body(ListYikeWorkspacesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListYikeWorkspacesResponse build() {
            return new ListYikeWorkspacesResponse(this);
        } 

    } 

}

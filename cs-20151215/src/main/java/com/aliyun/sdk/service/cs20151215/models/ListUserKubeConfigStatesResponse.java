// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link ListUserKubeConfigStatesResponse} extends {@link TeaModel}
 *
 * <p>ListUserKubeConfigStatesResponse</p>
 */
public class ListUserKubeConfigStatesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListUserKubeConfigStatesResponseBody body;

    private ListUserKubeConfigStatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListUserKubeConfigStatesResponse create() {
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
    public ListUserKubeConfigStatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUserKubeConfigStatesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListUserKubeConfigStatesResponseBody body);

        @Override
        ListUserKubeConfigStatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUserKubeConfigStatesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListUserKubeConfigStatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUserKubeConfigStatesResponse response) {
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
        public Builder body(ListUserKubeConfigStatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUserKubeConfigStatesResponse build() {
            return new ListUserKubeConfigStatesResponse(this);
        } 

    } 

}

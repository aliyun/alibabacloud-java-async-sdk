// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListK8sClusterSourcesResponse} extends {@link TeaModel}
 *
 * <p>ListK8sClusterSourcesResponse</p>
 */
public class ListK8sClusterSourcesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListK8sClusterSourcesResponseBody body;

    private ListK8sClusterSourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListK8sClusterSourcesResponse create() {
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
    public ListK8sClusterSourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListK8sClusterSourcesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListK8sClusterSourcesResponseBody body);

        @Override
        ListK8sClusterSourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListK8sClusterSourcesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListK8sClusterSourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListK8sClusterSourcesResponse response) {
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
        public Builder body(ListK8sClusterSourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListK8sClusterSourcesResponse build() {
            return new ListK8sClusterSourcesResponse(this);
        } 

    } 

}

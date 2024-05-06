// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterServiceConfigHistoryResponse} extends {@link TeaModel}
 *
 * <p>ListClusterServiceConfigHistoryResponse</p>
 */
public class ListClusterServiceConfigHistoryResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListClusterServiceConfigHistoryResponseBody body;

    private ListClusterServiceConfigHistoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListClusterServiceConfigHistoryResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
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
    public ListClusterServiceConfigHistoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClusterServiceConfigHistoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListClusterServiceConfigHistoryResponseBody body);

        @Override
        ListClusterServiceConfigHistoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClusterServiceConfigHistoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListClusterServiceConfigHistoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClusterServiceConfigHistoryResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
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
        public Builder body(ListClusterServiceConfigHistoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClusterServiceConfigHistoryResponse build() {
            return new ListClusterServiceConfigHistoryResponse(this);
        } 

    } 

}

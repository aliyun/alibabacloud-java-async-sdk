// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListClusterPluginInfoResponse} extends {@link TeaModel}
 *
 * <p>ListClusterPluginInfoResponse</p>
 */
public class ListClusterPluginInfoResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListClusterPluginInfoResponseBody body;

    private ListClusterPluginInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListClusterPluginInfoResponse create() {
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
    public ListClusterPluginInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClusterPluginInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListClusterPluginInfoResponseBody body);

        @Override
        ListClusterPluginInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClusterPluginInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListClusterPluginInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClusterPluginInfoResponse response) {
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
        public Builder body(ListClusterPluginInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClusterPluginInfoResponse build() {
            return new ListClusterPluginInfoResponse(this);
        } 

    } 

}

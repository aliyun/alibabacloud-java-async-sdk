// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcpeer20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcPeerConnectionsResponse} extends {@link TeaModel}
 *
 * <p>ListVpcPeerConnectionsResponse</p>
 */
public class ListVpcPeerConnectionsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListVpcPeerConnectionsResponseBody body;

    private ListVpcPeerConnectionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListVpcPeerConnectionsResponse create() {
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
    public ListVpcPeerConnectionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVpcPeerConnectionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListVpcPeerConnectionsResponseBody body);

        @Override
        ListVpcPeerConnectionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVpcPeerConnectionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListVpcPeerConnectionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVpcPeerConnectionsResponse response) {
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
        public Builder body(ListVpcPeerConnectionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVpcPeerConnectionsResponse build() {
            return new ListVpcPeerConnectionsResponse(this);
        } 

    } 

}

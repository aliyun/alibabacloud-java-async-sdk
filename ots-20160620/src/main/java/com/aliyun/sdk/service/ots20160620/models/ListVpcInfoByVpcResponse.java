// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ots20160620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcInfoByVpcResponse} extends {@link TeaModel}
 *
 * <p>ListVpcInfoByVpcResponse</p>
 */
public class ListVpcInfoByVpcResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private ListVpcInfoByVpcResponseBody body;

    private ListVpcInfoByVpcResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListVpcInfoByVpcResponse create() {
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
    public ListVpcInfoByVpcResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVpcInfoByVpcResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListVpcInfoByVpcResponseBody body);

        @Override
        ListVpcInfoByVpcResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVpcInfoByVpcResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListVpcInfoByVpcResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVpcInfoByVpcResponse response) {
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
        public Builder body(ListVpcInfoByVpcResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVpcInfoByVpcResponse build() {
            return new ListVpcInfoByVpcResponse(this);
        } 

    } 

}

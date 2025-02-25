// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshTaobaoItemResponse} extends {@link TeaModel}
 *
 * <p>RefreshTaobaoItemResponse</p>
 */
public class RefreshTaobaoItemResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RefreshTaobaoItemResponseBody body;

    private RefreshTaobaoItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RefreshTaobaoItemResponse create() {
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
    public RefreshTaobaoItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshTaobaoItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RefreshTaobaoItemResponseBody body);

        @Override
        RefreshTaobaoItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshTaobaoItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RefreshTaobaoItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshTaobaoItemResponse response) {
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
        public Builder body(RefreshTaobaoItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshTaobaoItemResponse build() {
            return new RefreshTaobaoItemResponse(this);
        } 

    } 

}

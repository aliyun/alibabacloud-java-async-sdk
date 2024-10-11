// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListConfigItemsResponse} extends {@link TeaModel}
 *
 * <p>ListConfigItemsResponse</p>
 */
public class ListConfigItemsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListConfigItemsResponseBody body;

    private ListConfigItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListConfigItemsResponse create() {
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
    public ListConfigItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConfigItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListConfigItemsResponseBody body);

        @Override
        ListConfigItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConfigItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListConfigItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConfigItemsResponse response) {
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
        public Builder body(ListConfigItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConfigItemsResponse build() {
            return new ListConfigItemsResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSubtaskItemsResponse} extends {@link TeaModel}
 *
 * <p>ListSubtaskItemsResponse</p>
 */
public class ListSubtaskItemsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListSubtaskItemsResponseBody body;

    private ListSubtaskItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListSubtaskItemsResponse create() {
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
    public ListSubtaskItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSubtaskItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListSubtaskItemsResponseBody body);

        @Override
        ListSubtaskItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSubtaskItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListSubtaskItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSubtaskItemsResponse response) {
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
        public Builder body(ListSubtaskItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSubtaskItemsResponse build() {
            return new ListSubtaskItemsResponse(this);
        } 

    } 

}

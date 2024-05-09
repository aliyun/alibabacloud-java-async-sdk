// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAsyncInvokeConfigsResponse} extends {@link TeaModel}
 *
 * <p>ListAsyncInvokeConfigsResponse</p>
 */
public class ListAsyncInvokeConfigsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListAsyncInvokeConfigOutput body;

    private ListAsyncInvokeConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListAsyncInvokeConfigsResponse create() {
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
    public ListAsyncInvokeConfigOutput getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAsyncInvokeConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListAsyncInvokeConfigOutput body);

        @Override
        ListAsyncInvokeConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAsyncInvokeConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListAsyncInvokeConfigOutput body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAsyncInvokeConfigsResponse response) {
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
        public Builder body(ListAsyncInvokeConfigOutput body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAsyncInvokeConfigsResponse build() {
            return new ListAsyncInvokeConfigsResponse(this);
        } 

    } 

}

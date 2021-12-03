// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListFunctionAsyncInvokeConfigsResponse} extends {@link TeaModel}
 *
 * <p>ListFunctionAsyncInvokeConfigsResponse</p>
 */
public class ListFunctionAsyncInvokeConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFunctionAsyncInvokeConfigsResponseBody body;


    private ListFunctionAsyncInvokeConfigsResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionAsyncInvokeConfigsResponse create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public ListFunctionAsyncInvokeConfigsResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ListFunctionAsyncInvokeConfigsResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ListFunctionAsyncInvokeConfigsResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * <p>headers.</p>
         */
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>body.</p>
         */
        public Builder body(ListFunctionAsyncInvokeConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        public ListFunctionAsyncInvokeConfigsResponse build() {
            return new ListFunctionAsyncInvokeConfigsResponse(this);
        } 

    } 

}

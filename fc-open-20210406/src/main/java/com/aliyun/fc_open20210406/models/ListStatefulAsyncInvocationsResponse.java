// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListStatefulAsyncInvocationsResponse} extends {@link TeaModel}
 *
 * <p>ListStatefulAsyncInvocationsResponse</p>
 */
public class ListStatefulAsyncInvocationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListStatefulAsyncInvocationsResponseBody body;


    private ListStatefulAsyncInvocationsResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStatefulAsyncInvocationsResponse create() {
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
    public ListStatefulAsyncInvocationsResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ListStatefulAsyncInvocationsResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ListStatefulAsyncInvocationsResponse response) {
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
        public Builder body(ListStatefulAsyncInvocationsResponseBody body) {
            this.body = body;
            return this;
        }

        public ListStatefulAsyncInvocationsResponse build() {
            return new ListStatefulAsyncInvocationsResponse(this);
        } 

    } 

}

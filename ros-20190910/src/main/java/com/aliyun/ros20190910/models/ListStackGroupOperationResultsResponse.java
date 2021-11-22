// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListStackGroupOperationResultsResponse} extends {@link TeaModel}
 *
 * <p>ListStackGroupOperationResultsResponse</p>
 */
public class ListStackGroupOperationResultsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListStackGroupOperationResultsResponseBody body;


    private ListStackGroupOperationResultsResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStackGroupOperationResultsResponse create() {
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
    public ListStackGroupOperationResultsResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ListStackGroupOperationResultsResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ListStackGroupOperationResultsResponse response) {
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
        public Builder body(ListStackGroupOperationResultsResponseBody body) {
            this.body = body;
            return this;
        }

        public ListStackGroupOperationResultsResponse build() {
            return new ListStackGroupOperationResultsResponse(this);
        } 

    } 

}

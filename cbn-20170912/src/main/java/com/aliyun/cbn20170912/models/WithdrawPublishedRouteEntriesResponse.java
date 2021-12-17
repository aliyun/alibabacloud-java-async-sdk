// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link WithdrawPublishedRouteEntriesResponse} extends {@link TeaModel}
 *
 * <p>WithdrawPublishedRouteEntriesResponse</p>
 */
public class WithdrawPublishedRouteEntriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private WithdrawPublishedRouteEntriesResponseBody body;


    private WithdrawPublishedRouteEntriesResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WithdrawPublishedRouteEntriesResponse create() {
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
    public WithdrawPublishedRouteEntriesResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private WithdrawPublishedRouteEntriesResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(WithdrawPublishedRouteEntriesResponse response) {
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
        public Builder body(WithdrawPublishedRouteEntriesResponseBody body) {
            this.body = body;
            return this;
        }

        public WithdrawPublishedRouteEntriesResponse build() {
            return new WithdrawPublishedRouteEntriesResponse(this);
        } 

    } 

}

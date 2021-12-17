// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListTransitRouterVpcAttachmentsResponse} extends {@link TeaModel}
 *
 * <p>ListTransitRouterVpcAttachmentsResponse</p>
 */
public class ListTransitRouterVpcAttachmentsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTransitRouterVpcAttachmentsResponseBody body;


    private ListTransitRouterVpcAttachmentsResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterVpcAttachmentsResponse create() {
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
    public ListTransitRouterVpcAttachmentsResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ListTransitRouterVpcAttachmentsResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ListTransitRouterVpcAttachmentsResponse response) {
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
        public Builder body(ListTransitRouterVpcAttachmentsResponseBody body) {
            this.body = body;
            return this;
        }

        public ListTransitRouterVpcAttachmentsResponse build() {
            return new ListTransitRouterVpcAttachmentsResponse(this);
        } 

    } 

}

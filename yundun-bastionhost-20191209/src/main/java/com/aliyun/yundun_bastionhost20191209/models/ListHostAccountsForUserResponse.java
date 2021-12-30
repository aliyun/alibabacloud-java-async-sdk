// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListHostAccountsForUserResponse} extends {@link TeaModel}
 *
 * <p>ListHostAccountsForUserResponse</p>
 */
public class ListHostAccountsForUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHostAccountsForUserResponseBody body;


    private ListHostAccountsForUserResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostAccountsForUserResponse create() {
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
    public ListHostAccountsForUserResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ListHostAccountsForUserResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ListHostAccountsForUserResponse response) {
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
        public Builder body(ListHostAccountsForUserResponseBody body) {
            this.body = body;
            return this;
        }

        public ListHostAccountsForUserResponse build() {
            return new ListHostAccountsForUserResponse(this);
        } 

    } 

}

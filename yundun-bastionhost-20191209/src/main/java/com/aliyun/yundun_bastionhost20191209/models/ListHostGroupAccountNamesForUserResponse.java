// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListHostGroupAccountNamesForUserResponse} extends {@link TeaModel}
 *
 * <p>ListHostGroupAccountNamesForUserResponse</p>
 */
public class ListHostGroupAccountNamesForUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHostGroupAccountNamesForUserResponseBody body;


    private ListHostGroupAccountNamesForUserResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostGroupAccountNamesForUserResponse create() {
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
    public ListHostGroupAccountNamesForUserResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ListHostGroupAccountNamesForUserResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ListHostGroupAccountNamesForUserResponse response) {
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
        public Builder body(ListHostGroupAccountNamesForUserResponseBody body) {
            this.body = body;
            return this;
        }

        public ListHostGroupAccountNamesForUserResponse build() {
            return new ListHostGroupAccountNamesForUserResponse(this);
        } 

    } 

}

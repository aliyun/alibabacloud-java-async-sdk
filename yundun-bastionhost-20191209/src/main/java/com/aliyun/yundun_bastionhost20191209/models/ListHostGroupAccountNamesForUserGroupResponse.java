// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListHostGroupAccountNamesForUserGroupResponse} extends {@link TeaModel}
 *
 * <p>ListHostGroupAccountNamesForUserGroupResponse</p>
 */
public class ListHostGroupAccountNamesForUserGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHostGroupAccountNamesForUserGroupResponseBody body;


    private ListHostGroupAccountNamesForUserGroupResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostGroupAccountNamesForUserGroupResponse create() {
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
    public ListHostGroupAccountNamesForUserGroupResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ListHostGroupAccountNamesForUserGroupResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ListHostGroupAccountNamesForUserGroupResponse response) {
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
        public Builder body(ListHostGroupAccountNamesForUserGroupResponseBody body) {
            this.body = body;
            return this;
        }

        public ListHostGroupAccountNamesForUserGroupResponse build() {
            return new ListHostGroupAccountNamesForUserGroupResponse(this);
        } 

    } 

}

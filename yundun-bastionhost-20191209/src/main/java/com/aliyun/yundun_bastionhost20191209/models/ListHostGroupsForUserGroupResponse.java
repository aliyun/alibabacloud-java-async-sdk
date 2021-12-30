// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListHostGroupsForUserGroupResponse} extends {@link TeaModel}
 *
 * <p>ListHostGroupsForUserGroupResponse</p>
 */
public class ListHostGroupsForUserGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHostGroupsForUserGroupResponseBody body;


    private ListHostGroupsForUserGroupResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostGroupsForUserGroupResponse create() {
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
    public ListHostGroupsForUserGroupResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ListHostGroupsForUserGroupResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ListHostGroupsForUserGroupResponse response) {
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
        public Builder body(ListHostGroupsForUserGroupResponseBody body) {
            this.body = body;
            return this;
        }

        public ListHostGroupsForUserGroupResponse build() {
            return new ListHostGroupsForUserGroupResponse(this);
        } 

    } 

}

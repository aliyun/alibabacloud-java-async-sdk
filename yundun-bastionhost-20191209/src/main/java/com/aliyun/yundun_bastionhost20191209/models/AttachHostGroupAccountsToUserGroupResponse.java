// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link AttachHostGroupAccountsToUserGroupResponse} extends {@link TeaModel}
 *
 * <p>AttachHostGroupAccountsToUserGroupResponse</p>
 */
public class AttachHostGroupAccountsToUserGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachHostGroupAccountsToUserGroupResponseBody body;


    private AttachHostGroupAccountsToUserGroupResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachHostGroupAccountsToUserGroupResponse create() {
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
    public AttachHostGroupAccountsToUserGroupResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private AttachHostGroupAccountsToUserGroupResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(AttachHostGroupAccountsToUserGroupResponse response) {
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
        public Builder body(AttachHostGroupAccountsToUserGroupResponseBody body) {
            this.body = body;
            return this;
        }

        public AttachHostGroupAccountsToUserGroupResponse build() {
            return new AttachHostGroupAccountsToUserGroupResponse(this);
        } 

    } 

}

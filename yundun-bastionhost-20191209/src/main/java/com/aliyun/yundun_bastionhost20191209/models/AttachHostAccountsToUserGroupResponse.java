// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link AttachHostAccountsToUserGroupResponse} extends {@link TeaModel}
 *
 * <p>AttachHostAccountsToUserGroupResponse</p>
 */
public class AttachHostAccountsToUserGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachHostAccountsToUserGroupResponseBody body;


    private AttachHostAccountsToUserGroupResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachHostAccountsToUserGroupResponse create() {
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
    public AttachHostAccountsToUserGroupResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private AttachHostAccountsToUserGroupResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(AttachHostAccountsToUserGroupResponse response) {
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
        public Builder body(AttachHostAccountsToUserGroupResponseBody body) {
            this.body = body;
            return this;
        }

        public AttachHostAccountsToUserGroupResponse build() {
            return new AttachHostAccountsToUserGroupResponse(this);
        } 

    } 

}

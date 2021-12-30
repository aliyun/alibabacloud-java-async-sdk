// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DetachHostAccountsFromUserGroupResponse} extends {@link TeaModel}
 *
 * <p>DetachHostAccountsFromUserGroupResponse</p>
 */
public class DetachHostAccountsFromUserGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachHostAccountsFromUserGroupResponseBody body;


    private DetachHostAccountsFromUserGroupResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachHostAccountsFromUserGroupResponse create() {
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
    public DetachHostAccountsFromUserGroupResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private DetachHostAccountsFromUserGroupResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(DetachHostAccountsFromUserGroupResponse response) {
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
        public Builder body(DetachHostAccountsFromUserGroupResponseBody body) {
            this.body = body;
            return this;
        }

        public DetachHostAccountsFromUserGroupResponse build() {
            return new DetachHostAccountsFromUserGroupResponse(this);
        } 

    } 

}

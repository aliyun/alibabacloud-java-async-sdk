// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RemoveUsersFromGroupResponse} extends {@link TeaModel}
 *
 * <p>RemoveUsersFromGroupResponse</p>
 */
public class RemoveUsersFromGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveUsersFromGroupResponseBody body;


    private RemoveUsersFromGroupResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveUsersFromGroupResponse create() {
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
    public RemoveUsersFromGroupResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private RemoveUsersFromGroupResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(RemoveUsersFromGroupResponse response) {
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
        public Builder body(RemoveUsersFromGroupResponseBody body) {
            this.body = body;
            return this;
        }

        public RemoveUsersFromGroupResponse build() {
            return new RemoveUsersFromGroupResponse(this);
        } 

    } 

}

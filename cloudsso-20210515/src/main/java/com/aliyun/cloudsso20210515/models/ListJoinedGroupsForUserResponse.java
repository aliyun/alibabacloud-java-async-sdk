// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListJoinedGroupsForUserResponse} extends {@link TeaModel}
 *
 * <p>ListJoinedGroupsForUserResponse</p>
 */
public class ListJoinedGroupsForUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListJoinedGroupsForUserResponseBody body;


    private ListJoinedGroupsForUserResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJoinedGroupsForUserResponse create() {
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
    public ListJoinedGroupsForUserResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ListJoinedGroupsForUserResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ListJoinedGroupsForUserResponse response) {
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
        public Builder body(ListJoinedGroupsForUserResponseBody body) {
            this.body = body;
            return this;
        }

        public ListJoinedGroupsForUserResponse build() {
            return new ListJoinedGroupsForUserResponse(this);
        } 

    } 

}

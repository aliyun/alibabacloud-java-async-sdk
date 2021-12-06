// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteMFADeviceForUserResponse} extends {@link TeaModel}
 *
 * <p>DeleteMFADeviceForUserResponse</p>
 */
public class DeleteMFADeviceForUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMFADeviceForUserResponseBody body;


    private DeleteMFADeviceForUserResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMFADeviceForUserResponse create() {
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
    public DeleteMFADeviceForUserResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMFADeviceForUserResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMFADeviceForUserResponse response) {
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
        public Builder body(DeleteMFADeviceForUserResponseBody body) {
            this.body = body;
            return this;
        }

        public DeleteMFADeviceForUserResponse build() {
            return new DeleteMFADeviceForUserResponse(this);
        } 

    } 

}

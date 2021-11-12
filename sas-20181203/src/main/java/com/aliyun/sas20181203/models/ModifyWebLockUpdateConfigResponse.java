// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyWebLockUpdateConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyWebLockUpdateConfigResponse</p>
 */
public class ModifyWebLockUpdateConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWebLockUpdateConfigResponseBody body;


    private ModifyWebLockUpdateConfigResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebLockUpdateConfigResponse create() {
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
    public ModifyWebLockUpdateConfigResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWebLockUpdateConfigResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWebLockUpdateConfigResponse response) {
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
        public Builder body(ModifyWebLockUpdateConfigResponseBody body) {
            this.body = body;
            return this;
        }

        public ModifyWebLockUpdateConfigResponse build() {
            return new ModifyWebLockUpdateConfigResponse(this);
        } 

    } 

}

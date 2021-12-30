// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link AttachHostAccountsToHostShareKeyResponse} extends {@link TeaModel}
 *
 * <p>AttachHostAccountsToHostShareKeyResponse</p>
 */
public class AttachHostAccountsToHostShareKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachHostAccountsToHostShareKeyResponseBody body;


    private AttachHostAccountsToHostShareKeyResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachHostAccountsToHostShareKeyResponse create() {
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
    public AttachHostAccountsToHostShareKeyResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private AttachHostAccountsToHostShareKeyResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(AttachHostAccountsToHostShareKeyResponse response) {
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
        public Builder body(AttachHostAccountsToHostShareKeyResponseBody body) {
            this.body = body;
            return this;
        }

        public AttachHostAccountsToHostShareKeyResponse build() {
            return new AttachHostAccountsToHostShareKeyResponse(this);
        } 

    } 

}

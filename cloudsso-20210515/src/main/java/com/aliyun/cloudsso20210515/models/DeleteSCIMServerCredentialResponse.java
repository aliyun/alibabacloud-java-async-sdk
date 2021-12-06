// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteSCIMServerCredentialResponse} extends {@link TeaModel}
 *
 * <p>DeleteSCIMServerCredentialResponse</p>
 */
public class DeleteSCIMServerCredentialResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSCIMServerCredentialResponseBody body;


    private DeleteSCIMServerCredentialResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSCIMServerCredentialResponse create() {
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
    public DeleteSCIMServerCredentialResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSCIMServerCredentialResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSCIMServerCredentialResponse response) {
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
        public Builder body(DeleteSCIMServerCredentialResponseBody body) {
            this.body = body;
            return this;
        }

        public DeleteSCIMServerCredentialResponse build() {
            return new DeleteSCIMServerCredentialResponse(this);
        } 

    } 

}

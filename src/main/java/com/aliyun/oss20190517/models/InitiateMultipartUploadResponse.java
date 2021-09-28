// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link InitiateMultipartUploadResponse} extends {@link TeaModel}
 *
 * <p>InitiateMultipartUploadResponse</p>
 */
public class InitiateMultipartUploadResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InitiateMultipartUploadResponseBody body;


    private InitiateMultipartUploadResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitiateMultipartUploadResponse create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > headers() {
        return this.headers;
    }

    /**
     * @return body
     */
    public InitiateMultipartUploadResponseBody body() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private InitiateMultipartUploadResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(InitiateMultipartUploadResponse response) {
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
        public Builder body(InitiateMultipartUploadResponseBody body) {
            this.body = body;
            return this;
        }

        public InitiateMultipartUploadResponse build() {
            return new InitiateMultipartUploadResponse(this);
        } 

    } 

}

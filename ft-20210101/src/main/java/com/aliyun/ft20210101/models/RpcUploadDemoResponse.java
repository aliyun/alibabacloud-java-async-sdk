// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RpcUploadDemoResponse} extends {@link TeaModel}
 *
 * <p>RpcUploadDemoResponse</p>
 */
public class RpcUploadDemoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RpcUploadDemoResponseBody body;


    private RpcUploadDemoResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RpcUploadDemoResponse create() {
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
    public RpcUploadDemoResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private RpcUploadDemoResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(RpcUploadDemoResponse response) {
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
        public Builder body(RpcUploadDemoResponseBody body) {
            this.body = body;
            return this;
        }

        public RpcUploadDemoResponse build() {
            return new RpcUploadDemoResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link NormalRpcHsfApiResponse} extends {@link TeaModel}
 *
 * <p>NormalRpcHsfApiResponse</p>
 */
public class NormalRpcHsfApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private NormalRpcHsfApiResponseBody body;


    private NormalRpcHsfApiResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NormalRpcHsfApiResponse create() {
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
    public NormalRpcHsfApiResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private NormalRpcHsfApiResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(NormalRpcHsfApiResponse response) {
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
        public Builder body(NormalRpcHsfApiResponseBody body) {
            this.body = body;
            return this;
        }

        public NormalRpcHsfApiResponse build() {
            return new NormalRpcHsfApiResponse(this);
        } 

    } 

}

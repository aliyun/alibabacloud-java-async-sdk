// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link NormalRpcHttpApiResponse} extends {@link TeaModel}
 *
 * <p>NormalRpcHttpApiResponse</p>
 */
public class NormalRpcHttpApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private NormalRpcHttpApiResponseBody body;


    private NormalRpcHttpApiResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NormalRpcHttpApiResponse create() {
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
    public NormalRpcHttpApiResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private NormalRpcHttpApiResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(NormalRpcHttpApiResponse response) {
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
        public Builder body(NormalRpcHttpApiResponseBody body) {
            this.body = body;
            return this;
        }

        public NormalRpcHttpApiResponse build() {
            return new NormalRpcHttpApiResponse(this);
        } 

    } 

}

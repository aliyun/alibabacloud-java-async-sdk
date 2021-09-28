// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteMultipleObjectsResponse} extends {@link TeaModel}
 *
 * <p>DeleteMultipleObjectsResponse</p>
 */
public class DeleteMultipleObjectsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMultipleObjectsResponseBody body;


    private DeleteMultipleObjectsResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMultipleObjectsResponse create() {
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
    public DeleteMultipleObjectsResponseBody body() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMultipleObjectsResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMultipleObjectsResponse response) {
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
        public Builder body(DeleteMultipleObjectsResponseBody body) {
            this.body = body;
            return this;
        }

        public DeleteMultipleObjectsResponse build() {
            return new DeleteMultipleObjectsResponse(this);
        } 

    } 

}

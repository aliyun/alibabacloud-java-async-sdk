// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetBucketReplicationLocationResponse} extends {@link TeaModel}
 *
 * <p>GetBucketReplicationLocationResponse</p>
 */
public class GetBucketReplicationLocationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBucketReplicationLocationResponseBody body;


    private GetBucketReplicationLocationResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketReplicationLocationResponse create() {
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
    public GetBucketReplicationLocationResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private GetBucketReplicationLocationResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(GetBucketReplicationLocationResponse response) {
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
        public Builder body(GetBucketReplicationLocationResponseBody body) {
            this.body = body;
            return this;
        }

        public GetBucketReplicationLocationResponse build() {
            return new GetBucketReplicationLocationResponse(this);
        } 

    } 

}

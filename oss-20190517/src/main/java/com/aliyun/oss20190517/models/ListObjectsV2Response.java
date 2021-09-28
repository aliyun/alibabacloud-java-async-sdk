// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListObjectsV2Response} extends {@link TeaModel}
 *
 * <p>ListObjectsV2Response</p>
 */
public class ListObjectsV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListObjectsV2ResponseBody body;


    private ListObjectsV2Response(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListObjectsV2Response create() {
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
    public ListObjectsV2ResponseBody body() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ListObjectsV2ResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ListObjectsV2Response response) {
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
        public Builder body(ListObjectsV2ResponseBody body) {
            this.body = body;
            return this;
        }

        public ListObjectsV2Response build() {
            return new ListObjectsV2Response(this);
        } 

    } 

}

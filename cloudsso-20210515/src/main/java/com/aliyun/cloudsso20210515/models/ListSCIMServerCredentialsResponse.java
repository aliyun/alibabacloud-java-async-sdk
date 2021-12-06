// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListSCIMServerCredentialsResponse} extends {@link TeaModel}
 *
 * <p>ListSCIMServerCredentialsResponse</p>
 */
public class ListSCIMServerCredentialsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSCIMServerCredentialsResponseBody body;


    private ListSCIMServerCredentialsResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSCIMServerCredentialsResponse create() {
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
    public ListSCIMServerCredentialsResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ListSCIMServerCredentialsResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ListSCIMServerCredentialsResponse response) {
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
        public Builder body(ListSCIMServerCredentialsResponseBody body) {
            this.body = body;
            return this;
        }

        public ListSCIMServerCredentialsResponse build() {
            return new ListSCIMServerCredentialsResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListVpcBindingsResponse} extends {@link TeaModel}
 *
 * <p>ListVpcBindingsResponse</p>
 */
public class ListVpcBindingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVpcBindingsResponseBody body;


    private ListVpcBindingsResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcBindingsResponse create() {
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
    public ListVpcBindingsResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ListVpcBindingsResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ListVpcBindingsResponse response) {
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
        public Builder body(ListVpcBindingsResponseBody body) {
            this.body = body;
            return this;
        }

        public ListVpcBindingsResponse build() {
            return new ListVpcBindingsResponse(this);
        } 

    } 

}

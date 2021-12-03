// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RegisterEventSourceResponse} extends {@link TeaModel}
 *
 * <p>RegisterEventSourceResponse</p>
 */
public class RegisterEventSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RegisterEventSourceResponseBody body;


    private RegisterEventSourceResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterEventSourceResponse create() {
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
    public RegisterEventSourceResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private RegisterEventSourceResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(RegisterEventSourceResponse response) {
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
        public Builder body(RegisterEventSourceResponseBody body) {
            this.body = body;
            return this;
        }

        public RegisterEventSourceResponse build() {
            return new RegisterEventSourceResponse(this);
        } 

    } 

}

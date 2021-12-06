// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetDirectorySAMLServiceProviderInfoResponse} extends {@link TeaModel}
 *
 * <p>GetDirectorySAMLServiceProviderInfoResponse</p>
 */
public class GetDirectorySAMLServiceProviderInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDirectorySAMLServiceProviderInfoResponseBody body;


    private GetDirectorySAMLServiceProviderInfoResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDirectorySAMLServiceProviderInfoResponse create() {
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
    public GetDirectorySAMLServiceProviderInfoResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private GetDirectorySAMLServiceProviderInfoResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(GetDirectorySAMLServiceProviderInfoResponse response) {
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
        public Builder body(GetDirectorySAMLServiceProviderInfoResponseBody body) {
            this.body = body;
            return this;
        }

        public GetDirectorySAMLServiceProviderInfoResponse build() {
            return new GetDirectorySAMLServiceProviderInfoResponse(this);
        } 

    } 

}

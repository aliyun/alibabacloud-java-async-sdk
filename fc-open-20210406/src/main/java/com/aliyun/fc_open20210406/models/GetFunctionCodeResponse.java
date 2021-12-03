// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetFunctionCodeResponse} extends {@link TeaModel}
 *
 * <p>GetFunctionCodeResponse</p>
 */
public class GetFunctionCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFunctionCodeResponseBody body;


    private GetFunctionCodeResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFunctionCodeResponse create() {
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
    public GetFunctionCodeResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private GetFunctionCodeResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(GetFunctionCodeResponse response) {
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
        public Builder body(GetFunctionCodeResponseBody body) {
            this.body = body;
            return this;
        }

        public GetFunctionCodeResponse build() {
            return new GetFunctionCodeResponse(this);
        } 

    } 

}

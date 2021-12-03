// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetFunctionAsyncInvokeConfigResponse} extends {@link TeaModel}
 *
 * <p>GetFunctionAsyncInvokeConfigResponse</p>
 */
public class GetFunctionAsyncInvokeConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFunctionAsyncInvokeConfigResponseBody body;


    private GetFunctionAsyncInvokeConfigResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFunctionAsyncInvokeConfigResponse create() {
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
    public GetFunctionAsyncInvokeConfigResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private GetFunctionAsyncInvokeConfigResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(GetFunctionAsyncInvokeConfigResponse response) {
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
        public Builder body(GetFunctionAsyncInvokeConfigResponseBody body) {
            this.body = body;
            return this;
        }

        public GetFunctionAsyncInvokeConfigResponse build() {
            return new GetFunctionAsyncInvokeConfigResponse(this);
        } 

    } 

}

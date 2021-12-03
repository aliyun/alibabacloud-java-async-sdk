// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetStatefulAsyncInvocationResponse} extends {@link TeaModel}
 *
 * <p>GetStatefulAsyncInvocationResponse</p>
 */
public class GetStatefulAsyncInvocationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StatefulAsyncInvocation body;


    private GetStatefulAsyncInvocationResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStatefulAsyncInvocationResponse create() {
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
    public StatefulAsyncInvocation getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private StatefulAsyncInvocation body; 

        private Builder() {
            super();
        } 

        private Builder(GetStatefulAsyncInvocationResponse response) {
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
        public Builder body(StatefulAsyncInvocation body) {
            this.body = body;
            return this;
        }

        public GetStatefulAsyncInvocationResponse build() {
            return new GetStatefulAsyncInvocationResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteFunctionAsyncInvokeConfigResponse} extends {@link TeaModel}
 *
 * <p>DeleteFunctionAsyncInvokeConfigResponse</p>
 */
public class DeleteFunctionAsyncInvokeConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;


    private DeleteFunctionAsyncInvokeConfigResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFunctionAsyncInvokeConfigResponse create() {
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

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFunctionAsyncInvokeConfigResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * <p>headers.</p>
         */
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        public DeleteFunctionAsyncInvokeConfigResponse build() {
            return new DeleteFunctionAsyncInvokeConfigResponse(this);
        } 

    } 

}

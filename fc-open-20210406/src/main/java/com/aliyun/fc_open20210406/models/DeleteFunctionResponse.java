// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteFunctionResponse} extends {@link TeaModel}
 *
 * <p>DeleteFunctionResponse</p>
 */
public class DeleteFunctionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;


    private DeleteFunctionResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFunctionResponse create() {
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

        private Builder(DeleteFunctionResponse response) {
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

        public DeleteFunctionResponse build() {
            return new DeleteFunctionResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteVpcBindingResponse} extends {@link TeaModel}
 *
 * <p>DeleteVpcBindingResponse</p>
 */
public class DeleteVpcBindingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;


    private DeleteVpcBindingResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVpcBindingResponse create() {
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

        private Builder(DeleteVpcBindingResponse response) {
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

        public DeleteVpcBindingResponse build() {
            return new DeleteVpcBindingResponse(this);
        } 

    } 

}

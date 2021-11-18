// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteInstanceVpcEndpointLinkedVpcResponse} extends {@link TeaModel}
 *
 * <p>DeleteInstanceVpcEndpointLinkedVpcResponse</p>
 */
public class DeleteInstanceVpcEndpointLinkedVpcResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteInstanceVpcEndpointLinkedVpcResponseBody body;


    private DeleteInstanceVpcEndpointLinkedVpcResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceVpcEndpointLinkedVpcResponse create() {
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
    public DeleteInstanceVpcEndpointLinkedVpcResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private DeleteInstanceVpcEndpointLinkedVpcResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInstanceVpcEndpointLinkedVpcResponse response) {
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
        public Builder body(DeleteInstanceVpcEndpointLinkedVpcResponseBody body) {
            this.body = body;
            return this;
        }

        public DeleteInstanceVpcEndpointLinkedVpcResponse build() {
            return new DeleteInstanceVpcEndpointLinkedVpcResponse(this);
        } 

    } 

}

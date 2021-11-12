// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyOpenLogShipperResponse} extends {@link TeaModel}
 *
 * <p>ModifyOpenLogShipperResponse</p>
 */
public class ModifyOpenLogShipperResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyOpenLogShipperResponseBody body;


    private ModifyOpenLogShipperResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOpenLogShipperResponse create() {
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
    public ModifyOpenLogShipperResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ModifyOpenLogShipperResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOpenLogShipperResponse response) {
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
        public Builder body(ModifyOpenLogShipperResponseBody body) {
            this.body = body;
            return this;
        }

        public ModifyOpenLogShipperResponse build() {
            return new ModifyOpenLogShipperResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyDomainIpv6StatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyDomainIpv6StatusResponse</p>
 */
public class ModifyDomainIpv6StatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDomainIpv6StatusResponseBody body;


    private ModifyDomainIpv6StatusResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDomainIpv6StatusResponse create() {
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
    public ModifyDomainIpv6StatusResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDomainIpv6StatusResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDomainIpv6StatusResponse response) {
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
        public Builder body(ModifyDomainIpv6StatusResponseBody body) {
            this.body = body;
            return this;
        }

        public ModifyDomainIpv6StatusResponse build() {
            return new ModifyDomainIpv6StatusResponse(this);
        } 

    } 

}

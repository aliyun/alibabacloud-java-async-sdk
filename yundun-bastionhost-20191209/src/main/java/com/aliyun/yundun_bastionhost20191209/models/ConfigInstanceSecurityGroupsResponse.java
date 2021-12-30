// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ConfigInstanceSecurityGroupsResponse} extends {@link TeaModel}
 *
 * <p>ConfigInstanceSecurityGroupsResponse</p>
 */
public class ConfigInstanceSecurityGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigInstanceSecurityGroupsResponseBody body;


    private ConfigInstanceSecurityGroupsResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigInstanceSecurityGroupsResponse create() {
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
    public ConfigInstanceSecurityGroupsResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ConfigInstanceSecurityGroupsResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ConfigInstanceSecurityGroupsResponse response) {
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
        public Builder body(ConfigInstanceSecurityGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        public ConfigInstanceSecurityGroupsResponse build() {
            return new ConfigInstanceSecurityGroupsResponse(this);
        } 

    } 

}

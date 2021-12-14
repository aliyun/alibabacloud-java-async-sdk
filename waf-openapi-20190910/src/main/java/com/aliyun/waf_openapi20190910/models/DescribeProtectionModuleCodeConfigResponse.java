// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeProtectionModuleCodeConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeProtectionModuleCodeConfigResponse</p>
 */
public class DescribeProtectionModuleCodeConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeProtectionModuleCodeConfigResponseBody body;


    private DescribeProtectionModuleCodeConfigResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProtectionModuleCodeConfigResponse create() {
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
    public DescribeProtectionModuleCodeConfigResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private DescribeProtectionModuleCodeConfigResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProtectionModuleCodeConfigResponse response) {
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
        public Builder body(DescribeProtectionModuleCodeConfigResponseBody body) {
            this.body = body;
            return this;
        }

        public DescribeProtectionModuleCodeConfigResponse build() {
            return new DescribeProtectionModuleCodeConfigResponse(this);
        } 

    } 

}

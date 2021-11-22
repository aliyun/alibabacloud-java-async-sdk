// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GenerateTemplatePolicyResponse} extends {@link TeaModel}
 *
 * <p>GenerateTemplatePolicyResponse</p>
 */
public class GenerateTemplatePolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateTemplatePolicyResponseBody body;


    private GenerateTemplatePolicyResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateTemplatePolicyResponse create() {
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
    public GenerateTemplatePolicyResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private GenerateTemplatePolicyResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(GenerateTemplatePolicyResponse response) {
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
        public Builder body(GenerateTemplatePolicyResponseBody body) {
            this.body = body;
            return this;
        }

        public GenerateTemplatePolicyResponse build() {
            return new GenerateTemplatePolicyResponse(this);
        } 

    } 

}

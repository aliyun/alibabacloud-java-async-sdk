// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link SetTemplatePermissionResponse} extends {@link TeaModel}
 *
 * <p>SetTemplatePermissionResponse</p>
 */
public class SetTemplatePermissionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetTemplatePermissionResponseBody body;


    private SetTemplatePermissionResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetTemplatePermissionResponse create() {
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
    public SetTemplatePermissionResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private SetTemplatePermissionResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(SetTemplatePermissionResponse response) {
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
        public Builder body(SetTemplatePermissionResponseBody body) {
            this.body = body;
            return this;
        }

        public SetTemplatePermissionResponse build() {
            return new SetTemplatePermissionResponse(this);
        } 

    } 

}

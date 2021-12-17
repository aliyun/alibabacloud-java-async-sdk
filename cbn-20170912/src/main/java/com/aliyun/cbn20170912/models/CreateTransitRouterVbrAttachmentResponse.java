// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateTransitRouterVbrAttachmentResponse} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterVbrAttachmentResponse</p>
 */
public class CreateTransitRouterVbrAttachmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTransitRouterVbrAttachmentResponseBody body;


    private CreateTransitRouterVbrAttachmentResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterVbrAttachmentResponse create() {
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
    public CreateTransitRouterVbrAttachmentResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private CreateTransitRouterVbrAttachmentResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(CreateTransitRouterVbrAttachmentResponse response) {
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
        public Builder body(CreateTransitRouterVbrAttachmentResponseBody body) {
            this.body = body;
            return this;
        }

        public CreateTransitRouterVbrAttachmentResponse build() {
            return new CreateTransitRouterVbrAttachmentResponse(this);
        } 

    } 

}

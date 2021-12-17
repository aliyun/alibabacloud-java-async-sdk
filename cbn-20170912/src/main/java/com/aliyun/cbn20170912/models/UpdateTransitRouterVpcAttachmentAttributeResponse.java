// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UpdateTransitRouterVpcAttachmentAttributeResponse} extends {@link TeaModel}
 *
 * <p>UpdateTransitRouterVpcAttachmentAttributeResponse</p>
 */
public class UpdateTransitRouterVpcAttachmentAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTransitRouterVpcAttachmentAttributeResponseBody body;


    private UpdateTransitRouterVpcAttachmentAttributeResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTransitRouterVpcAttachmentAttributeResponse create() {
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
    public UpdateTransitRouterVpcAttachmentAttributeResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTransitRouterVpcAttachmentAttributeResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTransitRouterVpcAttachmentAttributeResponse response) {
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
        public Builder body(UpdateTransitRouterVpcAttachmentAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        public UpdateTransitRouterVpcAttachmentAttributeResponse build() {
            return new UpdateTransitRouterVpcAttachmentAttributeResponse(this);
        } 

    } 

}

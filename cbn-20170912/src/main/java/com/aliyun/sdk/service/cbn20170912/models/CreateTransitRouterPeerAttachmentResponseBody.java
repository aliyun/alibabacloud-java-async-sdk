// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTransitRouterPeerAttachmentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterPeerAttachmentResponseBody</p>
 */
public class CreateTransitRouterPeerAttachmentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TransitRouterAttachmentId")
    private String transitRouterAttachmentId;

    private CreateTransitRouterPeerAttachmentResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterPeerAttachmentResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transitRouterAttachmentId
     */
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    public static final class Builder {
        private String requestId; 
        private String transitRouterAttachmentId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the inter-region connection.
         */
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }

        public CreateTransitRouterPeerAttachmentResponseBody build() {
            return new CreateTransitRouterPeerAttachmentResponseBody(this);
        } 

    } 

}

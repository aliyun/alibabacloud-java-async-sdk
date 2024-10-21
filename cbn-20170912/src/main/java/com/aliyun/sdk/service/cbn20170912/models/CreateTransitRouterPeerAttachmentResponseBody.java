// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateTransitRouterPeerAttachmentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterPeerAttachmentResponseBody</p>
 */
public class CreateTransitRouterPeerAttachmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>59422BF5-BAAD-4CFD-9019-9557BD3ACFA3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the inter-region connection.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-nwkiqfvw22qesz****</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateTransitRouterPeerAttachmentAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateTransitRouterPeerAttachmentAttributeResponseBody</p>
 */
public class UpdateTransitRouterPeerAttachmentAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateTransitRouterPeerAttachmentAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTransitRouterPeerAttachmentAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A01FEDD7-7D69-4EB3-996D-CF79F6F885CA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateTransitRouterPeerAttachmentAttributeResponseBody build() {
            return new UpdateTransitRouterPeerAttachmentAttributeResponseBody(this);
        } 

    } 

}

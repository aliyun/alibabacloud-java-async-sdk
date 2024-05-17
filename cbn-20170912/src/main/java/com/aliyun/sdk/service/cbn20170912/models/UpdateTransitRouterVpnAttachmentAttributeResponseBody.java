// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTransitRouterVpnAttachmentAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateTransitRouterVpnAttachmentAttributeResponseBody</p>
 */
public class UpdateTransitRouterVpnAttachmentAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateTransitRouterVpnAttachmentAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTransitRouterVpnAttachmentAttributeResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateTransitRouterVpnAttachmentAttributeResponseBody build() {
            return new UpdateTransitRouterVpnAttachmentAttributeResponseBody(this);
        } 

    } 

}

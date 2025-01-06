// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateTransitRouterVpnAttachmentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterVpnAttachmentResponseBody</p>
 */
public class CreateTransitRouterVpnAttachmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
    private String transitRouterAttachmentId;

    private CreateTransitRouterVpnAttachmentResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterVpnAttachmentResponseBody create() {
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
         * <p>8B5DD40A-3A29-5AC0-B8DA-05FD10D5C893</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the VPN attachment.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-y5dup2qwfyh9lu****</p>
         */
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }

        public CreateTransitRouterVpnAttachmentResponseBody build() {
            return new CreateTransitRouterVpnAttachmentResponseBody(this);
        } 

    } 

}

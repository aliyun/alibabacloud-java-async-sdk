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
 * {@link UpdateTransitRouterVpcAttachmentZonesResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateTransitRouterVpcAttachmentZonesResponseBody</p>
 */
public class UpdateTransitRouterVpcAttachmentZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateTransitRouterVpcAttachmentZonesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTransitRouterVpcAttachmentZonesResponseBody create() {
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
         * <p>595AE52F-49FF-5788-A677-0DD1467941A1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateTransitRouterVpcAttachmentZonesResponseBody build() {
            return new UpdateTransitRouterVpcAttachmentZonesResponseBody(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCenChildInstanceRouteEntryToAttachmentResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCenChildInstanceRouteEntryToAttachmentResponseBody</p>
 */
public class DeleteCenChildInstanceRouteEntryToAttachmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteCenChildInstanceRouteEntryToAttachmentResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCenChildInstanceRouteEntryToAttachmentResponseBody create() {
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

        public DeleteCenChildInstanceRouteEntryToAttachmentResponseBody build() {
            return new DeleteCenChildInstanceRouteEntryToAttachmentResponseBody(this);
        } 

    } 

}

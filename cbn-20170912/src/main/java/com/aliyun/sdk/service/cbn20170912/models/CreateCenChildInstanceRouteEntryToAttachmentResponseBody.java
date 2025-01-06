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
 * {@link CreateCenChildInstanceRouteEntryToAttachmentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCenChildInstanceRouteEntryToAttachmentResponseBody</p>
 */
public class CreateCenChildInstanceRouteEntryToAttachmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCenChildInstanceRouteEntryToAttachmentResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCenChildInstanceRouteEntryToAttachmentResponseBody create() {
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
         * <p>A95A100B-3F3A-56F4-A5DE-19DB7E994807</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCenChildInstanceRouteEntryToAttachmentResponseBody build() {
            return new CreateCenChildInstanceRouteEntryToAttachmentResponseBody(this);
        } 

    } 

}

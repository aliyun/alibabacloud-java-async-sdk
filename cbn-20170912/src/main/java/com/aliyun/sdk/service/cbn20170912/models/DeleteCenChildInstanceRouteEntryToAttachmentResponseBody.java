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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>250E717B-9823-5FD8-A1C6-5714234FB825</p>
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

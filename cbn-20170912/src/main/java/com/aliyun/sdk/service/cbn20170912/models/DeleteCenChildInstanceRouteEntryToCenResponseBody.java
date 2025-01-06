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
 * {@link DeleteCenChildInstanceRouteEntryToCenResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCenChildInstanceRouteEntryToCenResponseBody</p>
 */
public class DeleteCenChildInstanceRouteEntryToCenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteCenChildInstanceRouteEntryToCenResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCenChildInstanceRouteEntryToCenResponseBody create() {
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
         * <p>C05000A4-2FC5-5B2C-9527-954044DE2CF3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteCenChildInstanceRouteEntryToCenResponseBody build() {
            return new DeleteCenChildInstanceRouteEntryToCenResponseBody(this);
        } 

    } 

}

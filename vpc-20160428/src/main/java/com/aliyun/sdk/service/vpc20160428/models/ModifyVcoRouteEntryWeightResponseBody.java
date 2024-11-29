// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyVcoRouteEntryWeightResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyVcoRouteEntryWeightResponseBody</p>
 */
public class ModifyVcoRouteEntryWeightResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyVcoRouteEntryWeightResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVcoRouteEntryWeightResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9496F8A-82F4-3130-A51A-2266ACC799B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyVcoRouteEntryWeightResponseBody build() {
            return new ModifyVcoRouteEntryWeightResponseBody(this);
        } 

    } 

}

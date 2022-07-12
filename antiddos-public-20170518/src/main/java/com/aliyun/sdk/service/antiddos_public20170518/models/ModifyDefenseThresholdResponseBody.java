// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDefenseThresholdResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDefenseThresholdResponseBody</p>
 */
public class ModifyDefenseThresholdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyDefenseThresholdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDefenseThresholdResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDefenseThresholdResponseBody build() {
            return new ModifyDefenseThresholdResponseBody(this);
        } 

    } 

}

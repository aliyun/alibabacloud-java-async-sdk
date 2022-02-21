// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyResourcePoolSchedulerTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyResourcePoolSchedulerTypeResponseBody</p>
 */
public class ModifyResourcePoolSchedulerTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyResourcePoolSchedulerTypeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyResourcePoolSchedulerTypeResponseBody create() {
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

        public ModifyResourcePoolSchedulerTypeResponseBody build() {
            return new ModifyResourcePoolSchedulerTypeResponseBody(this);
        } 

    } 

}

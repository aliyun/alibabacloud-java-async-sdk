// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOperateVulResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyOperateVulResponseBody</p>
 */
public class ModifyOperateVulResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyOperateVulResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOperateVulResponseBody create() {
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

        public ModifyOperateVulResponseBody build() {
            return new ModifyOperateVulResponseBody(this);
        } 

    } 

}

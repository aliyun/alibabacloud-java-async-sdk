// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRuleStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyRuleStatusResponseBody</p>
 */
public class ModifyRuleStatusResponseBody extends TeaModel {
    @NameInMap("FailedIds")
    private String failedIds;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyRuleStatusResponseBody(Builder builder) {
        this.failedIds = builder.failedIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRuleStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return failedIds
     */
    public String getFailedIds() {
        return this.failedIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String failedIds; 
        private String requestId; 

        /**
         * The IDs of sensitive data detection rules whose status failed to be changed. Multiple IDs are separated with commas (,).
         */
        public Builder failedIds(String failedIds) {
            this.failedIds = failedIds;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyRuleStatusResponseBody build() {
            return new ModifyRuleStatusResponseBody(this);
        } 

    } 

}

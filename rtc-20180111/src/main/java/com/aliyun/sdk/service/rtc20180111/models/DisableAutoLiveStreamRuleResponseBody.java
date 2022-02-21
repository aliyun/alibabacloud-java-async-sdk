// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableAutoLiveStreamRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DisableAutoLiveStreamRuleResponseBody</p>
 */
public class DisableAutoLiveStreamRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DisableAutoLiveStreamRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableAutoLiveStreamRuleResponseBody create() {
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

        public DisableAutoLiveStreamRuleResponseBody build() {
            return new DisableAutoLiveStreamRuleResponseBody(this);
        } 

    } 

}

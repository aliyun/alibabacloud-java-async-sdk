// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableScalingGroupResponseBody} extends {@link TeaModel}
 *
 * <p>EnableScalingGroupResponseBody</p>
 */
public class EnableScalingGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private EnableScalingGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableScalingGroupResponseBody create() {
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

        public EnableScalingGroupResponseBody build() {
            return new EnableScalingGroupResponseBody(this);
        } 

    } 

}

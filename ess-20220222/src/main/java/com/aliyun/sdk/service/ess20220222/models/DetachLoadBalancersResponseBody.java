// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link DetachLoadBalancersResponseBody} extends {@link TeaModel}
 *
 * <p>DetachLoadBalancersResponseBody</p>
 */
public class DetachLoadBalancersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingActivityId")
    private String scalingActivityId;

    private DetachLoadBalancersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scalingActivityId = builder.scalingActivityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachLoadBalancersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingActivityId
     */
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

    public static final class Builder {
        private String requestId; 
        private String scalingActivityId; 

        private Builder() {
        } 

        private Builder(DetachLoadBalancersResponseBody model) {
            this.requestId = model.requestId;
            this.scalingActivityId = model.scalingActivityId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the scaling activity. The value of this parameter is returned only if you set the Async parameter to true. You can call the describescalingactivities operation to query all scaling activity IDs and use the scaling activity IDs to check the status of the scaling activities.</p>
         * 
         * <strong>example:</strong>
         * <p>asa-bp140qd7mak8k63f****</p>
         */
        public Builder scalingActivityId(String scalingActivityId) {
            this.scalingActivityId = scalingActivityId;
            return this;
        }

        public DetachLoadBalancersResponseBody build() {
            return new DetachLoadBalancersResponseBody(this);
        } 

    } 

}

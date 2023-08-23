// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachServerGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>AttachServerGroupsResponseBody</p>
 */
public class AttachServerGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScalingActivityId")
    private String scalingActivityId;

    private AttachServerGroupsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scalingActivityId = builder.scalingActivityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachServerGroupsResponseBody create() {
        return builder().build();
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

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the scaling activity in which you attach the server group to the scaling group and Auto Scaling adds the ECS instances in the scaling group to the server group.
         * <p>
         * 
         * > This parameter is returned only if you set the ForceAttach parameter to true.
         */
        public Builder scalingActivityId(String scalingActivityId) {
            this.scalingActivityId = scalingActivityId;
            return this;
        }

        public AttachServerGroupsResponseBody build() {
            return new AttachServerGroupsResponseBody(this);
        } 

    } 

}

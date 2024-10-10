// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AttachAlbServerGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>AttachAlbServerGroupsResponseBody</p>
 */
public class AttachAlbServerGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingActivityId")
    private String scalingActivityId;

    private AttachAlbServerGroupsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scalingActivityId = builder.scalingActivityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachAlbServerGroupsResponseBody create() {
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
         * <p>The ID of the scaling activity. During the scaling activity, the ALB server group is attached to the scaling group and the existing ECS instances or elastic container instances in the scaling group are added to the ALB server group.</p>
         * <blockquote>
         * <p> This parameter is returned only if you set <code>ForceAttach</code> to <code>true</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>asa-2ze6wxj8vsohn6j9****</p>
         */
        public Builder scalingActivityId(String scalingActivityId) {
            this.scalingActivityId = scalingActivityId;
            return this;
        }

        public AttachAlbServerGroupsResponseBody build() {
            return new AttachAlbServerGroupsResponseBody(this);
        } 

    } 

}

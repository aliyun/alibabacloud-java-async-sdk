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
 * {@link DetachAlbServerGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DetachAlbServerGroupsResponseBody</p>
 */
public class DetachAlbServerGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingActivityId")
    private String scalingActivityId;

    private DetachAlbServerGroupsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scalingActivityId = builder.scalingActivityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachAlbServerGroupsResponseBody create() {
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

        private Builder(DetachAlbServerGroupsResponseBody model) {
            this.requestId = model.requestId;
            this.scalingActivityId = model.scalingActivityId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the scaling activity during which the ALB server group is detached from the scaling group and the existing ECS instances are removed from the ALB server group. This parameter has a return value only if you set <code>ForceDetach</code> to <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>asa-2ze6wxj8vsohn6j9****</p>
         */
        public Builder scalingActivityId(String scalingActivityId) {
            this.scalingActivityId = scalingActivityId;
            return this;
        }

        public DetachAlbServerGroupsResponseBody build() {
            return new DetachAlbServerGroupsResponseBody(this);
        } 

    } 

}

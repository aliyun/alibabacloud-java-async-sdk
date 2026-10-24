// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link DeleteScalingRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteScalingRuleRequest</p>
 */
public class DeleteScalingRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String triggerType;

    private DeleteScalingRuleRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.nodeGroupId = builder.nodeGroupId;
        this.scalingRuleId = builder.scalingRuleId;
        this.triggerType = builder.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteScalingRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return scalingRuleId
     */
    public String getScalingRuleId() {
        return this.scalingRuleId;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    public static final class Builder extends Request.Builder<DeleteScalingRuleRequest, Builder> {
        private String instanceId; 
        private String nodeGroupId; 
        private String scalingRuleId; 
        private String triggerType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteScalingRuleRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.nodeGroupId = request.nodeGroupId;
            this.scalingRuleId = request.scalingRuleId;
            this.triggerType = request.triggerType;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b25e21e24388****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The node group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-3d5ce6454354****</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>The ID of the scaling rule to be deleted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>r-d01a1cac4081s****</p>
         */
        public Builder scalingRuleId(String scalingRuleId) {
            this.putQueryParameter("ScalingRuleId", scalingRuleId);
            this.scalingRuleId = scalingRuleId;
            return this;
        }

        /**
         * <p>The trigger type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TIME_TRIGGER</p>
         */
        public Builder triggerType(String triggerType) {
            this.putQueryParameter("TriggerType", triggerType);
            this.triggerType = triggerType;
            return this;
        }

        @Override
        public DeleteScalingRuleRequest build() {
            return new DeleteScalingRuleRequest(this);
        } 

    } 

}

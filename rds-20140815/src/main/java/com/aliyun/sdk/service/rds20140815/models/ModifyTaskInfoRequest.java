// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyTaskInfoRequest} extends {@link RequestModel}
 *
 * <p>ModifyTaskInfoRequest</p>
 */
public class ModifyTaskInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionParams")
    private String actionParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private Long resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StepName")
    private String stepName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskAction")
    private String taskAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private ModifyTaskInfoRequest(Builder builder) {
        super(builder);
        this.actionParams = builder.actionParams;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
        this.stepName = builder.stepName;
        this.taskAction = builder.taskAction;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTaskInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionParams
     */
    public String getActionParams() {
        return this.actionParams;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public Long getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return stepName
     */
    public String getStepName() {
        return this.stepName;
    }

    /**
     * @return taskAction
     */
    public String getTaskAction() {
        return this.taskAction;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<ModifyTaskInfoRequest, Builder> {
        private String actionParams; 
        private String regionId; 
        private Long resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 
        private String stepName; 
        private String taskAction; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTaskInfoRequest request) {
            super(request);
            this.actionParams = request.actionParams;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
            this.stepName = request.stepName;
            this.taskAction = request.taskAction;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The action-related parameters. You can add action-related parameters based on your business requirements. If you set the TaskAction parameter to modifySwitchTime, you must set this parameter to <code>{&quot;recoverMode&quot;: &quot;xxx&quot;, &quot;recoverTime&quot;: &quot;xxx&quot;}</code>.</p>
         * <p>The recoverMode field specifies the task restoration mode. valid values:</p>
         * <ul>
         * <li><strong>timePoint</strong>: The task is executed at a specified point in time.</li>
         * <li><strong>Immediate</strong>: The task is executed immediately.</li>
         * <li><strong>maintainTime</strong>: The task is executed based on the O&amp;M time.</li>
         * </ul>
         * <p>The recoverTime field specifies restoration time. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. If you set the recoverMode field to timePoint, you must also specify the recoverTime field.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;recoverTime&quot;:&quot;2023-04-12T18:30:00Z&quot;,&quot;recoverMode&quot;:&quot;timePoint&quot;}</p>
         */
        public Builder actionParams(String actionParams) {
            this.putQueryParameter("ActionParams", actionParams);
            this.actionParams = actionParams;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/26243.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(Long resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The name of the execution step.</p>
         * 
         * <strong>example:</strong>
         * <p>ha_switch</p>
         */
        public Builder stepName(String stepName) {
            this.putQueryParameter("StepName", stepName);
            this.stepName = stepName;
            return this;
        }

        /**
         * <p>The task action. Set the value to modifySwitchTime. The value specifies that you want to change the switching time or restoration time.</p>
         * 
         * <strong>example:</strong>
         * <p>ImportImage</p>
         */
        public Builder taskAction(String taskAction) {
            this.putQueryParameter("TaskAction", taskAction);
            this.taskAction = taskAction;
            return this;
        }

        /**
         * <p>The task ID. You can call the DescribeTasks operation to query task IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t-83br18hloum8u3948s</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ModifyTaskInfoRequest build() {
            return new ModifyTaskInfoRequest(this);
        } 

    } 

}

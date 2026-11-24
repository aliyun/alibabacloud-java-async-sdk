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
 * {@link CreateLifecycleHookRequest} extends {@link RequestModel}
 *
 * <p>CreateLifecycleHookRequest</p>
 */
public class CreateLifecycleHookRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultResult")
    private String defaultResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HeartbeatTimeout")
    private Integer heartbeatTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecycleActionSources")
    private java.util.List<String> lifecycleActionSources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecycleHookName")
    private String lifecycleHookName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecycleTransition")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lifecycleTransition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotificationArn")
    private String notificationArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotificationMetadata")
    private String notificationMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingGroupId;

    private CreateLifecycleHookRequest(Builder builder) {
        super(builder);
        this.defaultResult = builder.defaultResult;
        this.heartbeatTimeout = builder.heartbeatTimeout;
        this.lifecycleActionSources = builder.lifecycleActionSources;
        this.lifecycleHookName = builder.lifecycleHookName;
        this.lifecycleTransition = builder.lifecycleTransition;
        this.notificationArn = builder.notificationArn;
        this.notificationMetadata = builder.notificationMetadata;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLifecycleHookRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultResult
     */
    public String getDefaultResult() {
        return this.defaultResult;
    }

    /**
     * @return heartbeatTimeout
     */
    public Integer getHeartbeatTimeout() {
        return this.heartbeatTimeout;
    }

    /**
     * @return lifecycleActionSources
     */
    public java.util.List<String> getLifecycleActionSources() {
        return this.lifecycleActionSources;
    }

    /**
     * @return lifecycleHookName
     */
    public String getLifecycleHookName() {
        return this.lifecycleHookName;
    }

    /**
     * @return lifecycleTransition
     */
    public String getLifecycleTransition() {
        return this.lifecycleTransition;
    }

    /**
     * @return notificationArn
     */
    public String getNotificationArn() {
        return this.notificationArn;
    }

    /**
     * @return notificationMetadata
     */
    public String getNotificationMetadata() {
        return this.notificationMetadata;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static final class Builder extends Request.Builder<CreateLifecycleHookRequest, Builder> {
        private String defaultResult; 
        private Integer heartbeatTimeout; 
        private java.util.List<String> lifecycleActionSources; 
        private String lifecycleHookName; 
        private String lifecycleTransition; 
        private String notificationArn; 
        private String notificationMetadata; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLifecycleHookRequest request) {
            super(request);
            this.defaultResult = request.defaultResult;
            this.heartbeatTimeout = request.heartbeatTimeout;
            this.lifecycleActionSources = request.lifecycleActionSources;
            this.lifecycleHookName = request.lifecycleHookName;
            this.lifecycleTransition = request.lifecycleTransition;
            this.notificationArn = request.notificationArn;
            this.notificationMetadata = request.notificationMetadata;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
        } 

        /**
         * <p>The action to be performed after the wait state ends. Valid values: </p>
         * <ul>
         * <li>CONTINUE: Continues the response to the scale-out or scale-in activity.</li>
         * <li>ABANDON: Releases the ECS instances created by the scale-out activity or removes the ECS instances in the scale-in activity from the scaling group. </li>
         * <li>ROLLBACK: Rejects the release of ECS instances and rolls back the scale-in activity. For a scale-out activity, this value directly releases the created ECS instances, which has the same effect as ABANDON.</li>
         * </ul>
         * <p>When a scale-in activity occurs in the scaling group and multiple lifecycle hooks are triggered, if the DefaultResult of one lifecycle hook is set to ABANDON or ROLLBACK and the wait state of the hook ends, the wait states of other lifecycle hooks are ended in advance. In other cases, the action to be performed is subject to the action of the last lifecycle hook whose wait state ends.</p>
         * <p>Default value: CONTINUE.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTINUE</p>
         */
        public Builder defaultResult(String defaultResult) {
            this.putQueryParameter("DefaultResult", defaultResult);
            this.defaultResult = defaultResult;
            return this;
        }

        /**
         * <p>The wait time configured by the lifecycle hook for the scaling activity. After the wait state times out, the next action is performed. Valid values: 30 to 21600. Unit: seconds.</p>
         * <p>After you create a lifecycle hook, you can call RecordLifecycleActionHeartbeat to extend the wait time of the ECS instance, or call CompleteLifecycleAction to end the wait state of the scaling activity in advance. </p>
         * <p>Default value: 600.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder heartbeatTimeout(Integer heartbeatTimeout) {
            this.putQueryParameter("HeartbeatTimeout", heartbeatTimeout);
            this.heartbeatTimeout = heartbeatTimeout;
            return this;
        }

        /**
         * <p>The specific scenarios triggered by the lifecycle hook.</p>
         */
        public Builder lifecycleActionSources(java.util.List<String> lifecycleActionSources) {
            this.putQueryParameter("LifecycleActionSources", lifecycleActionSources);
            this.lifecycleActionSources = lifecycleActionSources;
            return this;
        }

        /**
         * <p>The name of the lifecycle hook. The name must be unique among all lifecycle hooks in the current scaling group. It must be 2 to 64 characters in length, start with a digit, an uppercase or lowercase letter, or a Chinese character, and can contain digits, underscores (_), hyphens (-), and periods (.).</p>
         * <p>Default value: the value of LifecycleHookId.</p>
         * 
         * <strong>example:</strong>
         * <p>lifecyclehook****</p>
         */
        public Builder lifecycleHookName(String lifecycleHookName) {
            this.putQueryParameter("LifecycleHookName", lifecycleHookName);
            this.lifecycleHookName = lifecycleHookName;
            return this;
        }

        /**
         * <p>The type of scaling activity to which the lifecycle hook applies. Valid values: </p>
         * <ul>
         * <li>SCALE_OUT: scale-out activity of the scaling group. </li>
         * <li>SCALE_IN: scale-in activity of the scaling group.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SCALE_OUT</p>
         */
        public Builder lifecycleTransition(String lifecycleTransition) {
            this.putQueryParameter("LifecycleTransition", lifecycleTransition);
            this.lifecycleTransition = lifecycleTransition;
            return this;
        }

        /**
         * <p>The identifier of the notification recipient for the lifecycle hook. If you do not specify this parameter, no notifications are sent. If you specify this parameter, the following notification methods are supported:</p>
         * <ul>
         * <li>MNS queue. Format: acs:mns:{region-id}:{account-id}:queue/{queuename}.</li>
         * <li>MNS topic. Format: acs:mns:{region-id}:{account-id}:topic/{topicname}.</li>
         * <li>OOS template. Format: acs:oos:{region-id}:{account-id}:template/{templatename}.</li>
         * <li>EventBridge. Format: acs:eventbridge:{region-id}:{account-id}:eventbus/default.</li>
         * </ul>
         * <p>The variables in the formats have the following meanings:</p>
         * <ul>
         * <li>region-id: the ID of the region where the scaling group resides.</li>
         * <li>account-id: the Alibaba Cloud account ID. The ID of a Resource Access Management (RAM) user is not supported.</li>
         * <li>queuename: the name of the MNS queue.</li>
         * <li>topicname: the name of the MNS topic.</li>
         * <li>templatename: the name of the OOS template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:mns:cn-beijing:161456884340****:queue/modifyLifecycleHo****</p>
         */
        public Builder notificationArn(String notificationArn) {
            this.putQueryParameter("NotificationArn", notificationArn);
            this.notificationArn = notificationArn;
            return this;
        }

        /**
         * <p>The notification message pushed to the NotificationArn (notification recipient) when the lifecycle hook pauses the scaling activity. This parameter helps you manage and mark different types of notification messages. You must specify NotificationArn together with this parameter. The value can be up to 4,096 characters in length.</p>
         * <p>If NotificationArn is set to an OOS template, including a public or custom template, NotificationMetadata must be specified as a JSON string that matches the parameters of the OOS template. For example, <code>{&quot;dbInstanceId&quot;: &quot;dds-bp17661e0135****&quot;, &quot;modifyMode&quot;: &quot;Append&quot;}</code>, where <code>dbInstanceId</code> and <code>modifyMode</code> are parameters defined in the OOS template. Some parameters of the OOS template have default values. You must specify parameters without default values in NotificationMetadata. If you specify parameters with default values, the original default values are overwritten. However, keep the default values for the following parameters to obtain relevant information at runtime:</p>
         * <ul>
         * <li><p><code>regionId</code>: the region where the scaling activity is executed. Default value: ${regionId}.</p>
         * </li>
         * <li><p><code>instanceIds</code>: the list of instances associated with the scaling activity. Default value: ${instanceIds}.</p>
         * </li>
         * <li><p><code>lifecycleHookId</code>: the ID of the lifecycle hook. Default value: ${lifecycleHookId}.</p>
         * </li>
         * <li><p><code>lifecycleActionToken</code>: the wait state identifier for the scaling activity, which is used to end the current suspended activity in advance. Default value: ${lifecycleActionToken}.</p>
         * </li>
         * <li><p><code>scalingGroupId</code>: the ID of the scaling group to which the scaling activity belongs. Default value: ${scalingGroupId}.</p>
         * </li>
         * <li><p><code>lifecycleActionResult</code>: the action to be performed after the wait state of the lifecycle hook ends. This parameter is used to end the current suspended activity in advance when the OOS template execution fails. When DefaultResult is set to ROLLBACK, the default value of this parameter is ROLLBACK. In other cases, the default value is ABANDON.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>You can configure the value of lifecycleActionResult to overwrite the current default value as needed. Valid values: ABANDON, CONTINUE, ROLLBACK, and ${lifecycleActionResult}.
         * Among these values, ${lifecycleActionResult} indicates that the value of lifecycleActionResult is the same as that of DefaultResult.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>You can obtain detailed information about the parameters of the corresponding template in the <a href="https://oos.console.aliyun.com/">OOS console</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Test lifecycle hook.</p>
         */
        public Builder notificationMetadata(String notificationMetadata) {
            this.putQueryParameter("NotificationMetadata", notificationMetadata);
            this.notificationMetadata = notificationMetadata;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * <p>The ID of the scaling group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp1eyv4qn8ssgv43****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        @Override
        public CreateLifecycleHookRequest build() {
            return new CreateLifecycleHookRequest(this);
        } 

    } 

}
